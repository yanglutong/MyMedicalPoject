package com.yang.mymedicalpoject.fragment.homefragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yang.mymedicalpoject.R;
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

        HomeRecyclerAdapter adapter = new HomeRecyclerAdapter(z_type, getActivity(), R.layout.recycler_home_item);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;

    }
}