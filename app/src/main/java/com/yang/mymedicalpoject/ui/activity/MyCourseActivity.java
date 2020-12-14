package com.yang.mymedicalpoject.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.utils.MyTitleBar;

public class MyCourseActivity extends AppCompatActivity {

    private MyTitleBar myTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_course);
        myTitle = findViewById(R.id.myTitle);
        myTitle.setOnClick(new MyTitleBar.OnClick() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.include_image:
                        finish();
                        break;
                    case R.id.include_fan:{
                        finish();
                        break;}
                }
            }
        });
    }
}