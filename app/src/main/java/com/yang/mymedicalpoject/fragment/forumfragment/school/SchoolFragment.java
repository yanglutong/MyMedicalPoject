package com.yang.mymedicalpoject.fragment.forumfragment.school;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.mvplibrary.base.fragment.BaseFragment;
import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.google.android.material.tabs.TabLayout;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.SchoolBean;
import com.yang.mymedicalpoject.fragment.forumfragment.school.model.SchoolModel;
import com.yang.mymedicalpoject.fragment.forumfragment.school.presenter.SchoolPresenter;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;

import java.io.Serializable;
import java.util.ArrayList;


public class SchoolFragment extends BaseMvpFragment<SchoolConstants.MyView, SchoolModel, SchoolPresenter> implements SchoolConstants.MyView{
    private TabLayout mTab;
    private ViewPager mVp;
    private TextView school_lod;


    @Override
    protected void initDataMvp(View view) {
        mTab = view.findViewById(R.id.tabItem);
        mVp = view.findViewById(R.id.ViewPager);
        school_lod = view.findViewById(R.id.school_lod);
        school_lod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTab.setEnabled(false);
            }
        });
        initDemo();
    }

    private void initDemo() {
        //请求数据

        mPresenter.getData();
    }

    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_demo;
    }

    @Override
    public void showData(ArrayList<SchoolBean> schoolBeans) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Fragment> fragments = new ArrayList<>();
        schoolBeans.remove(0);
        for (int i = 0; i <schoolBeans.size() ; i++) {
            strings.add(schoolBeans.get(i).getName());
            Log.i("杨路通", "showData: "+strings.get(i));
            School_Fragment fragment = new School_Fragment();

            Bundle bundle = new Bundle();

            bundle.putString("type",schoolBeans.get(i).getType());

            bundle.putString("id",schoolBeans.get(i).getId());
            fragment.setArguments(bundle);
            fragments.add(fragment);
        }
        FragmentStatePagerAdapter pagerAdapter = new FragmentStatePagerAdapter(getFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return strings.get(position);
            }
        };
        mVp.setAdapter(pagerAdapter);
        mTab.setupWithViewPager(mVp);

        mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void showError(String msg, int c) {
        Log.i("杨路通", "showError: "+msg+c);
    }



    @Override
    protected SchoolPresenter createPresenter() {
        return new SchoolPresenter();
    }
}