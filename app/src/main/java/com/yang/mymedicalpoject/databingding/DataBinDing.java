package com.yang.mymedicalpoject.databingding;

import com.yang.mymedicalpoject.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

//需要继承Baseobservable接口
public class DataBinDing extends BaseObservable {
     String name;
     String sex;
     String image;

    public DataBinDing() {
    }

    public DataBinDing(String name, String sex, String image) {
        this.name = name;
        this.sex = sex;
        this.image = image;
    }

    @Bindable
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }

    @Bindable
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyPropertyChanged(BR.sex);
    }
}
