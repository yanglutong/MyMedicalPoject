package com.yang.mymedicalpoject.shijianfenfa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.yang.mymedicalpoject.R;

public class ShiJianFenFaActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener{
    private MyLinearLayout MyLinearLayoutHF;
    private MyLinearLayout MyLinearLayoutVZ;
    private MyButton button1;
    private MyButton button2;
    private MyButton button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shi_jian_fen_fa);
        MyLinearLayoutHF= findViewById(R.id.MyLinearLayoutHF);
        MyLinearLayoutVZ = findViewById(R.id.MyLinearLayoutVZ);
         button1 = findViewById(R.id.button1);
         button2 = findViewById(R.id.button2);
         button3 = findViewById(R.id.button3);
        initData(MyLinearLayoutHF,MyLinearLayoutVZ,button1,button2,button3);
    }

    private void initData(MyLinearLayout myLinearLayoutHF, MyLinearLayout myLinearLayoutVZ, MyButton button1, MyButton button2, MyButton button3) {
        myLinearLayoutHF.setOnClickListener(this);
        myLinearLayoutVZ.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("杨路通", "dispatchTouchEvent: "+this.toString());
        return super.dispatchTouchEvent(ev);

    }

    @Override
    public void onClick(View view) {
        Log.i("杨路通", "onClick: "+view.toString());
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.i("杨路通", "onTouch: "+view.toString()+motionEvent.getAction());
        return false;
    }
}