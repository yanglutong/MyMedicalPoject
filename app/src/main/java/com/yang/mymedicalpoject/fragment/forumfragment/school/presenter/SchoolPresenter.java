package com.yang.mymedicalpoject.fragment.forumfragment.school.presenter;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.fragment.forumfragment.school.SchoolConstants;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.SchoolBean;
import com.yang.mymedicalpoject.fragment.forumfragment.school.model.SchoolModel;

import java.util.ArrayList;

public class SchoolPresenter extends BasePresenterIml<SchoolConstants.MyView,SchoolModel> implements SchoolConstants.MyPresenter, ModelBaseCallBack<ArrayList<SchoolBean>> {

    @Override
    public void getData() {
        getModel().getModel(this,getLifecycleProvider());
    }

    @Override
    public void onSucess(ArrayList<SchoolBean> data) {
        getView().showData(data);
    }

    @Override
    public void onError(String msg, int code) {
        getView().showError(msg,code);
    }
}
