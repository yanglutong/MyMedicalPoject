package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

public interface ModelQuanBuCall<T> {
    void onQuanBu(T data);

    void onError(String msg,int code);
}
