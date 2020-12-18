package com.yang.mymedicalpoject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.conifg.GlobalConfig;
import com.http.httplibrary.utils.JsonUtils;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.adapter.Ti_Zheng_RecyAdapter;
import com.yang.mymedicalpoject.bean.Ti_Ying_Recy_Bean;
import com.yang.mymedicalpoject.fragment.kechengfragment.RefitCallBack;
import com.yang.mymedicalpoject.interfaces.MyClick;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ti_Ying_RecyActivity extends AppCompatActivity {

    private ImageView mFanhui;
    private TextView mTitle;
    private RecyclerView mRecy;
    private static final String TAG ="Ti_Ying_RecyActivity" ;
    private int position;
    private List<Ti_Ying_Recy_Bean.UTypeBean.ZTypeBean> z_type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ti__zheng__item);
        mFanhui = findViewById(R.id.fanhui);
        mTitle = findViewById(R.id.title);
        mRecy = findViewById(R.id.recy);
        mRecy.setLayoutManager(new LinearLayoutManager(this));
        mRecy.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        mFanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mTitle.setText("英语专项");
        initData();
        position = getIntent().getIntExtra("position",0);



    }

    private void initData() {
        Map<String, Object> baseHeades = GlobalConfig.getInstance().getBaseHeades();
        GlobalConfig.getInstance().setBaseUrl("https://app.yiyanmeng.com/index.php/");
        new HttpClient.Buidler()
                .post()
                .setHeadres(baseHeades)
                .setApiUrl("shitien/ti_type_list")
                .build()
                .enqueue(new RefitCallBack<Ti_Ying_Recy_Bean>() {
                    @Override
                    public Ti_Ying_Recy_Bean convert(JsonElement result) {
                        return JsonUtils.jsonToClass(result,Ti_Ying_Recy_Bean.class);
                    }

                    @Override
                    public void onSucess(Ti_Ying_Recy_Bean ti_ying_recy_bean) {
                        Log.d(TAG, "onSucess: "+ti_ying_recy_bean);
                        //给答题卡传集合的，因为类型穿不过去
                      List<Ti_Ying_Recy_Bean.UTypeBean.ZTypeBean> u_type = ti_ying_recy_bean.getU_type().get(position).getZ_type();
                        ArrayList<Ti_Ying_Recy_Bean.UTypeBean.ZTypeBean> ti_ying_recy_beans = new ArrayList<>();
                        ti_ying_recy_beans.addAll(u_type);
//-----------------------------------------------------
                        Ti_Ying_RecyActivity.this.z_type = ti_ying_recy_bean .getU_type().get(position).getZ_type();
                        Ti_Zheng_RecyAdapter.Ti_Ying_RecyAdapter ti_zheng_recyAdapter = new Ti_Zheng_RecyAdapter.Ti_Ying_RecyAdapter(Ti_Ying_RecyActivity.this.z_type, Ti_Ying_RecyActivity.this);
                        mRecy.setAdapter(ti_zheng_recyAdapter);
                        ti_zheng_recyAdapter.notifyDataSetChanged();
                        ti_zheng_recyAdapter.setMyClick(new MyClick() {
                            @Override
                            public void onItemClick(int position) {
                                Intent intent = new Intent(Ti_Ying_RecyActivity.this, ZhuangXiangActivity.class);
                                //英语
                              //  String id = ti_ying_recy_bean.getU_type().get(position).getId();
                                  String id = Ti_Ying_RecyActivity.this.z_type.get(position).getId();
                                   intent.putExtra("ying",1);
                                    intent.putExtra("yingId",id);
                                    intent.putExtra("yingBeans",  ti_ying_recy_bean);
                                    Log.d("yingid", "onItemClick: "+id);

                                startActivity(intent);

                            }
                        });
                    }

                    @Override
                    public void error(String error, int code) {
                        Log.d(TAG, "error: "+error);
                    }
                }) ;


    }
}