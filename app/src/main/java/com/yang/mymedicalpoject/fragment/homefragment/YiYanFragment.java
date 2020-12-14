package com.yang.mymedicalpoject.fragment.homefragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.fragment.BaseFragment;
import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.MyApp;
import com.yang.mymedicalpoject.base.adapter.YiYanReAdapter;
import com.yang.mymedicalpoject.bean.YiYanBean;
import com.yang.mymedicalpoject.constants.YiYanConstants;
import com.yang.mymedicalpoject.model.MyYiYanModel;
import com.yang.mymedicalpoject.presenter.MyYiYanPresenter;
import com.yang.mymedicalpoject.ui.activity.DaTiActivity;

import java.util.ArrayList;
import java.util.List;

public class YiYanFragment extends BaseMvpFragment<YiYanConstants.MyView, MyYiYanModel, MyYiYanPresenter> implements YiYanConstants.MyView {


    private RecyclerView recycler;

    @Override
    protected void initDataMvp(View view) {
        find(view);

        getRequest();

    }

    private void getRequest() {
        //请求
        mPresenter.getData("1");
    }

    private void find(View view) {
        recycler = view.findViewById(R.id.recycler);
    }

    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_li_nian;
    }
    @Override
    protected MyYiYanPresenter createPresenter() {
        return new MyYiYanPresenter();
    }


    @Override
    public void show(YiYanBean yiYanBean) {


        List<YiYanBean.ZTypeBean> type = yiYanBean.getZ_type();
        Log.i("杨路通", "YiYanFragment: "+yiYanBean.getFen());
        //设置数据
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        YiYanReAdapter adapter = new YiYanReAdapter(type, getActivity(), R.layout.yiyan_item);
        recycler.setAdapter(adapter);

        adapter.notifyDataSetChanged();

        adapter.setAdapterOnItemClickListener(new BaseAdapter.AdapterOnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                String name = yiYanBean.getZ_type().get(position).getName();
                String id = type.get(position).getId();
                Bundle bundle = new Bundle();
                bundle.putString("id",id);
                bundle.putString("name",name);
                MyApp.openActivity(context, DaTiActivity.class,bundle);
            }
        });
    }

    @Override
    public void error(String msg, int code) {
        Log.i("杨路通", "YiYanFragment: "+msg+code);
    }
}