package com.example.mvplibrary.base.fragment;

import android.os.Bundle;

import android.view.View;

import com.example.mvplibrary.base.model.BaseModel;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.example.mvplibrary.base.view.BaseView;

import androidx.annotation.Nullable;

/**
 * 项目名：2007
 * 包名：  com.example.mvplibrary.base.fragment
 * 文件名：BaseMvpFragment
 * 创建者：liangxq
 * 创建时间：2020/11/9  10:31
 * 描述：TODO
 */
public abstract class BaseMvpFragment<V extends BaseView,M extends BaseModel,P extends BasePresenterIml<V,M>> extends BaseFragment implements BaseView{
    protected View view;
    public P mPresenter;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view=view;
        mPresenter=createPresenter();
        if(mPresenter!=null){
            mPresenter.bindView((V) this);
        }
        initDataMvp(view);
    }

    //初始化Mvp数据方法
    protected abstract void initDataMvp(View view);

    protected abstract P createPresenter();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(mPresenter!=null){
            mPresenter.onUnBindView();
        }
    }

    @Override
    public void showLoadingView() {

    }

    @Override
    protected void initData(View rootView) {

    }

    @Override
    public void showSucessView() {

    }

    @Override
    public void showErrorView() {

    }

}
