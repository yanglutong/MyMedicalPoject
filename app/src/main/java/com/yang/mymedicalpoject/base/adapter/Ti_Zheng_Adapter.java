package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.Ti_Zheng_Bean;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/28 19:56
 */
public  class Ti_Zheng_Adapter extends RecyclerView.Adapter {
    
    List<Ti_Zheng_Bean.UTypeBean> ti_zheng_beans;
    private Context context;
    private MyClick myClick;
    public interface MyClick {
        void onItemClick(int position);
    }
    public void setMyClick(MyClick myClick) {

        this.myClick = myClick;
    }

    public Ti_Zheng_Adapter(List<Ti_Zheng_Bean.UTypeBean> ti_zheng_beans, Context context) {
        this.ti_zheng_beans = ti_zheng_beans;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ti_ying_item, parent, false);
        ViewHodler viewHodler = new ViewHodler(inflate);
        return viewHodler;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHodler viewHodler = (ViewHodler) holder;
        viewHodler.textJie.setText(ti_zheng_beans.get(position).getJianjie());
        Log.d("888", "onBindViewHolder: "+ti_zheng_beans.get(position).getJianjie());
        viewHodler.textXiang.setText("第"+(position+1)+"项");
        viewHodler.textXue.setText(ti_zheng_beans.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myClick!=null){
                    myClick.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return ti_zheng_beans.size();
    }
    class ViewHodler extends RecyclerView.ViewHolder{
            TextView textXiang;
            TextView textXue;
            TextView textJie;

        public ViewHodler(@NonNull View itemView) {
            super(itemView);
            textJie=itemView.findViewById(R.id.jie);
            textXue=itemView.findViewById(R.id.xue);
            textXiang=itemView.findViewById(R.id.xiang);
        }
    }
}
