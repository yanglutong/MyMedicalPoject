package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;
import android.view.View;
import android.widget.Button;


import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.HaShiBean;


import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/12/10 10:01
 */
public class DanAdapter<se> extends BaseAdapter<Integer> {
    private boolean is;

    public DanAdapter(List<Integer> datas, Context context, int layoutId) {
        super(datas, context, layoutId);
    }

    @Override
    public void bindData(BaseViewHolder viewHolder, int position) {
        viewHolder.setText(R.id.button,data.get(position)+"");
        Button but = viewHolder.getView(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(setonClick!=null){
                    setonClick.setonClick(position);
                }
            }
        });
        Integer integer1 = data.get(position);
        Integer integer = HaShiBean.map.get(integer1-1);


                if(integer!=null){
                    if(integer==1){

                    }else if(integer==2){
                        but.setBackgroundResource(R.drawable.button_blue);
                    }else if(integer==3){
                        but.setBackgroundResource(R.drawable.button_red);
                    }
                }





    }

    public interface SetButtonClick {
        void setonClick(int position);
    }

    private SetButtonClick setonClick;

    public void SetButtonClick(SetButtonClick setonClick){
        this.setonClick=setonClick;

    }
}
