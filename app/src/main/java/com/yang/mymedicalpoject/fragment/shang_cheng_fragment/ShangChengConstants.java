package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.KeChengBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.TuShuBean;

import java.util.List;

public interface ShangChengConstants {
    interface MyShangChengView extends BaseView {
        void showData(Object object,int i);
        void showError(String msg,int code);
    }
    interface MyShangChengPresenter{ ;
        void getDataQuanBuPresenter(String start, String end, int All);
        void getDataTuShuPresenter(String p, int TuShu);
        void getDataKeChengPresenter(String type, int KeC);
    }
    interface MyShangChengModel{
        void getDataModelQuanBu(int BOOK, String start, String end, ModelQuanBuCall<QuanBuBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);
        void getDataModelKeCheng(int ALL, String type, ModelBaseCallBack<KeChengBean> modelBaseCallBack, LifecycleProvider lifecycleProvider);
        void getDataModelTuShu(int KECHENG, String p, ModelTuShuCall<List<TuShuBean>> modelBaseCallBack, LifecycleProvider lifecycleProvider);
    }
}
