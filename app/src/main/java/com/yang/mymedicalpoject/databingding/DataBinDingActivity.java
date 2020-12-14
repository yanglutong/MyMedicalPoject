package com.yang.mymedicalpoject.databingding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import com.yang.mymedicalpoject.R;
import com.yang.mymedicalpoject.databinding.ActivityDataBinDingBinding;

public class DataBinDingActivity extends AppCompatActivity implements TextWatcher {

    private DataBinDing dataBinDing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_data_bin_ding);
        ActivityDataBinDingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_bin_ding);

        dataBinDing = new DataBinDing();
        dataBinDing.setName("杨路通");
        dataBinDing.setSex("男");
        String url="http://www.ruanyifeng.com/blogimg/asset/2015/bg2015071001.gif";
        dataBinDing.setImage(url);
        binding.setDataBin(dataBinDing);

        //监听两个控件
        binding.button.addTextChangedListener(this);
        binding.edit.addTextChangedListener(this);

        //通过BaseObservlable所继承的bean类进行监听
        dataBinDing.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                /*if(propertyId== name){
                    Log.i("onPropertyChanged", "onPropertyChanged: "+dataBinDing.getName());
                }*/
            }
        });
       /* binding.button.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.i("杨路通", "onTextChanged: "+dataBinDing.getName()+dataBinDing.getSex());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });*/
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        Log.i("杨路通", "onTextChanged: "+dataBinDing.getName()+dataBinDing.getSex());
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}