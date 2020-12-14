package com.yang.mymedicalpoject.base.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean.FuromChildBean;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FuromChildAdapter extends RecyclerView.Adapter {
    private FuromChildBean furomChildBean;
    private Context context;
    private int recycler1 = 0;
    private int recycler2 = 1;
    private static final String TAG = "FuromChildAdapter";
    private List<FuromChildBean.ArticleBean> articleBeans;
    private List<FuromChildBean.TopBean> topBeans;

    public FuromChildAdapter(Context context, List<FuromChildBean.ArticleBean> articleBeans, List<FuromChildBean.TopBean> topBeans) {
        this.context = context;
        this.articleBeans = articleBeans;
        Log.i(TAG, "FuromChildAdapter: "+articleBeans);
        this.topBeans = topBeans;
        Log.i(TAG, "FuromChildAdapter: "+topBeans);
    }

/* public FuromChildAdapter(FuromChildBean furomChildBean, Context context) {
        this.furomChildBean = furomChildBean;
        Log.i(TAG, "FuromChildAdapter: " + furomChildBean.getArticle());
        this.context = context;

    }*/

    @Override
    public int getItemViewType(int position) {
        if (position < 2) {
            return recycler1;
        } else {
            return recycler2;
        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == recycler1) {
            View v = LayoutInflater.from(context).inflate(R.layout.furomchild_recycler_item, parent, false);
            MyHolder myHolder = new MyHolder(v);
            return myHolder;
        } else {
            View v = LayoutInflater.from(context).inflate(R.layout.furomchild_recycler1_item, parent, false);
            MyHolder1 myHolder1 = new MyHolder1(v);
            return myHolder1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyHolder) {
            MyHolder holder1 = (MyHolder) holder;
            String title = topBeans.get(position).getTitle();
            holder1.furom_child_title.setText(title);
        } else {
            MyHolder1 holder2 = (MyHolder1) holder;
            holder2.mFuromAddtime.setText(articleBeans.get(position - 2).getAddtime());
            holder2.mFuromAuthName.setText(articleBeans.get(position-2).getAuthName());
            holder2.mFuromTitle.setText(articleBeans.get(position-2).getTitle());
            holder2.mFuromContent.setText(articleBeans.get(position-2).getContent());
            holder2.mFuromPingNum.setText(articleBeans.get(position-2).getPing_num());
            RequestOptions options = new RequestOptions().circleCrop();
            Glide.with(context).load(articleBeans.get(position-2).getAuthImg()).apply(options).into(holder2.mFuromAuthImg);
            Glide.with(context).load(articleBeans.get(position-2).getImages()).into(holder2.mFuromImages);
        }

    }

    @Override
    public int getItemCount() {
        return topBeans.size() + articleBeans.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
          TextView furom_child_title;

        //  有参构造
        public MyHolder(View itemView) {
            super(itemView);
            furom_child_title = itemView.findViewById(R.id.furom_child_title);
        }

    }

    class MyHolder1 extends RecyclerView.ViewHolder {
        private ImageView mFuromAuthImg;
        private TextView mFuromAuthName;
        private TextView mFuromAddtime;
        private TextView mFuromTitle;
        private TextView mFuromContent;
        private ImageView mFuromImages;
        private TextView mFuromPingNum;

        //  有参构造
        public MyHolder1(View itemView) {
            super(itemView);
            mFuromAuthImg = itemView.findViewById(R.id.furom_authImg);
            mFuromAuthName = itemView.findViewById(R.id.furom_authName);
            mFuromAddtime = itemView.findViewById(R.id.furom_addtime);
            mFuromTitle = itemView.findViewById(R.id.furom_title);
            mFuromContent = itemView.findViewById(R.id.furom_content);
            mFuromImages = itemView.findViewById(R.id.furom_images);
            mFuromPingNum = itemView.findViewById(R.id.furom_ping_num);
        }

    }


}
