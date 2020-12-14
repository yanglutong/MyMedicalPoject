package com.yang.mymedicalpoject.fragment.kechengfragment;

import java.io.Serializable;
import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/26 16:16
 */
public class KeBean implements Serializable {

    private List<GongGaoBean> gong_gao;
    private List<KechengBean> kecheng;
    private List<LunboBean> lunbo;

    @Override
    public String toString() {
        return "KeBean{" +
                "gong_gao=" + gong_gao +
                ", kecheng=" + kecheng +
                ", lunbo=" + lunbo +
                '}';
    }

    public List<GongGaoBean> getGong_gao() {
        return gong_gao;
    }

    public void setGong_gao(List<GongGaoBean> gong_gao) {
        this.gong_gao = gong_gao;
    }

    public List<KechengBean> getKecheng() {
        return kecheng;
    }

    public void setKecheng(List<KechengBean> kecheng) {
        this.kecheng = kecheng;
    }

    public List<LunboBean> getLunbo() {
        return lunbo;
    }

    public void setLunbo(List<LunboBean> lunbo) {
        this.lunbo = lunbo;
    }

    public static class GongGaoBean {
        @Override
        public String toString() {
            return "GongGaoBean{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }

        /**
         * id : 9
         * name : 最后50天高分冲刺攻略来喽，冲鸭！
         * url : https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/9.html
         */

        private String id;
        private String name;
        private String url;

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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class KechengBean {
        @Override
        public String toString() {
            return "KechengBean{" +
                    "class_hour='" + class_hour + '\'' +
                    ", class_time='" + class_time + '\'' +
                    ", id='" + id + '\'' +
                    ", jia_ge='" + jia_ge + '\'' +
                    ", name='" + name + '\'' +
                    ", pic='" + pic + '\'' +
                    ", price_status='" + price_status + '\'' +
                    ", sort_id='" + sort_id + '\'' +
                    ", type='" + type + '\'' +
                    ", yuan_jia_ge='" + yuan_jia_ge + '\'' +
                    ", teacher_id=" + teacher_id +
                    ", type_str=" + type_str +
                    '}';
        }

        /**
         * class_hour : 7
         * class_time : 永久免费
         * id : 54
         * jia_ge : 0.00
         * name : 2021万人模考视频详解
         * pic : https://app.yiyanmeng.com:443/Public/user/2020-10-01/5f757008cf9df.png
         * price_status : 1
         * sort_id : 1
         * teacher_id : [{"id":"8","name":"李睿","pic":"https://app.yiyanmeng.com:443/Public/user/2019-12-31/5e0acf0ecb3f1.jpg"},{"id":"9","name":"马威","pic":"https://app.yiyanmeng.com:443/Public/user/2019-12-31/5e0aceffdab7d.jpg"},{"id":"10","name":"李聪","pic":"https://app.yiyanmeng.com:443/Public/user/2019-12-31/5e0aced96d9c2.jpg"},{"id":"11","name":"李婷","pic":"https://app.yiyanmeng.com:443/Public/user/2019-12-31/5e0aceca48632.jpg"}]
         * type : 0
         * type_str : ["陆续更新"]
         * yuan_jia_ge : 0.00
         */

        private String class_hour;
        private String class_time;
        private String id;
        private String jia_ge;
        private String name;
        private String pic;
        private String price_status;
        private String sort_id;
        private String type;
        private String yuan_jia_ge;
        private List<TeacherIdBean> teacher_id;
        private List<String> type_str;

        public String getClass_hour() {
            return class_hour;
        }

        public void setClass_hour(String class_hour) {
            this.class_hour = class_hour;
        }

        public String getClass_time() {
            return class_time;
        }

        public void setClass_time(String class_time) {
            this.class_time = class_time;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getJia_ge() {
            return jia_ge;
        }

        public void setJia_ge(String jia_ge) {
            this.jia_ge = jia_ge;
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

        public String getPrice_status() {
            return price_status;
        }

        public void setPrice_status(String price_status) {
            this.price_status = price_status;
        }

        public String getSort_id() {
            return sort_id;
        }

        public void setSort_id(String sort_id) {
            this.sort_id = sort_id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getYuan_jia_ge() {
            return yuan_jia_ge;
        }

        public void setYuan_jia_ge(String yuan_jia_ge) {
            this.yuan_jia_ge = yuan_jia_ge;
        }

        public List<TeacherIdBean> getTeacher_id() {
            return teacher_id;
        }

        public void setTeacher_id(List<TeacherIdBean> teacher_id) {
            this.teacher_id = teacher_id;
        }

        public List<String> getType_str() {
            return type_str;
        }

        public void setType_str(List<String> type_str) {
            this.type_str = type_str;
        }

        public static class TeacherIdBean {
            @Override
            public String toString() {
                return "TeacherIdBean{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", pic='" + pic + '\'' +
                        '}';
            }

            /**
             * id : 8
             * name : 李睿
             * pic : https://app.yiyanmeng.com:443/Public/user/2019-12-31/5e0acf0ecb3f1.jpg
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

    public static class LunboBean {
        @Override
        public String toString() {
            return "LunboBean{" +
                    "id='" + id + '\'' +
                    ", pic='" + pic + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }

        /**
         * id : 36
         * pic : https://app.yiyanmeng.com:443/Public/lunbo/15992997043284.jpg
         * url : https://mp.weixin.qq.com/s/9GMz4NVwS_8lYZub1B-fXw
         */

        private String id;
        private String pic;
        private String url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
