package com.yang.mymedicalpoject.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvplibrary.base.adapter.BaseAdapter;
import com.example.mvplibrary.base.adapter.BaseViewHolder;
import com.yang.mymedicalpoject.BaseApp;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.CollectBean;
import com.yang.mymedicalpoject.db.CollectBeanDao;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link YiYanFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class YiYanFragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recycler;
    private List<CollectBean> beans;

    public YiYanFragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment YiYanFragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static YiYanFragment2 newInstance(String param1, String param2) {
        YiYanFragment2 fragment = new YiYanFragment2();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_yi_yan2, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        recycler = view.findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));


        CollectBeanDao dao = BaseApp.getInstance().getDaoSession().getCollectBeanDao();
        beans = dao.loadAll();


        MyAdapter adapter = new MyAdapter(beans, getActivity(), R.layout.shoucang_item);
        recycler.setAdapter(adapter);

        adapter.notifyDataSetChanged();

    }
    class MyAdapter extends BaseAdapter<CollectBean>{
        public MyAdapter(List<CollectBean> datas, Context context, int layoutId) {
            super(datas, context, layoutId);
        }

        @Override
        public void bindData(BaseViewHolder baseViewHolder, int position) {
            baseViewHolder.setText(R.id.tv_name,data.get(position).getName());
        }
    }
}