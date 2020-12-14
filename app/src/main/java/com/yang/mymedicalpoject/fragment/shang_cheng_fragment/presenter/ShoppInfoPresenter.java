package com.yang.mymedicalpoject.fragment.shang_cheng_fragment.presenter;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ConstantsInfo;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.InfoBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.model.ShoppingInfoModel;

public class ShoppInfoPresenter extends BasePresenterIml<ConstantsInfo.View, ShoppingInfoModel> implements ConstantsInfo.Presenter, ModelBaseCallBack<InfoBean> {

    @Override
    public void getData(String id) {
        getModel().getModel(id,this,getLifecycleProvider());
    }

    @Override
    public void onSucess(InfoBean data) {
        getView().showData(data);
    }

    @Override
    public void onError(String msg, int code) {
getView().showE(msg,code);
    }
}
