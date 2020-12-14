package com.yang.mymedicalpoject.ui.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.DaTiBean;
import com.yang.mymedicalpoject.constants.MyDaTiConstants;
import com.yang.mymedicalpoject.model.MyDaTiModel;
import com.yang.mymedicalpoject.register.presenter.MyDaTiPresenter;
import com.yang.mymedicalpoject.utils.MyTitleBar;
import com.yang.myregionselect.CommonPopupWindow;

import java.util.ArrayList;
import java.util.List;

public class DaTiActivity extends BaseMvpActivity<MyDaTiConstants.MyView, MyDaTiModel, MyDaTiPresenter> implements MyDaTiConstants.MyView, View.OnClickListener {

    private ViewPager mVp;
    private MyTitleBar titleBar;
    private ArrayList<View> views;
    private PagerAdapter adapter;
    private TextView tv_dati_card;
    private CommonPopupWindow window;
    private RelativeLayout rl_daTi;
    private String name;

    @Override
    protected int createLayoutId() {
        return R.layout.activity_da_ti;
    }

    @Override
    protected void initMvpData() {
        find();
        //加载布局
        initLoad();
        //请求网络数据
        request();


    }

    private void initLoad() {
        views = new ArrayList<>();
    }

    @Override
    protected MyDaTiPresenter createPresenter() {
        return new MyDaTiPresenter();
    }

    private void request() {
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        name = intent.getStringExtra("name");
        Log.i("杨路通", "DaTiActivityRequest: "+id);
        mPresenter.getData(id);
    }

    private void initData(List<DaTiBean.ListBean> list) {
        for (int i = 0; i <list.size() ; i++) {
            View view = View.inflate(DaTiActivity.this, R.layout.dati_item, null);;
            views.add(view);
        }
        adapter = new PagerAdapter() {
            public View currentView;
            @Override
            public int getCount() {
                return views.size();
            }
            public View getCurrentView(){
                return currentView;
            }
            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
                return view == object;
            }

            @Override
            public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
                currentView= (View) object;
            }

