package com.yang.mymedicalpoject.fragment.forumfragment.school.presenter;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.fragment.forumfragment.school.SchoolConstants;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.RecyclerBean;
import com.yang.mymedicalpoject.fragment.forumfragment.school.model.SchoolRecyclerModel;

import java.util.ArrayList;

public class SchoolRecyclerPresenter extends BasePresenterIml<SchoolConstants.MyRecyclerView, SchoolRecyclerModel> implements SchoolConstants.MyRecyclerPresenter, ModelBaseCallBack<ArrayList<RecyclerBean>> {
    @Override
    public void getData(int id, int p) {
        getModel().getModel(id,p,this, getLifecycleProvider());
    }

    @Override
    public void onSucess(ArrayList<RecyclerBean> data) {
        if(data!=null){
            if(getView()!=null){
                getView().showData(data);
            }
        }
    }

    @Override
    public void onError(String msg, int code) {
        if(msg!=null){
            if(getView()!=null){
                getView().showError(msg,code);
            }
        }
    }
}
