package com.yang.mymedicalpoject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.TiKuLieBean;
import com.yang.mymedicalpoject.fragment.homefragment.bean.HomeBean;
import com.yang.mymedicalpoject.ui.activity.HomeActivity;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class Ti_Recy_ItemActivity extends AppCompatActivity {
    //诊断学   单一条目
    private TextView mName;
    private TextView mZong;
    private ImageView mFanHui;
    private RelativeLayout mRela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ti__recy__item);
        mName = findViewById(R.id.name);
        mZong = findViewById(R.id.zong);
        mRela = findViewById(R.id.rela);
        mFanHui = findViewById(R.id.fanhui);
        ArrayList<HomeBean.UTypeBean.ZTypeBean> beans = (ArrayList<HomeBean.UTypeBean.ZTypeBean>) getIntent().getSerializableExtra("beans");
        int i = getIntent().getIntExtra("i", 0);
        mName.setText(beans.get(i).getName()+"");
        mZong.setText(beans.get(i).getZong() + "");
        mFanHui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ti_Recy_ItemActivity.this, HomeActivity.class));
                finish();
            }
        });
        //监听
        mRela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tab 里面子条目 的监听
                Intent intent = new Intent(Ti_Recy_ItemActivity.this, TabZiActivity.class);
                intent.putExtra("id",beans.get(i).getId());
                intent.putExtra("beans",beans);//诊断学外部recy 列表
                intent.putExtra("tye",2);//诊断学外部recy 列表
                Log.d("gzp", "onClick: "+beans.get(i).getId());
                intent.putExtra("i",i);
                startActivity(intent);
            }
        });
    }
}