package com.yang.mymedicalpoject.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    public static void showToast(Context context,String toast){
        Toast.makeText(context, ""+toast, Toast.LENGTH_SHORT).show();
    }
}