            @NonNull
            @Override
            public Object instantiateItem(@NonNull ViewGroup container, int position) {
                TextView tv_type = views.get(position).findViewById(R.id.tv_type);
                //标题 关于粘连性肩关节囊炎,正确的选项有
                TextView tv_name = views.get(position).findViewById(R.id.tv_name);

                //A R
                RelativeLayout rl_1 = views.get(position).findViewById(R.id.rl_1);

                //A T
                TextView tv_11 = views.get(position).findViewById(R.id.tv_11);


                //

                //B R
                RelativeLayout rl_2 = views.get(position).findViewById(R.id.rl_2);

                //B T
                TextView tv_22 = views.get(position).findViewById(R.id.tv_22);

                //C
                RelativeLayout rl_3 = views.get(position).findViewById(R.id.rl_3);
                TextView tv_33 = views.get(position).findViewById(R.id.tv_33);
                //D
                RelativeLayout rl_4 = views.get(position).findViewById(R.id.rl_4);
                TextView tv_44 = views.get(position).findViewById(R.id.tv_44);


                TextView tv_1 = views.get(position).findViewById(R.id.tv_1);
                TextView tv_2 = views.get(position).findViewById(R.id.tv_2);
                TextView tv_3 = views.get(position).findViewById(R.id.tv_3);
                TextView tv_4 = views.get(position).findViewById(R.id.tv_4);



                tv_type.setText("单选题");

                tv_name.setText("\u3000\u3000\u3000\u3000"+list.get(position).getName());

                tv_1.setText(list.get(position).getData().getA());
                tv_2.setText(list.get(position).getData().getB());
                tv_3.setText(list.get(position).getData().getC());
                tv_4.setText(list.get(position).getData().getD());

                rl_1.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(DaTiActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                        rl_1.setBackground(getResources().getDrawable(R.drawable.duoxuan));
                        tv_1.setTextColor(R.color.txt_11);

                        rl_2.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_2.setTextColor(getResources().getColor(R.color.txt_26));

                        rl_3.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_3.setTextColor(getResources().getColor(R.color.txt_26));

                        rl_4.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_4.setTextColor(getResources().getColor(R.color.txt_26));
                    }
                });
                rl_2.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onClick(View view) {
                        rl_2.setBackground(getResources().getDrawable(R.drawable.duoxuan));
                        tv_2.setTextColor(R.color.txt_11);

                        rl_1.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_1.setTextColor(getResources().getColor(R.color.txt_26));

                        rl_3.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_3.setTextColor(getResources().getColor(R.color.txt_26));

                        rl_4.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_4.setTextColor(getResources().getColor(R.color.txt_26));
                    }
                });
                rl_3.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onClick(View view) {
                        rl_3.setBackground(getResources().getDrawable(R.drawable.duoxuan));
                        tv_3.setTextColor(R.color.txt_11);

                        rl_1.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_1.setTextColor(getResources().getColor(R.color.txt_26));

                        rl_2.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_2.setTextColor(getResources().getColor(R.color.txt_26));

                        rl_4.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_4.setTextColor(getResources().getColor(R.color.txt_26));
                    }
                });
                rl_4.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onClick(View view) {
                        rl_4.setBackground(getResources().getDrawable(R.drawable.duoxuan));
                        tv_4.setTextColor(R.color.txt_11);

                        rl_1.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_1.setTextColor(getResources().getColor(R.color.txt_26));

                        rl_3.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_3.setTextColor(getResources().getColor(R.color.txt_26));

                        rl_2.setBackground(getResources().getDrawable(R.drawable.weixuanze));
                        tv_2.setTextColor(getResources().getColor(R.color.txt_26));
                    }
                });

                // 添加到ViewPager容器
                container.addView(views.get(position));
                // 返回填充的View对象
                return views.get(position);
            }


            @Override
            public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
                container.removeView(views.get(position));
            }
        };
        mVp.setAdapter(adapter);

    }
    public void initDataPopupWindow(String name){
        //点击答题卡弹出popwindow

        // get the height of screen
        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int screenHeight=metrics.heightPixels;

        // create popup window
        window=new CommonPopupWindow(this,R.layout.dati_dialog, ViewGroup.LayoutParams.MATCH_PARENT, (int) (screenHeight*0.5)) {

            @Override
            protected void initView() {
                //获取当前的布局 设置监听
                View view = getContentView();
                TextView tv_name = view.findViewById(R.id.tv_name);
                RecyclerView Recycler = view.findViewById(R.id.recycler_item);
                tv_name.setText(name);
               /* tv_name.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(DaTiActivity.this, "弹出的窗口", Toast.LENGTH_SHORT).show();
                    }
                });*/
            }

            @Override
            protected void initEvent() {

            }

            @Override
            protected void initWindow() {
                super.initWindow();
                //获取当前popupwindow对象
                PopupWindow instance=getPopupWindow();
                instance.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    //设置隐藏
                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp=getWindow().getAttributes();
                        lp.alpha=1.0f;
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                        getWindow().setAttributes(lp);
                    }
                });
            }
        };


        PopupWindow win = window.getPopupWindow();
        win.setAnimationStyle(com.yang.myregionselect.R.style.animTranslate);
        //设置要在哪个布局显示
        window.showAtLocation(rl_daTi, Gravity.BOTTOM, 0, 0);
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = 0.3f;
        //添加样式
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        getWindow().setAttributes(lp);
    }

    private void find() {
        mVp = findViewById(R.id.mVp);
        titleBar = findViewById(R.id.myTitle);
        tv_dati_card = findViewById(R.id.tv_dati_card);
        rl_daTi = findViewById(R.id.rl_daTi);
        tv_dati_card.setOnClickListener(this);



        titleBar.setOnClick(v -> {
            switch (v.getId()){
                case R.id.include_fan:
                    finish();
                    break;
                case R.id.include_image:{
                    finish();
                    break;}
            }
        });
    }

    @Override
    public void show(DaTiBean daTiBean) {
        Log.i("杨路通", "DaTiActivityShow: "+daTiBean.getList().size());
        initData(daTiBean.getList());

    }

    @Override
    public void error(String msg, int code) {

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.tv_dati_card){
            Intent intent = getIntent();
            name = intent.getStringExtra("name");
            //设置弹出答题卡
            initDataPopupWindow(name);
        }

        //设置背景颜色和字体颜色
        switch (view.getId()){
            case R.id.rl_1:{
                Toast.makeText(this, "当前", Toast.LENGTH_SHORT).show();

            }
            break;
            case R.id.rl_2:
                Toast.makeText(this, "当前", Toast.LENGTH_SHORT).show();

              /*  rl_2.setBackgroundColor(R.color.color_BDBDBD);
                tv_22.setTextColor(R.color.white);
                tv_2.setTextColor(R.color.design_default_color_primary);


                rl_1.setBackgroundColor(R.color.colorBg);
                tv_11.setTextColor(R.color.txt_33);
                tv_1.setTextColor(R.color.txt_4d);

                rl_3.setBackgroundColor(R.color.colorBg);
                tv_33.setTextColor(R.color.txt_33);
                tv_3.setTextColor(R.color.txt_4d);

                rl_4.setBackgroundColor(R.color.colorBg);
                tv_44.setTextColor(R.color.txt_33);
                tv_4.setTextColor(R.color.txt_4d);*/

            break;
            case R.id.rl_3:

              /*  rl_3.setBackgroundColor(R.color.color_BDBDBD);
                tv_33.setTextColor(R.color.white);
                tv_3.setTextColor(R.color.design_default_color_primary);


                rl_2.setBackgroundColor(R.color.colorBg);
                tv_22.setTextColor(R.color.txt_33);
                tv_2.setTextColor(R.color.txt_4d);

                rl_1.setBackgroundColor(R.color.colorBg);
                tv_11.setTextColor(R.color.txt_33);
                tv_1.setTextColor(R.color.txt_4d);

                rl_4.setBackgroundColor(R.color.colorBg);
                tv_44.setTextColor(R.color.txt_33);
                tv_4.setTextColor(R.color.txt_4d);*/
                Toast.makeText(this, "当前", Toast.LENGTH_SHORT).show();

                break;
            case R.id.rl_4:{
              /*  rl_4.setBackgroundColor(R.color.color_BDBDBD);
                tv_44.setTextColor(R.color.white);
                tv_4.setTextColor(R.color.design_default_color_primary);


                rl_2.setBackgroundColor(R.color.colorBg);
                tv_22.setTextColor(R.color.txt_33);
                tv_2.setTextColor(R.color.txt_4d);

                rl_3.setBackgroundColor(R.color.colorBg);
                tv_33.setTextColor(R.color.txt_33);
                tv_3.setTextColor(R.color.txt_4d);

                rl_1.setBackgroundColor(R.color.colorBg);
                tv_11.setTextColor(R.color.txt_33);
                tv_1.setTextColor(R.color.txt_4d);*/
                Toast.makeText(this, "当前", Toast.LENGTH_SHORT).show();
                break;
            }

        }
    }
}