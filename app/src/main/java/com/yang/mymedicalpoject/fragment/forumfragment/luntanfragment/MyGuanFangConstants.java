package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;

public interface MyGuanFangConstants  {
    interface MyView extends BaseView{
        void showData(Object o);
        void showError(String e,int code);
    }
    interface MyPresenter {
        void getData(String p);
    }
    interface MyModel{
        void getModel(String p,ModelBaseCallBack<Object> modelBaseCallBack, LifecycleProvider lifecycleProvider);
    }
}
