package com.yang.mymedicalpoject.fragment.kechengfragment;


import com.google.gson.JsonElement;
import com.http.httplibrary.callback.BaseCallBack;
import com.http.httplibrary.utils.JsonUtils;
import com.yang.mymedicalpoject.jsonRequest.Response;

public abstract class RefitCallBack<T> extends BaseCallBack<T> {
    Response2 response;
    @Override
    protected T onConvert(String result) {
        T t=null;
        response= JsonUtils.jsonToClass(result, Response2.class);
        JsonElement info = response.getInfo();
        String mas = response.getMas();
        String ret = response.getRet();
        if(ret.equals("200")){
            t=convert(info);
        }else{
            error("失败",100);
        }


        return t;
    }

    @Override
    public boolean isCodeSuccess() {
        return response.getRet().equals("200");
    }
}
