package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;

import com.example.mvplibrary.base.adapter.CommonType;
import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.adapter.MyGFAdapter;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean.GuanFangBean;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.model.MyGuanFangModel;
import com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.presenter.MyGuanFangPresenter;

import java.util.ArrayList;
import java.util.List;

public class GuanFangFragment extends BaseMvpFragment<MyGuanFangConstants.MyView, MyGuanFangModel,MyGuanFangPresenter> implements MyGuanFangConstants.MyView {

    private RecyclerView guanFangRecycler;
    private ArrayList<GuanFangBean> arrayList = new ArrayList<>();;

    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_guan_fang;
    }

    @Override
    protected void initDataMvp(View view) {
        mPresenter.getData("1");
        //找到控件
        guanFangRecycler = view.findViewById(R.id.guanFangRecycler);

        //加载网络数据





    }

    @Override
    protected MyGuanFangPresenter createPresenter() {
        return new MyGuanFangPresenter();
    }

    private void requestNet() {

    }


    @Override
    public void showData(Object o) {
        GuanFangBean guanFangBean= (GuanFangBean) o;
        List<GuanFangBean.ArticleBean> article = guanFangBean.getArticle();
        List<GuanFangBean.PlateBean> plate = guanFangBean.getPlate();
        if(article.size()>0&&plate.size()>0){
            MyGFAdapter adapter = new MyGFAdapter(getActivity(),article,plate);
            guanFangRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
            guanFangRecycler.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }
        int size = guanFangBean.getArticle().size();
        Log.i("杨路通", "GuanFangFragment: "+size);
        Log.i("杨路通", "showData: "+guanFangBean.getPlate().get(0).getId()+guanFangBean
        .getPlate().get(0).getTitle()+guanFangBean.getPlate().get(0).getNum()+guanFangBean.getPlate().get(0).getImage()
        );
    }

    @Override
    public void showError(String e, int code) {
        Log.i("杨路通", "GuanFangFragment: "+e+code);
    }
}