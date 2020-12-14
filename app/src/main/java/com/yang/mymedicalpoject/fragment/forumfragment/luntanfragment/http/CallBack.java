package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.http;


import com.google.gson.JsonElement;
import com.http.httplibrary.callback.BaseCallBack;
import com.http.httplibrary.utils.JsonUtils;
import com.yang.mymedicalpoject.register.http.Response;

public abstract class CallBack<T> extends BaseCallBack<T> {
    Response respone;
    @Override
    protected T onConvert(String result) {
        T t=null;
        respone= JsonUtils.jsonToClass(result,Response.class);
        JsonElement info = respone.getInfo();
        String mas = respone.getMas();
        String ret = respone.getRet();
        if(ret.equals("200")){
            t=convert(info);
        }else{
            error("错误",100);
        }
        return t;
    }

    @Override
    public boolean isCodeSuccess() {
        return respone.getRet().equals("200");
    }
}
