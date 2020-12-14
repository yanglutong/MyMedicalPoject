package com.yang.mymedicalpoject.login;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.login.bean.LoginBean;

public  interface MyLoginConstants {
    interface MyLoginView extends BaseView{
        void showData(LoginBean loginBean);
        void showError(String msg,int code);
    }
    interface MyLoginPresenter{
        void getLoginData(String name,String pass);
    }
    interface MyLoginModel{
        void getModelData(String name,String pass,ModelBaseCallBack<LoginBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);
    }
}
