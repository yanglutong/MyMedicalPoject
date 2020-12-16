package com.yang.mymedicalpoject.bean;

import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/29 12:23
 */
public class Ti_Zheng_Bean {

    /**
     * fen : 1
     * u_type : [{"ban_ben":"0","id":"26","jianjie":"","name":"马克思主义基本原理概论","pai":"7","pid":"0","status":"1","type_id":"26","xishu":"1.00","yizuo":"2001","z_type":[{"ban_ben":"599","biao_name":"Z_T_K_BE","id":"14","jianjie":"","name":"单选题","pai":"12","pid":"26","status":"0","type_id":"14","xishu":"1.00","yizuo":"5274","zong":"98","zuo":"0"},{"ban_ben":"493","biao_name":"Z_T_K_DH","id":"37","jianjie":"","name":"多选题","pai":"0","pid":"26","status":"0","type_id":"37","xishu":"1.00","yizuo":"2637","zong":"10","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"25","jianjie":"","name":"毛泽东思想","pai":"6","pid":"0","status":"1","type_id":"25","xishu":"1.00","yizuo":"2000","z_type":[{"ban_ben":"480","biao_name":"Z_T_K_DA","id":"30","jianjie":"","name":"单选题","pai":"2","pid":"25","status":"0","type_id":"30","xishu":"1.00","yizuo":"2690","zong":"11","zuo":"0"},{"ban_ben":"498","biao_name":"Z_T_K_DD","id":"33","jianjie":"","name":"多选题","pai":"1","pid":"25","status":"0","type_id":"33","xishu":"1.00","yizuo":"2203","zong":"10","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"34","jianjie":"","name":"中国近代史纲要","pai":"5","pid":"0","status":"1","type_id":"34","xishu":"1.00","yizuo":"2000","z_type":[{"ban_ben":"484","biao_name":"Z_T_K_DJ","id":"39","jianjie":"","name":"单选题","pai":"0","pid":"34","status":"0","type_id":"39","xishu":"1.00","yizuo":"2641","zong":"12","zuo":"0"},{"ban_ben":"500","biao_name":"Z_T_K_EA","id":"40","jianjie":"","name":"多选题","pai":"0","pid":"34","status":"0","type_id":"40","xishu":"1.00","yizuo":"2246","zong":"5","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"44","jianjie":"","name":"思想道德修养与法律基础","pai":"4","pid":"0","status":"1","type_id":"44","xishu":"1.00","yizuo":"2000","z_type":[{"ban_ben":"486","biao_name":"Z_T_K_EF","id":"45","jianjie":"","name":"单选题","pai":"0","pid":"44","status":"0","type_id":"45","xishu":"1.00","yizuo":"2379","zong":"6","zuo":"0"},{"ban_ben":"503","biao_name":"Z_T_K_EG","id":"46","jianjie":"","name":"多选题","pai":"0","pid":"44","status":"0","type_id":"46","xishu":"1.00","yizuo":"2190","zong":"5","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"48","jianjie":"","name":"形式与政策","pai":"3","pid":"0","status":"1","type_id":"48","xishu":"1.00","yizuo":"2000","z_type":[{"ban_ben":"488","biao_name":"Z_T_K_EJ","id":"49","jianjie":"","name":"单选题","pai":"0","pid":"48","status":"0","type_id":"49","xishu":"1.00","yizuo":"2466","zong":"5","zuo":"0"},{"ban_ben":"505","biao_name":"Z_T_K_FA","id":"50","jianjie":"","name":"多选题","pai":"0","pid":"48","status":"0","type_id":"50","xishu":"1.00","yizuo":"2167","zong":"4","zuo":"0"}],"zong":"0","zuo":"0"}]
     */

    private String fen;
    private List<UTypeBean> u_type;

    @Override
    public String toString() {
        return "Ti_Zheng_Bean{" +
                "fen='" + fen + '\'' +
                ", u_type=" + u_type +
                '}';
    }

    public String getFen() {
        return fen;
    }

    public void setFen(String fen) {
        this.fen = fen;
    }

    public List<UTypeBean> getU_type() {
        return u_type;
    }

    public void setU_type(List<UTypeBean> u_type) {
        this.u_type = u_type;
    }

