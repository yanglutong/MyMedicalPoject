package com.yang.mymedicalpoject.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.bean.HaShiBean;
import com.yang.mymedicalpoject.bean.TiTabBean;

/**
 * @author gzp
 * @description:
 * @date : 2020/12/8 16:51
 */
public class TiTabItemFragment extends Fragment implements View.OnClickListener {
    private static final String TAG ="TiTabItemFragment" ;
    private int id;
    private TextView mName;
    private TextView mAtitle;
    private TextView mBtitle;
    private TextView mCtitle;
    private TextView mDtitle;
    private TextView mEtitle;
    private RadioButton A;
    private RadioButton B;
    private RadioButton C;
    private RadioButton D;
    private RadioButton E;
    private int i;
    private Button mButton;
    private  TiTabBean.ListBean listBean;
    private LinearLayout mLi5;
    private TextView mXiangqing;
    private LinearLayout mDaan;
    private TextView mda_an;
    private RelativeLayout mshitijiangjie;
    private int  type;
    private int  count=0;
    private boolean  duo=true;
    private ImageView mimgdan;
    private int zongzuo=0;
    private SharedPreferences zong;
    private SharedPreferences.Editor edit;
    private int xian;
    private int cuotitonfji;
    private SharedPreferences cuosp;
    private SharedPreferences.Editor cuoedit;
    private int cuoqu;
    private SharedPreferences duisp;
    private SharedPreferences.Editor duiedit;
    private int qudui;
    private boolean a;
    private int dui;
    boolean isselectall = false;
    private SharedPreferences countXuan;
    private SharedPreferences.Editor edit1;
    private int duoxuanzhong;
    private int duoxuanzhong1;
    private SharedPreferences mduoDui;
    private SharedPreferences.Editor mDuoDuiEdit;
    private int duoDuiqu;
    private SharedPreferences mduoZong;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.ti_tab_frag, null);
        id = getArguments().getInt("id");
        i = getArguments().getInt("i");
        listBean = (TiTabBean.ListBean) getArguments().getSerializable("beans");
        Log.d("123", "onCreateView: "+id);
        initView(inflate);
        zong = getActivity().getSharedPreferences("zong", Context.MODE_PRIVATE);
        cuosp = getActivity().getSharedPreferences("cuo", Context.MODE_PRIVATE);//错题sp
        duisp = getActivity().getSharedPreferences("dui", Context.MODE_PRIVATE);//对题sp
        countXuan = getActivity().getSharedPreferences("duoxuanzhong", Context.MODE_PRIVATE);//对题sp
        mduoDui = getActivity().getSharedPreferences("duoDui", Context.MODE_PRIVATE); //多选对题sp
        mduoZong = getActivity().getSharedPreferences("duoZong", Context.MODE_PRIVATE);//多选的总
        //如果是单选
        if(listBean.getTi_type().equals("1") ){
            type=1;
            //提交隐藏
            mButton.setVisibility(View.GONE);
            mName.setText(listBean.getName());
            mAtitle.setText(listBean.getData().getA());
            mBtitle.setText(listBean.getData().getB());
            mCtitle.setText(listBean.getData().getC());
            mDtitle.setText(listBean.getData().getD());
            if(listBean.getData().getE()!=null){
                mLi5.setVisibility(View.VISIBLE);
                mEtitle.setText(listBean.getData().getE());
            }


        }else if(listBean.getTi_type().equals("2")){//多选
            type=2;
            mButton.setVisibility(View.VISIBLE);
            mEtitle.setVisibility(View.VISIBLE);
            mimgdan.setImageResource(R.mipmap.duoxuan);

            mName.setText(listBean.getName());
            mAtitle.setText(listBean.getData().getA());
            mBtitle.setText(listBean.getData().getB());
            mCtitle.setText(listBean.getData().getC());
            mDtitle.setText(listBean.getData().getD());
            mEtitle.setText(listBean.getData().getE());



            if(listBean.getData().getE()!=null){
                mLi5.setVisibility(View.VISIBLE);
                mEtitle.setText(listBean.getData().getE());
            }
        }


        return inflate;
    }

    private void initView( View inflate) {
        mName = inflate.findViewById(R.id.name);//题目
        mAtitle = inflate.findViewById(R.id.Atitle);//A title
        mBtitle = inflate.findViewById(R.id.Btitle);//title
        mCtitle = inflate.findViewById(R.id.Ctitle);//title
        mDtitle = inflate.findViewById(R.id.Dtitle);//Dtitle
        mEtitle = inflate.findViewById(R.id.Etitle);//Etitle
       // -------------------------------按钮
        A = inflate.findViewById(R.id.A);//A
        A.setOnClickListener(this);
        B= inflate.findViewById(R.id.B);//
        B.setOnClickListener(this);
        C = inflate.findViewById(R.id.C);//
        C.setOnClickListener(this);
        D= inflate.findViewById(R.id.D);//D
        D.setOnClickListener(this);
        E = inflate.findViewById(R.id.E);//E
        E.setOnClickListener(this);
        //-------------------------------
        mButton = inflate.findViewById(R.id.ok);//提交
        mButton.setOnClickListener(this);
        mLi5 = inflate.findViewById(R.id.li5);//提交
        mXiangqing = inflate.findViewById(R.id.xiangqing);//详情
        mDaan = inflate.findViewById(R.id.da);//Danan
        mda_an = inflate.findViewById(R.id.da_an);//答案文本
        mshitijiangjie = inflate.findViewById(R.id.shitijiangjie);//详情讲解整个
        mimgdan = inflate.findViewById(R.id.imgdan);//详情讲解整个


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.A:
                if(type==1){
                    edit = zong.edit();
                    xian = zong.getInt("zongji", 0);
                    edit.putInt("zongji", xian+1);
                    edit.commit();
                    xiangqing();//展示
                    if(listBean.getDa_an().equals("A")){
                        A.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        A.setText("");
                        //答对
                        HaShiBean.map.put(i,2);
                        duiedit = duisp.edit();
                        dui = duisp.getInt("dui", 0);
                        duiedit.putInt("dui",dui+1);
                        duiedit.commit();


                    }else{
                        HaShiBean.map.put(i,3);
                        //应该让点击的变色
                        A.setBackground(getResources().getDrawable(R.mipmap.ticha));
                        A.setText("");
                         cuoedit = cuosp.edit();
                        cuoqu = cuosp.getInt("cuo", 0);//取值
                        cuoedit.putInt("cuo",cuoqu+1);
                        cuoedit.commit();



                    }
                    if(listBean.getDa_an().equals("B")){
                        B.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        B.setText("");
                    }
                    if(listBean.getDa_an().equals("C")){
                        C.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        C.setText("");
                    }
                    if(listBean.getDa_an().equals("D")){
                        D.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        D.setText("");
                    }
                    if(listBean.getDa_an().equals("E")){
                        E.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        E.setText("");
                    }
                }

                if(type==2){
                    duo=false;
                    //设置可以取消
                    if (isselectall) {
                        A.setChecked(false);
                        isselectall = false;
                        count--;
                        A.setBackground(getResources().getDrawable(R.drawable.yuan));
                        A.setTextColor(getResources().getColor(R.color.colorblack));
                    }else{
                        A.setChecked(true);
                        isselectall = true;
                        //选中状态
                        edit1 = countXuan.edit();
                        duoxuanzhong = countXuan.getInt("duoxuanzhong", 0);
                        edit1.putInt("duoxuanzhong",duoxuanzhong+1);
                        edit1.commit();

                        A.setBackground(getResources().getDrawable(R.drawable.shiyuan));
                        A.setTextColor(getResources().getColor(R.color.colorwhite));
                 }

                }


                break;
            case R.id.B:
                if(type==1){
                    edit = zong.edit();
                    xian = zong.getInt("zongji", 0);
                    edit.putInt("zongji", xian+1);
                    edit.commit();
                    xiangqing();//展示
                    if(listBean.getDa_an().equals("A")){
                        A.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        A.setText("");

                    }
                    if(listBean.getDa_an().equals("B")){
                        B.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        B.setText("");
                        //答对
                        HaShiBean.map.put(i,2);
                        duiedit = duisp.edit();
                        dui = duisp.getInt("dui", 0);
                        duiedit.putInt("dui",dui+1);
                        duiedit.commit();
                    }else{
                        //应该让点击的变色
                        B.setBackground(getResources().getDrawable(R.mipmap.ticha));
                        B.setText("");
                        HaShiBean.map.put(i,3);
                        cuoedit = cuosp.edit();
                        cuoqu = cuosp.getInt("cuo", 0);//取值
                        cuoedit.putInt("cuo",cuoqu+1);
                        cuoedit.commit();
                    }
                    if(listBean.getDa_an().equals("C")){
                        C.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        C.setText("");
                    }
                    if(listBean.getDa_an().equals("D")){
                        D.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        D.setText("");
                    }
                    if(listBean.getDa_an().equals("E")){
                        E.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        E.setText("");
                    }


                }
                if(type==2){
                    if (isselectall) {
                        B.setChecked(false);
                        isselectall = false;
                        count--;
                        B.setBackground(getResources().getDrawable(R.drawable.yuan));
                        B.setTextColor(getResources().getColor(R.color.colorblack));
                    }else{
                        B.setChecked(true);
                        isselectall = true;
                        //选中状态
                        edit1 = countXuan.edit();
                        duoxuanzhong = countXuan.getInt("duoxuanzhong", 0);
                        edit1.putInt("duoxuanzhong",duoxuanzhong+1);
                        edit1.commit();

                        B.setBackground(getResources().getDrawable(R.drawable.shiyuan));
                        B.setTextColor(getResources().getColor(R.color.colorwhite));
                    }
                }

                break;
            case R.id.C:
                if(type==1){
                    edit = zong.edit();
                    xian = zong.getInt("zongji", 0);
                    edit.putInt("zongji", xian+1);
                    edit.commit();
                    xiangqing();//展示
                    if(listBean.getDa_an().equals("A")){
                        A.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        A.setText("");

                    }
                    if(listBean.getDa_an().equals("C")){
                        C.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        C.setText("");
                        //答对
                        HaShiBean.map.put(i,2);
                        duiedit = duisp.edit();
                        dui = duisp.getInt("dui", 0);
                        duiedit.putInt("dui",dui+1);
                        duiedit.commit();
                    }else{
                        //应该让点击的变色
                        C.setBackground(getResources().getDrawable(R.mipmap.ticha));
                        C.setText("");

                        HaShiBean.map.put(i,3);

                        cuoedit = cuosp.edit();
                        cuoqu = cuosp.getInt("cuo", 0);//取值
                        cuoedit.putInt("cuo",cuoqu+1);
                        cuoedit.commit();
                    }
                    if(listBean.getDa_an().equals("B")){
                        B.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        B.setText("");
                    }
                    if(listBean.getDa_an().equals("D")){
                        D.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        D.setText("");
                    }
                    if(listBean.getDa_an().equals("E")){
                        E.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        E.setText("");
                    }
                }
                if(type==2){
                    if (isselectall) {
                        C.setChecked(false);
                        isselectall = false;
                        count--;
                       C.setBackground(getResources().getDrawable(R.drawable.yuan));
                        C.setTextColor(getResources().getColor(R.color.colorblack));
                    }else{
                        C.setChecked(true);
                        isselectall = true;
                        //选中状态
                        edit1 = countXuan.edit();
                        duoxuanzhong = countXuan.getInt("duoxuanzhong", 0);
                        edit1.putInt("duoxuanzhong",duoxuanzhong+1);
                        edit1.commit();

                       C.setBackground(getResources().getDrawable(R.drawable.shiyuan));
                      C.setTextColor(getResources().getColor(R.color.colorwhite));
                    }
            }


                break;
            case R.id.D:
                if(type==1){
                    edit = zong.edit();
                    xian = zong.getInt("zongji", 0);
                    edit.putInt("zongji", xian+1);
                    edit.commit();
                    xiangqing();//展示
                    if(listBean.getDa_an().equals("A")){
                        A.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        A.setText("");

                    }
                    if(listBean.getDa_an().equals("D")){
                        D.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        D.setText("");
                        //答对
                        HaShiBean.map.put(i,2);
                        duiedit = duisp.edit();
                        dui = duisp.getInt("dui", 0);
                        duiedit.putInt("dui",dui+1);
                        duiedit.commit();
                    }else{
                        //应该让点击的变色
                        D.setBackground(getResources().getDrawable(R.mipmap.ticha));
                        D.setText("");
                        HaShiBean.map.put(i,3);
                        cuoedit = cuosp.edit();
                        cuoqu = cuosp.getInt("cuo", 0);//取值
                        cuoedit.putInt("cuo",cuoqu+1);
                        cuoedit.commit();
                    }
                    if(listBean.getDa_an().equals("C")){
                        C.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        C.setText("");
                    }
                    if(listBean.getDa_an().equals("B")){
                        B.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        B.setText("");
                    }
                    if(listBean.getDa_an().equals("E")){
                        E.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        E.setText("");
                    }

                }
                if(type==2){
                    if (isselectall) {
                        D.setChecked(false);
                        isselectall = false;
                        count--;
                        D.setBackground(getResources().getDrawable(R.drawable.yuan));
                        D.setTextColor(getResources().getColor(R.color.colorblack));
                    }else{
                        D.setChecked(true);
                        isselectall = true;
                        //选中状态
                        edit1 = countXuan.edit();
                        duoxuanzhong = countXuan.getInt("duoxuanzhong", 0);
                        edit1.putInt("duoxuanzhong",duoxuanzhong+1);
                        edit1.commit();

                        D.setBackground(getResources().getDrawable(R.drawable.shiyuan));
                        D.setTextColor(getResources().getColor(R.color.colorwhite));
                    }
                }

                break;
            case R.id.E:
                if(type==1){
                    edit = zong.edit();
                    xian = zong.getInt("zongji", 0);
                    edit.putInt("zongji", xian+1);
                    edit.commit();
                    xiangqing();//展示
                    if(listBean.getDa_an().equals("A")){
                        A.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        A.setText("");

                    }
                    if(listBean.getDa_an().equals("E")){
                        E.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        E.setText("");
                        //答对
                        HaShiBean.map.put(i,2);
                        duiedit = duisp.edit();
                        dui = duisp.getInt("dui", 0);
                        duiedit.putInt("dui",dui+1);
                        duiedit.commit();
                    }else{
                        //应该让点击的变色
                        E.setBackground(getResources().getDrawable(R.mipmap.ticha));
                        E.setText("");
                        HaShiBean.map.put(i,3);
                        cuoedit = cuosp.edit();
                        cuoqu = cuosp.getInt("cuo", 0);//取值
                        cuoedit.putInt("cuo",cuoqu+1);
                        cuoedit.commit();
                    }
                    if(listBean.getDa_an().equals("C")){
                        C.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        C.setText("");
                    }
                    if(listBean.getDa_an().equals("D")){
                        D.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        D.setText("");
                    }
                    if(listBean.getDa_an().equals("B")){
                        B.setBackground(getResources().getDrawable(R.mipmap.tidui));//背景是对
                        B.setText("");
                    }

                }
                if(type==2){

                    if (isselectall) {
                       E.setChecked(false);
                        isselectall = false;
                        E.setBackground(getResources().getDrawable(R.drawable.yuan));
                       E.setTextColor(getResources().getColor(R.color.colorblack));
                    }else{
                       E.setChecked(true);
                        isselectall = true;
                        //选中状态
                        edit1 = countXuan.edit();
                        duoxuanzhong = countXuan.getInt("duoxuanzhong", 0);
                        edit1.putInt("duoxuanzhong",duoxuanzhong+1);
                        edit1.commit();
                      E.setBackground(getResources().getDrawable(R.drawable.shiyuan));
                      E.setTextColor(getResources().getColor(R.color.colorwhite));
                    }

                }

                break;
            case R.id.ok://提交
                //点击一下就是做题了
                SharedPreferences.Editor duozongedit = mduoZong.edit();
                int duoZong = mduoZong.getInt("duoZong", 0);
                SharedPreferences.Editor duoZongput = duozongedit.putInt("duoZong", duoZong+1);
                duoZongput.commit();

                Log.d("count", "onClick: "+count);
                duoxuanzhong1 = countXuan.getInt("duoxuanzhong", 0);
                if(type!=1 && duoxuanzhong1>=2) {
                    Log.d("A", "onClick: " + A.isChecked());
                    Log.d("D", "onClick: " + D.isChecked());
                    Log.d("B", "onClick: " + B.isChecked());
                    Log.d("C", "onClick: " + C.isChecked());
                    xiangqing();
                    String da_an = listBean.getDa_an();
                    Log.d(TAG, "onClick: " + da_an);
                    danxuan(da_an);
                 if(A.isChecked() &&B.isChecked() &&da_an.contains("A@B")){
                        //AB  是对的
                        //多选的对的
                     HaShiBean.map.put(i,2);
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;
                 }

                    if(A.isChecked() &&C.isChecked() &&da_an.indexOf("A")!=-1 &&da_an.indexOf("C")!=-1){
                        //AC  是对的
                        HaShiBean.map.put(i,2);
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;
                    }

                    if(A.isChecked() &&D.isChecked() &&da_an.indexOf("A")!=-1 &&da_an.indexOf("D")!=-1){
                        //AD  是对的
                        HaShiBean.map.put(i,2);
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;

                    }

                    if(B.isChecked() &&C.isChecked() &&da_an.indexOf("B")!=-1 &&da_an.indexOf("C")!=-1){
                        //BC  是对的
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        HaShiBean.map.put(i,2);
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;
                    }

                    if(B.isChecked() &&D.isChecked() &&da_an.indexOf("B")!=-1 &&da_an.indexOf("D")!=-1){
                        //BD  是对的
                        HaShiBean.map.put(i,2);
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        B.setBackground(getResources().getDrawable(R.mipmap.tidui));
                        D.setBackground(getResources().getDrawable(R.mipmap.tidui));
                        D.setText("");
                        B.setText("");

                        //多选的对的
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;
                    }

                    if(C.isChecked() &&D.isChecked() &&da_an.indexOf("C")!=-1 &&da_an.indexOf("D")!=-1){
                        //CD  是对的
                        //多选的对的
                        HaShiBean.map.put(i,2);
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;//ab bcd 测试答案
                    }

                    if(A.isChecked() &&B.isChecked()&& C.isChecked()&&da_an.indexOf("A")!=-1 &&da_an.indexOf("B")!=-1&&da_an.indexOf("C")!=-1){
                        //ABC  是对的
                        //多选的对的
                        HaShiBean.map.put(i,2);
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;
                    }

                    if(A.isChecked() &&B.isChecked()&& D.isChecked()&&da_an.indexOf("A")!=-1 &&da_an.indexOf("B")!=-1&&da_an.indexOf("D")!=-1){
                        //ABD 是对的
                        //多选的对的
                        HaShiBean.map.put(i,2);
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;
                    }

                    if(A.isChecked() &&C.isChecked()&& D.isChecked()&&da_an.indexOf("A")!=-1&&da_an.indexOf("C")!=-1 &&da_an.indexOf("D")!=-1){
                        //ACD 是对的
                        //多选的对的
                        HaShiBean.map.put(i,2);
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;
                    }
                    if(B.isChecked() &&C.isChecked()&& D.isChecked()&&da_an.indexOf("B")!=-1 &&da_an.indexOf("C")!=-1 &&da_an.indexOf("D")!=-1 ){
                        //BCD 是对的
                        //多选的对的
                        HaShiBean.map.put(i,2);
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;
                    }

                    if(A.isChecked() &&B.isChecked() &&C.isChecked()&& D.isChecked()&&da_an.indexOf("A")!=-1 &&da_an.indexOf("B")!=-1 &&da_an.indexOf("C")!=-1 &&da_an.indexOf("D")!=-1 ){
                        //ABCD 是对的
                        //多选的对的
                        HaShiBean.map.put(i,2);
                        Toast.makeText(getContext(), "正确", Toast.LENGTH_SHORT).show();
                        mDuoDuiEdit = mduoDui.edit();
                        duoDuiqu = mduoDui.getInt("duoDui", 0);
                        mDuoDuiEdit.putInt("duoDui",duoDuiqu+1);
                        mDuoDuiEdit.commit();
                        break;
                    }

                }else{
                    Toast.makeText(getContext(), "请选两个以上的选项", Toast.LENGTH_SHORT).show();
                }


                break;
        }
    }

    public void danxuan(String da_an) {
        if(da_an.indexOf("A")!=-1){
            A.setBackground(getResources().getDrawable(R.mipmap.tidui));
            A.setText("");
        }else{
            A.setBackground(getResources().getDrawable(R.mipmap.ticha));
            A.setText("");
        }
        if(da_an.indexOf("B")!=-1){
            B.setBackground(getResources().getDrawable(R.mipmap.tidui));
            B.setText("");
        }else{
            B.setBackground(getResources().getDrawable(R.mipmap.ticha));
            B.setText("");
        }

        if(da_an.indexOf("C")!=-1){
            C.setBackground(getResources().getDrawable(R.mipmap.tidui));
            C.setText("");
        }else{
            C.setBackground(getResources().getDrawable(R.mipmap.ticha));
            C.setText("");
        }
        if(da_an.indexOf("D")!=-1){
            D.setBackground(getResources().getDrawable(R.mipmap.tidui));
            D.setText("");
        }else{
            D.setBackground(getResources().getDrawable(R.mipmap.ticha));
            D.setText("");

        }
    }


    private void xiangqing() {

        mDaan.setVisibility(View.VISIBLE);
        mda_an.setText(listBean.getDa_an());
        mshitijiangjie.setVisibility(View.VISIBLE);//展示
        mXiangqing.setText(listBean.getXiang_jie());
         D.setEnabled(false);//不可点击
        E.setEnabled(false);//不可点击
        C.setEnabled(false);//不可点击
        A.setEnabled(false);//不可点击
        B.setEnabled(false);//不可点击

    }
}
