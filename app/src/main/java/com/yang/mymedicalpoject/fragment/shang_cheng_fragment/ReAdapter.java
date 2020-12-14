package com.yang.mymedicalpoject.fragment.shang_cheng_fragment;

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
import com.yang.mymedicalpoject.base.adapter.ReAdapter2;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.TuShuBean;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ReAdapter extends RecyclerView.Adapter {
    ArrayList<TuShuBean> book;
    Context context;
    private View view;

    public ReAdapter(FragmentActivity activity, ArrayList<TuShuBean> book) {
        this.context=activity;
        this.book=book;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_shangcheng_recycler, parent, false);
        Dey dey = new Dey(view);
        return dey;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Dey dey = new Dey(holder.itemView);
        dey.name.setText(book.get(position).getName());
        Glide.with(context).load(book.get(position).getPic()).into(dey.imageView);
            dey.tv_price.setText(book.get(position).getXian_price());
            dey.rl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(item!=null){
                        item.onClick(position);
                    }
                }
            });

    }

    @Override
    public int getItemCount() {
        return book.size();
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

    public interface OnItem{
        void onClick(int position);
    }
    OnItem item;

    public void setItem(OnItem item) {
        this.item = item;
    }
}
