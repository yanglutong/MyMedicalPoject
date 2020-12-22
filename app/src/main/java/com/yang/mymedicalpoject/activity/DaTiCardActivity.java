package com.yang.mymedicalpoject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.http.httplibrary.callback.BaseObserver;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.manager.RetrofitManager;
import com.http.httplibrary.server.HttpServer;
import com.http.httplibrary.utils.JsonUtils;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.DaTiBean;
import com.yang.mymedicalpoject.jsonRequest.HttpCallBack;
import com.yang.mymedicalpoject.jsonRequest.bean.JsonBean;
import com.yang.mymedicalpoject.jsonRequest.bean.JsonShiTiLei;
import com.yang.mymedicalpoject.ui.activity.DaTiActivity;
import com.yang.mymedicalpoject.utils.MyTitleBar;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class        DaTiCardActivity extends AppCompatActivity {

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dati_card_wrong);
        EventBus.getDefault().register(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void eventBus(ArrayList<DaTiBean.ListBean> arr) {
        Log.i("杨路通", "eventBus: "+arr.size());
        initData(arr);
    }
    private void initData(ArrayList<DaTiBean.ListBean> arr) {
        recycler = findViewById(R.id.recyclerView);
        recycler.setLayoutManager(new GridLayoutManager(DaTiCardActivity.this,6));
        DaTiActivity.ReAdapter adapter = new DaTiActivity.ReAdapter(arr, DaTiCardActivity.this, R.layout.select_item);
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        //点击条目中的数据跳转到对应的Viewpager
        adapter.setAdapterOnItemClickListener(new BaseAdapter.AdapterOnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Toast.makeText(DaTiCardActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                EventBus.getDefault().postSticky(position);
                startActivity(new Intent(DaTiCardActivity.this,DaTiActivity.class));
                finish();
            }
        });
    }
}