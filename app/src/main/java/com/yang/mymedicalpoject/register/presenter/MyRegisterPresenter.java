package com.yang.mymedicalpoject.register.presenter;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.register.MyRegisterConstants;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.model.ModelRegisterCallBack;
import com.yang.mymedicalpoject.register.model.MyRegisterModel;

public
class MyRegisterPresenter extends BasePresenterIml<MyRegisterConstants.MyRegisterView, MyRegisterModel> implements MyRegisterConstants.MyRegisterPresenter {
    @Override
    public void getData(String phone) {
        getModel().getDataModel(phone, new ModelBaseCallBack<RegisterCodeBean>() {
            @Override
            public void onSucess(RegisterCodeBean data) {
                getView().show(data);
            }

            @Override
            public void onError(String msg, int code) {
                getView().error(msg,code);
            }
        },getLifecycleProvider());
    }

    @Override
    public void getRegister(String phone, int code, String pass) {
        getModel().getDataRegister(phone, code, pass, new ModelRegisterCallBack<RegisterBean>() {
            @Override
            public void showDataMessage(RegisterBean registerBean) {
                    getView().showMessage(registerBean);
            }

            @Override
            public void showError(String or, int and) {
                    getView().errorMessage(or,and);
            }
        },getLifecycleProvider());
    }
}
