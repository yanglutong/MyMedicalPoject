package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.base.adapter.ReAdapter2;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.TuShuBean;
import com.yang.mymedicalpoject.ui.activity.ShoppingInfoActivity;

import java.util.ArrayList;

public class BookFragment extends BaseMvpFragment {
    private RecyclerView re_qb;
    private ReAdapter adapter;
    public BookFragment() {
        // Required empty public constructor
    }

    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_book;
    }

    @Override
    protected void initDataMvp(View view) {
        re_qb = view.findViewById(R.id.Re_qb);
        re_qb.setLayoutManager(new LinearLayoutManager(getActivity()));

            Bundle bundle = getArguments();
            int a = bundle.getInt("a");
            ArrayList<TuShuBean> book = (ArrayList<TuShuBean>) bundle.getSerializable("book");
            Log.i("杨路通", "initView: "+book.size());
            adapter = new ReAdapter(getActivity(), book);
            re_qb.setAdapter(adapter);
            adapter.notifyDataSetChanged();
            adapter.setItem(new ReAdapter.OnItem() {
                @Override
                public void onClick(int position) {
                    String id = book.get(position).getId();
                    Toast.makeText(getActivity(), ""+position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), ShoppingInfoActivity.class);
                    intent.putExtra("id",id);
                    startActivity(intent);
                }
            });


        Log.i("杨路通", "BookFragment_initView: "+"杨路通");

    }

    @Override
    protected BasePresenterIml createPresenter() {
        return null;
    }
}