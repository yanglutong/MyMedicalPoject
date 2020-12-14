package com.yang.mymedicalpoject.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import com.http.httplibrary.callback.BaseObserver;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.manager.RetrofitManager;
import com.http.httplibrary.server.HttpServer;
import com.http.httplibrary.utils.JsonUtils;
import com.yang.mymedicalpoject.R;

import com.yang.mymedicalpoject.jsonRequest.HttpCallBack;
import com.yang.mymedicalpoject.jsonRequest.bean.JsonBean;
import com.yang.mymedicalpoject.jsonRequest.bean.JsonShiTiLei;
import com.yang.mymedicalpoject.utils.MyTitleBar;

import java.util.HashMap;
import java.util.List;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        MyTitleBar viewById = findViewById(R.id.tabbar);
//        viewById.findViewById(R.id.)
//        initData();
//        initView();
        //检测内存泄漏方法
//        initLeak();
        initDemo();
    }

    private void initDemo() {
        String str="杨路通123";
        Log.i("杨路通", "initDemo: "+str.length());
        if(str.length()>=9){
            Log.i("杨路通", "initDemo: "+str);
        }
    }

    private void initView() {
        //MediaType指的是要传递的数据的MIME类型
        /*
        json : application/json
        xml : application/xml
        png : image/png
        jpg : image/jpeg
        gif : imge/gif
        * */                                                   //编码格式
        MediaType parse = MediaType.parse("application/json; charset=utf-8");
        //创建实体类
        JsonShiTiLei jsonShiTiLei = new JsonShiTiLei(0);
        //创建请求体
        RequestBody requestBody = RequestBody.create(parse, JsonUtils.classToJson(jsonShiTiLei));
        //Retrofit 网络请求
        //获取Retrofit的管理器 单例模式 两个参数 后面的是baseurl
        HttpServer server = RetrofitManager.getInstance().
                createServer(HttpServer.class, "http://169.254.64.55:8080/kotlin/");
        //进行postJson请求
        server.postjson("category/getCategory",requestBody,new HashMap<String, Object>())
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
        .subscribe(new BaseObserver() {
            @Override
            public void sucess(Object object) {
                Log.i("杨路通", "sucess: "+object.toString());
            }

            @Override
            public void error(String error, int code) {

            }
        });


    }

    private void initData() {
        String json="{\"parentId\":0}";

        JsonShiTiLei jsonShiTiLei = new JsonShiTiLei(0);
        //将实体类转成json串
        String s = new Gson().toJson(jsonShiTiLei);
        //jsonPost请求
        new HttpClient.Buidler().setBaseUrl("http://169.254.64.55:8080/kotlin/")
                .setApiUrl("category/getCategory")
                .setJson(true)
                .setJsonbody(JsonUtils.classToJson(jsonShiTiLei)).post().build().enqueue(new HttpCallBack<List<JsonBean>>() {
            @Override
            public void error(String error, int code) {
                Log.i("杨路通", "error: "+error+code);
            }

            @Override
            public List<JsonBean> convert(JsonElement result) {
                return JsonUtils.jsonToClassList(result,JsonBean.class);
            }

            @Override
            public void onSucess(List<JsonBean> jsonBeans) {
                Log.i("杨路通", "onSucess: "+jsonBeans.get(0).getCategoryName());
            }
        });
    }
}