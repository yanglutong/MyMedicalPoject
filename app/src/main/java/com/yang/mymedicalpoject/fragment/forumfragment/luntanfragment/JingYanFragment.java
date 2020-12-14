package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.adapter.FuromChildAdapter;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean.FuromChildBean;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.model.FuromChildModelIml;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.presenter.FuromChildPresenterIml;

public class JingYanFragment extends BaseMvpFragment<FuromChildConstans.FuromChildView, FuromChildModelIml,
        FuromChildPresenterIml> implements FuromChildConstans.FuromChildView {
    private static final String TAG = "FuromChildFragment";
    private RecyclerView mFuromChildRecycler1;
    private FuromChildAdapter furomChildAdapter;
    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_jing_yan;
    }

    @Override
    protected void initDataMvp(View view) {
        Log.i("杨路通", "initDataMvp: "+"ssssss");
        mPresenter.getFuromChild();

        Log.i("杨路通", "initDataMvp JingYanFragment: "+"哈哈哈");
    }

    @Override
    protected FuromChildPresenterIml createPresenter() {
        return new FuromChildPresenterIml();
    }

    @Override
    public void showFuromChild(FuromChildBean furomChildBean) {
        mFuromChildRecycler1 =view.findViewById(R.id.furom_child_recycler1);
        mFuromChildRecycler1.setLayoutManager(new LinearLayoutManager(getActivity()));
        furomChildAdapter = new FuromChildAdapter(getActivity(),furomChildBean.getArticle(),furomChildBean.getTop());
        Log.i("杨路通", "showFuromChild: " + furomChildBean.getArticle());
        mFuromChildRecycler1.setAdapter(furomChildAdapter);
        furomChildAdapter.notifyDataSetChanged();
    }
}