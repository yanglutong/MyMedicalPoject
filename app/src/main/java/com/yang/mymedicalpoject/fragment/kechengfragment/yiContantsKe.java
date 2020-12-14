package com.yang.mymedicalpoject.fragment.kechengfragment;


import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/25 20:33
 */
public interface yiContantsKe {
    interface  yiView extends BaseView {
        void Show(KeBean data);
        void error(String msg);
    }
    interface yiModel {
        void getData(ModelBaseCallBack modelBaseCallBack, LifecycleProvider lifecycleProvider);
    }
    interface yiPresenter{
        void getData();
    }

}
