package com.yang.mymedicalpoject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
import com.yang.mymedicalpoject.bean.Ti_Zheng_Recy_Bean;
import com.yang.mymedicalpoject.fragment.kechengfragment.RefitCallBack;
import com.yang.mymedicalpoject.interfaces.MyClick;
import com.yang.mymedicalpoject.utils.MyTitleBar;

import java.util.List;
import java.util.Map;

public class Ti_Zheng_RecyActivity extends AppCompatActivity {
    private MyTitleBar mTitle;
    private RecyclerView mRecy;
    private static final String TAG ="Ti_Zheng_RecyActivity" ;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ti__zheng__item);
        mTitle = findViewById(R.id.myTitle);
        mRecy = findViewById(R.id.recy);
        mRecy.setLayoutManager(new LinearLayoutManager(this));
        mRecy.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        mTitle.setOnClick(new MyTitleBar.OnClick() {
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
        initData();
        position = getIntent().getIntExtra("position",0);



    }

    private void initData() {
        Map<String, Object> baseHeades = GlobalConfig.getInstance().getBaseHeades();
        GlobalConfig.getInstance().setBaseUrl("https://app.yiyanmeng.com/index.php/");
        new HttpClient.Buidler()
                .post()
                .setHeadres(baseHeades)
                .setApiUrl("shitizz/ti_type_list")
                .build()
                .enqueue(new RefitCallBack<Ti_Zheng_Recy_Bean>() {
                    @Override
                    public Ti_Zheng_Recy_Bean convert(JsonElement result) {
                        return JsonUtils.jsonToClass(result,Ti_Zheng_Recy_Bean.class);
                    }

                    @Override
                    public void onSucess(Ti_Zheng_Recy_Bean ti_zheng_recy_bean) {
                        Log.d(TAG, "onSucess: "+ti_zheng_recy_bean);
                        List<Ti_Zheng_Recy_Bean.UTypeBean.ZTypeBean> z_type = ti_zheng_recy_bean.getU_type().get(position).getZ_type();
                        //适配器
                        Ti_Zheng_RecyAdapter ti_zheng_recyAdapter = new Ti_Zheng_RecyAdapter(z_type, Ti_Zheng_RecyActivity.this);
                        mRecy.setAdapter(ti_zheng_recyAdapter);
                        ti_zheng_recyAdapter.notifyDataSetChanged();
                        //政治==历年单选 条目监听
                        ti_zheng_recyAdapter.setMyClick(new MyClick() {
                            @Override
                            public void onItemClick(int position) {
                                Toast.makeText(Ti_Zheng_RecyActivity.this, "政治专项"+z_type.get(position).getName(), Toast.LENGTH_SHORT).show();
                                //要和英语专项公用
                                Intent intent = new Intent(Ti_Zheng_RecyActivity.this, ZhuangXiangActivity.class);
                                //政治id  为z里面 id;
                                String id = z_type.get(position).getId();
                                intent.putExtra("ying",2);//政治 2
                                intent.putExtra("yingId",id);
                                // "u_type":   "name": "马克思主义基本原理概论", 答题卡name +     z里面的id
                                intent.putExtra("yingBeans",  ti_zheng_recy_bean);//传整个集合，不然麻烦要传两次
                                Log.d("zheng_id", "onItemClick: "+id);
                                Log.d("zheng_beans", "onItemClick: "+ti_zheng_recy_bean);
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