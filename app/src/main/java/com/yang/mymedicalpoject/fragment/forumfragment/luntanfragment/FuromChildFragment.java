package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment;

import android.util.Log;
import android.view.View;

import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.adapter.FuromChildAdapter;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean.FuromChildBean;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.model.FuromChildModelIml;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.presenter.FuromChildPresenterIml;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



/*经验论坛*/
public class FuromChildFragment extends BaseMvpFragment<FuromChildConstans.FuromChildView, FuromChildModelIml,
        FuromChildPresenterIml> implements FuromChildConstans.FuromChildView {
    private static final String TAG = "FuromChildFragment";
    private RecyclerView mFuromChildRecycler1;
    private FuromChildAdapter furomChildAdapter;

    @Override
    protected void initDataMvp(View view) {
        Log.i("杨路通", "initDataMvp: "+"ssssss");
        mPresenter.getFuromChild();
        mFuromChildRecycler1 =view.findViewById(R.id.furom_child_recycler1);
        mFuromChildRecycler1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
    }

    @Override
    protected FuromChildPresenterIml createPresenter() {
        return new FuromChildPresenterIml();
    }


    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_furomchild;
    }


    @Override
    public void showFuromChild(FuromChildBean furomChildBean) {

        furomChildAdapter = new FuromChildAdapter(getActivity(),furomChildBean.getArticle(),furomChildBean.getTop());
        Log.i(TAG, "showFuromChild: " + furomChildBean.getArticle());
        mFuromChildRecycler1.setAdapter(furomChildAdapter);



    }
}
