package com.example.mvplibrary.base.activity;

import android.os.Bundle;


import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import androidx.annotation.Nullable;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 项目名：2007
 * 包名：  com.example.mvplibrary.base.activity
 * 文件名：BaseActvity
 * 创建者：liangxq
 * 创建时间：2020/11/7  14:17
 * 描述：TODO
 */
public abstract class BaseActvity extends RxAppCompatActivity{

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(createLayoutId());
        unbinder = ButterKnife.bind(this);
        initDataAndEcent();
    }

    //初始化操作
    protected  void initDataAndEcent(){

    }

    //创建视图
    protected abstract int createLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder!=null){
            unbinder.unbind();
        }
    }
}
