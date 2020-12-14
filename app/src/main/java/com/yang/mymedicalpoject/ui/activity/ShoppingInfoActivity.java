package com.yang.mymedicalpoject.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cundong.recyclerview.HeaderAndFooterRecyclerViewAdapter;
import com.cundong.recyclerview.RecyclerViewUtils;
import com.cundong.recyclerview.SampleFooter;
import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.BaseApp;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.MyApp;
import com.yang.mymedicalpoject.base.adapter.SoppingInfoAdapter;
import com.yang.mymedicalpoject.bean.ShoppingCartActivity;
import com.yang.mymedicalpoject.bean.ShoppingItem;
import com.yang.mymedicalpoject.bean.ThreeBean;
import com.yang.mymedicalpoject.db.ThreeBeanDao;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ConstantsInfo;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.InfoBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.model.ShoppingInfoModel;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.presenter.ShoppInfoPresenter;
import com.yang.mymedicalpoject.ui.activity.web.MyWebView;
import com.yang.mymedicalpoject.utils.SampleFooter2;

import java.util.ArrayList;

public class ShoppingInfoActivity extends BaseMvpActivity<ConstantsInfo.View, ShoppingInfoModel, ShoppInfoPresenter> implements ConstantsInfo.View, View.OnClickListener {


    private RecyclerView shopping_infoRecycler;
    private ArrayList<InfoBean> infoBeans = new ArrayList<>();
    private TextView tv_add_cart;
    private ImageView iv_inshop;
    private ThreeBeanDao threeBeanDao;
    private WebView webview;

    @Override
    protected int createLayoutId() {
        return R.layout.activity_shopping_info;
    }

    @Override
    protected void initMvpData() {

        shopping_infoRecycler = findViewById(R.id.shopping_infoRecycler);
        tv_add_cart = findViewById(R.id.tv_add_cart);
        iv_inshop = findViewById(R.id.iv_inshop);
        MyWebView myWebView = (MyWebView) findViewById(R.id.webView);
        webview = myWebView.getWebView();
        initWeb();
        //数据库
        initGreen();

        tv_add_cart.setOnClickListener(this);
        iv_inshop.setOnClickListener(this);


        //获取fragment发送的id
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        Log.i("杨路通", "ShoppingInfoActivity: "+id);
        LinearLayoutManager manager = new LinearLayoutManager(this);
//        manager.setOrientation(RecyclerView.VERTICAL);
        shopping_infoRecycler.setLayoutManager(manager);
        //请求网络数据
        mPresenter.getData(id);


        



    }
    private void initWeb() {
        WebSettings settings = webview.getSettings();
        // 设置可以支持缩放
        settings.setSupportZoom(true);
        // 设置支持js
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        // 关闭缓存
//        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
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

    }


    private void initGreen() {
        threeBeanDao = BaseApp.getInstance().getDaoSession().getThreeBeanDao();
    }

    @Override
    protected ShoppInfoPresenter createPresenter() {
        return new ShoppInfoPresenter();
    }


    @Override
    public void showData(InfoBean infoBean) {
        infoBeans.add(infoBean);
        Log.i("杨路通", "ShoppingInfoActivity: "+infoBean.getCid());
        SoppingInfoAdapter adapter = new SoppingInfoAdapter(infoBeans, this);
        shopping_infoRecycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        webview.loadUrl(infoBean.getShop().getXiang_qing());
    }

    @Override
    public void showE(String e, int c) {
        Log.i("杨路通", "ShoppingInfoActivity: "+e+c);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_add_cart:
                //添加到购物车
                String name = infoBeans.get(0).getShop().getName();
                String xian_price = infoBeans.get(0).getShop().getXian_price();
                String pic = infoBeans.get(0).getShop().getPic();//tu
                ThreeBean threeBean = new ThreeBean();
                threeBean.setName(name);
                threeBean.setCount(1);
                threeBean.setXian_price(Float.parseFloat(xian_price));
                threeBean.setPic(pic);
                threeBeanDao.insert(threeBean);
                Toast.makeText(this, "插入成功", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_inshop:{
                   //跳转到购物车界面
                startActivity(new Intent(this, ShoppingCartActivity.class));
            }
                break;
        }
    }
}