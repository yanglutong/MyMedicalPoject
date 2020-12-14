package com.yang.mymedicalpoject.jsonRequest;

import com.google.gson.JsonElement;
import com.http.httplibrary.callback.BaseCallBack;
import com.http.httplibrary.utils.JsonUtils;
import com.yang.mymedicalpoject.jsonRequest.Response;

/**
 * 项目名：2007
 * 包名：  com.example.myapplication.http
 * 文件名：HttpCallBack1
 * 创建者：liangxq
 * 创建时间：2020/11/10  9:40
 * 描述：TODO
 */
public abstract class HttpCallBack<T> extends BaseCallBack<T> {

    Response baseResponse;
    @Override
    protected T onConvert(String result) {
        T t=null;
        baseResponse = JsonUtils.jsonToClass(result, Response.class);
        JsonElement data = baseResponse.getData();
        int errorCode = baseResponse.getStatus();
        String errorMsg = baseResponse.getMessage();
        switch (errorCode){
            case -1001:
                error(errorMsg,errorCode);
                break;
            case 0:
                t=convert(data);
                break;
        }
        return t;
    }


    @Override
    public boolean isCodeSuccess() {
        return baseResponse.getStatus()==0;
    }
}
