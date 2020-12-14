package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;

import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.homefragment.bean.HomeBean;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class HomeRecyclerAdapter extends BaseAdapter<HomeBean.UTypeBean.ZTypeBean> {
    public HomeRecyclerAdapter(List<HomeBean.UTypeBean.ZTypeBean> datas, Context context, int layoutId) {
        super(datas, context, layoutId);
    }
    @Override
    public void bindData(BaseViewHolder baseViewHolder, int position) {
        baseViewHolder.setText(R.id.recyclerHomeText,data.get(position).getName());
    }
}
