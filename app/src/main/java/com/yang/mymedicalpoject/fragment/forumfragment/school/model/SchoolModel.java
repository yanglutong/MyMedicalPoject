package com.yang.mymedicalpoject.fragment.forumfragment.school.model;

import com.example.mvplibrary.base.model.BaseModel;
import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.conifg.GlobalConfig;
import com.http.httplibrary.utils.JsonUtils;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.base.Constants.Api;
import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.fragment.forumfragment.school.SchoolConstants;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.SchoolBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;

import java.util.ArrayList;
import java.util.Map;

public class SchoolModel extends BaseModel implements SchoolConstants.MyModel {

    @Override
    public void getModel(ModelBaseCallBack<ArrayList<SchoolBean>> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> heades = GlobalConfig.getInstance().getBaseHeades();
        new HttpClient.Buidler()
                .post()
                .setHeadres(heades)
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.SCHOOL_TAB)
                .build().enqueue(new HttpCallBack<ArrayList<SchoolBean>>() {
            @Override
            public void error(String error, int code) {
                modelBaseCallBack.onError(error,code);
            }

            @Override
            public ArrayList<SchoolBean> convert(JsonElement result) {
                return (ArrayList<SchoolBean>) JsonUtils.jsonToClassList(result,SchoolBean.class);
            }
            @Override
            public void onSucess(ArrayList<SchoolBean> schoolBeans) {
                modelBaseCallBack.onSucess(schoolBeans);
            }
        });
    }
}
