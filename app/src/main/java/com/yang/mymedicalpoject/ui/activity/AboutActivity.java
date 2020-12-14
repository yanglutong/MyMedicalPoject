package com.yang.mymedicalpoject.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mvplibrary.base.activity.BaseMvpActivity;
import com.example.mvplibrary.base.presenter.BasePresenterIml;
import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.utils.MyTitleBar;

public class AboutActivity extends BaseMvpActivity implements View.OnClickListener {

    private MyTitleBar in;

    @Override
    protected void initMvpData() {
        in = findViewById(R.id.clude);
        TextView include_fan = in.findViewById(R.id.include_fan);
        ImageView include_image = in.findViewById(R.id.include_image);


        include_fan.setOnClickListener(this);
        include_image.setOnClickListener(this);
    }

    @Override
    protected BasePresenterIml createPresenter() {
        return null;
    }

    @Override
    protected int createLayoutId() {
        return R.layout.activity_about_us;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.include_image){
            finish();
        }
        if(view.getId()==R.id.include_fan){
            finish();
        }
    }
}