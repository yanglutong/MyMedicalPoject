package com.yang.mymedicalpoject.fragment.forumfragment.school.model;

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
import com.yang.mymedicalpoject.fragment.forumfragment.school.SchoolConstants;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.RecyclerBean;
import com.yang.mymedicalpoject.register.http.HttpCallBack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SchoolRecyclerModel extends BaseModel implements SchoolConstants.MyRecyclerModel {

    @Override
    public void getModel(int id, int p, ModelBaseCallBack<ArrayList<RecyclerBean>> modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        Map<String, Object> map = new HashMap<>();
        map.put("id",id+"");
        map.put("p",p+"");

        Map<String, Object> heades = GlobalConfig.getInstance().getBaseHeades();

        System.out.println("-------[for-each循环遍历]通过EntrySet取出map数据-------");
        Set<Map.Entry<String, Object>> entrys = heades.entrySet();  //此行可省略，直接将map.entrySet()写在for-each循环的条件中
        for(Map.Entry<String, Object> entry:entrys){
            System.out.println("key值："+entry.getKey()+" value值："+entry.getValue());
        }

        new HttpClient.Buidler()
                .post()
                .setBaseUrl(Constants.BaseUrl)
                .setApiUrl(Api.SCHOOL_ITEM)
                .setHeadres(heades)
                .setParamser(map)
                .build().enqueue(new HttpCallBack<ArrayList<RecyclerBean>>() {
            @Override
            public void error(String error, int code) {
                if(error!=null){
                    modelBaseCallBack.onError(error,code);
                }
            }

            @Override
            public ArrayList<RecyclerBean> convert(JsonElement result) {
                return (ArrayList<RecyclerBean>) JsonUtils.jsonToClassList(result,RecyclerBean.class);
            }

            @Override
            public void onSucess(ArrayList<RecyclerBean> schoolBeans) {
                Log.i("杨路通", "SchoolRecyclerModelonSucess: "+schoolBeans.size());
                if(schoolBeans.size()>0){
                    modelBaseCallBack.onSucess(schoolBeans);
                }
            }
        });
    }
}
