package com.yang.mymedicalpoject.ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.google.android.material.tabs.TabLayout;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.homefragment.EnglishFragment;
import com.yang.mymedicalpoject.fragment.homefragment.YiYanFragment;
import com.yang.mymedicalpoject.fragment.homefragment.PoliticsFragment;
import com.yang.mymedicalpoject.utils.MyTitleBar;
import com.yang.mymedicalpoject.utils.MyViewPager;

import java.util.ArrayList;

public class HomeLiNianActivity extends BaseMvpActivity implements View.OnClickListener {


    private MyViewPager mVp;
    private TabLayout tab;
    private ArrayList<Fragment> fragments;
    private YiYanFragment nianFragment;
    private EnglishFragment englishFragment;
    private PoliticsFragment politicsFragment;
    private MyTitleBar myTitle;
    private TextView include_fan;
    private ImageView include_image;

    @Override
    protected int createLayoutId() {
        return R.layout.activity_home_li_nian;
    }

    @Override
    protected void initMvpData() {
        mVp = findViewById(R.id.liNiAn_Vp);
        tab = findViewById(R.id.tabLayout);
        myTitle = findViewById(R.id.myTitleBar);
        include_fan = myTitle.findViewById(R.id.include_fan);
        include_image = myTitle.findViewById(R.id.include_image);
        //初始化
        initLoad();
        getData();

        onClick();
    }

    private void onClick() {
        include_fan.setOnClickListener(this);
    }

    private void initLoad() {
        fragments = new ArrayList<>();
        nianFragment = new YiYanFragment();
        englishFragment = new EnglishFragment();
        politicsFragment = new PoliticsFragment();
    }

    private void getData() {
        fragments.add(nianFragment);
        fragments.add(englishFragment);
        fragments.add(politicsFragment);

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            String [] str={"医研","英语","政治"};
            @Override
            public int getCount() {
                return fragments.size();
            }

            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return str[position];
            }
        };

        mVp.setAdapter(adapter);
        tab.setupWithViewPager(mVp);

    }

    @Override
    protected BasePresenterIml createPresenter() {
        return null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.include_fan:
                finish();
                break;
                case R.id.include_image:{
                finish();
                break; }
        }
    }
}