package com.yang.mymedicalpoject.constants;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.bean.YiYanBean;

public interface YiYanConstants {
    //View 层的接口
    interface MyView extends BaseView{
         //用于获取验证码
        void show(YiYanBean yiYanBean);
        void error(String msg, int code);
    }
    //P 层的接口
    interface MyPresenter{
        //用于获取验证码
        void getData(String type);
    }
    //M 层的接口
    interface MyModel{
        //用于获取验证码
        void getDataModel(String type, ModelBaseCallBack<YiYanBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);

    }
}
