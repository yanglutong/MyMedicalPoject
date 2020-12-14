package com.yang.mymedicalpoject.register.model;

import android.util.Log;

import com.example.mvplibrary.base.model.BaseModel;
import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.utils.JsonUtils;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.base.Constants.Api;
import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.register.MyRegisterConstants;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;

import java.util.HashMap;
import java.util.Map;

public class MyRegisterModel extends BaseModel implements MyRegisterConstants.MyRegisterModel {

    @Override
    public void getDataModel(final String phone, ModelBaseCallBack<RegisterCodeBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> stringObjectMap = new HashMap<String, Object>();

        stringObjectMap.put("type", "1");
        stringObjectMap.put("phnoe", phone);


        Log.i("杨路通", "getDataModel: "+phone);
        new HttpClient.Buidler()
                .post()
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.CODE)
                .setParamser(stringObjectMap)
                .setLifecycleProvider(lifecycleProvider)
                .build().enqueue(new HttpCallBack<RegisterCodeBean>() {
            @Override
            public void error(String error, int code) {
                modelBaseCallBack.onError(error,code);
            }

            @Override
            public RegisterCodeBean convert(JsonElement result) {
                return JsonUtils.jsonToClass(result, RegisterCodeBean.class);
            }

            @Override
            public void onSucess(RegisterCodeBean registerCodeBean) {
                modelBaseCallBack.onSucess(registerCodeBean);
            }
        });

    }



    @Override
    public void getDataRegister(String phone,int code,String pass,ModelRegisterCallBack<RegisterBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        //
        Log.i("杨路通", "getDataModel: "+phone+code+pass);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("type","1");
        map.put("phnoe",phone);
        map.put("code",code+"");
        map.put("pass",pass);
        new HttpClient.Buidler()
                .post()
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.REGISTER_DATA)
                .setLifecycleProvider(lifecycleProvider)
                .setParamser(map)
                .build().enqueue(new HttpCallBack<RegisterBean>() {
            @Override
            public void error(String error, int code) {

                modelBaseCallBack.showError(error,code);
            }

            @Override
            public RegisterBean convert(JsonElement result) {
                return JsonUtils.jsonToClass(result,RegisterBean.class);
            }

            @Override
            public void onSucess(RegisterBean registerBean) {
                modelBaseCallBack.showDataMessage(registerBean);
            }
        });
    }
}
