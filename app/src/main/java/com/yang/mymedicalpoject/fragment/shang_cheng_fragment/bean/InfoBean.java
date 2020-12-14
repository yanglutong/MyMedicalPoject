package com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean;

import java.util.List;

public class InfoBean {

    /**
     * cid : 100
     * shop : {"class_hour":"","desc":"","ding":"1","fa_huo_di":"辽宁省大连市","fa_huo_time":"1","feng_pic":["https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e98a1b0b45fdeaa8f85b8a98626a1e4c.jpg"],"fq_price":"0.00","id":"100","is_fq":"0","is_sp":"0","ming_shi_id":[{"id":"11","name":"李婷","pic":"https://app.yiyanmeng.com:443/Public/user/2019-12-31/5e0aceca48632.jpg"}],"name":"《生化》押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e7425d4268ac68f0d9eccc7fbee6c38a.jpg","re_mai":"1","shop_desc":"√ 每句话一个考点 √ 每道题一个分数 √ 西综260高分计划","type_id":"4","wu_li_you":"1","xian_price":"99.00","xiang_qing":"https://app.yiyanmeng.com:443/index.php/index/shop_xiang_qing/id/100","yuan_price":"109.00","yue_shou":"97","yun_price":"0.00","zhekou":""}
     */

    private String cid;
    private ShopBean shop;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public ShopBean getShop() {
        return shop;
    }

    public void setShop(ShopBean shop) {
        this.shop = shop;
    }

    public static class ShopBean {
        /**
         * class_hour :
         * desc :
         * ding : 1
         * fa_huo_di : 辽宁省大连市
         * fa_huo_time : 1
         * feng_pic : ["https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e98a1b0b45fdeaa8f85b8a98626a1e4c.jpg"]
         * fq_price : 0.00
         * id : 100
         * is_fq : 0
         * is_sp : 0
         * ming_shi_id : [{"id":"11","name":"李婷","pic":"https://app.yiyanmeng.com:443/Public/user/2019-12-31/5e0aceca48632.jpg"}]
         * name : 《生化》押题三套卷
         * pic : https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e7425d4268ac68f0d9eccc7fbee6c38a.jpg
         * re_mai : 1
         * shop_desc : √ 每句话一个考点 √ 每道题一个分数 √ 西综260高分计划
         * type_id : 4
         * wu_li_you : 1
         * xian_price : 99.00
         * xiang_qing : https://app.yiyanmeng.com:443/index.php/index/shop_xiang_qing/id/100
         * yuan_price : 109.00
         * yue_shou : 97
         * yun_price : 0.00
         * zhekou :
         */

        private String class_hour;
        private String desc;
        private String ding;
        private String fa_huo_di;
        private String fa_huo_time;
        private String fq_price;
        private String id;
        private String is_fq;
        private String is_sp;
        private String name;
        private String pic;
        private String re_mai;
        private String shop_desc;
        private String type_id;
        private String wu_li_you;
        private String xian_price;
        private String xiang_qing;
        private String yuan_price;
        private String yue_shou;
        private String yun_price;
        private String zhekou;
        private List<String> feng_pic;
        private List<MingShiIdBean> ming_shi_id;

        public String getClass_hour() {
            return class_hour;
        }

        public void setClass_hour(String class_hour) {
            this.class_hour = class_hour;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDing() {
            return ding;
        }

        public void setDing(String ding) {
            this.ding = ding;
        }

        public String getFa_huo_di() {
            return fa_huo_di;
        }

        public void setFa_huo_di(String fa_huo_di) {
            this.fa_huo_di = fa_huo_di;
        }

        public String getFa_huo_time() {
            return fa_huo_time;
        }

        public void setFa_huo_time(String fa_huo_time) {
            this.fa_huo_time = fa_huo_time;
        }

        public String getFq_price() {
            return fq_price;
        }

        public void setFq_price(String fq_price) {
            this.fq_price = fq_price;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIs_fq() {
            return is_fq;
        }

        public void setIs_fq(String is_fq) {
            this.is_fq = is_fq;
        }

        public String getIs_sp() {
            return is_sp;
        }

        public void setIs_sp(String is_sp) {
            this.is_sp = is_sp;
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

        public String getShop_desc() {
            return shop_desc;
        }

        public void setShop_desc(String shop_desc) {
            this.shop_desc = shop_desc;
        }

        public String getType_id() {
            return type_id;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
        }

        public String getWu_li_you() {
            return wu_li_you;
        }

        public void setWu_li_you(String wu_li_you) {
            this.wu_li_you = wu_li_you;
        }

        public String getXian_price() {
            return xian_price;
        }

        public void setXian_price(String xian_price) {
            this.xian_price = xian_price;
        }

        public String getXiang_qing() {
            return xiang_qing;
        }

        public void setXiang_qing(String xiang_qing) {
            this.xiang_qing = xiang_qing;
        }

        public String getYuan_price() {
            return yuan_price;
        }

        public void setYuan_price(String yuan_price) {
            this.yuan_price = yuan_price;
        }

        public String getYue_shou() {
            return yue_shou;
        }

        public void setYue_shou(String yue_shou) {
            this.yue_shou = yue_shou;
        }

        public String getYun_price() {
            return yun_price;
        }

        public void setYun_price(String yun_price) {
            this.yun_price = yun_price;
        }

        public String getZhekou() {
            return zhekou;
        }

        public void setZhekou(String zhekou) {
            this.zhekou = zhekou;
        }

        public List<String> getFeng_pic() {
            return feng_pic;
        }

        public void setFeng_pic(List<String> feng_pic) {
            this.feng_pic = feng_pic;
        }

        public List<MingShiIdBean> getMing_shi_id() {
            return ming_shi_id;
        }

        public void setMing_shi_id(List<MingShiIdBean> ming_shi_id) {
            this.ming_shi_id = ming_shi_id;
        }

        public static class MingShiIdBean {
            /**
             * id : 11
             * name : 李婷
             * pic : https://app.yiyanmeng.com:443/Public/user/2019-12-31/5e0aceca48632.jpg
             */

            private String id;
            private String name;
            private String pic;

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
        }
    }
}
