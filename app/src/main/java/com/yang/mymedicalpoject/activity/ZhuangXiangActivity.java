package com.yang.mymedicalpoject.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
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


import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.conifg.GlobalConfig;
import com.http.httplibrary.utils.JsonUtils;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.adapter.DanAdapter;
import com.yang.mymedicalpoject.base.adapter.DuoAdapter;
import com.yang.mymedicalpoject.base.adapter.TiTabItemVp;
import com.yang.mymedicalpoject.bean.TiTabBean;
import com.yang.mymedicalpoject.bean.Ti_Ying_Recy_Bean;
import com.yang.mymedicalpoject.bean.Ti_Zheng_Recy_Bean;
import com.yang.mymedicalpoject.fragment.TiTabItemFragment;
import com.yang.mymedicalpoject.fragment.kechengfragment.RefitCallBack;
import com.yang.mymedicalpoject.utils.MyTitleBar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZhuangXiangActivity extends AppCompatActivity implements View.OnClickListener {
        private static final String TAG = "TabZiActivity";
        /**
         *
         */
        private SharedPreferences.Editor edit;

        private ViewPager mVp;
        private TiTabItemFragment tiTabItemFragment;
        private ArrayList<Fragment> tiTabItemFragments;
        private TextView mNum;
        private Button mKandUi;
        private Button mKanCuo;
        private Button mFanhuishouye;
        private TextView mGong;
        private TextView mCuo;
        private TextView mDui;
        private SharedPreferences zong;
        private int ying_zhengType;
        private int i ;
        private String gongId;
        private ImageView mSikuai;
        private List<TiTabBean.ListBean> list;
        private TiTabBean.ListBean listBean;
        private TextView mBigTitle;
        private int gongType;
           private String url;
    private List<Ti_Ying_Recy_Bean.UTypeBean.ZTypeBean> yingBeans;
    private  List<Ti_Zheng_Recy_Bean.UTypeBean.ZTypeBean>  zhengBeans;
    private List<Ti_Zheng_Recy_Bean.UTypeBean> u_type;
    private String name;
    private String name1;
    private Ti_Ying_Recy_Bean yi;
    private List<Ti_Ying_Recy_Bean.UTypeBean.ZTypeBean> z_type;
    private SharedPreferences zong1;
    private int zongji;
    private SharedPreferences cuo;
    private SharedPreferences dui1;
    private List<Integer> mDan;
    private List<Integer> mDuo;
    private DanAdapter danAdapterXuan;
    private com.yang.mymedicalpoject.base.adapter.DuoAdapter<Object> DuoAdapter;
    private SharedPreferences duoDui;
    private SharedPreferences duoDuiZong;
    private int duoDui1;
    private int duoZong;
    private MyTitleBar myTitle;
    private LinearLayout mTitle;
    //  private Serializable yingBeans;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        //政治专项  英语 专项 通用（网址不同，答题ti_id为
        //                          "id": "57",
        //                        "name": "01.关于无产阶级和人类解放的科学",
        //                        "pid": "26",）
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tab_zi);
            initView();
        mDan = new ArrayList<>();
        mDuo = new ArrayList<>();

        SharedPreferences zong = getSharedPreferences("zong", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = zong.edit();
        edit.clear();
        edit.commit();//总清空
        SharedPreferences dui = getSharedPreferences("dui", Context.MODE_PRIVATE);
        dui.edit().clear().commit();//对题清空

        SharedPreferences cuo = getSharedPreferences("cuo", Context.MODE_PRIVATE);
        cuo.edit().clear().commit();//错题清空

        //多选的对题
        duoDui = getSharedPreferences("duoDui", Context.MODE_PRIVATE);
        duoDui.edit().clear().commit();//对题清空

        duoDuiZong = getSharedPreferences("duoZong", Context.MODE_PRIVATE);
        duoDuiZong.edit().clear().commit();//对题总数清空
            //英语专项 1   政治专项 2
            gongId = getIntent().getStringExtra("yingId");
            gongType = getIntent().getIntExtra("ying", 0);//英语专项 1   政治专项 2
         //   yingBeans = getIntent().getSerializableExtra("yingBeans");//接收两个集合 英语 政治

        //英语专项的集合

          //   Log.d("yingBeans", "onCreate: "+yingBeans);
            //路劲不同判断
        if(gongType==1){//英语专项
            url="shitien/get_ti_bufen_list";
            initData(gongId, url);
            yi = (Ti_Ying_Recy_Bean) getIntent().getSerializableExtra("yingBeans");

        }else if(gongType==2){//政治专项
            url="shitizz/get_ti_bufen_list";
            initData(gongId, url);
          /*  Ti_Zheng_Recy_Bean zheng = (Ti_Zheng_Recy_Bean) getIntent().getSerializableExtra("yingBeans");
            u_type = zheng.getU_type();*/



        }


        }

        private void initData(String typeId,String url) {
            Map<String, Object> baseHeades = GlobalConfig.getInstance().getBaseHeades();
            GlobalConfig.getInstance().setBaseUrl("https://app.yiyanmeng.com/index.php/");
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("ti_id", typeId);
            Log.d("gzp2", "getData: " + typeId);
            new HttpClient.Buidler()
                    .post()
                    .setHeadres(baseHeades)
                    .setApiUrl(url)
                    .setParamser(hashMap)
                    .build()
                    .enqueue(new RefitCallBack<TiTabBean>() {
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
                                i=j;
                                String ping_num = (String) list.get(j).getPing_num();
                                if (!TextUtils.isEmpty(ping_num)) {
                                    mNum.setText(ping_num);
                                } else {
                                    mNum.setText("0");
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
                                //判断出单选 多选

                                if(list.get(j).getTi_type().equals("1")){
                                    mDan.add(j+1);
                                }else{
                                    mDuo.add(j+1);
                                }

                            }
                            TiTabItemVp tiTabItemVp = new TiTabItemVp(getSupportFragmentManager(), tiTabItemFragments);
                            mVp.setAdapter(tiTabItemVp);


                        }
                    });

        }

        private void initView() {
            myTitle = (MyTitleBar) findViewById(R.id.myTitle);
            mTitle = (LinearLayout) findViewById(R.id.mTitle);
            myTitle.setOnClick(new MyTitleBar.OnClick() {
                @Override
                public void onClick(View v) {
                    if(v.getId()==R.id.include_image){
                        finish();
                    }
                    if(v.getId()==R.id.include_fan){
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
                    View inflate = LayoutInflater.from(ZhuangXiangActivity.this).inflate(R.layout.ti_dati_fanhui_pop, null);
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
                    int hejiduo=dui+ duoDui1;
                    mDui.setText(""+hejiduo);

                    //多选错题=总——多
                    duoZong = duoDuiZong.getInt("duoZong", Context.MODE_PRIVATE);
                    int duocuo = duoZong - duoDui1;



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
                            mGong.setText("0");
                            mCuo.setText("0");
                            mDui.setText("0");
                            finish();

                        }
                    });
                    mKandUi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {


                        }
                    });
                    mKanCuo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            SharedPreferences cuo = getSharedPreferences("cuo", Context.MODE_PRIVATE);
                            int cuo1 = cuo.getInt("cuo", 0);
                            mCuo.setText(cuo1+"");
                        }
                    });

                    PopupWindow popupWindow = new PopupWindow(inflate, 900, 900);
                    popyin(popupWindow);
                    break;
                case R.id.sikuai://答题卡
                    //pop
                    View inflate1 = LayoutInflater.from(ZhuangXiangActivity.this).inflate(R.layout.da_ti_pop, null);
                    MyTitleBar myTitle = inflate1.findViewById(R.id.myTitle);
                    mBigTitle = inflate1.findViewById(R.id.bigtitle);
                    RecyclerView mDanRecy = inflate1.findViewById(R.id.dan_Recy);
                    RecyclerView mDuoRecy = inflate1.findViewById(R.id.duo_Recy);
                    TextView mDantext = inflate1.findViewById(R.id.textdan);
                    TextView mDuotext = inflate1.findViewById(R.id.textduo);
                    mDanRecy.setLayoutManager(new GridLayoutManager(ZhuangXiangActivity.this, 6));//单选
                    mDuoRecy.setLayoutManager(new GridLayoutManager(ZhuangXiangActivity.this, 6));//多选
                //    mBigTitle.setText("");
                    if(gongType==1){
                        List<Ti_Ying_Recy_Bean.UTypeBean> u_type = yi.getU_type();
                        for (int j = 0; j <u_type.size() ; j++) {
                            name = u_type.get(j).getName();
                          //  z_type = u_type.get(j).getZ_type();
                        }
                        mBigTitle.setText(name);

/*
                        for (int j = 0; j <z_type.size() ; j++) {
                            name1 = z_type.get(j).getName();
                            mBigTitle.setText(name+name1);
                        }*/

                    }else{
                     /*   String name = u_type.get(i).getName();
                        String name1 = u_type.get(i).getZ_type().get(i).getName();

                        mBigTitle.setText(name+name1);*/
                    }

                    PopupWindow popupWindow1 = new PopupWindow(inflate1, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
                    popyin(popupWindow1);
                    myTitle.setOnClick(new MyTitleBar.OnClick() {
                        @Override
                        public void onClick(View v) {
                            if(v.getId()==R.id.include_fan){
                                popupWindow1.dismiss();
                            }
                            if(v.getId()==R.id.include_image){
                                popupWindow1.dismiss();
                            }
                        }
                    });
                    //隐藏
                    if(mDan.size()==0) {
                        mDanRecy.setVisibility(View.GONE);
                        mDantext.setVisibility(View.GONE);
                    }
                    if(mDuo.size()==0) {
                        mDuoRecy.setVisibility(View.GONE);
                        mDuotext.setVisibility(View.GONE);
                    }

                    danAdapterXuan = new DanAdapter(mDan, this, R.layout.dan_button);
                    mDanRecy.setAdapter(danAdapterXuan);
                    danAdapterXuan.setAdapterOnItemClickListener(new BaseAdapter.AdapterOnItemClickListener() {
                        @Override
                        public void OnItemClick(int position) {

                        }
                    });
                    DuoAdapter = new DuoAdapter<>(mDuo, this, R.layout.dan_button);
                    mDuoRecy.setAdapter(DuoAdapter);
                    mDuoRecy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    });


                    //1 单选 多选

                    //小按钮监听
                    mDanRecy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {


                        }
                    });
                    //单选的按钮 跳转到该题
                    danAdapterXuan.SetButtonClick(new DanAdapter.SetButtonClick() {
                        @Override
                        public void setonClick(int position) {

                            mVp.setCurrentItem(position);
                            popupWindow1.dismiss();
                        }
                    });
                    DuoAdapter.SetButtonClick(new DuoAdapter.SetButtonClick() {
                        @Override
                        public void setonClick(int position) {
                            Integer integer = mDuo.get(position);
                            mVp.setCurrentItem(integer-1);
                            popupWindow1.dismiss();
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

            //合计对题
            duoDui = getSharedPreferences("duoDui", Context.MODE_PRIVATE);
            duoDui.edit().clear().commit();//对题清空


            duoDuiZong = getSharedPreferences("duoZong", Context.MODE_PRIVATE);
            duoDuiZong.edit().clear().commit();//对题总数清空

        }
}