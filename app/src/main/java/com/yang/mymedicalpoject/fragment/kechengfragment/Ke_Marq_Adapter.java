package com.yang.mymedicalpoject.fragment.kechengfragment;

import android.content.Context;
import android.view.View;
import android.widget.TextView;


import com.xj.marqueeview.base.CommonAdapter;
import com.xj.marqueeview.base.ViewHolder;
import com.yang.mymedicalpoject.R;

import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/27 20:00
 */
public class Ke_Marq_Adapter extends CommonAdapter<KeBean.GongGaoBean> {


    public Ke_Marq_Adapter(Context context, List<KeBean.GongGaoBean> datas) {
        super(context, R.layout.ke_mar_item, datas);
    }
    @Override
    protected void convert(ViewHolder viewHolder, KeBean.GongGaoBean item, int position) {
        TextView mText = viewHolder.getView(R.id.ke_mtext);
        mText.setText(item.getName());
    }
}
