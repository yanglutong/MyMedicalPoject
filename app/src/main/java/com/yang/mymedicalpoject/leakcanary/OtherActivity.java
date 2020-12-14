package com.yang.mymedicalpoject.leakcanary;

import android.os.Bundle;

import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.base.MyApp;

import androidx.appcompat.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        LeakThread leakThread = new LeakThread();
        leakThread.start();
    }

    class LeakThread extends Thread {
        @Override
        public void run() {
            try {
                LoginManager.getInstance(OtherActivity.this).dealData();
                Thread.sleep(6 * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}