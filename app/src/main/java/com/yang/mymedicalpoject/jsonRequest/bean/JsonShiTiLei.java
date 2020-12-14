package com.yang.mymedicalpoject.jsonRequest.bean;
/*
* 每一次的json都可以存放到实体类进行调用
* */
public class JsonShiTiLei {
    private int parentId;
    public JsonShiTiLei() {
    }

    public JsonShiTiLei(int json) {
        this.parentId = json;
    }

    public int getJson() {
        return parentId;
    }

    public void setJson(int json) {
        this.parentId = json;
    }
}
