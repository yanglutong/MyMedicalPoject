package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.TuShuBean;

import java.util.ArrayList;
import java.util.List;

public class Fragment_TuShu extends Fragment {
    List<TuShuBean> tuShuBean;

    public Fragment_TuShu() {
    }

    public Fragment_TuShu(List<TuShuBean> tuShuBean) {
        this.tuShuBean=tuShuBean;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__tu_shu, container, false);
        initData(view);
        return view;
    }

    private void initData(View view) {
        if(tuShuBean!=null){
            Log.i("杨路通", "initData: "+tuShuBean.get(0).getName());
        }
    }
}