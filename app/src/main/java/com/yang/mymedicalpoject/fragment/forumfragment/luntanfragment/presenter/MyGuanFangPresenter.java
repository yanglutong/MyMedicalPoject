package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.presenter;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.GuanFangFragment;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.MyGuanFangConstants;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.model.MyGuanFangModel;

public class MyGuanFangPresenter extends BasePresenterIml<MyGuanFangConstants.MyView, MyGuanFangModel> implements MyGuanFangConstants.MyPresenter, ModelBaseCallBack<Object> {

    @Override
    public void getData(String p) {
        getModel().getModel(p,this,getLifecycleProvider());
    }

    @Override
    public void onSucess(Object data) {
        getView().showData(data);
    }

    @Override
    public void onError(String msg, int code) {
        getView().showError(msg,code);
    }
}
