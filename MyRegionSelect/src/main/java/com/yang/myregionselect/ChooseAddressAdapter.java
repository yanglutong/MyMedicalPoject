package com.yang.myregionselect;

import android.app.Activity;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;


public class ChooseAddressAdapter extends RecyclerView.Adapter<ChooseAddressAdapter.NyViewholder>{

    private Activity context;
    private List<ChooseAddressBean> mList;

    public ChooseAddressAdapter(Activity context, List<ChooseAddressBean> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public NyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_edit_info, parent, false);
        return new NyViewholder(view);
    }

    @Override
    public void onBindViewHolder(final NyViewholder holder, final int position) {
        holder.image.setTextColor(context.getResources().getColor(R.color.txt_26));
        holder.image.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);
        holder.image.setText(mList.get(position).name);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.image.setTextColor(context.getResources().getColor(R.color.txt_red));
                holder.iv_choose.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class NyViewholder extends RecyclerView.ViewHolder {
        TextView image;
        ImageView iv_choose;
        RelativeLayout rl;

        public NyViewholder(View itemView) {
            super(itemView);
            image = (TextView) itemView.findViewById(R.id.image);
            iv_choose=itemView.findViewById(R.id.iv_choose);
            rl=itemView.findViewById(R.id.rl);
        }
    }

}
