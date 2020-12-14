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
import com.yang.mymedicalpoject.bean.YiYanBean;
import com.yang.mymedicalpoject.constants.YiYanConstants;
import com.yang.mymedicalpoject.register.MyRegisterConstants;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;
import com.yang.mymedicalpoject.register.model.ModelRegisterCallBack;

import java.util.HashMap;
import java.util.Map;

public class MyYiYanModel extends BaseModel implements YiYanConstants.MyModel {

    @Override
    public void getDataModel(String type, ModelBaseCallBack<YiYanBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> heades = GlobalConfig.getInstance().getBaseHeades();
        map.put("type",type);;
        new HttpClient.Buidler()
                .post()
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.HOME_YIYAN)
                .setLifecycleProvider(lifecycleProvider)
                .setHeadres(heades)
                .setParamser(map)
                .build().enqueue(new HttpCallBack<YiYanBean>() {
            @Override
            public void error(String error, int code) {
                    modelBaseCallBack.onError(error,code);
            }


            @Override
            public YiYanBean convert(JsonElement result) {
                return JsonUtils.jsonToClass(result,YiYanBean.class);
            }

            @Override
            public void onSucess(YiYanBean yiYanBean) {
                modelBaseCallBack.onSucess(yiYanBean);
            }
        });
    }
}
