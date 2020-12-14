package com.yang.mymedicalpoject.login.presenter;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.login.MyLoginConstants;
import com.yang.mymedicalpoject.login.bean.LoginBean;
import com.yang.mymedicalpoject.login.model.MyLoginModel;

public class MyLoginPresenter extends BasePresenterIml<MyLoginConstants.MyLoginView, MyLoginModel> implements MyLoginConstants.MyLoginPresenter, ModelBaseCallBack<LoginBean> {


    @Override
    public void getLoginData(String name,String pass) {
        getModel().getModelData(name,pass,this,getLifecycleProvider());
    }

    @Override
    public void onSucess(LoginBean data) {
        getView().showData(data);
    }

    @Override
    public void onError(String msg, int code) {
        getView().showError(msg,code);
    }
}
