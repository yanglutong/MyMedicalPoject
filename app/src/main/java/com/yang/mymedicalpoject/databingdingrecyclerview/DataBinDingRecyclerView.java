package com.yang.mymedicalpoject.databingdingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.yang.mymedicalpoject.R;

import java.util.ArrayList;
import java.util.List;

public class DataBinDingRecyclerView extends AppCompatActivity {

    private Handler handler;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_bin_ding_recycler_view);
        recycler = findViewById(R.id.recycler);
        initData();
    }

    private void initData() {
        handler = new Handler(Looper.getMainLooper());
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        HttpService httpService = retrofit.create(HttpService.class);
        Call<Bean> cookCall = httpService.getCook();
        cookCall.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        List<Bean.DataBean> data = response.body().getData();
                        Log.i("杨路通", "run: "+data.get(0).getTitle());
                        initRecycler(data);
                    }
                });

            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {

            }
        });
    }

    private void initRecycler(List<Bean.DataBean> data) {
        /*Log.i("initRecycler", "initRecycler: "+data.size());
        Person person ;
        ArrayList<Person> list = new ArrayList<>();

        for (int i = 0; i <data.size() ; i++) {
            person=new Person();
            list.add(i,person);
            list.get(i).name.set(data.get(i).getTitle());
            list.get(i).sex.set(data.get(i).getUrl());
           *//* person.name.set(data.get(i).getTitle());
            person.sex.set(data.get(i).getDesc());*//*
        }
*/

        //加载Recyclerview
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //适配器 dataBinDing适配器
        SecondAdapter adapter = new SecondAdapter((ArrayList<Bean.DataBean>) data, this);
//        Adapter adapter = new Adapter(this, (ArrayList<Bean.DataBean>) data);
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}