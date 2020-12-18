package com.yang.mymedicalpoject.fragment.homefragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.activity.Ti_Recy_ItemActivity;
import com.yang.mymedicalpoject.base.adapter.HomeRecyclerAdapter;
import com.yang.mymedicalpoject.fragment.homefragment.bean.HomeBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        Bundle arguments = getArguments();
        ArrayList<HomeBean.UTypeBean.ZTypeBean> z_type = (ArrayList<HomeBean.UTypeBean.ZTypeBean>) arguments.getSerializable("list");
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        HomeRecyclerAdapter adapter = new HomeRecyclerAdapter(z_type, getActivity(), R.layout.recycler_home_item);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        //做子条目的监听

        adapter.setAdapterOnItemClickListener(new BaseAdapter.AdapterOnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                //点击子条目监听
                // Toast.makeText(getContext(), "我是自提哦啊吗", Toast.LENGTH_SHORT).show();
                //跳转
                Intent intent = new Intent(getContext(), Ti_Recy_ItemActivity.class);
                intent.putExtra("beans",z_type);
                intent.putExtra("i",position);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return view;

    }
}