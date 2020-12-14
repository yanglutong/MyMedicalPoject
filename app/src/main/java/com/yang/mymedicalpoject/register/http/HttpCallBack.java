package com.yang.mymedicalpoject.register.http;

import com.google.gson.JsonElement;
import com.http.httplibrary.callback.BaseCallBack;
import com.http.httplibrary.utils.JsonUtils;

/**
 * 项目名：2007
 * 包名：  com.example.myapplication.http
 * 文件名：HttpCallBack
 * 创建者：liangxq
 * 创建时间：2020/11/9  14:57
 * 描述：TODO
 */
public abstract class HttpCallBack<T> extends BaseCallBack<T> {
    Response response;
    @Override
    protected T onConvert(String result) {
        T t=null;
        response= JsonUtils.jsonToClass(result,Response.class);
        JsonElement info = response.getInfo();
        String mas = response.getMas();
        String ret = response.getRet();
        if(ret.equals("200")){
            t=convert(info);
        }else{
            error(mas, Integer.parseInt(ret));
        }
        return t;
    }

    @Override
    public boolean isCodeSuccess() {
        return response.getRet().equals("200");
    }
}
