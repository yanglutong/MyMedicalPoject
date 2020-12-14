package com.yang.mymedicalpoject.instance_code.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.yang.mymedicalpoject.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.Random;

public class ShoppingActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private CheckBox checkbox;
    //初始化集合
    private ArrayList<CartData> list=new ArrayList<>();
    private boolean allCheck;
    private ShoppingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        EventBus.getDefault().register(this);
        Log.i("杨路通", "onCreate: "+"杨路通");
//        find();

    }


   /* private void find() {
        recycler = findViewById(R.id.recyclerView);
        checkbox = findViewById(R.id.checkbox);
        initData();
        //判断是否选中状态
    }

    private void initData() {
        //加载资源
        for (int i = 0; i <10 ; i++) {
            CartData cartData = new CartData();
            cartData.setCount(1);
            cartData.setPrice(new Random().nextInt(1000));
            cartData.setName("商品列表"+i);
            list.add(cartData);
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ShoppingAdapter(list, this, R.layout.item_booking_car);
        recycler.setAdapter(adapter);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    for (int i = 0; i <list.size() ; i++) {
                        list.get(i).setCheck(true);
                    }
                }else{
                    if(allCheck){
                        for (int i = 0; i <list.size() ; i++) {
                            list.get(i).setCheck(false);
                        }
                    }
                }
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN,sticky = true) //主线程接收事件
    public void onEventBus(ArrayList<CartData> data){
        allCheck=true;//先默认设置为选中状态
        for (int i = 0; i <data.size() ; i++) {//遍历集合中当前所有条目的选中状态
            if(!data.get(i).isCheck()){//获取条目里的每一个状态 若有一个未选中则设置全部选中按钮为false
                allCheck = false;
            }
        }
        checkbox.setChecked(allCheck);//全部按钮设置为全选



    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }*/
}