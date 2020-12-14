package com.yang.mymedicalpoject.jsonRequest;

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

    int status;
    JsonElement data;
    String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
