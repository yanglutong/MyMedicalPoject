package com.yang.mymedicalpoject.fragment.kechengfragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.yang.mymedicalpoject.R;

import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/27 20:44
 */
public class Ke_Jing_Adapter extends BaseAdapter<KeBean.KechengBean> {

    public Ke_Jing_Adapter(List<KeBean.KechengBean> datas, Context context) {
        super(datas, context, R.layout.ke_jing_item);
    }

    @Override
    public void bindData(BaseViewHolder viewHolder, int position) {
        ImageView viewById = viewHolder.itemView.findViewById(R.id.ke_jing_img);
        Glide.with(context).load(data.get(position).getPic()).into(viewById);
//        viewHolder.setImage(R.id.ke_jing_img,datas.get(position).getPic());
        viewHolder.setText(R.id.ke_jing_title,data.get(position).getName());
        viewHolder.setText(R.id.ke_shi_num,data.get(position).getClass_hour()+"");
        viewHolder.setText(R.id.ke_shi_yuan,data.get(position).getYuan_jia_ge()+"");
    }
}
