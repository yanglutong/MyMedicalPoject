package com.yang.mymedicalpoject.fragment.kechengfragment;

import android.util.Log;


import com.example.mvplibrary.base.model.BaseModel;
import com.example.mvplibrary.base.model.ModelBaseCallBack;
import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.conifg.GlobalConfig;
import com.http.httplibrary.utils.JsonUtils;
import com.trello.rxlifecycle2.LifecycleProvider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.ResourceSubscriber;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/25 20:41
 */
public class KeModel extends BaseModel implements yiContantsKe.yiModel{
    @Override
    public void getData(ModelBaseCallBack modelBaseCallBack, LifecycleProvider lifecycleProvider) {
        //商城的网络请求
     Map<String, Object> baseHeades = GlobalConfig.getInstance().getBaseHeades();
        GlobalConfig.getInstance().setBaseUrl("https://app.yiyanmeng.com/index.php/");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("p",1);
        hashMap.put("type",1);

        new HttpClient.Buidler()
                .get()
                .setLifecycleProvider(lifecycleProvider)
                .setHeadres(baseHeades)
                .setApiUrl("Kecheng/ke_index_list")
                .setParamser(hashMap)
                .build()
                .enqueue(new RefitCallBack<KeBean>() {

                    @Override
                    public KeBean convert(JsonElement result) {
                        return JsonUtils.jsonToClass(result,KeBean.class);
                    }

                    @Override
                    public void onSucess(KeBean keBeans) {
                        Log.d("ke_moel", "onSucess: "+keBeans);
                        modelBaseCallBack.onSucess(keBeans);
                    }



                    @Override
                    public void error(String error, int code) {
                        Log.d("ke_moel", "error: "+error);
                        modelBaseCallBack.onError(error,code);
                    }
                });


    }
}
