package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.model;

import android.util.Log;

import com.example.mvplibrary.base.model.BaseModel;
import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.conifg.GlobalConfig;
import com.http.httplibrary.utils.JsonUtils;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.base.Constants.Api;
import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.MyGuanFangConstants;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean.GuanFangBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;

import java.util.HashMap;
import java.util.Map;

public class MyGuanFangModel extends BaseModel implements MyGuanFangConstants.MyModel {

    @Override
    public void getModel(String p,ModelBaseCallBack<Object> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> heades = GlobalConfig.getInstance().getBaseHeades();
        Map<String, Object> map = new HashMap<>();
        map.put("p",p);
        new  HttpClient.Buidler()
                .post()
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.FORUM_GF)
                .setHeadres(heades)
                .setParamser(map)
                .build().enqueue(new HttpCallBack<GuanFangBean>() {
            @Override
            public void error(String error, int code) {
                modelBaseCallBack.onError(error,code);
            }

            @Override
            public GuanFangBean convert(JsonElement result) {
                return JsonUtils.jsonToClass(result,GuanFangBean.class);
            }

            @Override
            public void onSucess(GuanFangBean guanFangBean) {
                Log.i("杨路通", "MyGuanFangModel onSucess: "+guanFangBean.getArticle().size());
                modelBaseCallBack.onSucess(guanFangBean);
            }
        });
    }
}
