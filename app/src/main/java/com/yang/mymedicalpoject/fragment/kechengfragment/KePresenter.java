package com.yang.mymedicalpoject.fragment.kechengfragment;


import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.example.mvplibrary.base.presenter.BasePresenterIml;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/25 20:43
 */
public class KePresenter extends BasePresenterIml<yiContantsKe.yiView, KeModel> implements yiContantsKe.yiPresenter, ModelBaseCallBack<KeBean> {

    @Override
    public void onSucess(KeBean data) {
        getView().Show(data);
    }

    @Override
    public void onError(String error, int code) {
        getView().error(error);
    }

    @Override
    public void getData() {
       getModel().getData(this, getLifecycleProvider());
    }


}
