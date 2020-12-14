package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.model;

import android.util.Log;

import com.example.mvplibrary.base.model.BaseModel;

import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.utils.JsonUtils;
import com.trello.rxlifecycle2.LifecycleProvider;

import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.FuromChildConstans;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean.FuromChildBean;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.http.CallBack;

import java.util.HashMap;

public class FuromChildModelIml extends BaseModel implements FuromChildConstans.FuromChildModel {
    private HashMap<String, Object> stringObjectHashMap;
    private static final String TAG = "FuromChildModelIml";
    @Override
    public void getFuromChild(ModelBaseCallBack<FuromChildBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("A-uthorization", "Bearer " + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIzMjg4MSIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4yNi44IiwidGltZSI6MTY2NzM4NTMxN30.fqulOziAVeQyNAllnfIaSGfWeJsMd4l8gGH50_PUzx4");
        new HttpClient.Buidler()
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl("index.php/forumjy/forum_jy_index")
                .setLifecycleProvider(lifecycleProvider)
                .setHeadres(stringObjectHashMap)
                .post()
                .build().enqueue(new CallBack<FuromChildBean>() {
            @Override
            public FuromChildBean convert(JsonElement result) {
                return new JsonUtils().jsonToClass(result,FuromChildBean.class);
            }

            @Override
            public void onSucess(FuromChildBean o) {
                Log.i("杨路通", "FuromChildModelIml: "+o.getArticle().size());
                modelBaseCallBack.onSucess(o);

            }

            @Override
            public void error(String error, int code) {
                Log.i(TAG, "error: "+error);
                modelBaseCallBack.onError(error,code);

            }
        });

    }
}
