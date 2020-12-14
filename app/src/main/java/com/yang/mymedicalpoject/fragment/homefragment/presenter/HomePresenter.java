package com.yang.mymedicalpoject.fragment.homefragment.presenter;

import android.util.Log;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.fragment.homefragment.HomeConstants;
import com.yang.mymedicalpoject.fragment.homefragment.bean.HomeBean;
import com.yang.mymedicalpoject.fragment.homefragment.model.HomeModel;

public class HomePresenter extends BasePresenterIml< HomeConstants.MyHomeView,HomeModel> implements HomeConstants.MyHomePresenter, ModelBaseCallBack<HomeBean> {
    @Override
    public void getData() {
        getModel().getDataModel(this, getLifecycleProvider());
    }

    @Override
    public void onSucess(HomeBean data) {
        getView().showData(data);
    }

    @Override
    public void onError(String msg, int code) {
        getView().error(msg,code);
    }
}
