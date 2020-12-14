package com.yang.mymedicalpoject.fragment.forumfragment.school;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.cundong.recyclerview.HeaderAndFooterRecyclerViewAdapter;
import com.cundong.recyclerview.RecyclerViewUtils;
import com.cundong.recyclerview.SampleFooter;
import com.example.mvplibrary.base.fragment.BaseFragment;
import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.adapter.MyRecyclerAdapter;
import com.yang.mymedicalpoject.base.adapter.ReAdapter2;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.RecyclerBean;
import com.yang.mymedicalpoject.fragment.forumfragment.school.model.SchoolRecyclerModel;
import com.yang.mymedicalpoject.fragment.forumfragment.school.presenter.SchoolRecyclerPresenter;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ReAdapter;
import com.yang.mymedicalpoject.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class School_Fragment extends BaseMvpFragment<SchoolConstants.MyRecyclerView, SchoolRecyclerModel, SchoolRecyclerPresenter> implements SchoolConstants.MyRecyclerView {

    private RecyclerView school_recycler;
    private TextView tv_shequ;
    private SmartRefreshLayout smart_refresh;
    private int p;
    private int id;
    boolean isAdd=false;
    private MyRecyclerAdapter adapter;
    private ArrayList<RecyclerBean> list=new ArrayList<>();;
    private LinearLayoutManager manager;
    @Override
    protected void initDataMvp(View view) {
        school_recycler = view.findViewById(R.id.school_recycler);
        tv_shequ = view.findViewById(R.id.tv_shequ);
        smart_refresh = view.findViewById(R.id.smart_refresh);

        initData();
    }

    private void initData() {
        //获取Argments
        Bundle bundle = getArguments();
        String id2 = bundle.getString("id");
        String type = bundle.getString("type");
        id = Integer.parseInt(id2);


        p = Integer.parseInt(type);


        //通过获取到的id 来进行网络请求（int类型）

        mPresenter.getData(id, p);


    }

    @Override
    protected SchoolRecyclerPresenter createPresenter() {
        return new SchoolRecyclerPresenter();
    }

    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_school;
    }

    @Override
    public void showData(ArrayList<RecyclerBean> recyclerBeans) {
        if(recyclerBeans.size()>0){
            list.addAll(recyclerBeans);
        }
        if(list.size()>0){
            manager = new LinearLayoutManager(getActivity());
            school_recycler.setLayoutManager(manager);
            adapter = new MyRecyclerAdapter(list, getContext(), R.layout.item_shequ_school);
            HeaderAndFooterRecyclerViewAdapter adapter1 = new HeaderAndFooterRecyclerViewAdapter(adapter);
            school_recycler.setAdapter(adapter1);
            adapter1.notifyDataSetChanged();
        }
        smart_refresh.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {

                isAdd=true;
                p++;

                mPresenter.getData(id,p);

                smart_refresh.finishLoadMore();
                ToastUtils.showToast(getContext(),"没有更多的了");
            }
        });
        smart_refresh.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                ToastUtils.showToast(getContext(),"下拉刷新");
                adapter.notifyDataSetChanged();
                smart_refresh.finishRefresh();
            }
        });
/*
//设置 Header 为 贝塞尔雷达 样式
        smart_refresh.setRefreshHeader(new BezierRadarHeader(getContext()).setEnableHorizontalDrag(true));
//设置 Footer 为 球脉冲 样式
        smart_refresh.setRefreshFooter(new BallPulseFooter(getContext()).setSpinnerStyle(SpinnerStyle.Scale));*/
        school_recycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                //当前屏幕可见的数量
                int childCount = recyclerView.getChildCount();

                Log.i("TAG", "--------------------------------------");
                if(school_recycler.canScrollVertically(1)){
                    Log.i("TAG", "direction 1: true");
                }else {
                        int position = manager.findLastVisibleItemPosition();
                        if(childCount>=3){
                            RecyclerViewUtils.setFooterView(recyclerView,new SampleFooter(getActivity()));
                            Log.i("TAG", "direction 1: false 滑动到底部");//滑动到底部
                        }

                }
                if(school_recycler.canScrollVertically(-1)){
                    Log.i("TAG", "direction -1: true");
                }else {
                    Log.i("TAG", "direction -1: false 滑动到顶部");//滑动到顶部
                }
            }
        });
    }

    @Override
    public void showError(String msg, int c) {
        if(isAdd){

        }else{
            Log.i("杨路通", "School_Fragment: "+msg+c);
            tv_shequ.setVisibility(View.VISIBLE);
            if(msg.equals("解析错误")){
                tv_shequ.setText("暂无数据");
            }
        }
    }
}
