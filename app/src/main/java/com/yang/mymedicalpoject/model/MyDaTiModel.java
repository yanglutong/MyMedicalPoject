package com.yang.mymedicalpoject.model;

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
import com.yang.mymedicalpoject.bean.DaTiBean;
import com.yang.mymedicalpoject.constants.MyDaTiConstants;
import com.yang.mymedicalpoject.register.MyRegisterConstants;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;
import com.yang.mymedicalpoject.register.model.ModelRegisterCallBack;

import java.util.HashMap;
import java.util.Map;

public class MyDaTiModel extends BaseModel implements MyDaTiConstants.MyModel {


    @Override
    public void getDataModel(String phone, ModelBaseCallBack<DaTiBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ti_id",phone);
        new HttpClient.Buidler()
                .post()
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.HOME_DATI)
                .setLifecycleProvider(lifecycleProvider)
                .setHeadres(GlobalConfig.getInstance().getBaseHeades())
                .setParamser(map)
                .build().enqueue(new HttpCallBack<DaTiBean>() {
            @Override
            public void error(String error, int code) {

                modelBaseCallBack.onError(error,code);
            }

            @Override
            public DaTiBean convert(JsonElement result) {
                return JsonUtils.jsonToClass(result,DaTiBean.class);
            }

            @Override
            public void onSucess(DaTiBean daTiBean) {
                modelBaseCallBack.onSucess(daTiBean);
            }
        });
    }
}
