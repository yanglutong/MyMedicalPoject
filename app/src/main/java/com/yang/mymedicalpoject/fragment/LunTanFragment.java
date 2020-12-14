package com.yang.mymedicalpoject.fragment;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.FuromChildFragment;
import com.yang.mymedicalpoject.utils.MyViewPager;
import com.yang.mymedicalpoject.fragment.forumfragment.ForumFragment;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.GuanFangFragment;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.JingYanFragment;
import com.yang.mymedicalpoject.fragment.forumfragment.school.SchoolFragment;

import java.util.ArrayList;


public class LunTanFragment extends BaseMvpFragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    private TextView tv_school;
    private TextView tvForum;
    private RelativeLayout reDyr;
    private ArrayList<Fragment> fragments;
    private RelativeLayout Re_Forum;
    private FragmentTransaction fragmentTransaction;
    private SchoolFragment schoolFragment;
    private ForumFragment forumFragment;
    private FragmentManager manager;
    private TabLayout tab;
    private TabItem Forum_JingYan;
    private TabItem Forum_GuanFang;
    private ImageView forumEdit;
    private MyViewPager mVpager;

    public LunTanFragment() {
        // Required empty public constructor
    }

    //设置两个fragment和TextView联动
    public void fun(){
        fragments = new ArrayList<>();
        //创建fragment管理器
        schoolFragment = new SchoolFragment();
        forumFragment = new ForumFragment();
        fragments.add(schoolFragment);
        fragments.add(forumFragment);

        manager = getFragmentManager();
        fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.add(R.id.Re_Forum, schoolFragment).add(R.id.Re_Forum, forumFragment)
                .show(schoolFragment)
                .hide(forumFragment)
                .commit();
    }
    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_lun_tan;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_school:{
                tab.setVisibility(View.GONE);
                mVpager.setVisibility(View.GONE);
                Re_Forum.setVisibility(View.VISIBLE);
                reDyr.setBackground(getResources().getDrawable(R.drawable.shequ_bg_1));
                tv_school.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                tvForum.setTextColor(getResources().getColor(R.color.white));
                manager.beginTransaction().show(schoolFragment).hide(forumFragment).commit();
            }
                break;
            case R.id.tv_Forum:    {
                tab.setVisibility(View.VISIBLE);
                Re_Forum.setVisibility(View.GONE);
                reDyr.setBackground(getResources().getDrawable(R.drawable.shequ_bg));
                tv_school.setTextColor(getResources().getColor(R.color.white));
                tvForum.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                manager.beginTransaction().show(forumFragment).hide(schoolFragment).commit();

                //Viewpager也显示
                mVpager.setVisibility(View.VISIBLE);
                //设置Viewpager和Tab联动
                ArrayList<Fragment> fragments1 = new ArrayList<>();
                GuanFangFragment guanFangFragment = new GuanFangFragment();
                JingYanFragment jingYanFragment = new JingYanFragment();
                fragments1.add(guanFangFragment);
                fragments1.add(jingYanFragment);
                FragmentPagerAdapter fragmentPagerAdapter=new FragmentPagerAdapter(getChildFragmentManager()) {
                    @NonNull
                    @Override
                    public Fragment getItem(int position) {
                        return fragments1.get(position);
                    }

                    @Override
                    public int getCount() {
                        return fragments1.size();
                    }
                };
                mVpager.setAdapter(fragmentPagerAdapter);
                tab.setupWithViewPager(mVpager);
                tab.getTabAt(0).setText("官方论坛");
                tab.getTabAt(1).setText("经验论坛");
                break;
            }
            case R.id.Forum_Edit:
                //点击编辑按钮

                break;
        }
    }

    @Override
    protected void initDataMvp(View view) {
        tv_school = view.findViewById(R.id.tv_school);
        tvForum = view.findViewById(R.id.tv_Forum);
        reDyr = view.findViewById(R.id.Re_DYR);
        Re_Forum = view.findViewById(R.id.Re_Forum);
        Forum_GuanFang = view.findViewById(R.id.Forum_GuanFang);
        Forum_JingYan = view.findViewById(R.id.Forum_JingYan);
        tab = view.findViewById(R.id.LunTan_Tab);
        forumEdit = view.findViewById(R.id.Forum_Edit);

        mVpager = view.findViewById(R.id.mVp);

        tv_school.setOnClickListener(this);
        tvForum.setOnClickListener(this);
        forumEdit.setOnClickListener(this);

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //选中经验论坛显示编辑按钮
                if(tab.getPosition()==0){
                    //官方
                    forumEdit.setVisibility(View.GONE);
                }
                if(tab.getPosition()==1){
                    //经验
                    forumEdit.setVisibility(View.VISIBLE);

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        fun();
    }

    @Override
    protected BasePresenterIml createPresenter() {
        return null;
    }
}