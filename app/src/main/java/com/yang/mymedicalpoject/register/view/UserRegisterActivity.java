package com.yang.mymedicalpoject.register.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.MyApp;
import com.yang.mymedicalpoject.register.MyRegisterConstants;
import com.yang.mymedicalpoject.register.bean.RegisterBean;
import com.yang.mymedicalpoject.register.bean.RegisterCodeBean;
import com.yang.mymedicalpoject.register.model.MyRegisterModel;
import com.yang.mymedicalpoject.register.presenter.MyRegisterPresenter;
import com.yang.mymedicalpoject.ui.activity.web.WebViewActivity;
import com.yang.mymedicalpoject.utils.TimerUtil;
import com.yang.mymedicalpoject.utils.ToastUtils;

public class UserRegisterActivity extends BaseMvpActivity<MyRegisterConstants.MyRegisterView, MyRegisterModel, MyRegisterPresenter> implements View.OnClickListener, MyRegisterConstants.MyRegisterView {


    private TextView tvUserRegisterCode;
    private EditText etUserRegisterPhone;
    private Button userRegister_registerButton;
    private int code;
    private EditText etUserRegisterPass;
    private CheckBox userRegisterCheck;
    private String name;
    private String passWord;
    private String str;
    private String phone;
    private TimerUtil timerUtil;
    private ImageView userLogin_tuiChu;
    private TextView user_registerCheckBox_txt;

    @Override
    protected int createLayoutId() {
        return R.layout.activity_user_register;
    }

    @Override
    protected void initMvpData() {
            //找到控件方法
            initFindViewById();

    }

    private void initData() {
            Intent intent = new Intent();
            intent.setAction("name");
            intent.putExtra("phone",phone);
            intent.putExtra("pass",passWord);
            //回传值
            setResult(2,intent);
            finish();
    }

    @Override
    protected MyRegisterPresenter createPresenter() {
        return new MyRegisterPresenter();
    }


    private void initFindViewById() {
        user_registerCheckBox_txt = findViewById(R.id.user_registerCheckBox_txt);
        //获取文本验证码
        EditText etUserRegisterCode = findViewById(R.id.etUserRegisterCode);
        //获取密码
        etUserRegisterPass = findViewById(R.id.etUserRegisterPass);
        //获取手机号
        etUserRegisterPhone = findViewById(R.id.etUserRegisterPhone);
        //点击退出
        userLogin_tuiChu = findViewById(R.id.userLogin_TuiChu);
        //同意阅读协议
        userRegisterCheck = findViewById(R.id.userRegisterCheck);

        //获取请求验证码
        tvUserRegisterCode = findViewById(R.id.tvUserRegisterCode);
        //点击快速注册

        userRegister_registerButton = findViewById(R.id.userRegister_registerButton);

        tvUserRegisterCode.setOnClickListener(this);
        userLogin_tuiChu.setOnClickListener(this);
        userRegister_registerButton.setOnClickListener(this);

        //获取文本Html类型的资源文件
        String string = getResources().getString(R.string.checkbox_text);
        //将获取的资源转换成Html类型所支持的并设置到文本上
        user_registerCheckBox_txt.setText(Html.fromHtml(string));
        user_registerCheckBox_txt.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.userLogin_TuiChu:
                    finish();
                    break;
                    case R.id.user_registerCheckBox_txt:
                        Bundle bundle=new Bundle();
                        bundle.putInt("flag",2);
                        MyApp.openActivity(UserRegisterActivity.this, WebViewActivity.class,bundle);
                    break;
                case R.id.tvUserRegisterCode : {
                    ToastUtils.showToast(UserRegisterActivity.this,"验证码发送成");
                    timerUtil = new TimerUtil(tvUserRegisterCode);
                    timerUtil.timersStart();
                    //判断手机号不能为空
                    SharedPreferences sharedPreferences = getSharedPreferences("phone", MODE_PRIVATE);
                    SharedPreferences.Editor edit = sharedPreferences.edit();

                    String phone = etUserRegisterPhone.getText().toString();

                    if (!TextUtils.isEmpty(phone)) {
                        //将账号保存起来
                        edit.putString("phone",phone);
                        edit.commit();

                        Log.i("杨路通", "onClick: "+phone);
                        if (phone.length() == 11) {
                            mPresenter.getData(phone);

                        } else {
                            ToastUtils.showToast(UserRegisterActivity.this, "手机号码为十一位数字");
                        }
                    } else {
                        ToastUtils.showToast(UserRegisterActivity.this, "请输入手机号");
                    }
                }
                break;
              case R.id.userRegister_registerButton :{

                    //点击快速注册时判断手机号不能为空
                  phone = etUserRegisterPhone.getText().toString();
                  String pass = etUserRegisterPass.getText().toString();

                  //判断阅读协议是否选中状态
                  if(userRegisterCheck.isChecked()){

                  if (!TextUtils.isEmpty(phone)) {

                        //是否是注册的手机号 是 注册
                      SharedPreferences phone1 = getSharedPreferences("phone", MODE_PRIVATE);
                      String string = phone1.getString("phone", "");
                      if(string.equals(phone)){
                          if(pass.length()>=6&&pass.length()<=12){
                              //提交注册
                              //获取手机号和验证码和密码
                              //请求网络返回数据

                              //用户名密码回传
                              name = etUserRegisterPhone.getText().toString();
                              passWord = etUserRegisterPass.getText().toString();
                              mPresenter.getRegister(phone,code,pass);

                          }else{
                              ToastUtils.showToast(UserRegisterActivity.this,"不支持此密码");
                          }



                      }else{
                          ToastUtils.showToast(UserRegisterActivity.this,"输入的手机号不正确");
                      }



                  } else {
                      ToastUtils.showToast(UserRegisterActivity.this, "手机号不能为空");
                  }
                  }else{
                      ToastUtils.showToast(UserRegisterActivity.this,"请同意注册条款");
                  }
                break; }

            }
    }

    @Override
    public void show(RegisterCodeBean registerCodeBean) {

        ToastUtils.showToast(UserRegisterActivity.this,"您的验证码为："+ registerCodeBean.getCode()+"");
        code = registerCodeBean.getCode();
    }

    @Override
    public void error(String msg, int code) {
        Log.i("杨路通", "error: "+msg+code);
    }


    @Override
    public void showMessage(RegisterBean registerBean) {
        str = "注册成功";
        ToastUtils.showToast(UserRegisterActivity.this, str);

        //回传
        initData();
    }

    @Override
    public void errorMessage(String error, int code) {
        ToastUtils.showToast(UserRegisterActivity.this,error);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(timerUtil!=null){
            timerUtil.cancelTimer();
        }
    }
}