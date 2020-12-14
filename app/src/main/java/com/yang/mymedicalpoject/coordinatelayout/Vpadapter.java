package com.yang.mymedicalpoject.coordinatelayout;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import androidx.viewpager.widget.PagerAdapter;

public class Vpadapter extends PagerAdapter {
    private List<ImageView> list;

    public Vpadapter(List<ImageView> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        container.addView( list.get(position), 0);//添加页卡
        return list.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(list.get(position));//删除页卡
    }
}
