package com.yang.mymedicalpoject.bean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yang.mymedicalpoject.BaseApp;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.db.ThreeBeanDao;
import com.yang.mymedicalpoject.instance_code.shoppingcart.CartData;
import com.yang.mymedicalpoject.instance_code.shoppingcart.ShoppingAdapter;
import com.yang.mymedicalpoject.utils.MyTitleBar;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShoppingCartActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recycler;
    private CheckBox checkbox;
    //初始化集合
    private ArrayList<ThreeBean> threeBeans=new ArrayList<>();
    private boolean allCheck;
    private ShoppingAdapter adapter;
    private RelativeLayout managerRl;
    private MyTitleBar titleBar;
    private TextView include_manager;
    private TextView tv_price;
    private int  po;
    private TextView tv_del;
    private ThreeBeanDao threeBeanDao;
    boolean isCheck=false;
    boolean isAll=false;
    //    private ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        threeBeanDao = BaseApp.getInstance().getDaoSession().getThreeBeanDao();
        EventBus.getDefault().register(this);
        Log.i("杨路通", "onCreate: "+"杨路通");
        find();
        adapter.setItem(new ShoppingAdapter.OnItem() {
            @Override
            public void onClick(boolean b,int position) {
                isCheck=b;
                Toast.makeText(ShoppingCartActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                po=position;
            }
        });
    }


    private void find() {
        recycler = findViewById(R.id.recyclerView);
        checkbox = findViewById(R.id.checkbox);
        managerRl = findViewById(R.id.managerRl);
        titleBar = findViewById(R.id.titleBar);
        tv_del = findViewById(R.id.tv_del);
        include_manager = titleBar.findViewById(R.id.include_manager);
        tv_price = findViewById(R.id.tv_price);
        initData();

        //判断是否选中状态
        include_manager.setOnClickListener(this);
        tv_del.setOnClickListener(this);
    }

    private void initData() {
        List<ThreeBean> beans = threeBeanDao.loadAll();
        threeBeans.addAll(beans);
        //加载资源
       /* for (int i = 0; i <10 ; i++) {
            CartData cartData = new CartData();
            cartData.setCount(1);
            cartData.setPrice(new Random().nextInt(1000));
            cartData.setName("商品列表"+i);
            list.add(cartData);
        }*/
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ShoppingAdapter(threeBeans, this, R.layout.item_booking_car);
        recycler.setAdapter(adapter);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){//全部选中
                     float price2 = 0;
                    for (int i = 0; i <threeBeans.size() ; i++) {
                        threeBeans.get(i).setBiao(true);
                        float price1 = threeBeans.get(i).getXian_price();

                        price2 +=price1;
                    }
                        tv_price.setText("￥"+price2);
                    isAll=true;
                }else{
                    if(allCheck){//取消全选
                        for (int i = 0; i <threeBeans.size() ; i++) {
                            threeBeans.get(i).setBiao(false);
                            tv_price.setText("￥ 0.0");
                        }
                    }
                }
                adapter.notifyDataSetChanged();
            }
        });
    }
    @Subscribe(threadMode = ThreadMode.MAIN,sticky = true) //主线程接收事件
    public void onEventBus(ArrayList<ThreeBean> data){
        float priceCount=0;
        allCheck=true;//先默认设置为选中状态
        //接受过来选中的那一条
        for (int i = 0; i <data.size() ; i++) {//遍历集合中当前所有条目的选中状态
            if(!data.get(i).isBiao()){//获取条目里的每一个状态 若有一个未选中则设置全部选中按钮为false
                allCheck = false;
            }else{
                priceCount+=data.get(i).getCount()*data.get(i).getXian_price();
            }
        }

        tv_price.setText("￥"+priceCount);

        checkbox.setChecked(allCheck);//全部按钮设置为全选

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.include_manager:
                if(include_manager.getText().equals("管理")){
                    managerRl.setVisibility(View.VISIBLE);
                    include_manager.setText("完成");
                }else{
                    managerRl.setVisibility(View.GONE);
                    include_manager.setText("管理");
                }
               /* if(include_manager.getText().equals("完成")){
                    managerRl.setVisibility(View.GONE);
                    include_manager.setText("管理");
                }*/
                break;
            case R.id.tv_del:
                Toast.makeText(this, "删除", Toast.LENGTH_SHORT).show();
                //点击删除
                /*for (int i = 0; i <threeBeans.size() ; i++) {
                    threeBeanDao.deleteByKey(threeBeans.get(i).getId());
                    threeBeans.remove(i);
                    adapter.notifyDataSetChanged();
                }*/
                /*if(isCheck){
                    threeBeanDao.delete(threeBeans.get(po));
                    threeBeans.remove(po);
                }else{
                    Toast.makeText(this, "未有选中", Toast.LENGTH_SHORT).show();
                }*/
                for (int i = 0; i <threeBeans.size() ; i++) {
                    if(threeBeans.get(i).isBiao()){
                        threeBeanDao.delete(threeBeans.get(i));
                        threeBeans.remove(i);
                        i--;
                    }
                }
                if(isAll){
                    threeBeanDao.deleteAll();
                    threeBeans.clear();
                    tv_price.setText("￥ 0.0");
                }
                adapter.notifyDataSetChanged();
                break;
        }
    }
}