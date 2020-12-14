package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.InfoBean;

public interface ConstantsInfo {
    public interface View  extends BaseView{
        void showData(InfoBean infoBean);
        void showE(String e,int c);
    }
    interface Presenter{
        void getData(String id);
    }
    interface Model{
        void getModel(String id,ModelBaseCallBack<InfoBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);
    }
}
