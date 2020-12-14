package com.yang.mymedicalpoject.presenter;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.bean.YiYanBean;
import com.yang.mymedicalpoject.constants.YiYanConstants;
import com.yang.mymedicalpoject.model.MyYiYanModel;
import com.yang.mymedicalpoject.register.MyRegisterConstants;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.model.ModelRegisterCallBack;
import com.yang.mymedicalpoject.register.model.MyRegisterModel;

public class MyYiYanPresenter extends BasePresenterIml<YiYanConstants.MyView, MyYiYanModel> implements YiYanConstants.MyPresenter, ModelBaseCallBack<YiYanBean> {

    @Override
    public void getData(String type) {
        getModel().getDataModel(type,this,getLifecycleProvider());
    }

    @Override
    public void onSucess(YiYanBean data) {
        getView().show(data);
    }

    @Override
    public void onError(String msg, int code) {
        getView().error(msg,code);
    }
}
