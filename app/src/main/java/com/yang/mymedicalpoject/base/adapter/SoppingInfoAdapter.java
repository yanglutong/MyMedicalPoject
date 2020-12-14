package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.InfoBean;
import com.yang.mymedicalpoject.ui.activity.web.MyWebView;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SoppingInfoAdapter extends RecyclerView.Adapter {
    ArrayList<InfoBean> arrayList;
    Context context;

    public SoppingInfoAdapter(ArrayList<InfoBean> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View header = LayoutInflater.from(context).inflate(R.layout.header_shop_info, null);
        View footer = LayoutInflater.from(context).inflate(R.layout.footer_shop_info, null);
            DayHeader day = new DayHeader(header);
            return day;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            DayHeader dayHeader= (DayHeader) holder;
            dayHeader.banner.setImages(arrayList.get(position).getShop().getFeng_pic());
            dayHeader.banner.setImageLoader(new ImageLoader() {
                @Override
                public void displayImage(Context context, Object path, ImageView imageView) {
                    Glide.with(context).load((String) path).into(imageView);
                }
            }).start();
            dayHeader.tvName.setText(arrayList.get(position).getShop().getName());
            dayHeader.tvPrice.setText("$ "+arrayList.get(position).getShop().getXian_price());
    }

   /* private void initWeb(MyWebView mVebView, int position) {
        WebView webView = mVebView.getWebView();
        WebSettings settings = webView.getSettings();
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

        webView.loadUrl(arrayList.get(position).getShop().getXiang_qing());

    }*/

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    class DayHeader extends RecyclerView.ViewHolder{
        Banner banner;
        TextView tvName;
        TextView tvPrice;
//        R.layout.header_shop_info
        public DayHeader(@NonNull View itemView) {
            super(itemView);
            banner = itemView.findViewById(R.id.banner);
            tvName = itemView.findViewById(R.id.tv_name);
            tvPrice = itemView.findViewById(R.id.tv_price);
        }
    }
    class DayFooter extends RecyclerView.ViewHolder{
        MyWebView mVebView;
//        R.layout.footer_shop_info
        public DayFooter(@NonNull View itemView) {
            super(itemView);
            mVebView = itemView.findViewById(R.id.webView);
        }
    }
}
