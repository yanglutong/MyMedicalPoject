package com.yang.mymedicalpoject.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.google.gson.JsonElement;
import com.http.httplibrary.client.HttpClient;
import com.http.httplibrary.conifg.GlobalConfig;
import com.http.httplibrary.utils.JsonUtils;
import com.xj.marqueeview.MarqueeView;
import com.xj.marqueeview.base.MultiItemTypeAdapter;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.fragment.kechengfragment.KeBean;
import com.yang.mymedicalpoject.fragment.kechengfragment.KeModel;
import com.yang.mymedicalpoject.fragment.kechengfragment.KePresenter;
import com.yang.mymedicalpoject.fragment.kechengfragment.Ke_Jing_Adapter;
import com.yang.mymedicalpoject.fragment.kechengfragment.Ke_Marq_Adapter;
import com.yang.mymedicalpoject.fragment.kechengfragment.RefitCallBack;
import com.yang.mymedicalpoject.fragment.kechengfragment.yiContantsKe;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeChengFragment extends BaseMvpFragment<yiContantsKe.yiView, KeModel, KePresenter> implements yiContantsKe.yiView {

    private Toolbar mToor;
    private Banner mKeBan;
    private List<KeBean> keBeans;
    private List<Object> objects;
    private MarqueeView mMar;//跑马灯
    private List<KeBean.LunboBean> lunbo;
    private RecyclerView mRecyJing;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.kecheng_fra, null);
        mKeBan = inflate.findViewById(R.id.ke_ban);
        mMar = inflate.findViewById(R.id.ke_marquee);
        mRecyJing = inflate.findViewById(R.id.ke_recy_liang);
        mRecyJing.setLayoutManager(new LinearLayoutManager(getActivity()));
        return inflate;
    }


    @Override
    protected int creatLayoutId() {
        return R.layout.kecheng_fra;
    }

    @Override
    protected void initDataMvp(View view) {
        mPresenter.getData();
    }

    @Override
    protected KePresenter createPresenter() {
        return new KePresenter();
    }


    @Override
    public void Show(KeBean data) {
        Log.d("kefrg", "Show: " + data);
        objects = new ArrayList<>();
        lunbo = data.getLunbo();
        List<KeBean.GongGaoBean> gong_gao = data.getGong_gao();
        // lunbo=   data.getLunbo();
        objects.addAll(lunbo);
        objects.addAll(gong_gao);
        Log.d("kegrg_lun", "Show: " + lunbo);
        Log.d("kegrg_guan", "Show: " + gong_gao);
        Log.d("kegrg_objetc", "Show: " + objects.toString());

        mKeBan.setImages(lunbo).setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                KeBean.LunboBean keBean = (KeBean.LunboBean) path;
                Glide.with(KeChengFragment.this).load(keBean.getPic()).into(imageView);
            }
        }).start();
        //跑马灯
        Ke_Marq_Adapter ke_marq_adapter = new Ke_Marq_Adapter(activity, gong_gao);
        ke_marq_adapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position, View view) {
                if (mMar.isStart()) {
                    mMar.stopFilp();
                }
            }
        });
        mMar.setAdapter(ke_marq_adapter);
        //精品
        initData();
        /*    */

    }

    private void initData() {
        Map<String, Object> baseHeades = GlobalConfig.getInstance().getBaseHeades();
        GlobalConfig.getInstance().setBaseUrl("https://app.yiyanmeng.com/index.php/");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("p", 1);
        hashMap.put("type", 1);

        new HttpClient.Buidler()
                .post()
                .setHeadres(baseHeades)
                // .setHeadres(baseHeades)
                .setApiUrl("Kecheng/ke_index_list")
                .setParamser(hashMap)
                .build()
                .enqueue(new RefitCallBack<KeBean>() {

                    @Override
                    public KeBean convert(JsonElement result) {
                        return JsonUtils.jsonToClass(result, KeBean.class);
                    }

                    @Override
                    public void onSucess(KeBean keBeans) {
                        Log.i("杨路通", "onSucess: "+keBeans.getKecheng().size());
                        mRecyJing.addItemDecoration(new DividerItemDecoration(activity, LinearLayout.VERTICAL));
                        Log.d("ke_moel---jing", "onSucess: " + keBeans.getKecheng());
                        Ke_Jing_Adapter ke_jing_adapter = new Ke_Jing_Adapter(keBeans.getKecheng(), activity);
                        mRecyJing.setAdapter(ke_jing_adapter);
                    }


                    @Override
                    public void error(String error, int code) {
                        Log.d("ke_moel+jing", "error: " + error);
                    }
                });


    }


    @Override
    public void error(String msg) {
        Log.d("kech", "error: " + msg);
    }
}
