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
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ModelQuanBuCall;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ModelTuShuCall;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ShangChengConstants;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.KeChengBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.TuShuBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyShangCengModel extends BaseModel implements ShangChengConstants.MyShangChengModel {

    @Override
    public void getDataModelQuanBu(int BOOK, String start, String end, ModelQuanBuCall<QuanBuBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> map = new HashMap<>();
        map.put(start,"0");
        map.put(end,"0");
        //设置token
        Map<String, Object> heades = GlobalConfig.getInstance().getBaseHeades();

        new HttpClient.Buidler().post()
                .setLifecycleProvider(lifecycleProvider)
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.SC_QUANBU)
                .setParamser(map)
                .setHeadres(heades)
                .build().enqueue(new HttpCallBack<QuanBuBean>() {
            @Override
            public void error(String error, int code) {
                modelBaseCallBack.onError(error,code);
            }

            @Override
            public QuanBuBean convert(JsonElement result) {
                return JsonUtils.jsonToClass(result,QuanBuBean.class);
            }

            @Override
            public void onSucess(QuanBuBean quanBuBean) {
                modelBaseCallBack.onQuanBu(quanBuBean);

            }
        });
    }



    @Override
    public void getDataModelTuShu(int KECHENG, String p, ModelTuShuCall<List<TuShuBean>> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> map = new HashMap<>();
        map.put(p,1);

        //设置token
        Map<String, Object> heades = GlobalConfig.getInstance().getBaseHeades();

        new HttpClient.Buidler().post()
                .setLifecycleProvider(lifecycleProvider)
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.SC_TUSHU)
                .setParamser(map)
                .setHeadres(heades)
                .build().enqueue(new HttpCallBack<List<TuShuBean>>() {
            @Override
            public void error(String error, int code) {
                modelBaseCallBack.onError(error,code);
            }

            @Override
            public List<TuShuBean> convert(JsonElement result) {
                return JsonUtils.jsonToClassList(result,TuShuBean.class);
            }

            @Override
            public void onSucess(List<TuShuBean> quanBuBean) {
                modelBaseCallBack.onTuShu(quanBuBean);
                //18331877311
            }
        });
    }
    @Override
    public void getDataModelKeCheng(int ALL, String type, ModelBaseCallBack<KeChengBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> map = new HashMap<>();
        map.put(type,"0");

        //设置token
        Map<String, Object> heades = GlobalConfig.getInstance().getBaseHeades();

        new HttpClient.Buidler().post()
                .setLifecycleProvider(lifecycleProvider)
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.SC_KECHENG)
                .setParamser(map)
                .setHeadres(heades)
                .build().enqueue(new HttpCallBack<KeChengBean>() {
            @Override
            public void error(String error, int code) {
                modelBaseCallBack.onError(error,code);
            }

            @Override
            public KeChengBean convert(JsonElement result) {
                return JsonUtils.jsonToClass(result,KeChengBean.class);
            }

            @Override
            public void onSucess(KeChengBean quanBuBean) {
                modelBaseCallBack.onSucess(quanBuBean);
            }
        });
    }
}
