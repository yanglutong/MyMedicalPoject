package com.yang.mymedicalpoject.base.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * @author gzp
 * @description:
 * @date : 2020/12/8 19:20
 */
public class TiTabItemVp extends FragmentPagerAdapter {
    private final FragmentManager fm;

    public TiTabItemVp(@NonNull FragmentManager fm, ArrayList<Fragment> tiTabItemFragments) {
        super(fm);
        this.fm=fm;
        this.tiTabItemFragments = tiTabItemFragments;
    }

    private ArrayList<Fragment> tiTabItemFragments;

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tiTabItemFragments.get(position);
    }

    @Override
    public int getCount() {
        return tiTabItemFragments.size();
    }

    @NonNull
    @Override
    public Fragment instantiateItem(@NonNull ViewGroup container, int position) {
        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        fm.beginTransaction().show(fragment).commit();

        return fragment;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
     //   super.destroyItem(container, position, object);
        Fragment fragment = tiTabItemFragments.get(position);
        fm.beginTransaction().hide(fragment).commit();

    }
}
