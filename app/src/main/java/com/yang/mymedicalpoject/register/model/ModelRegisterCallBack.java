package com.yang.mymedicalpoject.register.model;

public interface ModelRegisterCallBack<T> {
    void showDataMessage(T t);
    void showError(String or,int and);
}