    public static class UTypeBean {
        @Override
        public String toString() {
            return "UTypeBean{" +
                    "ban_ben='" + ban_ben + '\'' +
                    ", id='" + id + '\'' +
                    ", jianjie='" + jianjie + '\'' +
                    ", name='" + name + '\'' +
                    ", pai='" + pai + '\'' +
                    ", pid='" + pid + '\'' +
                    ", status='" + status + '\'' +
                    ", type_id='" + type_id + '\'' +
                    ", xishu='" + xishu + '\'' +
                    ", yizuo='" + yizuo + '\'' +
                    ", zong='" + zong + '\'' +
                    ", zuo='" + zuo + '\'' +
                    ", z_type=" + z_type +
                    '}';
        }

        /**
         * ban_ben : 0
         * id : 26
         * jianjie :
         * name : 马克思主义基本原理概论
         * pai : 7
         * pid : 0
         * status : 1
         * type_id : 26
         * xishu : 1.00
         * yizuo : 2001
         * z_type : [{"ban_ben":"599","biao_name":"Z_T_K_BE","id":"14","jianjie":"","name":"单选题","pai":"12","pid":"26","status":"0","type_id":"14","xishu":"1.00","yizuo":"5274","zong":"98","zuo":"0"},{"ban_ben":"493","biao_name":"Z_T_K_DH","id":"37","jianjie":"","name":"多选题","pai":"0","pid":"26","status":"0","type_id":"37","xishu":"1.00","yizuo":"2637","zong":"10","zuo":"0"}]
         * zong : 0
         * zuo : 0
         */

        private String ban_ben;
        private String id;
        private String jianjie;
        private String name;
        private String pai;
        private String pid;
        private String status;
        private String type_id;
        private String xishu;
        private String yizuo;
        private String zong;
        private String zuo;
        private List<ZTypeBean> z_type;

        public String getBan_ben() {
            return ban_ben;
        }

        public void setBan_ben(String ban_ben) {
            this.ban_ben = ban_ben;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getJianjie() {
            return jianjie;
        }

        public void setJianjie(String jianjie) {
            this.jianjie = jianjie;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPai() {
            return pai;
        }

        public void setPai(String pai) {
            this.pai = pai;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
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

        public String getZuo() {
            return zuo;
        }

        public void setZuo(String zuo) {
            this.zuo = zuo;
        }

        public List<ZTypeBean> getZ_type() {
            return z_type;
        }

        public void setZ_type(List<ZTypeBean> z_type) {
            this.z_type = z_type;
        }

        public static class ZTypeBean {
            /**
             * ban_ben : 599
             * biao_name : Z_T_K_BE
             * id : 14
             * jianjie :
             * name : 单选题
             * pai : 12
             * pid : 26
             * status : 0
             * type_id : 14
             * xishu : 1.00
             * yizuo : 5274
             * zong : 98
             * zuo : 0
             */

            private String ban_ben;
            private String biao_name;
            private String id;
            private String jianjie;
            private String name;
            private String pai;
            private String pid;
            private String status;
            private String type_id;
            private String xishu;
            private String yizuo;
            private String zong;
            private String zuo;

            @Override
            public String toString() {
                return "ZTypeBean{" +
                        "ban_ben='" + ban_ben + '\'' +
                        ", biao_name='" + biao_name + '\'' +
                        ", id='" + id + '\'' +
                        ", jianjie='" + jianjie + '\'' +
                        ", name='" + name + '\'' +
                        ", pai='" + pai + '\'' +
                        ", pid='" + pid + '\'' +
                        ", status='" + status + '\'' +
                        ", type_id='" + type_id + '\'' +
                        ", xishu='" + xishu + '\'' +
                        ", yizuo='" + yizuo + '\'' +
                        ", zong='" + zong + '\'' +
                        ", zuo='" + zuo + '\'' +
                        '}';
            }

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

            public String getJianjie() {
                return jianjie;
            }

            public void setJianjie(String jianjie) {
                this.jianjie = jianjie;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPai() {
                return pai;
            }

            public void setPai(String pai) {
                this.pai = pai;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
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

            public String getZuo() {
                return zuo;
            }

            public void setZuo(String zuo) {
                this.zuo = zuo;
            }
        }
    }
}
