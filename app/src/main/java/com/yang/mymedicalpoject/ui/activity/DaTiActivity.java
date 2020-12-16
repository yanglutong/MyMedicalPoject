package com.yang.mymedicalpoject.ui.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.BaseApp;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.activity.DaTiCardActivity;
import com.yang.mymedicalpoject.base.MyApp;
import com.yang.mymedicalpoject.bean.CollectBean;
import com.yang.mymedicalpoject.bean.DaTiBean;
import com.yang.mymedicalpoject.constants.MyDaTiConstants;
import com.yang.mymedicalpoject.db.CollectBeanDao;
import com.yang.mymedicalpoject.model.MyDaTiModel;
import com.yang.mymedicalpoject.register.presenter.MyDaTiPresenter;
import com.yang.mymedicalpoject.utils.MyTitleBar;
import com.yang.myregionselect.CommonPopupWindow;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DaTiActivity extends BaseMvpActivity<MyDaTiConstants.MyView, MyDaTiModel, MyDaTiPresenter> implements MyDaTiConstants.MyView, View.OnClickListener {

    private ViewPager mVp;
    private MyTitleBar titleBar;
    private ArrayList<View> views;
    private MyPagerAdapter adapter;
    private TextView tv_dati_card;
    private CommonPopupWindow window;
    private RelativeLayout rl_daTi;
    private String name;
    private TextView mCheckbox;
    private boolean isCheck=true;
    private CollectBeanDao dao;
    private ArrayList<DaTiBean.ListBean> list;
    private int po;
    private PopupWindow win;
    private AlertDialog aldg;

    @Override
    protected int createLayoutId() {
        return R.layout.activity_da_ti;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void eventBuss(int p) {
        Log.i("杨路通", "aaa: "+p);

        mVp.setCurrentItem(p);
    }
    @Override
    protected void initMvpData() {
        EventBus.getDefault().register(this);
        //获取数据库
        dao = BaseApp.getInstance().getDaoSession().getCollectBeanDao();



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
    class MyPagerAdapter extends PagerAdapter{
        private boolean isPager;
        public int pagerPosition=list.size();

        public View currentView;
        @Override
        public int getCount() {
            return views.size();
        }

        public int getPagerPosition() {
            return pagerPosition;
        }

        public void setPagerPosition(int pagerPosition) {
            this.pagerPosition = pagerPosition;
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
            po=position;
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

            //判断是否有选中过text有的话就设置为position-1
            if(isPager){
                pagerPosition-=1;
            }
            rl_1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    isPager=true;
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
                    isPager=true;
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
                    isPager=true;
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
                    isPager=true;
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
    }
    private void initData(ArrayList<DaTiBean.ListBean> list) {
        this.list=list;
        for (int i = 0; i <list.size() ; i++) {
            View view = View.inflate(DaTiActivity.this, R.layout.dati_item, null);;
            views.add(view);
        }

        adapter=new MyPagerAdapter();
        mVp.setAdapter(adapter);

    }


    public void initDataPopupWindow(String name){
        //点击答题卡弹出popwindow

        // get the height of screen
        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int screenHeight=metrics.heightPixels;

        // create popup window
        window=new CommonPopupWindow(this,R.layout.dati_dialog, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT) {

            @Override
            protected void initView() {
                //获取当前的布局 设置监听
                View view = getContentView();
                TextView tv_name = view.findViewById(R.id.tv_name);


                TextView tv_submit = view.findViewById(R.id.tv_submit);
                tv_submit.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder adBd=new AlertDialog.Builder(DaTiActivity.this);
                        View inflate = View.inflate(DaTiActivity.this, R.layout.submit_dialog, null);
                        TextView bt_Qd = inflate.findViewById(R.id.bt_Qd);
                        TextView bt_cancel = inflate.findViewById(R.id.bt_cancel);
                        bt_Qd.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Log.i("杨路通", "确定: "+list.size());
                                EventBus.getDefault().postSticky(list);
                                Intent intent = new Intent(DaTiActivity.this,DaTiCardActivity.class);
                                startActivity(intent);
                               /* Bundle bundle = new Bundle();
                                bundle.putSerializable("arr", (Serializable) list);*/
                              /*  //确定
                                MyApp.openActivity(DaTiActivity.this, DaTiCardActivity.class,bundle);*/
                            }
                        });
                        bt_cancel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                //取消
                                finish();
                            }
                        });
                        adBd.setView(inflate);
                        aldg =adBd.create();
                        aldg.show();

                    }
                });


                RecyclerView recycler = view.findViewById(R.id.recycler_item);
                recycler.setLayoutManager(new GridLayoutManager(DaTiActivity.this,6));
                tv_name.setText(name);

                ReAdapter adapter = new ReAdapter(list, DaTiActivity.this, R.layout.select_item);
                recycler.setAdapter(adapter);

                //点击条目中的数据跳转到对应的Viewpager
                adapter.setAdapterOnItemClickListener(new BaseAdapter.AdapterOnItemClickListener() {
                    @Override
                    public void OnItemClick(int position) {
                        Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
                        mVp.setCurrentItem(position);
                        getPopupWindow().dismiss();
                    }
                });
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
        win = window.getPopupWindow();
        win.setAnimationStyle(com.yang.myregionselect.R.style.animTranslate);
        //设置要在哪个布局显示
        window.showAtLocation(rl_daTi, Gravity.BOTTOM, 0, 0);
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = 1.0f; //1.0恢复正常 0.7让屏幕除弹窗外的都设置为阴影
        //添加样式
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        getWindow().setAttributes(lp);
    }

    private void find() {
        mVp = findViewById(R.id.mVp);
        titleBar = findViewById(R.id.myTitle);
        tv_dati_card = findViewById(R.id.tv_dati_card);
        rl_daTi = findViewById(R.id.rl_daTi);
        //点击收藏收藏数据库
        mCheckbox = findViewById(R.id.checkbox);
        mCheckbox.setOnClickListener(this);
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
        if(view.getId()==R.id.checkbox){
            CollectBean bean = new CollectBean();
            //点击收藏到数据库
            if(isCheck){
                if(list.size()>0){
                    bean.setTitleName(list.get(po).getName());
                    bean.setName(name);
                    dao.insert(bean);
                    isCheck=false;
                }

            }else{
                        Toast.makeText(DaTiActivity.this, ""+po+isCheck, Toast.LENGTH_SHORT).show();
                        List<CollectBean> all = (List<CollectBean>) dao.loadAll();
                        int size = all.size();
                        if(size>0){
                            //删除数据库
                            dao.deleteAll();
                            isCheck=true;
                        }

            }
        }
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


            break;
            case R.id.rl_3:




                break;
            case R.id.rl_4:{

                Toast.makeText(this, "当前", Toast.LENGTH_SHORT).show();
                break;
            }

        }
    }
    public static class ReAdapter extends BaseAdapter<DaTiBean.ListBean> {
        public ReAdapter(List<DaTiBean.ListBean> datas, Context context, int layoutId) {
            super(datas, context, layoutId);
        }

        @Override
        public void bindData(BaseViewHolder baseViewHolder, int position) {
            baseViewHolder.setText(R.id.textItem1,position+"");
        }
    }
}