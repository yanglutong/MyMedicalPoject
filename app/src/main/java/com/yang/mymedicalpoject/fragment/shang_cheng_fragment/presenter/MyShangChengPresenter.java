package com.yang.mymedicalpoject.fragment.shang_cheng_fragment.presenter;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ModelQuanBuCall;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ModelTuShuCall;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ShangChengConstants;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.KeChengBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.TuShuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.model.MyShangCengModel;

import java.util.List;

public class MyShangChengPresenter extends BasePresenterIml<ShangChengConstants.MyShangChengView,MyShangCengModel> implements ShangChengConstants.MyShangChengPresenter{
    private int all;
    private int book;
    private int ke1;
    @Override
    public void getDataQuanBuPresenter(String start, String end, int All) {
        getModel().getDataModelQuanBu(All,start, end, new ModelQuanBuCall<QuanBuBean>() {
            @Override
            public void onQuanBu(QuanBuBean data) {
//                all= Constants.ALL;
                getView().showData(data,All);

            }

            @Override
            public void onError(String msg, int code) {
                getView().showError(msg,code);

            }
        },getLifecycleProvider());
    }

    @Override
    public void getDataTuShuPresenter(String p, int TuShu) {
        getModel().getDataModelTuShu(TuShu,p, new ModelTuShuCall<List<TuShuBean>>() {
            @Override
            public void onTuShu(List<TuShuBean> data) {
//                book=TuShu;
                getView().showData(data,TuShu);
            }

            @Override
            public void onError(String msg, int code) {
                getView().showError(msg,code);
            }
        },getLifecycleProvider());
    }

    @Override
    public void getDataKeChengPresenter(String type, int ke) {
        getModel().getDataModelKeCheng(ke,type, new ModelBaseCallBack<KeChengBean>() {
            @Override
            public void onSucess(KeChengBean data) {
//                MyShangChengPresenter.this.ke1=ke;
                getView().showData(data,ke);
            }

            @Override
            public void onError(String msg, int code) {
                getView().showError(msg,code);

            }
        },getLifecycleProvider());
    }
}
