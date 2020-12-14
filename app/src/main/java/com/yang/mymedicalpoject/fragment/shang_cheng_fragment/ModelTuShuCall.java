package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

public interface ModelTuShuCall<T> {
    void onTuShu(T data);

    void onError(String msg, int code);
}
