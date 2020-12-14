package com.yang.mymedicalpoject.fragment.homefragment;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.fragment.homefragment.bean.HomeBean;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.model.ModelRegisterCallBack;

public interface HomeConstants {
        //View 层的接口
        interface MyHomeView extends BaseView {
            //用于获取验证码
            void showData(HomeBean homeBean);
            void error(String msg,int code);
        }
        //P 层的接口
        interface MyHomePresenter{
            //用于获取验证码
            void getData();
        }
        //M 层的接口
        interface MyHomeModel{
            //用于获取验证码
            void getDataModel(ModelBaseCallBack<HomeBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);
        }

}
