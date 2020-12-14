package com.yang.mymedicalpoject.shijianfenfa;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        this(context,null);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    //分发
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("杨路通", "dispatchTouchEvent: "+this.toString());
        return super.dispatchTouchEvent(ev);
    }
    //消费
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("杨路通", "onTouchEvent: "+event.toString());
        return super.onTouchEvent(event);
    }
    //拦截
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("杨路通", "onInterceptTouchEvent: "+ev.toString());
        return true;
    }
}
