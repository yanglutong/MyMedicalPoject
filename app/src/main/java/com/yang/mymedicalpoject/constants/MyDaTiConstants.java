package com.yang.mymedicalpoject.constants;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.bean.DaTiBean;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.model.ModelRegisterCallBack;

public interface MyDaTiConstants {
    //View 层的接口
    interface MyView extends BaseView{

        void show(DaTiBean daTiBean);
        void error(String msg, int code);
    }
    //P 层的接口
    interface MyPresenter{
        //用于获取验证码
        void getData(String ti_id);
    }
    //M 层的接口
    interface MyModel{
        //用于获取验证码
        void getDataModel(String phone, ModelBaseCallBack<DaTiBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);
    }
}
