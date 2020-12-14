package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.example.mvplibrary.base.adapter.CommonType;
import com.example.mvplibrary.base.adapter.MultipleAdapter;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean.GuanFangBean;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MyGFAdapter extends RecyclerView.Adapter {
    int positions;
    private int type;
    private ArrayList<GuanFangBean.ArticleBean> article;
    private ArrayList<GuanFangBean.PlateBean> plate;

    Context context;

    public MyGFAdapter(Context activity, List<GuanFangBean.ArticleBean> article, List<GuanFangBean.PlateBean> plate) {
        context=activity;
        this.article= (ArrayList<GuanFangBean.ArticleBean>) article;
        this.plate= (ArrayList<GuanFangBean.PlateBean>) plate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==1){
            Item1 item1 = new Item1(LayoutInflater.from(context).inflate(R.layout.guanfang_item1, null));
            return item1;
        }else{
            Item2 item2 = new Item2(LayoutInflater.from(context).inflate(R.layout.guanfang_item2, null));
            return item2;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(type==1){
            Item1 item1 = new Item1(holder.itemView);
            //加载第一个布局
            Glide.with(context).load(plate.get(position).getImage()).into(item1.liJu_image);
            item1.liJu_name.setText(plate.get(position).getTitle());
            item1.liJu_tieShu.setText("贴数 ："+plate.get(position).getNum());
        }else if(type==2){
            Item2 item2 = new Item2(holder.itemView);
            Glide.with(context).load(article.get(position-3).getAuthImg()).into(item2.liJu_image);
            item2.liJu_tieShu.setText(article.get(position-3).getAddtime());
            item2.liJu_name.setText(article.get(position-3).getAuthName());
            item2.text.setText(article.get(position-3).getTitle());
            item2.text2.setText(article.get(position-3).getContent());
            item2.w12.setText(article.get(position-3).getPing_num());
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0||position==1||position==2){
            type=1;
        }else{
            type=2 ;
        }
        return type;
    }

    @Override
    public int getItemCount() {
        return plate.size()+article.size();
    }
    class Item1 extends RecyclerView.ViewHolder{

        private final ImageView liJu_image;
        private final TextView liJu_tieShu;
        private final TextView liJu_name;

        public Item1(@NonNull View itemView) {
            super(itemView);
            liJu_image = itemView.findViewById(R.id.liJu_image);
            liJu_tieShu = itemView.findViewById(R.id.liJu_tieShu);
            liJu_name = itemView.findViewById(R.id.liJu_name);
        }
    } class Item2 extends RecyclerView.ViewHolder{

        private final ImageView liJu_image;
        private final TextView liJu_tieShu;
        private final TextView liJu_name;
        private final TextView text;
        private final TextView text2;
        private final TextView w12;

        public Item2(@NonNull View itemView) {
            super(itemView);
            liJu_image = itemView.findViewById(R.id.liJu_image);
            liJu_tieShu = itemView.findViewById(R.id.liJu_tieShu);
            liJu_name = itemView.findViewById(R.id.liJu_name);
            text = itemView.findViewById(R.id.text);
            text2 = itemView.findViewById(R.id.text2);
            w12 = itemView.findViewById(R.id.w12);
        }
    }
}
