package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.RecyclerBean;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerAdapter extends BaseAdapter<RecyclerBean> {
    public MyRecyclerAdapter(List<RecyclerBean> datas, Context context, int layoutId) {
        super(datas, context, layoutId);
    }

    /*
    }*/
    @Override
    public void bindData(BaseViewHolder baseViewHolder, int position) {
        if(data.get(position).getSchool_name()!=null){
            baseViewHolder.setText(R.id.tv_school_name,data.get(position).getSchool_name());
        }
        if(data.get(position).getThumb()!=null){
            ImageView byId = baseViewHolder.itemView.findViewById(R.id.image_school);
            Glide.with(context).load(data.get(position).getThumb()).into(byId);
//            baseViewHolder.setImage(R.id.image_school,datas.get(position).getThumb());
        }
        if(data.get(position).getTitle()!=null){
            baseViewHolder.setText(R.id.tv_content,data.get(position).getTitle());

        }
    }
}
