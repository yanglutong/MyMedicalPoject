package com.yang.mymedicalpoject.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;


import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.conifg.GlobalConfig;
import com.http.httplibrary.utils.JsonUtils;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.adapter.DanAdapter;
import com.yang.mymedicalpoject.base.adapter.DuoAdapter;
import com.yang.mymedicalpoject.base.adapter.TiTabItemVp;
import com.yang.mymedicalpoject.bean.HaShiBean;
import com.yang.mymedicalpoject.bean.TiKuLieBean;
import com.yang.mymedicalpoject.bean.TiTabBean;
import com.yang.mymedicalpoject.fragment.TiTabItemFragment;
import com.yang.mymedicalpoject.fragment.homefragment.bean.HomeBean;
import com.yang.mymedicalpoject.fragment.kechengfragment.RefitCallBack;
import com.yang.mymedicalpoject.utils.MyTitleBar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabZiActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "TabZiActivity";
    private ImageView mFanhui;

    private LinearLayout mTitle;
    private ViewPager mVp;
    private TiTabItemFragment tiTabItemFragment;
    private ArrayList<Fragment> tiTabItemFragments;
    private String id;
    private TextView mNum;
    private Button mKandUi;
    private Button mKanCuo;
    private Button mFanhuishouye;
    private TextView mGong;
    private TextView mCuo;
    private TextView mDui;


    private ImageView mSikuai;
    private List<TiTabBean.ListBean> list;
    private TiTabBean.ListBean listBean;
    private ArrayList<HomeBean.UTypeBean.ZTypeBean> beans;
    private int i;
    private DanAdapter danAdapter;
    private int ty;
    private TextView mBigTitle;
    private int zongji;
    private SharedPreferences cuo;
    private SharedPreferences zong1;
    private SharedPreferences dui1;
    private ArrayList<Integer> mdan;
    private ArrayList<Integer> mduo;
    private DuoAdapter duoAdapter1;
    private SharedPreferences countXuan;
    private SharedPreferences duoDui;
    private int duoDui1;
    private SharedPreferences duoDuiZong;
    private int duoZong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_zi);
        mdan = new ArrayList<>();
        mduo = new ArrayList<>();
        initView();
        beans = (ArrayList<HomeBean.UTypeBean.ZTypeBean>) getIntent().getSerializableExtra("beans");
        id = getIntent().getStringExtra("id");
        ty = getIntent().getIntExtra("tye", 0);
        i = getIntent().getIntExtra("i", 0);
        initData(id);
        SharedPreferences zong = getSharedPreferences("zong", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = zong.edit();
        edit.clear();
        edit.commit();//总清空
        SharedPreferences dui = getSharedPreferences("dui", Context.MODE_PRIVATE);
        dui.edit().clear().commit();//对题清空

        SharedPreferences cuo = getSharedPreferences("cuo", Context.MODE_PRIVATE);
        cuo.edit().clear().commit();//错题清空

        countXuan =getSharedPreferences("duoxuanzhong", Context.MODE_PRIVATE);//选多题sp数量+1
        //多选的对题
        duoDui = getSharedPreferences("duoDui", Context.MODE_PRIVATE);
        duoDui.edit().clear().commit();//对题清空

        duoDuiZong = getSharedPreferences("duoZong", Context.MODE_PRIVATE);
        duoDuiZong.edit().clear().commit();//对题总数清空




    }

    private void initData(String typeId) {
        Map<String, Object> baseHeades = GlobalConfig.getInstance().getBaseHeades();
        GlobalConfig.getInstance().setBaseUrl("https://app.yiyanmeng.com/index.php/");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ti_id", typeId);
        Log.d("gzp2", "getData: " + typeId);
        new HttpClient.Buidler()
                .post()
                .setHeadres(baseHeades)
                .setApiUrl("shiti/get_ti_bufen_list")
                .setParamser(hashMap)
                .build()
                .enqueue(new RefitCallBack<TiTabBean>() {

                    private List<String> objects;
                    private Object ping_num;

                    @Override
                    public void error(String error, int code) {
                        Log.d(TAG, "error: " + error);
                    }

                    @Override
                    public TiTabBean convert(JsonElement result) {
                        return JsonUtils.jsonToClass(result, TiTabBean.class);

                    }

                    @Override
                    public void onSucess(TiTabBean tiTabBean) {
                        Log.d(TAG, "onSucess: " + tiTabBean);
                        //适配器
                        list = tiTabBean.getList();//大集合

                        tiTabItemFragments = new ArrayList<>();
                        for (int j = 0; j < list.size(); j++) {
                            ping_num = list.get(j).getPing_num();
                            objects = new ArrayList<>();
                            objects.add(String.valueOf(ping_num));
                            Log.d("obje", "onSucess: "+ objects);
                            Log.d("ping_num", "onSucess: "+ping_num);
                            HaShiBean.map.put(j, 1);
                            if (list.get(j).getTi_type().equals("1")) {//单;
                                mdan.add(j + 1);
                                Log.d("lzm", "onSucess: " + j);
                                //    Log.d("dan", "onClick: "+mdan.get(j));
                            } else {
                                Log.d("lzm", "onSucess: " + j);
                                mduo.add(j + 1);//54
                                // Log.d("dan11", "onClick: "+mduo.get(j));

                        }
                            tiTabItemFragment = new TiTabItemFragment();
                            listBean = tiTabBean.getList().get(j);
                            String i1 = list.get(j).getId();
                            int id = Integer.parseInt(i1);
                            Bundle bundle = new Bundle();
                            bundle.putInt("id", id);
                            bundle.putSerializable("beans", listBean);
                            bundle.putInt("i", j);
                            Log.d("id1", "onCreate: " + id);
                            tiTabItemFragment.setArguments(bundle);
                            tiTabItemFragments.add(tiTabItemFragment);//添加集合

                        }
                        TiTabItemVp tiTabItemVp = new TiTabItemVp(getSupportFragmentManager(), tiTabItemFragments);
                        mVp.setAdapter(tiTabItemVp);
                        mVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                            @Override
                            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


                            }

                            @Override
                            public void onPageSelected(int position) {
                                countXuan.edit().clear().commit();
                              /*  String s = objects.get(i);
                                Log.d("ping_num", "onSucess: "+s);
                                if(s.equals("null")){
                                    mNum.setText("0");
                                }else{
                                    mNum.setText(s);
                                }*/
                            }

                            @Override
                            public void onPageScrollStateChanged(int state) {

                            }
                        });


                    }
                });

    }

    private void initView() {
        mTitle = findViewById(R.id.mTitle);
        MyTitleBar myTitle = (MyTitleBar) findViewById(R.id.myTitle);
        myTitle.setOnClick(new MyTitleBar.OnClick() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.include_fan){
                    finish();
                }
                if(v.getId()==R.id.include_image){
                    finish();
                }
            }
        });
        mVp = (ViewPager) findViewById(R.id.vp);
        mNum = (TextView) findViewById(R.id.num);
        mSikuai = (ImageView) findViewById(R.id.sikuai);
        mSikuai.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.fanhui:
                //pop
                View inflate = LayoutInflater.from(TabZiActivity.this).inflate(R.layout.ti_dati_fanhui_pop, null);
                mKandUi = inflate.findViewById(R.id.kandui);
                mKanCuo = inflate.findViewById(R.id.kancuo);
                //值
                mGong = inflate.findViewById(R.id.gong);
                mCuo = inflate.findViewById(R.id.cuo);
                mDui = inflate.findViewById(R.id.dui);
                mFanhuishouye = inflate.findViewById(R.id.fanhuishouye);

                //对题
                //多选对题+单选
                dui1 = getSharedPreferences("dui", Context.MODE_PRIVATE);
                int dui = dui1.getInt("dui", 0);

                duoDui1 = this.duoDui.getInt("duoDui", 0);
                int hejiduo=dui+duoDui1;
                mDui.setText(""+hejiduo);

                //多选错题=总——多
                duoZong = duoDuiZong.getInt("duoZong", Context.MODE_PRIVATE);
                int duocuo = duoZong-duoDui1;



                //错题
                cuo = getSharedPreferences("cuo", Context.MODE_PRIVATE);
                int cuo1 = cuo.getInt("cuo", 0);
                //单错+对错
                int zongcuo = duocuo + cuo1;
                mCuo.setText(zongcuo+"");


                //总计
                zong1 = getSharedPreferences("zong", Context.MODE_PRIVATE);
                zongji = zong1.getInt("zongji", 0);
                //多选+单选的总计
                int zuizong = duoZong + zongji;
                mGong.setText("" + zuizong);


                //返回首页
                mFanhuishouye.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cuo.edit().clear().commit();
                        zong1.edit().clear().commit();
                        dui1.edit().clear().commit();

                        //多选
                        duoDui.edit().clear().commit();//对题对清空
                        duoDuiZong.edit().clear().commit();//对题总数清空

                        mGong.setText("0");
                        mCuo.setText("0");
                        mDui.setText("0");
                        finish();

                    }
                });
                mKandUi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       SharedPreferences dui = getSharedPreferences("dui", Context.MODE_PRIVATE);
                        int dui1 = dui.getInt("dui", 0);



                    }
                });
                mKanCuo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                PopupWindow popupWindow = new PopupWindow(inflate, 900, 900);
                popyin(popupWindow);
                break;
            case R.id.sikuai://答题卡
                //pop
                View inflate1 = LayoutInflater.from(TabZiActivity.this).inflate(R.layout.da_ti_pop, null);
                MyTitleBar mTitle = inflate1.findViewById(R.id.myTitle);
                mBigTitle = inflate1.findViewById(R.id.bigtitle);
                RecyclerView mDanRecy = inflate1.findViewById(R.id.dan_Recy);
                RecyclerView mDuoRecy = inflate1.findViewById(R.id.duo_Recy);
                TextView mDantext = inflate1.findViewById(R.id.textdan);
                TextView mDuotext = inflate1.findViewById(R.id.textduo);
                mDanRecy.setLayoutManager(new GridLayoutManager(TabZiActivity.this, 6));//单选
                mDuoRecy.setLayoutManager(new GridLayoutManager(TabZiActivity.this, 6));//多选
                mBigTitle.setText(beans.get(this.i).getName());

                PopupWindow popupWindow1 = new PopupWindow(inflate1, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
                popyin(popupWindow1);
                mTitle.setOnClick(new MyTitleBar.OnClick() {
                    @Override
                    public void onClick(View v) {
                        if(v.getId()==R.id.include_image){
                            popupWindow1.dismiss();
                        }
                        if(v.getId()==R.id.include_fan){
                            popupWindow1.dismiss();
                        }
                    }
                });
//                mTitle.setText("答题卡");
//                Log.d("tilexing", "onClick: "+list.get(22).getTi_type());
                //1 单选
                //隐藏
                if(mdan.size()==0) {
                    mDanRecy.setVisibility(View.GONE);
                    mDantext.setVisibility(View.GONE);
                }
                if(mduo.size()==0) {
                    mDuoRecy.setVisibility(View.GONE);
                    mDuotext.setVisibility(View.GONE);
                }
                duoAdapter1 = new DuoAdapter(mduo,this,R.layout.dan_button);
                danAdapter = new DanAdapter(mdan, this,R.layout. dan_button);
                mDuoRecy.setAdapter(duoAdapter1);
                mDanRecy.setAdapter(danAdapter);

                //单选按钮跳转
                danAdapter.SetButtonClick(new DanAdapter.SetButtonClick() {
                    @Override
                    public void setonClick(int position) {
                        mVp.setCurrentItem(position);
                        popupWindow1.dismiss();
                    }
                });
                //多选按钮跳转
                duoAdapter1.SetButtonClick(new DuoAdapter.SetButtonClick() {
                    @Override
                    public void setonClick(int position) {
                        Integer duoposi = mduo.get(position);
                        mVp.setCurrentItem(duoposi-1);
                        popupWindow1.dismiss();
                    }
                });
                //小按钮监听
                mDanRecy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });


                break;
        }
    }

    //pop阴影
    public void popyin(PopupWindow popupWindow) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.showAtLocation(mTitle, Gravity.CENTER, 0, 0);
        // 阴影
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = 0.7f;
        getWindow().setAttributes(lp);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {

            // 在dismiss中恢复透明度
            public void onDismiss() {
                WindowManager.LayoutParams lp = getWindow()
                        .getAttributes();
                lp.alpha = 1f;
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                getWindow().setAttributes(lp);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SharedPreferences zong = getSharedPreferences("zong", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = zong.edit();
        edit.clear();
        edit.commit();//总清空
        SharedPreferences dui = getSharedPreferences("dui", Context.MODE_PRIVATE);
        dui.edit().clear().commit();//对题清空

        SharedPreferences cuo = getSharedPreferences("cuo", Context.MODE_PRIVATE);
        cuo.edit().clear().commit();//错题清空
     /*   mGong.setText("");
        mCuo.setText("");
        mDui.setText(" ");*/


        //合计对题
        duoDui = getSharedPreferences("duoDui", Context.MODE_PRIVATE);
        duoDui.edit().clear().commit();//对题清空


        duoDuiZong = getSharedPreferences("duoZong", Context.MODE_PRIVATE);
        duoDuiZong.edit().clear().commit();//对题总数清空

    }
}