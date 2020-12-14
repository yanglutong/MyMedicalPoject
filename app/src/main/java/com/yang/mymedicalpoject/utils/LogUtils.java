package com.yang.mymedicalpoject.utils;

import android.util.Log;

public class LogUtils {
    public static void logCatE(String msg){
        Log.e("杨路通", "logCat: "+msg);
    }
    public static void logCatI(String msg,int code){
        Log.i("杨路通", "logCat: "+msg+code);
    }
}
