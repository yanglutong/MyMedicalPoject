package com.yang.mymedicalpoject.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.mvplibrary.base.fragment.BaseMvpFragment;
import com.google.android.material.tabs.TabLayout;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.Constants.Constants;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.BookFragment;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.KeChengFragment;
import com.yang.mymedicalpoject.utils.MyViewPager;
import com.yang.mymedicalpoject.base.adapter.ShangchengPagerAdapter;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.BlankFragment;
import com.yang.mymedicalpoject.fragment.forumfragment.school.SchoolFragment;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.ShangChengConstants;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.KeChengBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.QuanBuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean.TuShuBean;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.model.MyShangCengModel;
import com.yang.mymedicalpoject.fragment.shang_cheng_fragment.presenter.MyShangChengPresenter;

import java.util.ArrayList;
import java.util.List;

public class ShangChengFragment extends BaseMvpFragment<ShangChengConstants.MyShangChengView,MyShangCengModel, MyShangChengPresenter> implements ShangChengConstants.MyShangChengView {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    QuanBuBean quanBuBean;
    List<TuShuBean> data;
    KeChengBean keChengBean;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private ShangchengPagerAdapter adapter;

    public ShangChengFragment() {
    }

    private String mParam2;
    public static SchoolFragment newInstance(String param1, String param2) {
        SchoolFragment fragment = new SchoolFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private TabLayout mTab;
    private MyViewPager mViewP;
    private ArrayList<Fragment> fragments;

    private FragmentPagerAdapter adapter1;


    @Override
    protected int creatLayoutId() {
        return R.layout.fragment_shang_cheng;
    }
    @Override
    protected void initDataMvp(View view) {
        mTab = view.findViewById(R.id.mTab);
        mViewP = view.findViewById(R.id.mViewP);
        fragments = new ArrayList<>();


        BlankFragment blankFragment = new BlankFragment();
        BookFragment bookFragment = new BookFragment();
        KeChengFragment keChengFragment = new KeChengFragment();
        fragments.add(blankFragment);
        fragments.add(bookFragment);
        fragments.add(keChengFragment);

        mPresenter.getDataKeChengPresenter("type", Constants.KECHENG);
        mPresenter.getDataQuanBuPresenter("start","end", Constants.ALL);
        mPresenter.getDataTuShuPresenter("p", Constants.BOOK);

    }

    private void initData() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <fragments.size() ; i++) {
                if(i==0){
                    strings.add("全部");
                }
                if(i==1){
                    strings.add("图书");
                }
                if(i==2){
                    strings.add("课程");
                }
        }
        adapter = new ShangchengPagerAdapter(getActivity().getSupportFragmentManager(), fragments,strings);
        mViewP.setAdapter(adapter);
        mTab.setupWithViewPager(mViewP);
    }

    @Override
    protected MyShangChengPresenter createPresenter() {
        return new MyShangChengPresenter();
    }


    @Override
    public void showData(Object object,int i) {//当回来以后设置适配器
        Bundle bundle = new Bundle();
        if(i==Constants.ALL){
            quanBuBean= (QuanBuBean) object;
            bundle.putInt("a",100);
            bundle.putSerializable("all",quanBuBean);
            fragments.get(0).setArguments(bundle);
        }
        if(i==Constants.BOOK){
            data= (List<TuShuBean>) object;
            ArrayList<TuShuBean> arrayList= (ArrayList<TuShuBean>) data;
            bundle.putInt("a",200);
            bundle.putSerializable("book", arrayList);
            fragments.get(1).setArguments(bundle);
        }
        if(i==Constants.KECHENG){
            keChengBean= (KeChengBean) object;
            bundle.putInt("a",300);
            bundle.putSerializable("ke", keChengBean);
            fragments.get(2).setArguments(bundle);
        }
        if(quanBuBean!=null&&data!=null&&keChengBean!=null){
                initData();
        }
    }

    @Override
    public void showError(String msg, int code) {
        Log.i("ShangChengFragmentError", "showError: "+msg+code);
    }

}