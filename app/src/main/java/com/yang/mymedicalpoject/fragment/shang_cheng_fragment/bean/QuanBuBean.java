package com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean;

import java.io.Serializable;
import java.util.List;

public class QuanBuBean implements Serializable {

    /**
     * end : 20
     * shop : [{"hao_ping":"5","id":"106","name":"内、外、人文押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/b3f23b9b93c4e0f3f42fc1a745a55f83.jpg","re_mai":"1","xian_price":"300.00"},{"hao_ping":"5","id":"105","name":"小三门押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/9e017cca58e797775871efff0069d334.jpg","re_mai":"1","xian_price":"280.00"},{"hao_ping":"5","id":"96","name":"西综押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/b8cea19510537fd398a9b36ae4897c42.jpg","re_mai":"1","xian_price":"550.00"},{"hao_ping":"5","id":"98","name":"《外科》押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/93b476c4ba2d00b1f4202f0b88c1cf2b.jpg","re_mai":"1","xian_price":"109.00"},{"hao_ping":"5","id":"97","name":"《内科》押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/4a661dde54788a17053b2312e957776d.jpg","re_mai":"1","xian_price":"109.00"},{"hao_ping":"5","id":"99","name":"《生理》押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/7f973a08f3c64461c4ec2f4ac257a967.jpg","re_mai":"1","xian_price":"99.00"},{"hao_ping":"5","id":"100","name":"《生化》押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e7425d4268ac68f0d9eccc7fbee6c38a.jpg","re_mai":"1","xian_price":"99.00"},{"hao_ping":"5","id":"101","name":"《病理》押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/c74ec15a619ac771dbd51704a21260fb.jpg","re_mai":"1","xian_price":"99.00"},{"hao_ping":"5","id":"102","name":"《人文》押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/68ff2cc96f17d7d6e2b4aa1d5033666d.jpg","re_mai":"1","xian_price":"99.00"},{"hao_ping":"5","id":"94","name":"22考研西综高端课","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/be1c133b09ef352baa56fe29b34e4380.jpg","re_mai":"1","xian_price":"11490.00"}]
     * start : 20
     */

    private int end;
    private int start;
    private List<ShopBean> shop;

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public List<ShopBean> getShop() {
        return shop;
    }

    public void setShop(List<ShopBean> shop) {
        this.shop = shop;
    }

    public static class ShopBean implements Serializable{
        /**
         * hao_ping : 5
         * id : 106
         * name : 内、外、人文押题三套卷
         * pic : https://app.yiyanmeng.com:443/Public/shop_xiang_qing/b3f23b9b93c4e0f3f42fc1a745a55f83.jpg
         * re_mai : 1
         * xian_price : 300.00
         */

        private String hao_ping;
        private String id;
        private String name;
        private String pic;
        private String re_mai;
        private String xian_price;

        public String getHao_ping() {
            return hao_ping;
        }

        public void setHao_ping(String hao_ping) {
            this.hao_ping = hao_ping;
        }

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

        public String getRe_mai() {
            return re_mai;
        }

        public void setRe_mai(String re_mai) {
            this.re_mai = re_mai;
        }

        public String getXian_price() {
            return xian_price;
        }

        public void setXian_price(String xian_price) {
            this.xian_price = xian_price;
        }
    }
}
