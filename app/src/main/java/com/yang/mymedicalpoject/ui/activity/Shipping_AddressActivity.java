package com.yang.mymedicalpoject.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.MyApp;
import com.yang.mymedicalpoject.fragment.forumfragment.school.bean.RecyclerBean;
import com.yang.mymedicalpoject.sqlite.MySql;
import com.yang.mymedicalpoject.sqlite.Person;
import com.yang.mymedicalpoject.utils.MyTitleBar;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Shipping_AddressActivity extends AppCompatActivity implements MyTitleBar.OnClick, View.OnClickListener {

    private MyTitleBar myTitle;
    private TextView tv_create;
    private RecyclerView recycler;
    private boolean is;
    private LinearLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping__address);

        findViewById();
    }


    private void findViewById() {
        myTitle = findViewById(R.id.myTitle);
        tv_create = findViewById(R.id.tv_create);
        recycler = findViewById(R.id.recycler);

        initDataRecycler();
        myTitle.setOnClick(this);

        tv_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyApp.openActivity(Shipping_AddressActivity.this,Shipping_AddressActivity2.class);
            }
        });

    }

    private void initDataRecycler() {
        MySql mySql = new MySql(this);
        ArrayList<Person> list = mySql.selectAdd();
        //创建布局管理器
        manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);
        ReAdapter adapter = new ReAdapter(this,list);
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        //设置点击条目
    }
     class ReAdapter extends RecyclerView.Adapter {
        private Context context;
        private  ArrayList<Person> list;
        public ReAdapter(Context context,  ArrayList<Person> list) {
            this.context = context;
            this.list = list;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            return new ItemView(LayoutInflater.from(context).inflate(R.layout.item_address,null));
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if(interLong !=null){
                        interLong.setInterLong(position);
                    }
                    return false;
                }
            });
            ItemView itemView= (ItemView) holder;
            itemView.tv_name.setText(list.get(position).getAddress1());
            itemView.tv_content.setText(list.get(position).getPhone()+"");
            itemView.tv_tel.setText(list.get(position).getDetail()+list.get(position).getRegion());

            //监听当前的check是否选中状态
            //将状态保存到数据库
            //设置状态
            itemView.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    //要执行的操作
                    RelativeLayout childAt = (RelativeLayout) manager.getChildAt(position);
                    CheckBox check = childAt.findViewById(R.id.checkbox);
                    check.setChecked(true);
                    notifyItemChanged(position);

                    Person person = new Person(list.get(position).getRegion(), list.get(position).getPhone(),
                            list.get(position).getAddress1(), list.get(position).getDetail(), list.get(position).getA());

                    Person person2 = new Person(list.get(0).getRegion(), list.get(0).getPhone(),
                            list.get(0).getAddress1(), list.get(0).getDetail(), list.get(0).getA());

                    list.set(0,person);
                    list.set(position,person2);

                    check.setChecked(false);
                    /*Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            *//**
                             *要执行的操作
                             *//*
                        }
                    }, 3000);//3秒后执行Runnable中的run方法
                    */

                    RelativeLayout childAt2 = (RelativeLayout) manager.getChildAt(0);
                    CheckBox check2 = childAt2.findViewById(R.id.checkbox);
                    check2.setChecked(true);
                    notifyDataSetChanged();
                }

            });
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
        class ItemView extends RecyclerView.ViewHolder{
            private  TextView tv_name;
            private  TextView tv_content;
            private  TextView tv_tel;
            private  TextView tv_edit;
            private  TextView tv_del;
            private CheckBox checkbox;

            public ItemView(@NonNull View itemView) {
                super(itemView);
                //名字
                tv_name = itemView.findViewById(R.id.tv_name);
                //手机号
                tv_content = itemView.findViewById(R.id.tv_content);
                //详情
                tv_tel = itemView.findViewById(R.id.tv_tel);
                //编辑
                tv_edit = itemView.findViewById(R.id.tv_edit);
                //删除
                tv_del = itemView.findViewById(R.id.tv_del);
                checkbox = itemView.findViewById(R.id.checkbox);

            }


        }

    }


    public interface InterLong{
        void setInterLong(int position);
    }
    InterLong interLong;

    public void setInterLong(InterLong interLong) {
        this.interLong = interLong;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
           /* case R.id.tv_create:
                //新建收货地址

                break;*/
            case R.id.include_fan:
                finish();
                break;
            case R.id.include_image:
            {
                finish();
            }
                break;
        }
    }
}