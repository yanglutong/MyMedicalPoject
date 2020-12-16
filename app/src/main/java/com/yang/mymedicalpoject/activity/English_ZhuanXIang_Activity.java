package com.yang.mymedicalpoject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.conifg.GlobalConfig;
import com.http.httplibrary.utils.JsonUtils;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.adapter.Ti_Ying_Adapter;
import com.yang.mymedicalpoject.base.adapter.Ti_Zheng_Adapter;
import com.yang.mymedicalpoject.bean.Ti_Ying_Bean;
import com.yang.mymedicalpoject.bean.Ti_Zheng_Bean;
import com.yang.mymedicalpoject.fragment.kechengfragment.RefitCallBack;

import java.util.List;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class English_ZhuanXIang_Activity extends AppCompatActivity {

    private RecyclerView mRecy;
    private ImageView mFanHui;
    private TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ti__ying_);
        mRecy = findViewById(R.id.recy);
        mTitle = findViewById(R.id.title);
        mFanHui = findViewById(R.id.fanhui);
        mRecy.setLayoutManager(new LinearLayoutManager(this));
        mRecy.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        String type = getIntent().getStringExtra("type");
        if(type.equals("3")){
            mTitle.setText("英语专项练习");
            initData();
        }else if(type.equals("4")){
            mTitle.setText("政治专项");
            initZheng();
            Log.d("ti_zheng", "onCreate: "+"政治专项");

        }
        //数据
   //     initData();
        mFanHui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
finish();
            }
        });

    }

    private void initZheng() {
        //政治专项
        Map<String, Object> map = GlobalConfig.getInstance().getBaseHeades();
        GlobalConfig.getInstance().setBaseUrl("https://app.yiyanmeng.com/index.php/");
        new HttpClient.Builder()
                .setApiUrl("shitizz/ti_type_list")
                .post()
                .setHeadres(map)
                .build()
                .enqueue(new RefitCallBack<Ti_Zheng_Bean>() {
                    @Override
                    public Ti_Zheng_Bean convert(JsonElement result) {
                        return JsonUtils.jsonToClass(result,Ti_Zheng_Bean.class);
                    }
                    @Override
                    public void onSucess(Ti_Zheng_Bean zheng_bean) {
                        Log.d("ti_zheng", "onSucess: "+zheng_bean);
                        List<Ti_Zheng_Bean.UTypeBean> u_type = zheng_bean.getU_type();
                        //适配器
                        Ti_Zheng_Adapter ti_zheng_adapter = new Ti_Zheng_Adapter(u_type, English_ZhuanXIang_Activity.this);
                        mRecy.setAdapter(ti_zheng_adapter);
                       /* ti_zheng_adapter.setMyClick(new MyClick() {
                            @Override
                            public void onItemClick(int position) {
                                Intent intent = new Intent(Ti_Ying_Activity.this, Ti_Zheng_RecyActivity.class);
                                intent.putExtra("position",position);
                                startActivity(intent);
                            }
                        });*/

                    }

                    @Override
                    public void error(String error, int code) {
                        Log.d("ti_zheng", "error: "+error);
                    }
                });


    }

    private void initData() {
        Map<String, Object> map = Conifg.getInstance().getBaseHeades();
        Conifg.getInstance().setBaseUrl("https://app.yiyanmeng.com/index.php/");
        new HttpClient.Buidler()
                .setApiUrl("shitien/ti_type_list")
                .post()
                .setHeadres(map)
                .build()
                .enqueue(new RefitCallBack<Ti_Ying_Bean>() {



                    @Override
                    public Ti_Ying_Bean convert(JsonElement result) {
                        return JsonUtils.jsonToClass(result,Ti_Ying_Bean.class);
                    }

                    @Override
                    public void onSucess(Ti_Ying_Bean ti_ying_beans) {
                        Log.d("ti_ying", "onSucess: "+ti_ying_beans);
                        List<Ti_Ying_Bean.UTypeBean> u_type = ti_ying_beans.getU_type();
                        //适配器
                        Ti_Ying_Adapter ti_ying_adapter = new Ti_Ying_Adapter(u_type, English_ZhuanXIang_Activity.this);
                        mRecy.setAdapter(ti_ying_adapter);
                     /* ti_ying_adapter.setMyClick(new MyClick() {
                          @Override
                          public void onItemClick(int position) {
                              Intent intent = new Intent(English_ZhuanXIang_Activity.this, English_ZhuanXIang_Activity.class);
                              intent.putExtra("position",position );
                              startActivity(intent);
                          }
                      });*/


                    }

                    @Override
                    public void error(String error, int code) {
                        Log.d("ti_ying", "error: "+error);
                    }
                });






    }


}