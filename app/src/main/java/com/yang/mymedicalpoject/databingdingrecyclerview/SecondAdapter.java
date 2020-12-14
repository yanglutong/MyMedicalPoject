package com.yang.mymedicalpoject.databingdingrecyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.databinding.RecyclerItemBinding;

import java.util.ArrayList;

import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by $wu on 2017-09-09 上午 10:40.
 */

public class SecondAdapter extends RecyclerView.Adapter {

    private ArrayList<Bean.DataBean> users;
    private Context context;

    public SecondAdapter(ArrayList<Bean.DataBean> users, Context context) {
        if(this.users == null){
            this.users = users;
        }
        this.users =  users;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        RecyclerItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.recycler_item, parent, false);
        return new MyViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecyclerItemBinding binding = DataBindingUtil.getBinding(holder.itemView);
        binding.setUser(users.get(position));
        binding.executePendingBindings();
    }


    @Override
    public int getItemCount() {
        Log.i("杨路通", "getItemCount: "+users.size());
        return users.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
    @BindingAdapter({"android:yang"})
    public static void ImageViewAdapter(ImageView imageView,String url){
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }
}
