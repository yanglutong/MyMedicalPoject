package com.yang.mymedicalpoject.register.http;

import com.google.gson.JsonElement;

/**
 * 项目名：2007
 * 包名：  com.example.myapplication.http
 * 文件名：Response
 * 创建者：liangxq
 * 创建时间：2020/11/9  14:58
 * 描述：TODO
 */
public class Response {
    /**
     * ret : 200
     * info :
     * mas : 成功
     */

    private String ret;
    private JsonElement info;
    private String mas;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public JsonElement getInfo() {
        return info;
    }

    public void setInfo(JsonElement info) {
        this.info = info;
    }

    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }
}
