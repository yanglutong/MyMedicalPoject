package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment;


import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean.FuromChildBean;

public interface FuromChildConstans {
    interface FuromChildView extends BaseView {
        void showFuromChild(FuromChildBean furomChildBean);


    }

    interface FuromChildPresenter {

        void getFuromChild();




    }

    interface FuromChildModel {
        void getFuromChild(ModelBaseCallBack<FuromChildBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);

    }
}
