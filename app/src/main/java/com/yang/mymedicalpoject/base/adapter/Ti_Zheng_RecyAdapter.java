package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.Ti_Ying_Recy_Bean;
import com.yang.mymedicalpoject.bean.Ti_Zheng_Recy_Bean;
import com.yang.mymedicalpoject.interfaces.MyClick;

import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/12/9 18:57
 */
public class Ti_Zheng_RecyAdapter extends RecyclerView.Adapter {


    private List<Ti_Zheng_Recy_Bean.UTypeBean.ZTypeBean> z_type;
    private Context mContext;
    private MyClick myClick;

    public void setMyClick(MyClick myClick) {
        this.myClick = myClick;
    }

    public Ti_Zheng_RecyAdapter(List<Ti_Zheng_Recy_Bean.UTypeBean.ZTypeBean> z_type, Context mContext) {
        this.z_type = z_type;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.ti_zheng_recy, parent, false);
        ViewHolderti viewHolderti = new ViewHolderti(inflate);
        return viewHolderti;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderti viewHolderti = (ViewHolderti) holder;
        Log.d("lzm11", "onBindViewHolder: "+z_type.size());
        viewHolderti.text.setText(z_type.get(position).getName());
        Log.d("ppp", "onBindViewHolder: "+z_type.get(position).getName());
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
        return z_type.size();
    }



   static class ViewHolderti extends RecyclerView.ViewHolder{
        TextView text;

        public ViewHolderti(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.text);
        }
    }
    public static class Ti_Ying_RecyAdapter extends RecyclerView.Adapter {


        private List<Ti_Ying_Recy_Bean.UTypeBean.ZTypeBean> yingz_type;
        private Context mContext;
        private MyClick myClick;

        public void setMyClick(MyClick myClick) {
            this.myClick = myClick;
        }

        public Ti_Ying_RecyAdapter(List<Ti_Ying_Recy_Bean.UTypeBean.ZTypeBean> yingz_type, Context mContext) {
            this.yingz_type = yingz_type;
            this.mContext = mContext;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View inflate = LayoutInflater.from(mContext).inflate(R.layout.ti_zheng_recy, parent, false);
          ViewHoldertiying viewHoldertiying = new ViewHoldertiying(inflate);
            return viewHoldertiying;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ViewHoldertiying viewHoldertiying = (ViewHoldertiying) holder;
                    Log.d("lzm11", "onBindViewHolder: " + yingz_type.size());
            viewHoldertiying.text.setText(yingz_type.get(position).getName());
            Log.d("ppp", "onBindViewHolder: " + yingz_type.get(position).getName());
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
            return yingz_type.size();
        }

        class ViewHoldertiying extends RecyclerView.ViewHolder {
            TextView text;

            public ViewHoldertiying(@NonNull View itemView) {
                super(itemView);
                text = itemView.findViewById(R.id.text);
            }
        }
    }


}
