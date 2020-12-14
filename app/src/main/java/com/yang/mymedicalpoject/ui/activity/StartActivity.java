package com.yang.mymedicalpoject.ui.activity;

import androidx.annotation.NonNull;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.MyApp;
import com.yang.mymedicalpoject.login.LoginActivity;

/*
* 启动页
* */
public class StartActivity extends BaseMvpActivity {

    private TextView skip;
    private int time=3;
    private boolean du=false;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if(time<=3){
                if(time==0){
                    if(!du){
                        MyApp.openActivity(StartActivity.this, LoginActivity.class);
                        finish();
                    }
                }
                skip.setText(time+" "+"秒跳过");
               time--;
               handler.sendEmptyMessageDelayed(1,1000);
            }

        }
    };
    private TextView tv_in;

    @Override
    protected void initMvpData() {
        skip = findViewById(R.id.start_skip);
        tv_in = findViewById(R.id.tv_in);
        initData();
    }

    private void initData() {
        //设置延时跳转页面
        handler.sendEmptyMessageDelayed(1,1000);
        //设置点击监听
        skip.setOnClickListener(view -> {
            MyApp.openActivity(StartActivity.this, LoginActivity.class);
            MyApp.showToast(StartActivity.this,"请先进行登录");
            du=true;
        });
        tv_in.setOnClickListener(view -> {
            MyApp.openActivity(StartActivity.this, LoginActivity.class);
            MyApp.showToast(StartActivity.this,"请先进行登录");
            du=true;
        });
    }

    @Override
    protected BasePresenterIml createPresenter() {
        return null;
    }

    @Override
    protected int createLayoutId() {
        return R.layout.fragment_welcome;
    }
}