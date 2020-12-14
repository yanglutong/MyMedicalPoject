package com.yang.mymedicalpoject.bean;

import java.util.List;

public
class YiYanBean {

    /**
     * fen : 1
     * z_type : [{"ban_ben":"12452","biao_name":"L_N_CAF","id":"205","name":"2020年真题","type_id":"205","xishu":"0.00","yizuo":"12040","zong":"165"},{"ban_ben":"11740","biao_name":"L_N_CAA","id":"200","name":"2019年真题","type_id":"200","xishu":"1.00","yizuo":"8346","zong":"165"},{"ban_ben":"11355","biao_name":"L_N_E","id":"4","name":"2018年真题","type_id":"4","xishu":"1.50","yizuo":"3661","zong":"172"},{"ban_ben":"6889","biao_name":"L_N_BJD","id":"193","name":"2017年真题","type_id":"193","xishu":"1.60","yizuo":"1809","zong":"165"},{"ban_ben":"9951","biao_name":"L_N_BJC","id":"192","name":"2016年真题","type_id":"192","xishu":"1.00","yizuo":"1521","zong":"180"},{"ban_ben":"10367","biao_name":"L_N_BJE","id":"194","name":"2015年真题","type_id":"194","xishu":"1.00","yizuo":"1294","zong":"180"},{"ban_ben":"105","biao_name":"L_N_CJ","id":"29","name":"2014年真题","type_id":"29","xishu":"1.00","yizuo":"1142","zong":"180"},{"ban_ben":"10566","biao_name":"L_N_BJG","id":"196","name":"2013年真题","type_id":"196","xishu":"1.00","yizuo":"1045","zong":"180"},{"ban_ben":"10373","biao_name":"L_N_DB","id":"31","name":"2012年真题","type_id":"31","xishu":"1.00","yizuo":"1016","zong":"180"},{"ban_ben":"10386","biao_name":"L_N_DC","id":"32","name":"2011年真题","type_id":"32","xishu":"1.00","yizuo":"1057","zong":"180"},{"ban_ben":"10392","biao_name":"L_N_DD","id":"33","name":"2010年真题","type_id":"33","xishu":"1.70","yizuo":"1282","zong":"180"},{"ban_ben":"7631","biao_name":"L_N_DE","id":"34","name":"2009年真题","type_id":"34","xishu":"1.60","yizuo":"911","zong":"180"},{"ban_ben":"11352","biao_name":"L_N_DF","id":"35","name":"2008年真题","type_id":"35","xishu":"1.40","yizuo":"851","zong":"180"},{"ban_ben":"9173","biao_name":"L_N_BHD","id":"173","name":"2007年真题","type_id":"173","xishu":"1.40","yizuo":"943","zong":"179"},{"ban_ben":"11354","biao_name":"L_N_BHC","id":"172","name":"2006年真题","type_id":"172","xishu":"1.10","yizuo":"745","zong":"150"},{"ban_ben":"11356","biao_name":"L_N_BHB","id":"171","name":"2005年真题","type_id":"171","xishu":"1.00","yizuo":"733","zong":"150"},{"ban_ben":"11358","biao_name":"L_N_BHI","id":"178","name":"2004年真题","type_id":"178","xishu":"1.00","yizuo":"688","zong":"150"},{"ban_ben":"9250","biao_name":"L_N_BHH","id":"177","name":"2003年真题","type_id":"177","xishu":"1.00","yizuo":"645","zong":"150"},{"ban_ben":"11359","biao_name":"L_N_BHG","id":"176","name":"2002年真题","type_id":"176","xishu":"1.00","yizuo":"718","zong":"159"},{"ban_ben":"11361","biao_name":"L_N_BHF","id":"175","name":"2001年真题","type_id":"175","xishu":"1.00","yizuo":"735","zong":"160"},{"ban_ben":"11376","biao_name":"L_N_BHE","id":"174","name":"2000年真题","type_id":"174","xishu":"1.00","yizuo":"787","zong":"160"},{"ban_ben":"11372","biao_name":"L_N_BID","id":"183","name":"1999年真题","type_id":"183","xishu":"1.00","yizuo":"679","zong":"161"},{"ban_ben":"11381","biao_name":"L_N_BIC","id":"182","name":"1998年真题","type_id":"182","xishu":"1.00","yizuo":"663","zong":"160"},{"ban_ben":"11390","biao_name":"L_N_BIB","id":"181","name":"1997年真题","type_id":"181","xishu":"1.00","yizuo":"609","zong":"160"},{"ban_ben":"9796","biao_name":"L_N_BIA","id":"180","name":"1996年真题","type_id":"180","xishu":"1.00","yizuo":"626","zong":"159"},{"ban_ben":"9793","biao_name":"L_N_BHJ","id":"179","name":"1995年真题","type_id":"179","xishu":"1.00","yizuo":"653","zong":"159"},{"ban_ben":"8099","biao_name":"L_N_BIG","id":"186","name":"1994年真题","type_id":"186","xishu":"1.00","yizuo":"634","zong":"160"},{"ban_ben":"11339","biao_name":"L_N_BIF","id":"185","name":"1993年真题","type_id":"185","xishu":"1.00","yizuo":"639","zong":"160"},{"ban_ben":"12285","biao_name":"L_N_BIE","id":"184","name":"1992年真题","type_id":"184","xishu":"1.00","yizuo":"1222","zong":"161"},{"ban_ben":"12286","biao_name":"L_N_CAE","id":"204","name":"2020真题估分","type_id":"204","xishu":"0.00","yizuo":"8075","zong":"165"}]
     */

    private String fen;
    private List<ZTypeBean> z_type;

    public String getFen() {
        return fen;
    }

    public void setFen(String fen) {
        this.fen = fen;
    }

    public List<ZTypeBean> getZ_type() {
        return z_type;
    }

    public void setZ_type(List<ZTypeBean> z_type) {
        this.z_type = z_type;
    }

    public static class ZTypeBean {
        /**
         * ban_ben : 12452
         * biao_name : L_N_CAF
         * id : 205
         * name : 2020年真题
         * type_id : 205
         * xishu : 0.00
         * yizuo : 12040
         * zong : 165
         */

        private String ban_ben;
        private String biao_name;
        private String id;
        private String name;
        private String type_id;
        private String xishu;
        private String yizuo;
        private String zong;

        public String getBan_ben() {
            return ban_ben;
        }

        public void setBan_ben(String ban_ben) {
            this.ban_ben = ban_ben;
        }

        public String getBiao_name() {
            return biao_name;
        }

        public void setBiao_name(String biao_name) {
            this.biao_name = biao_name;
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

        public String getType_id() {
            return type_id;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
        }

        public String getXishu() {
            return xishu;
        }

        public void setXishu(String xishu) {
            this.xishu = xishu;
        }

        public String getYizuo() {
            return yizuo;
        }

        public void setYizuo(String yizuo) {
            this.yizuo = yizuo;
        }

        public String getZong() {
            return zong;
        }

        public void setZong(String zong) {
            this.zong = zong;
        }
    }
}
