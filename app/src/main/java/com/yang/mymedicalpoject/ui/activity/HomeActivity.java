package com.yang.mymedicalpoject.ui.activity;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.utils.MyViewPager;
import com.yang.mymedicalpoject.base.adapter.PagerAdapter;
import com.yang.mymedicalpoject.fragment.HomeFragment;
import com.yang.mymedicalpoject.fragment.KeChengFragment;
import com.yang.mymedicalpoject.fragment.LunTanFragment;
import com.yang.mymedicalpoject.fragment.MiFragment;
import com.yang.mymedicalpoject.fragment.ShangChengFragment;
import com.yang.mymedicalpoject.utils.ToastUtils;

import java.util.ArrayList;

public class HomeActivity extends BaseMvpActivity {


    private MyViewPager mVp;
    private RadioButton homeKc;
    private RadioButton homeMi;
    private RadioButton homeLt;
    private RadioButton home_sy;
    private RadioButton homeSc;
    private RadioGroup radioGroup;
    private ArrayList<Fragment> fragments;
    private PagerAdapter adapter;
    private int current=0;
    @Override
    protected int createLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void initMvpData() {
        //找到控件
        initFindViewById();

        //初始化Fragment
        initData();
    }

    private void initData() {
        if(fragments==null){
            fragments = new ArrayList<>();
        }
        HomeFragment homeFragment = new HomeFragment();
        ShangChengFragment shangChengFragment = new ShangChengFragment();
        KeChengFragment keChengFragment = new KeChengFragment();
        LunTanFragment lunTanFragment = new LunTanFragment();
        MiFragment miFragment = new MiFragment();
        fragments.add(homeFragment);
        fragments.add(shangChengFragment);
        fragments.add(keChengFragment);
        fragments.add(lunTanFragment);
        fragments.add(miFragment);
        Log.i("杨路通", "HomeActivity: "+fragments.size());
        adapter = new PagerAdapter(getSupportFragmentManager(), fragments);
        mVp.setAdapter(adapter);
        //18331877311
    }

    private void initFindViewById() {
        mVp = findViewById(R.id.homeViewpager);
        radioGroup = findViewById(R.id.radioGroup);
        homeKc = findViewById(R.id.homeKc);
        homeMi = findViewById(R.id.homeMi);
        homeLt = findViewById(R.id.homeLt);
        home_sy = findViewById(R.id.home_Sy);
        homeSc = findViewById(R.id.homeSc);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                if(checkId==home_sy.getId()){
                    current=0;
                    mVp.setCurrentItem(current);
                    //切换到第一个fragment
                    ToastUtils.showToast(HomeActivity.this,"题库");
                }
                if(checkId==homeSc.getId()){
                    current=1;
                    mVp.setCurrentItem(current);
                }
                if(checkId==homeKc.getId()){
                    current=2;
                    mVp.setCurrentItem(current);

                }
                if(checkId==homeLt.getId()){
                    current=3;
                    mVp.setCurrentItem(current);

                }
                if(checkId==homeMi.getId()){
                    current=4;
                    mVp.setCurrentItem(current);
                }
            }
        });

    }

    @Override
    protected BasePresenterIml createPresenter() {
        return null;
    }
}