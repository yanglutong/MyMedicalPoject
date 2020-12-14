package com.yang.mymedicalpoject.login;

import androidx.annotation.Nullable;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.http.httplibrary.conifg.GlobalConfig;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.MyApp;
import com.yang.mymedicalpoject.login.bean.LoginBean;
import com.yang.mymedicalpoject.login.model.MyLoginModel;
import com.yang.mymedicalpoject.login.presenter.MyLoginPresenter;
import com.yang.mymedicalpoject.register.view.UserRegisterActivity;
import com.yang.mymedicalpoject.ui.activity.ForGetPasswordActivity;
import com.yang.mymedicalpoject.ui.activity.HomeActivity;
import com.yang.mymedicalpoject.utils.ToastUtils;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends BaseMvpActivity<MyLoginConstants.MyLoginView,MyLoginModel,MyLoginPresenter> implements View.OnClickListener , MyLoginConstants.MyLoginView {

    //手机号快速登录
    private TextView tvQuickLogin;
    //忘记密码
    private TextView tv_find_pass;

    //账号密码登录
    private TextView tv_pass_login;

    private View view;
    private View view_pass;
    private View view_quick;
    //获取验证码
    private TextView tv_quick_get_code;

    private View view2;

    //86+
    private TextView txt1;

    private View view1;

    //手机号快速登录的界面
    private LinearLayout ll_quick;

    //账号密码登录的界面
    private LinearLayout ll_pass;


    //用户注册界面
    private TextView tv_register;
    //用户手机号快速登录的用户注册界面
    private TextView tv_quick_register;
    private String name;
    private String pass;
    private EditText et_phone;
    private EditText et_pass;

    //点击登录

    private TextView tv_login;


    @Override
    protected int createLayoutId() {
        //123456
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initMvpData() {
        //查找控件
        tvQuickLogin = findViewById(R.id.tv_quick_login);
        tv_find_pass = findViewById(R.id.tv_find_pass);
        tv_pass_login = findViewById(R.id.tv_pass_login);
        view_pass = findViewById(R.id.view_pass);
        view_quick = findViewById(R.id.view_quick);
        //
        tv_login = findViewById(R.id.tv_login);

        tv_quick_get_code = findViewById(R.id.tv_quick_get_code);
        ll_pass = findViewById(R.id.ll_pass);
        txt1 = findViewById(R.id.txt1);
        view1 = findViewById(R.id.view1);
        view2 = findViewById(R.id.view2);
        view = findViewById(R.id.view);
        ll_quick = findViewById(R.id.ll_quick);
        tv_register = findViewById(R.id.tv_register);
        et_phone = findViewById(R.id.et_phone);
        et_pass = findViewById(R.id.et_pass);
        tv_quick_register = findViewById(R.id.tv_quick_register);

        
        //监听
        tvQuickLogin.setOnClickListener(this);
        tv_find_pass.setOnClickListener(this);
        tv_pass_login.setOnClickListener(this);
        tv_login.setOnClickListener(this);
        tv_register.setOnClickListener(this);
        tv_quick_register.setOnClickListener(this);


    }

    @Override
    protected MyLoginPresenter createPresenter() {
        return new MyLoginPresenter();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&resultCode==2){
            ll_pass.setVisibility(View.VISIBLE);
            ll_quick.setVisibility(View.GONE);
            view_quick.setVisibility(View.GONE);
            view_pass.setVisibility(View.VISIBLE);
            String action = data.getAction();
            if(action.equals("name")){
                name = data.getStringExtra("phone");
                pass = data.getStringExtra("pass");
                et_phone.setText(name);
                et_pass.setText(pass);
            }
        }
    }

    //监听控件
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_login:
                //点击获取账号和密码登录
                String name = et_phone.getText().toString();

                String passWord = et_phone.getText().toString();

                if(!TextUtils.isEmpty(name)){
                    if(name.length()==11){
                        if(!TextUtils.isEmpty(passWord)){

                            SharedPreferences preferences = getSharedPreferences("name", MODE_PRIVATE);
                            SharedPreferences.Editor edit = preferences.edit();
                            edit.putString("token","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIzMjg4MSIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4yNi44IiwidGltZSI6MTY2NzM4NTMxN30.fqulOziAVeQyNAllnfIaSGfWeJsMd4l8gGH50_PUzx4");
                            edit.commit();
                            //A-uthorization
                            Map<String, Object> map = new HashMap<>();
                            map.put("A-uthorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIzMjg4MSIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4yNi44IiwidGltZSI6MTY2NzM4NTMxN30.fqulOziAVeQyNAllnfIaSGfWeJsMd4l8gGH50_PUzx4");
                            GlobalConfig.getInstance().setBaseHeades(map);
//                                mPresenter.getLoginData(name,passWord);
                            MyApp.openActivity(LoginActivity.this, HomeActivity.class);
                            finish();
                        }else{
                            ToastUtils.showToast(LoginActivity.this,"密码不能为空");
                        }

                    }else{
                        ToastUtils.showToast(LoginActivity.this,"手机号必须十一位");
                    }
                }else{
                    ToastUtils.showToast(LoginActivity.this,"用户名不能为空");
                }
                break;
            //手机号登录
            case R.id.tv_quick_login:
                tv_find_pass.setVisibility(View.GONE);
                this.view.setVisibility(View.GONE);
                view_pass.setVisibility(View.GONE);
                view_quick.setVisibility(View.VISIBLE);
                tv_quick_get_code.setVisibility(View.VISIBLE);
                ll_pass.setVisibility(View.GONE);
                ll_quick.setVisibility(View.VISIBLE);
                
                break;
                //账号密码登录
            case R.id.tv_pass_login:
                tv_find_pass.setVisibility(View.VISIBLE);
                this.view.setVisibility(View.VISIBLE);
                view_pass.setVisibility(View.VISIBLE);
                view_quick.setVisibility(View.GONE);
                tv_quick_get_code.setVisibility(View.GONE);
                ll_pass.setVisibility(View.VISIBLE);
                ll_quick.setVisibility(View.GONE);
                break;
            case R.id.tv_find_pass:
                //点击忘记密码跳转到获取验证码登录
                MyApp.openActivity(LoginActivity.this, ForGetPasswordActivity.class);
                break;
            case R.id.tv_register:
                //点击忘记密码跳转到获取验证码登录
                Intent intent = new Intent(LoginActivity.this,UserRegisterActivity.class);
                startActivityForResult(intent,1);
//                MyApp.openActivity(WelcomeActivity.this, UserRegisterActivity.class);
                break;
                case R.id.tv_quick_register:{
                    //点击忘记密码跳转到获取验证码登录
                    Intent intent2 = new Intent(LoginActivity.this,UserRegisterActivity.class);
                    startActivityForResult(intent2,1);
//                    MyApp.openActivity(WelcomeActivity.this,UserRegisterActivity.class);
                    break;
                }

        }
    }
    @Override
    public void showData(LoginBean loginBean) {
            loginBean.getToken().getRefresh_token();
            ToastUtils.showToast(LoginActivity.this,"登录成功");

            //将用户登录后的token存放
        String refresh_token = loginBean.getToken().getRefresh_token();
        Log.i("杨路通", "refresh_token: "+refresh_token);
        String access_token = loginBean.getToken().getAccess_token();

        Map<String, Object> map = new HashMap<>();
        map.put("A-uthorization","Bearer "+access_token);
        //获取登录的请求头存放到类里面


        GlobalConfig.getInstance().setBaseHeades(map);
        Log.i("杨路通", "showData: "+access_token);
        MyApp.openActivity(LoginActivity.this, HomeActivity.class);
        finish();
    }

    @Override
    public void showError(String msg, int code) {
            Log.i("杨路通", "LoginActivity_showError: "+msg+code);
            ToastUtils.showToast(LoginActivity.this,"登录失败"+msg+code);
    }
}