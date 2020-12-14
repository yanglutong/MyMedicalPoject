package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.presenter;

import android.util.Log;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.FuromChildConstans;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean.FuromChildBean;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.model.FuromChildModelIml;


public class FuromChildPresenterIml extends BasePresenterIml<FuromChildConstans.FuromChildView, FuromChildModelIml>
        implements FuromChildConstans.FuromChildPresenter {
    private static final String TAG = "FuromChildPresenterIml";
    @Override
    public void getFuromChild() {
getModel().getFuromChild(new ModelBaseCallBack<FuromChildBean>() {
    @Override
    public void onSucess(FuromChildBean data) {
        Log.i("杨路通", "onSucess: "+data);
        getView().showFuromChild(data);
    }

    @Override
    public void onError(String msg, int code) {
        Log.i(TAG, "onError: "+msg);


    }
},getLifecycleProvider());
    }
}
