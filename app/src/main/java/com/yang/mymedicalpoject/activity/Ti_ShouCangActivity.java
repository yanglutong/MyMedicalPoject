package com.yang.mymedicalpoject.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.Ti_ShouCang_Yan_Frag;
import com.yang.mymedicalpoject.fragment.Ti_ShouCang_Ying_Frag;
import com.yang.mymedicalpoject.fragment.Ti_ShouCang_Zheng_Frag;

public class Ti_ShouCangActivity extends AppCompatActivity {
    //收藏    --------未请求

    private TabLayout mTab;
    private RelativeLayout mRela;

//    private Toolbar mToor;
    private Ti_ShouCang_Yan_Frag ti_shouCang_yan_frag;
    private Ti_ShouCang_Ying_Frag ti_shouCang_ying_frag;
    private Ti_ShouCang_Zheng_Frag ti_shouCang_zheng_frag;
    private TextView mTitle;
    private ImageView mFanui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ti__shou_cang);
        mRela = findViewById(R.id.ti_li_rela);
        mTab = findViewById(R.id.ti_li_tab);
        mFanui = findViewById(R.id.fanhui);
        mTitle = findViewById(R.id.title);
        String type = getIntent().getStringExtra("type");
        if(type.equals("2")){
            mTitle.setText("收藏");
        }else{
            mTitle.setText("错题库");
        }
      /*  mToor = findViewById(R.id.toor);
        mTab = findViewById(R.id.ti_li_tab);
        mToor.setTitle("收藏");
        setSupportActionBar(mToor);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
      //返回键
        mFanui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Ti_ShouCangActivity.this. finish();
            }
        });



        //添加子fag
        ti_shouCang_yan_frag= new Ti_ShouCang_Yan_Frag();
        ti_shouCang_ying_frag = new Ti_ShouCang_Ying_Frag();
        ti_shouCang_zheng_frag = new Ti_ShouCang_Zheng_Frag();
    /*    setSupportActionBar(mToor);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.ti_li_rela,ti_shouCang_yan_frag)
                .add(R.id.ti_li_rela,ti_shouCang_ying_frag)
                .add(R.id.ti_li_rela,ti_shouCang_zheng_frag)
                .hide(ti_shouCang_yan_frag)
                .hide(ti_shouCang_zheng_frag)
                .commit();
        mTab.addTab(mTab.newTab().setText("医研"));
        mTab.addTab(mTab.newTab().setText("英语"));
        mTab.addTab(mTab.newTab().setText("政治"));
        //tab监听
        mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()==0){

                    FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
                    fragmentTransaction
                            .show(ti_shouCang_yan_frag)
                            .hide(ti_shouCang_ying_frag)
                            .hide(ti_shouCang_zheng_frag)
                            .commit();

                }else if(tab.getPosition()==1){
                    FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
                    fragmentTransaction
                            .show(ti_shouCang_ying_frag)
                            .hide(ti_shouCang_yan_frag)
                            .hide(ti_shouCang_zheng_frag)
                            .commit();

                }else{
                    FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
                    fragmentTransaction
                            .show(ti_shouCang_zheng_frag)
                            .hide(ti_shouCang_yan_frag)
                            .hide(ti_shouCang_ying_frag)
                            .commit();

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}