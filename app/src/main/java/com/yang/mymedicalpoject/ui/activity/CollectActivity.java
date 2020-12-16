package com.yang.mymedicalpoject.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.google.android.material.tabs.TabLayout;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.EnglishFragment2;
import com.yang.mymedicalpoject.fragment.PoliticsFragment2;
import com.yang.mymedicalpoject.fragment.YiYanFragment2;
import com.yang.mymedicalpoject.fragment.homefragment.EnglishFragment;
import com.yang.mymedicalpoject.fragment.homefragment.PoliticsFragment;
import com.yang.mymedicalpoject.fragment.homefragment.YiYanFragment;
import com.yang.mymedicalpoject.utils.MyTitleBar;
import com.yang.mymedicalpoject.utils.MyViewPager;

import java.util.ArrayList;
import java.util.List;

public class CollectActivity extends BaseMvpActivity {
    private MyViewPager mViewPager;

    private List<Fragment> fragments;
    private List<String> listTitles = new ArrayList<>();
    private MyTitleBar mInclude;
    private TabLayout mTabLayout;
    private RelativeLayout mActivityMain;
    @Override
    protected int createLayoutId() {
        return R.layout.activity_collect;
    }

    @Override
    protected void initMvpData() {
        initView();
    }

    private void initView() {
        mInclude = (MyTitleBar) findViewById(R.id.include);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (MyViewPager) findViewById(R.id.viewPager);
        mActivityMain = (RelativeLayout) findViewById(R.id.activity_main);

        listTitles.add("医研");
        listTitles.add("英语");
        listTitles.add("政治");
        mTabLayout.addTab(mTabLayout.newTab().setText(listTitles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(listTitles.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(listTitles.get(2)));

        YiYanFragment2 yiYanFragment = new YiYanFragment2();
        EnglishFragment2 englishFragment = new EnglishFragment2();
        PoliticsFragment2 politicsFragment = new PoliticsFragment2();

        fragments = new ArrayList<Fragment>();

            fragments.add(yiYanFragment);
            fragments.add(englishFragment);
            fragments.add(politicsFragment);
        FragmentPagerAdapter mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            //ViewPager与TabLayout绑定后，这里获取到PageTitle就是Tab的Text
            @Override
            public CharSequence getPageTitle(int position) {
                return listTitles.get(position);
            }
        };
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);//将TabLayout和ViewPager关联起来。
        mTabLayout.setTabsFromPagerAdapter(mAdapter);//给Tabs设置适配器
    }

    @Override
    protected BasePresenterIml createPresenter() {
        return null;
    }
}