package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

import android.content.Context;

import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;

import java.util.List;

class RecyclerViewAdapter extends BaseAdapter<QuanBuBean> {
    public RecyclerViewAdapter(List<QuanBuBean> datas, Context context, int layoutId) {
        super(datas, context, layoutId);
    }

    @Override
    public void bindData(BaseViewHolder baseViewHolder, int position) {
//        baseViewHolder.setImage();
    }
}
