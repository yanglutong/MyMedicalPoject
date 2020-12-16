package com.yang.mymedicalpoject.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class CollectBean {
    @Id
    private Long id;
    private String titleName;
    private String name;

    @Generated(hash = 1805359634)
    public CollectBean(Long id, String titleName, String name) {
        this.id = id;
        this.titleName = titleName;
        this.name = name;
    }

    @Generated(hash = 420494524)
    public CollectBean() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
