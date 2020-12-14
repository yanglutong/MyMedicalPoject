package com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean;

import java.io.Serializable;

public class TuShuBean implements Serializable {

    /**
     * id : 106
     * name : 内、外、人文押题三套卷
     * pic : https://app.yiyanmeng.com:443/Public/shop_xiang_qing/b3f23b9b93c4e0f3f42fc1a745a55f83.jpg
     * hao_ping : 5
     * xian_price : 300.00
     * re_mai : 1
     */

    private String id;
    private String name;
    private String pic;
    private String hao_ping;
    private String xian_price;
    private String re_mai;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getHao_ping() {
        return hao_ping;
    }

    public void setHao_ping(String hao_ping) {
        this.hao_ping = hao_ping;
    }

    public String getXian_price() {
        return xian_price;
    }

    public void setXian_price(String xian_price) {
        this.xian_price = xian_price;
    }

    public String getRe_mai() {
        return re_mai;
    }

    public void setRe_mai(String re_mai) {
        this.re_mai = re_mai;
    }
}
