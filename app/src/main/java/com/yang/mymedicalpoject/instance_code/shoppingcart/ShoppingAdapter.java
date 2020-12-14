package com.yang.mymedicalpoject.instance_code.shoppingcart;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.ThreeBean;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class ShoppingAdapter extends BaseAdapter<ThreeBean> {

    public ShoppingAdapter(List<ThreeBean> data, Context context, int layoutId) {
        super(data, context, layoutId);
    }
    @Override
    public void bindData(BaseViewHolder baseViewHolder, int position) {
        baseViewHolder.setText(R.id.tv_name,data.get(position).getName());
        baseViewHolder.setText(R.id.tv_totalPrice,data.get(position).getXian_price()+"");
        baseViewHolder.setText(R.id.tv_num,data.get(position).getCount()+"");
        ImageView image = baseViewHolder.itemView.findViewById(R.id.image);
        String pic = data.get(position).getPic();
        Glide.with(context).load(pic).into(image);
        TextView tv_num = baseViewHolder.itemView.findViewById(R.id.tv_num);
        TextView tv_reduce = baseViewHolder.itemView.findViewById(R.id.tv_reduce);
        TextView tv_plus = baseViewHolder.itemView.findViewById(R.id.tv_plus);

        CheckBox checkBox = baseViewHolder.getView(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    checkBox.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(item!=null){
                                item.onClick(b,position);
                            }
                        }
                    });

                if(b){
                    String string = tv_num.getText().toString();
                    int i = Integer.parseInt(string);
                    float price = data.get(position).getXian_price();
                    float f=i*price;
                    Log.i("杨路通", "onCheckedChanged: "+f);
                }
                //设置当前已选中的条目
                data.get(position).setBiao(b);
                //获取到所有的条目集合
                EventBus.getDefault().postSticky(data);
            }
        });
        //设置条目为选中
        checkBox.setChecked(data.get(position).isBiao());
        tv_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = data.get(position).getCount();
                if (count > 1) {
                    --count;
                }
                data.get(position).setCount(count);
                notifyItemChanged(position,true);
                if(data.get(position).isBiao()){
                    EventBus.getDefault().postSticky(data);
                }
            }
        });
        tv_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = data.get(position).getCount();
                ++count;
                data.get(position).setCount(count);
                notifyItemChanged(position,true);
                if(data.get(position).isBiao()){
                    EventBus.getDefault().postSticky(data);
                }
            }
        });
        tv_num.setText(data.get(position).getCount()+"");
    }
    public interface OnItem{
        void onClick(boolean b,int position);
    }
    OnItem item;

    public void setItem(OnItem item) {
        this.item = item;
    }
}
