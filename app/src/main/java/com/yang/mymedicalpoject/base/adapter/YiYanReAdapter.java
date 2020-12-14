package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;
import android.view.View;

import com.bumptech.glide.Glide;
import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.YiYanBean;

import java.util.List;

import androidx.fragment.app.FragmentActivity;

public class YiYanReAdapter extends BaseAdapter<YiYanBean.ZTypeBean> {

    public YiYanReAdapter(List<YiYanBean.ZTypeBean> datas, Context context, int layoutId) {
        super(datas, context, layoutId);
    }

    @Override
    public void bindData(BaseViewHolder baseViewHolder, int position) {
        baseViewHolder.setText(R.id.tvTitle,data.get(position).getName());
        baseViewHolder.setText(R.id.yiYuan_tvNanDu,"难度系数："+data.get(position).getXishu());
        baseViewHolder.setText(R.id.yiYan_tvYiZuo,"已做人数："+data.get(position).getYizuo());
    }
}
