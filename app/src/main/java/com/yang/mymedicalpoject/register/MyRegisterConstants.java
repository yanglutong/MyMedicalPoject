package com.yang.mymedicalpoject.register;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.model.ModelRegisterCallBack;

public interface MyRegisterConstants {
    //View 层的接口
    interface MyRegisterView extends BaseView{
         //用于获取验证码
        void show(RegisterCodeBean registerCodeBean);
        void error(String msg,int code);
        //用于注册返回注册成功数据
        void showMessage(RegisterBean registerBean);
        void errorMessage(String error,int code);
    }
    //P 层的接口
    interface MyRegisterPresenter{
        //用于获取验证码
        void getData(String phone);
        //用于注册
        void getRegister(String phone, int code, String pass);
    }
    //M 层的接口
    interface MyRegisterModel{
        //用于获取验证码
        void getDataModel(String phone, ModelBaseCallBack<RegisterCodeBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);
        void getDataRegister(String phone, int code, String pass, ModelRegisterCallBack<RegisterBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);
    }
}
