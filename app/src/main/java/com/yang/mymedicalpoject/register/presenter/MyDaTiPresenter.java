package com.yang.mymedicalpoject.register.presenter;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.bean.DaTiBean;
import com.yang.mymedicalpoject.constants.MyDaTiConstants;
import com.yang.mymedicalpoject.model.MyDaTiModel;
import com.yang.mymedicalpoject.register.MyRegisterConstants;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.model.ModelRegisterCallBack;
import com.yang.mymedicalpoject.register.model.MyRegisterModel;

public class MyDaTiPresenter extends BasePresenterIml<MyDaTiConstants.MyView, MyDaTiModel> implements MyDaTiConstants.MyPresenter, ModelBaseCallBack<DaTiBean> {

    @Override
    public void getData(String phone) {
        getModel().getDataModel(phone,this,getLifecycleProvider());
    }

    @Override
    public void onSucess(DaTiBean data) {
        getView().show(data);
    }

    @Override
    public void onError(String msg, int code) {
        getView().error(msg,code);
    }
}
