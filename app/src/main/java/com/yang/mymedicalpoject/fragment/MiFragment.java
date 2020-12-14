package com.yang.mymedicalpoject.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.MyApp;
import com.yang.mymedicalpoject.login.LoginActivity;
import com.yang.mymedicalpoject.ui.activity.AboutActivity;
import com.yang.mymedicalpoject.ui.activity.MyCourseActivity;
import com.yang.mymedicalpoject.ui.activity.Shipping_AddressActivity;

public class MiFragment extends BaseMvpFragment {

    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_mi;
    }

    @Override
    protected void initDataMvp(View view) {
        TextView viewById = view.findViewById(R.id.tv_exit);
        RelativeLayout rl_about_us = view.findViewById(R.id.rl_about_us);
        RelativeLayout rl_my_class = view.findViewById(R.id.rl_my_class);
        RelativeLayout rl_address = view.findViewById(R.id.rl_address);

        rl_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyApp.openActivity(context, Shipping_AddressActivity.class);
            }
        });
        rl_my_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyApp.openActivity(context, MyCourseActivity.class);
            }
        });

        rl_about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyApp.openActivity(context, AboutActivity.class);
            }
        });
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
    }

    @Override
    protected BasePresenterIml createPresenter() {
        return null;
    }
}