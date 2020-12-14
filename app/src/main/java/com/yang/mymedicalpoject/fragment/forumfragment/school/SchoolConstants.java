package com.yang.mymedicalpoject.fragment.forumfragment.school;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.RecyclerBean;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.SchoolBean;

import java.util.ArrayList;

public interface SchoolConstants {
    interface MyView extends BaseView{
        void showData(ArrayList<SchoolBean> schoolBeans);
        void showError(String msg,int c);
    }
    interface MyPresenter{
        void getData();
    }
    interface MyModel{
        void getModel(ModelBaseCallBack<ArrayList<SchoolBean>> modelBaseCallBack, LifecycleProvider lifecycleProvider);
    }
    interface MyRecyclerView extends BaseView{
        void showData(ArrayList<RecyclerBean> recyclerBeans);
        void showError(String msg,int c);
    }
    interface MyRecyclerPresenter{
        void getData(int id, int p);
    }
    interface MyRecyclerModel{
        void getModel(int id, int p, ModelBaseCallBack<ArrayList<RecyclerBean>> modelBaseCallBack, LifecycleProvider lifecycleProvider);
    }
}
