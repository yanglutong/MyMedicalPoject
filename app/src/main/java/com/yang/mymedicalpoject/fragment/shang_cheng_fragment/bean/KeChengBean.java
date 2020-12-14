package com.yang.mymedicalpoject.fragment.shang_cheng_fragment.bean;

import java.io.Serializable;
import java.util.List;

public class KeChengBean implements Serializable {

    /**
     * kecheng : null
     * lunbo : [{"id":"36","pic":"https://app.yiyanmeng.com:443/Public/lunbo/15992997043284.jpg","url":"https://mp.weixin.qq.com/s/9GMz4NVwS_8lYZub1B-fXw"},{"id":"31","pic":"https://app.yiyanmeng.com:443/Public/lunbo/16048907508296.jpg","url":"https://m.yiyanmeng.com/nd.jsp?_sc=3&id=90&checkWxLogin=true&openId=mpE0kTH3S%2Bx2i9sPbSU8P5EZ2W5iU4qqvk%2FtQeA1KSg%3D&secondAuth=true"},{"id":"30","pic":"https://app.yiyanmeng.com:443/Public/lunbo/16007361734484.jpg","url":"https://mp.weixin.qq.com/s/OQ0Zkw6_3V9h48U3kgmv5A"},{"id":"20","pic":"https://app.yiyanmeng.com:443/Public/lunbo/15991016536577.jpg","url":"https://mp.weixin.qq.com/s/ycIMhnQDxGhxqwURTNnEsw"}]
     * gong_gao : [{"id":"10","name":"【21考研】 强烈建议：考研订房一定要趁早！","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/10.html"},{"id":"9","name":"最后50天高分冲刺攻略来喽，冲鸭！","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/9.html"},{"id":"8","name":"各省市宣布以\u201c网上确认\u201d的方式进行，确认时间已出。手把手教你避开坑","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/8.html"},{"id":"7","name":"距离考研网报系统关闭还有3天，这4件事一定要做好！！","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/7.html"},{"id":"6","name":"21考研学习规划大公开，黄金倒计时60天，如何高效规划，合理备考？","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/6.html"}]
     */

    private Object kecheng;
    private List<LunboBean> lunbo;
    private List<GongGaoBean> gong_gao;

    public Object getKecheng() {
        return kecheng;
    }

    public void setKecheng(Object kecheng) {
        this.kecheng = kecheng;
    }

    public List<LunboBean> getLunbo() {
        return lunbo;
    }

    public void setLunbo(List<LunboBean> lunbo) {
        this.lunbo = lunbo;
    }

    public List<GongGaoBean> getGong_gao() {
        return gong_gao;
    }

    public void setGong_gao(List<GongGaoBean> gong_gao) {
        this.gong_gao = gong_gao;
    }

    public static class LunboBean implements Serializable {
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

    public static class GongGaoBean implements Serializable{
        /**
         * id : 10
         * name : 【21考研】 强烈建议：考研订房一定要趁早！
         * url : https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/10.html
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
}
