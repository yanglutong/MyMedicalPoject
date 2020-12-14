package com.yang.mymedicalpoject.fragment.shang_cheng_fragment.model;

import com.example.mvplibrary.base.model.BaseModel;
import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.conifg.GlobalConfig;
import com.http.httplibrary.utils.JsonUtils;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.yang.mymedicalpoject.base.Constants.Api;
import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ConstantsInfo;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.InfoBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;

import java.util.HashMap;
import java.util.Map;

public class ShoppingInfoModel extends BaseModel implements ConstantsInfo.Model {

    @Override
    public void getModel(String id,ModelBaseCallBack<InfoBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> map = new HashMap<>();
        map.put("id",id);
        new HttpClient.Buidler()
                    .post()
                    .setBaseUrl(Constants.BaseUrl)
                    .setApiUrl( Api.SHOPPING)
                    .setHeadres(GlobalConfig.getInstance().getBaseHeades())
                    .setParamser(map)
                    .build().enqueue(new HttpCallBack<InfoBean>() {
                @Override
                public void error(String error, int code) {
                    modelBaseCallBack.onError(error,code);
                }

                @Override
                public InfoBean convert(JsonElement result) {
                    return JsonUtils.jsonToClass(result,InfoBean.class);
                }

                @Override
                public void onSucess(InfoBean infoBean) {
                    modelBaseCallBack.onSucess(infoBean);
                }
            });
    }
}
