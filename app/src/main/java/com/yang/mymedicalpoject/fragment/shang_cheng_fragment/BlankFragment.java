package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.base.adapter.ReAdapter2;
import com.yang.mymedicalpoject.fragment.LazyFragment;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.TuShuBean;
import com.yang.mymedicalpoject.ui.activity.ShoppingInfoActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BlankFragment extends Fragment {
    private RecyclerView re_qb;
    private ReAdapter2 adapter1;

    public BlankFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        re_qb = view.findViewById(R.id.Re_qb);
        re_qb.setLayoutManager(new LinearLayoutManager(getActivity()));

        Bundle bundle = getArguments();
        int a = bundle.getInt("a");

            QuanBuBean all = (QuanBuBean) bundle.getSerializable("all");
            List<QuanBuBean.ShopBean> shop = all.getShop();
            adapter1 = new ReAdapter2(getActivity(), shop);
            re_qb.setAdapter(adapter1);
            adapter1.notifyDataSetChanged();

        adapter1.setSetOnItemClick(new ReAdapter2.setOnItemClick() {
            @Override
            public void onClick(int position) {
                String id = shop.get(position).getId();
                Toast.makeText(getActivity(), ""+position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ShoppingInfoActivity.class);
                intent.putExtra("id",id);
                //点击跳转到详情页面
                startActivity(intent);
            }
        });


        Log.i("杨路通", "BlankFragment_initView: "+"杨路通");
    }






















}