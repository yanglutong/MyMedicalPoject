package com.yang.mymedicalpoject.ui.activity.web;

import android.app.Instrumentation;
import android.os.Bundle;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;


import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.MyApp;
import com.yang.mymedicalpoject.ui.activity.HomeActivity;
import com.yang.mymedicalpoject.ui.activity.tab.ClassDetailActivity;

import org.json.JSONException;
import org.json.JSONObject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class WebViewActivity extends AppCompatActivity {

    private WebView webview;
    private int flag;
    //关于我们1  注册协议2  预约协议5  使用帮助6  7广告图 详情
    private final String webUrl = "http://59.110.163.144/appoint/aboutus/disPlayDetail?id=";
    private String url;

    private TextView image_back,tv_title;
    private boolean isOnPause;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        flag = getIntent().getIntExtra("flag", -303);
        init();
        initWeb();
    }

    private void init() {
        MyWebView myWebView = (MyWebView) findViewById(R.id.webView);
        webview = myWebView.getWebView();
        image_back=(TextView)findViewById(R.id.image_back);
        image_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==7)
                {
                    if (webview.canGoBack())
                    {
                        webview.goBack();//返回上一页面
                    }else
                    {
                        MyApp.openActivity(WebViewActivity.this, HomeActivity.class);
                        finish();
                    }
                }else
                {
                    actionKey(KeyEvent.KEYCODE_BACK);
                }
            }
        });
        tv_title=findViewById(R.id.tv_title);
//        if (flag == -1) {
//            if (!TextUtils.isEmpty(getIntent().getStringExtra("content"))) {
//                initTitle(getIntent().getStringExtra("content"));
//                GoneRightImage();
//            } else {
//                initTitle("文章详情");
//            }
//        }
        url=getIntent().getStringExtra("url");
    }

    private void initWeb() {
        WebSettings settings = webview.getSettings();
        // 设置可以支持缩放
        settings.setSupportZoom(true);
        // 设置支持js
        settings.setJavaScriptEnabled(true);
        // 关闭缓存
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        // 支持自动加载图片
        settings.setLoadsImagesAutomatically(true);
        // 设置出现缩放工具
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        // 扩大比例的缩放
        settings.setUseWideViewPort(true);
        // 自适应屏幕
        settings.setLoadWithOverviewMode(true);

        //注册协议
        if (flag==2)
        {
            webview.loadUrl("file:///android_asset/agreement.html");
//            initTitle("注册协议");
        }
        webview.addJavascriptInterface(new JSNotify(), "huoqu");
        webview.loadUrl(url);

    }




    public class JSNotify extends Object {
        @JavascriptInterface
        public void huo_id(String id) {
            //拿到id跳转页面
            Log.e("id---",id);
            try {
                JSONObject obj=new JSONObject(id);
                Bundle bundle=new Bundle();
                bundle.putString("id",obj.getString("id"));
                bundle.putString("name",obj.getString("name"));
                bundle.putString("class_hour",obj.getString("class_hour"));
                bundle.putString("jia_ge",obj.getString("jia_ge"));
                bundle.putString("yuan_jia_ge",obj.getString("yuan_jia_ge"));
                bundle.putString("pic",obj.getString("pic"));
                MyApp.openActivity(WebViewActivity.this, ClassDetailActivity.class,bundle);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }


    public void actionKey(final int keyCode) {
        new Thread() {
            public void run () {
                try {
                    Instrumentation inst=new Instrumentation();
                    inst.sendKeyDownUpSync(keyCode);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (flag==7)
            {
                if (webview.canGoBack()) {
                    webview.goBack();//返回上一页面
                }else
                {
                    MyApp.openActivity(WebViewActivity.this,HomeActivity.class);
                    finish();
                }
            }else
            {
                if (webview.canGoBack()) {
                    webview.goBack();//返回上一页面
                }else
                {
                    finish();
                }
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void onPause() {
        super.onPause();
        webview.onPause();
    }
    public void onResume() {
        super.onResume();
        webview.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(webview!=null){
            webview.destroy();
        }
    }

}
