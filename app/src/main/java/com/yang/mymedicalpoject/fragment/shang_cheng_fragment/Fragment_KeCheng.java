package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.KeChengBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;

import androidx.fragment.app.Fragment;

/**

 */
public class Fragment_KeCheng extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ke_cheng, container, false);
        initData();
        return view;
    }

    private void initData() {

    }
}