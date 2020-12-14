package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ReAdapter;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.TuShuBean;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ReAdapter2 extends RecyclerView.Adapter {
    List<QuanBuBean.ShopBean> shop;
    Context context;
    public ReAdapter2(FragmentActivity activity,   List<QuanBuBean.ShopBean> shop) {
        this.context=activity;
        this.shop=shop;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_shangcheng_recycler, parent, false);
        Dey dey = new Dey(view);
        return dey;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ReAdapter2.Dey dey= (ReAdapter2.Dey) holder;
        dey.rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(setOnItemClick!=null){
                    setOnItemClick.onClick(position);
                }
            }
        });
        dey.name.setText(shop.get(position).getName());
        Glide.with(context).load(shop.get(position).getPic()).into(dey.imageView);
        dey.tv_price.setText(shop.get(position).getXian_price());
      /*  dey.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(setOnItemClick!=null){
                    setOnItemClick.onClick(position);
                }
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return shop.size();
    }
    public  class Dey extends RecyclerView.ViewHolder{
        TextView name;
        ImageView imageView;
        TextView tv_price;
        RelativeLayout rl;

        public Dey(@NonNull View itemView) {
            super(itemView);
            imageView=  itemView.findViewById(R.id.image);
            name= itemView.findViewById(R.id.name);
            tv_price = itemView.findViewById(R.id.tv_price);
            rl = itemView.findViewById(R.id.rl);
        }
    }

    public interface setOnItemClick{
        void onClick(int position);
    }
    setOnItemClick setOnItemClick;

    public void setSetOnItemClick(ReAdapter2.setOnItemClick setOnItemClick) {
        this.setOnItemClick = setOnItemClick;
    }
}
