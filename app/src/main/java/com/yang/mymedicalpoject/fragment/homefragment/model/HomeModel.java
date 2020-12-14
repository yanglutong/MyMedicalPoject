package com.yang.mymedicalpoject.fragment.homefragment.model;

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
import com.yang.mymedicalpoject.fragment.homefragment.HomeConstants;
import com.yang.mymedicalpoject.fragment.homefragment.bean.HomeBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;

import java.util.Map;
import java.util.Set;

public class HomeModel extends BaseModel implements HomeConstants.MyHomeModel {

    @Override
    public void getDataModel(ModelBaseCallBack<HomeBean> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> map = GlobalConfig.getInstance().getBaseHeades();
        //通过EntrySet取出map数据[for-each循环]
        System.out.println("-------[for-each循环遍历]通过EntrySet取出map数据-------");
        Set<Map.Entry<String, Object>> entrys = map.entrySet();  //此行可省略，直接将map.entrySet()写在for-each循环的条件中
        for(Map.Entry<String, Object> entry:entrys){
            System.out.println("key值："+entry.getKey()+" value值："+entry.getValue());
        }
        new HttpClient.Buidler()
                .post()
                //添加请求头Token
                .setHeadres(map)
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.HOME_REQUEST)
                .setLifecycleProvider(lifecycleProvider)
                .build().enqueue(new HttpCallBack<HomeBean>() {
            @Override
            public void error(String error, int code) {
                modelBaseCallBack.onError(error,code);
                Log.i("HomeModel_error", "error: "+error+code);
            }

            @Override
            public HomeBean convert(JsonElement result) {
                return JsonUtils.jsonToClass(result,HomeBean.class);
            }

            @Override
            public void onSucess(HomeBean homeBean) {
                modelBaseCallBack.onSucess(homeBean);
            }
        });
    }
}
