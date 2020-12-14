package com.yang.mymedicalpoject.login.model;

import android.util.Log;

import com.example.mvplibrary.base.model.BaseModel;
import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.constans.Constans;
import com.http.httplibrary.utils.JsonUtils;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.base.Constants.Api;
import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.login.MyLoginConstants;
import com.yang.mymedicalpoject.login.bean.LoginBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;

import java.util.HashMap;
import java.util.Map;

public class MyLoginModel extends BaseModel implements MyLoginConstants.MyLoginModel {

    @Override
    public void getModelData(String name,String pass,ModelBaseCallBack<LoginBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Log.i("杨路通", "getModelData: "+name+pass);
        Map<String, Object> map = new HashMap<>();
        map.put("name",name);
        map.put("pass",pass);
        new HttpClient.Buidler().post()
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.LOGIN_DATA)
                .setLifecycleProvider(lifecycleProvider)
                .setParamser(map)
                .build().enqueue(new HttpCallBack<LoginBean>() {
            @Override
            public void error(String error, int code) {
                modelBaseCallBack.onError(error,code);
            }

            @Override
            public LoginBean convert(JsonElement result) {
                return JsonUtils.jsonToClass(result,LoginBean.class);
            }

            @Override
            public void onSucess(LoginBean loginBean) {
                    modelBaseCallBack.onSucess(loginBean);
            }
        });
    }
}
