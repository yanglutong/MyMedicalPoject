package com.yang.myregionselect;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RegionSelectActivity extends AppCompatActivity implements View.OnClickListener {

    private List<ChooseAddressBean> list=new ArrayList<>();
    private List<ChooseAddressBean> list2=new ArrayList<>();
    private List<ChooseAddressBean> list3=new ArrayList<>();
    private List<ChooseAddressBean> list4=new ArrayList<>();

    private List<ChooseAddressBean> list5=new ArrayList<>();
    private List<ChooseAddressBean> listTemp=new ArrayList<>();


    private TextView tv_region;
    private CommonPopupWindow window;
    private ImageView iv_close;
    private View activityPopup;
    private RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4;
    private ChooseAddressAdapter adapter;
    private String id1,id2,id3,id4;
    private LinearLayout ll_1,ll_2,ll_3,ll_4;
    private View view1,view2,view3,view4;
    private TextView tv_1,tv_2,tv_3,tv_4;
    private boolean isFirst=true;
    private DBOpenHelper dbHelper;
    private ConstraintLayout fl_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region_select);

        getData();

    }

    public void getData() {

        activityPopup=findViewById(R.id.activity_popup);

        tv_region = (TextView) findViewById(R.id.tv_region);
        tv_region.setOnClickListener(this);

        //获取到数据库
        dbHelper = new DBOpenHelper(this);
        initPopupWindow();
        initData();
    }

    private void initPopupWindow() {
        // get the height of screen
        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int screenHeight=metrics.heightPixels;
        // create popup window
        window=new CommonPopupWindow(this, R.layout.layout_choose_address_dialog, ViewGroup.LayoutParams.MATCH_PARENT, (int) (screenHeight*0.5)) {
            @Override
            protected void initView() {
                View view=getContentView();
                iv_close=(ImageView)view.findViewById(R.id.iv_close);
                ll_1=(LinearLayout)view.findViewById(R.id.ll_1);
                ll_2=view.findViewById(R.id.ll_2);
                ll_3=view.findViewById(R.id.ll_3);
                ll_4=view.findViewById(R.id.ll_4);
                ll_2.setVisibility(View.INVISIBLE);
                ll_3.setVisibility(View.INVISIBLE);
                ll_4.setVisibility(View.INVISIBLE);
                ll_3.setOnClickListener(RegionSelectActivity.this);
                ll_2.setOnClickListener(RegionSelectActivity.this);
                ll_1.setOnClickListener(RegionSelectActivity.this);
                ll_4.setOnClickListener(RegionSelectActivity.this);
                tv_1=view.findViewById(R.id.tv_1);
                tv_2=view.findViewById(R.id.tv_2);
                tv_3=view.findViewById(R.id.tv_3);
                tv_4=view.findViewById(R.id.tv_4);
                view1=view.findViewById(R.id.view_1);
                view2=view.findViewById(R.id.view_2);
                view3=view.findViewById(R.id.view_3);
                view4=view.findViewById(R.id.view_4);
                recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(RegionSelectActivity.this));
                adapter=new ChooseAddressAdapter(RegionSelectActivity.this,list5);
                recyclerView.setAdapter(adapter);
                recyclerView2=(RecyclerView)view.findViewById(R.id.recyclerView2);
                recyclerView2.setLayoutManager(new LinearLayoutManager(RegionSelectActivity.this));
//
                recyclerView2.setAdapter(adapter);
                recyclerView3=(RecyclerView)view.findViewById(R.id.recyclerView3);
                recyclerView3.setLayoutManager(new LinearLayoutManager(RegionSelectActivity.this));
//
                recyclerView3.setAdapter(adapter);
                recyclerView4=(RecyclerView)view.findViewById(R.id.recyclerView4);
                recyclerView4.setLayoutManager(new LinearLayoutManager(RegionSelectActivity.this));
//
                recyclerView4.setAdapter(adapter);
            }

            @Override
            protected void initEvent() {
                recyclerView.addOnItemTouchListener(new RecyclerItemTouchListener(recyclerView) {
                    @Override
                    public void onItemClick(RecyclerView.ViewHolder vh) {
                        int pos=vh.getAdapterPosition();
                        id1=list.get(pos).id;
//                        id1=cityList.get(pos).id;
                        tv_1.setText(list5.get(pos).name);
                        tv_2.setTextColor(getResources().getColor(R.color.txt_red));
                        tv_1.setTextColor(getResources().getColor(R.color.txt_26));
                        ll_2.setVisibility(View.VISIBLE);
                        view1.setVisibility(View.INVISIBLE);
                        view2.setVisibility(View.VISIBLE);
                        list5.clear();

                        for (int j=0;j<list2.size();j++)
                        {
                            if (list2.get(j).parentID.equals(list.get(pos).id))
                            {
                                list5.add(list2.get(j));
                            }
                        }
                        recyclerView2.setVisibility(View.VISIBLE);
                        recyclerView.setVisibility(View.GONE);
                        adapter.notifyDataSetChanged();
                        if (list5.size()==0)
                        {
                            tv_region.setText(tv_1.getText().toString());
                            window.getPopupWindow().dismiss();
                        }
                    }
                });
                recyclerView2.addOnItemTouchListener(new RecyclerItemTouchListener(recyclerView2) {
                    @Override
                    public void onItemClick(RecyclerView.ViewHolder vh) {
                        int pos=vh.getAdapterPosition();
                        id2=list5.get(pos).id;
                        tv_2.setText(list5.get(pos).name);
                        view2.setVisibility(View.INVISIBLE);
                        view3.setVisibility(View.VISIBLE);
                        ll_3.setVisibility(View.VISIBLE);
                        tv_2.setTextColor(getResources().getColor(R.color.txt_26));
                        tv_3.setTextColor(getResources().getColor(R.color.txt_red));
                        listTemp.clear();
                        for (int i=0;i<list5.size();i++)
                        {
                            listTemp.add(list5.get(i));
                        }
                        list5.clear();
                        for (int i=0;i<list3.size();i++)
                        {
                            if (list3.get(i).parentID.equals(listTemp.get(pos).id))
                            {
                                list5.add(list3.get(i));
                            }
                        }
                        recyclerView2.setVisibility(View.GONE);
                        recyclerView3.setVisibility(View.VISIBLE);
                        adapter.notifyDataSetChanged();
                        if (list5.size()==0)
                        {
                            tv_region.setText(tv_1.getText().toString()+tv_2.getText().toString());
                            window.getPopupWindow().dismiss();
                        }

                    }
                });
                recyclerView3.addOnItemTouchListener(new RecyclerItemTouchListener(recyclerView3) {
                    @Override
                    public void onItemClick(RecyclerView.ViewHolder vh) {
                        int pos=vh.getAdapterPosition();
                        id3=list5.get(pos).id;
                        tv_3.setText(list5.get(pos).name);
                        view3.setVisibility(View.INVISIBLE);
                        view4.setVisibility(View.VISIBLE);
                        tv_3.setTextColor(getResources().getColor(R.color.txt_26));
                        tv_4.setTextColor(getResources().getColor(R.color.txt_red));
                        ll_4.setVisibility(View.VISIBLE);
                        listTemp.clear();
                        for (int i=0;i<list5.size();i++)
                        {
                            listTemp.add(list5.get(i));
                        }
                        list5.clear();
                        for (int i=0;i<list4.size();i++)
                        {
                            if (list4.get(i).parentID.equals(listTemp.get(pos).id))
                            {
                                list5.add(list4.get(i));
                            }
                        }
                        recyclerView3.setVisibility(View.GONE);
                        recyclerView4.setVisibility(View.VISIBLE);
                        adapter.notifyDataSetChanged();
                        if (list5.size()==0)
                        {
                            tv_region.setText(tv_1.getText().toString()+tv_2.getText().toString()+tv_3.getText().toString());
                            window.getPopupWindow().dismiss();
                        }


                    }
                });
                recyclerView4.addOnItemTouchListener(new RecyclerItemTouchListener(recyclerView4) {
                    @Override
                    public void onItemClick(RecyclerView.ViewHolder vh) {
                        int pos=vh.getAdapterPosition();
                        id4=list5.get(pos).id;
                        tv_4.setText(list5.get(pos).name);
                        tv_region.setText(tv_1.getText().toString()+tv_2.getText().toString()+tv_3.getText().toString()+tv_4.getText().toString());
                        window.getPopupWindow().dismiss();
                    }
                });
                iv_close.setOnClickListener(RegionSelectActivity.this);
            }

            @Override
            protected void initWindow() {
                super.initWindow();
                PopupWindow instance=getPopupWindow();
                instance.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp=getWindow().getAttributes();
                        lp.alpha=1.0f;
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                        getWindow().setAttributes(lp);
                    }
                });
            }
        };
    }
    private void initData() {
        new Thread(){
            @Override
            public void run() {
                SQLiteDatabase sqLiteDatabase = dbHelper.openDatabase();
                StringBuffer sb=new StringBuffer("");
                Cursor cursor = sqLiteDatabase.rawQuery("select * from tp_region", null);
                while (cursor.moveToNext()){

                    //根据列的索引直接读取  比如第0列的值
                    String levelValue= cursor.getString(2);

                    ChooseAddressBean bean=new ChooseAddressBean();
                    bean.id=cursor.getString(0);
                    bean.level=cursor.getString(2);
                    bean.name=cursor.getString(1);
                    bean.parentID=cursor.getString(3);
                    if (levelValue.equals("1"))
                    {
                        list.add(bean);
                    }else if (levelValue.equals("2"))
                    {
                        list2.add(bean);
                    }else if (levelValue.equals("3"))
                    {
                        list3.add(bean);
                    }else if (levelValue.equals("4"))
                    {
                        list4.add(bean);
                    }
                }
                list5.addAll(list);
            }
        }.start();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_region) {//                list5.addAll(list);
            if (isFirst) {
                isFirst = false;
                if (list5.size() == 0) {
                    return;
                }
            }

            adapter.notifyDataSetChanged();
            PopupWindow win = window.getPopupWindow();
            win.setAnimationStyle(R.style.animTranslate);
            window.showAtLocation(activityPopup, Gravity.BOTTOM, 0, 0);
            WindowManager.LayoutParams lp = getWindow().getAttributes();
            lp.alpha = 0.3f;
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            getWindow().setAttributes(lp);
        } else if (id == R.id.ll_1) {
            id1 = "";
            id2 = "";
            id3 = "";
            id4 = "";
            recyclerView.setVisibility(View.VISIBLE);
            recyclerView2.setVisibility(View.GONE);
            recyclerView3.setVisibility(View.GONE);
            recyclerView4.setVisibility(View.GONE);
            ll_2.setVisibility(View.INVISIBLE);
            ll_3.setVisibility(View.INVISIBLE);
            ll_4.setVisibility(View.INVISIBLE);
            tv_1.setTextColor(getResources().getColor(R.color.txt_red));
            view1.setVisibility(View.VISIBLE);
            list5.clear();
            list5.addAll(list);
            tv_2.setTextColor(getResources().getColor(R.color.txt_26));
            tv_3.setTextColor(getResources().getColor(R.color.txt_26));
            tv_4.setTextColor(getResources().getColor(R.color.txt_26));
            view2.setVisibility(View.INVISIBLE);
            view3.setVisibility(View.INVISIBLE);
            view4.setVisibility(View.INVISIBLE);
            adapter.notifyDataSetChanged();
        } else if (id == R.id.ll_2) {
            id2 = "";
            id3 = "";
            id4 = "";
            recyclerView.setVisibility(View.GONE);
            recyclerView2.setVisibility(View.VISIBLE);
            recyclerView3.setVisibility(View.GONE);
            recyclerView4.setVisibility(View.GONE);
            ll_3.setVisibility(View.INVISIBLE);
            ll_4.setVisibility(View.INVISIBLE);
            tv_2.setTextColor(getResources().getColor(R.color.txt_red));
            view2.setVisibility(View.VISIBLE);
            tv_1.setTextColor(getResources().getColor(R.color.txt_26));
            tv_2.setTextColor(getResources().getColor(R.color.txt_red));
            tv_3.setTextColor(getResources().getColor(R.color.txt_26));
            tv_4.setTextColor(getResources().getColor(R.color.txt_26));
            view3.setVisibility(View.INVISIBLE);
            view4.setVisibility(View.INVISIBLE);
            list5.clear();
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).parentID.equals(id1)) {
                    list5.add(list2.get(i));
                }
            }
            adapter.notifyDataSetChanged();
        } else if (id == R.id.ll_3) {
            id3 = "";
            id4 = "";
            recyclerView.setVisibility(View.GONE);
            recyclerView2.setVisibility(View.GONE);
            recyclerView3.setVisibility(View.VISIBLE);
            recyclerView4.setVisibility(View.GONE);
            ll_4.setVisibility(View.INVISIBLE);
            tv_3.setTextColor(getResources().getColor(R.color.txt_red));
            view3.setVisibility(View.VISIBLE);
            tv_1.setTextColor(getResources().getColor(R.color.txt_26));
            tv_2.setTextColor(getResources().getColor(R.color.txt_26));
            tv_3.setTextColor(getResources().getColor(R.color.txt_red));
            tv_4.setTextColor(getResources().getColor(R.color.txt_26));
            view4.setVisibility(View.INVISIBLE);
            list5.clear();
            for (int i = 0; i < list3.size(); i++) {
                if (list3.get(i).parentID.equals(id2)) {
                    list5.add(list3.get(i));
                }
            }
            adapter.notifyDataSetChanged();
        }

    }
}
