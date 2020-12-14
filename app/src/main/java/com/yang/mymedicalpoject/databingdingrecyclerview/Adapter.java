package com.yang.mymedicalpoject.databingdingrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yang.mymedicalpoject.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter{
    private Context context;
    private ArrayList<Bean.DataBean> arrayList;

    public Adapter(Context context, ArrayList<Bean.DataBean> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
        return new Day(LayoutInflater.from(context).inflate(R.layout.recycler_item,null,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Day day= (Day) holder;
        day.textView.setText(arrayList.get(position).getImagePath());
        day.textView.setText(arrayList.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
  class Day extends RecyclerView.ViewHolder{
        TextView imageView;
        TextView textView;
        public Day(@NonNull View itemView) {
            super(itemView);
            imageView=  itemView.findViewById(R.id.iv_image);
          textView=  itemView.findViewById(R.id.tv_text);
        }
    }
}
