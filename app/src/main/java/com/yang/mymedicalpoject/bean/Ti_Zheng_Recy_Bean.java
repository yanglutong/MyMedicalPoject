package com.yang.mymedicalpoject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/12/9 18:54
 */
public class Ti_Zheng_Recy_Bean implements Serializable {

    @Override
    public String toString() {
        return "Ti_Zheng_Recy_Bean{" +
                "fen='" + fen + '\'' +
                ", u_type=" + u_type +
                '}';
    }

    /**
     * u_type : [{"id":"26","name":"马克思主义基本原理概论","pid":"0","status":"1","pic":null,"pai":"7","zong":"0","zuo":"0","ban_ben":"0","jianjie":"","xishu":"1.00","yizuo":"2001","type_id":"26","z_type":[{"id":"14","name":"历年真题 - 单选题","pid":"26","status":"0","pic":null,"pai":"12","zong":"98","zuo":"0","ban_ben":"599","jianjie":"","xishu":"1.00","yizuo":"5387","type_id":"14","biao_name":"Z_T_K_BE"},{"id":"37","name":"历年真题 - 多选题","pid":"26","status":"0","pic":null,"pai":"0","zong":"10","zuo":"0","ban_ben":"493","jianjie":"","xishu":"1.00","yizuo":"2656","type_id":"37","biao_name":"Z_T_K_DH"},{"id":"57","name":"01.关于无产阶级和人类解放的科学","pid":"26","status":"0","pic":null,"pai":"0","zong":"16","zuo":"0","ban_ben":"0","jianjie":"马克思主义是关于无产阶级和人类解放的科学","xishu":"0.00","yizuo":"30","type_id":"57","biao_name":"Z_T_K_FH"},{"id":"58","name":"02.世界的物质性及发展规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"129","zuo":"0","ban_ben":"0","jianjie":"世界的物质性及发展规律","xishu":"0.00","yizuo":"16","type_id":"58","biao_name":"Z_T_K_FI"},{"id":"59","name":"03.实践与认识及其发展规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"67","zuo":"0","ban_ben":"0","jianjie":"实践与认识及其发展规律","xishu":"0.00","yizuo":"5","type_id":"59","biao_name":"Z_T_K_FJ"},{"id":"60","name":"04.人类社会及其发展规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"53","zuo":"0","ban_ben":"0","jianjie":"人类社会及其发展规律","xishu":"0.00","yizuo":"3","type_id":"60","biao_name":"Z_T_K_GA"},{"id":"61","name":"05.资本主义的本质及规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"117","zuo":"0","ban_ben":"0","jianjie":"资本主义的本质及规律","xishu":"0.00","yizuo":"4","type_id":"61","biao_name":"Z_T_K_GB"},{"id":"62","name":"06.资本主义的发展及其趋势","pid":"26","status":"0","pic":null,"pai":"0","zong":"47","zuo":"0","ban_ben":"0","jianjie":"资本主义的发展及其趋势","xishu":"0.00","yizuo":"3","type_id":"62","biao_name":"Z_T_K_GC"},{"id":"63","name":"07.社会主义的发展及其规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"31","zuo":"0","ban_ben":"0","jianjie":"社会主义的发展及其规律","xishu":"0.00","yizuo":"4","type_id":"63","biao_name":"Z_T_K_GD"},{"id":"64","name":"08.共产主义崇高理想及其最终实现","pid":"26","status":"0","pic":null,"pai":"0","zong":"10","zuo":"0","ban_ben":"0","jianjie":"共产主义崇高理想及其最终实现","xishu":"0.00","yizuo":"5","type_id":"64","biao_name":"Z_T_K_GE"}]},{"id":"25","name":"毛泽东思想","pid":"0","status":"1","pic":null,"pai":"6","zong":"0","zuo":"0","ban_ben":"0","jianjie":"","xishu":"1.00","yizuo":"2000","type_id":"25","z_type":[{"id":"30","name":"历年真题 - 单选题","pid":"25","status":"0","pic":null,"pai":"2","zong":"11","zuo":"0","ban_ben":"480","jianjie":"","xishu":"1.00","yizuo":"2718","type_id":"30","biao_name":"Z_T_K_DA"},{"id":"33","name":"历年真题 - 多选题","pid":"25","status":"0","pic":null,"pai":"1","zong":"10","zuo":"0","ban_ben":"498","jianjie":"","xishu":"1.00","yizuo":"2219","type_id":"33","biao_name":"Z_T_K_DD"},{"id":"65","name":"01.毛泽东思想及其历史地位","pid":"25","status":"0","pic":null,"pai":"0","zong":"21","zuo":"0","ban_ben":"0","jianjie":"01.毛泽东思想及其历史地位","xishu":"0.00","yizuo":"10","type_id":"65","biao_name":"Z_T_K_GF"},{"id":"66","name":"02.新民主主义革命理论","pid":"25","status":"0","pic":null,"pai":"0","zong":"64","zuo":"0","ban_ben":"0","jianjie":"02.新民主主义革命理论","xishu":"0.00","yizuo":"6","type_id":"66","biao_name":"Z_T_K_GG"},{"id":"67","name":"03.社会主义改造理论","pid":"25","status":"0","pic":null,"pai":"0","zong":"40","zuo":"0","ban_ben":"0","jianjie":"03.社会主义改造理论","xishu":"0.00","yizuo":"1","type_id":"67","biao_name":"Z_T_K_GH"},{"id":"68","name":"04.社会主义建设道路初步探索的理论成果","pid":"25","status":"0","pic":null,"pai":"0","zong":"19","zuo":"0","ban_ben":"0","jianjie":"04.社会主义建设道路初步探索的理论成果","xishu":"0.00","yizuo":"0","type_id":"68","biao_name":"Z_T_K_GI"},{"id":"69","name":"05.邓小平理论","pid":"25","status":"0","pic":null,"pai":"0","zong":"39","zuo":"0","ban_ben":"0","jianjie":"05.邓小平理论","xishu":"0.00","yizuo":"2","type_id":"69","biao_name":"Z_T_K_GJ"},{"id":"70","name":"06.三个代表重要思想","pid":"25","status":"0","pic":null,"pai":"0","zong":"10","zuo":"0","ban_ben":"0","jianjie":"06.三个代表重要思想","xishu":"0.00","yizuo":"1","type_id":"70","biao_name":"Z_T_K_HA"},{"id":"71","name":"07.科学发展观","pid":"25","status":"0","pic":null,"pai":"0","zong":"13","zuo":"0","ban_ben":"0","jianjie":"07.科学发展观","xishu":"0.00","yizuo":"1","type_id":"71","biao_name":"Z_T_K_HB"},{"id":"72","name":"08.习近平新时代中国特色社会主义思想及其历史地位","pid":"25","status":"0","pic":null,"pai":"0","zong":"14","zuo":"0","ban_ben":"0","jianjie":"08.习近平新时代中国特色社会主义思想及其历史地位","xishu":"0.00","yizuo":"4","type_id":"72","biao_name":"Z_T_K_HC"},{"id":"73","name":"09.坚持和发展中国特色社会主义的总任务","pid":"25","status":"0","pic":null,"pai":"0","zong":"14","zuo":"0","ban_ben":"0","jianjie":"09.坚持和发展中国特色社会主义的总任务","xishu":"0.00","yizuo":"0","type_id":"73","biao_name":"Z_T_K_HD"},{"id":"74","name":"10.五位一体总体布局","pid":"25","status":"0","pic":null,"pai":"0","zong":"152","zuo":"0","ban_ben":"0","jianjie":"10.五位一体总体布局","xishu":"0.00","yizuo":"2","type_id":"74","biao_name":"Z_T_K_HE"},{"id":"75","name":"11.四个全面战略布局","pid":"25","status":"0","pic":null,"pai":"0","zong":"52","zuo":"0","ban_ben":"0","jianjie":"11.四个全面战略布局","xishu":"0.00","yizuo":"0","type_id":"75","biao_name":"Z_T_K_HF"},{"id":"76","name":"12.全面推进国防和军队现代化 多","pid":"25","status":"0","pic":null,"pai":"0","zong":"18","zuo":"0","ban_ben":"0","jianjie":"12.全面推进国防和军队现代化 多","xishu":"0.00","yizuo":"0","type_id":"76","biao_name":"Z_T_K_HG"},{"id":"79","name":"14.坚持和加强党的领导","pid":"25","status":"0","pic":null,"pai":"0","zong":"14","zuo":"0","ban_ben":"0","jianjie":"14.坚持和加强党的领导","xishu":"0.00","yizuo":"0","type_id":"79","biao_name":"Z_T_K_HJ"},{"id":"78","name":"13.中国特色大国外交","pid":"25","status":"0","pic":null,"pai":"0","zong":"15","zuo":"0","ban_ben":"0","jianjie":"13.中国特色大国外交","xishu":"0.00","yizuo":"2","type_id":"78","biao_name":"Z_T_K_HI"}]},{"id":"34","name":"中国近代史纲要","pid":"0","status":"1","pic":null,"pai":"5","zong":"0","zuo":"0","ban_ben":"0","jianjie":"","xishu":"1.00","yizuo":"2000","type_id":"34","z_type":[{"id":"39","name":"历年真题 - 单选题","pid":"34","status":"0","pic":null,"pai":"0","zong":"12","zuo":"0","ban_ben":"484","jianjie":"","xishu":"1.00","yizuo":"2664","type_id":"39","biao_name":"Z_T_K_DJ"},{"id":"40","name":"历年真题 - 多选题","pid":"34","status":"0","pic":null,"pai":"0","zong":"5","zuo":"0","ban_ben":"500","jianjie":"","xishu":"1.00","yizuo":"2255","type_id":"40","biao_name":"Z_T_K_EA"},{"id":"86","name":"01.反对外国侵略的斗争","pid":"34","status":"0","pic":null,"pai":"0","zong":"43","zuo":"0","ban_ben":"0","jianjie":"01.反对外国侵略的斗争","xishu":"0.00","yizuo":"6","type_id":"86","biao_name":"Z_T_K_IG"},{"id":"87","name":"02.对国家出路的早期探索","pid":"34","status":"0","pic":null,"pai":"0","zong":"31","zuo":"0","ban_ben":"0","jianjie":"02.对国家出路的早期探索","xishu":"0.00","yizuo":"1","type_id":"87","biao_name":"Z_T_K_IH"},{"id":"88","name":"03.辛亥革命与君主专制制度的终结","pid":"34","status":"0","pic":null,"pai":"0","zong":"36","zuo":"0","ban_ben":"0","jianjie":"03.辛亥革命与君主专制制度的终结","xishu":"0.00","yizuo":"7","type_id":"88","biao_name":"Z_T_K_II"},{"id":"89","name":"04.开天辟地的大事变","pid":"34","status":"0","pic":null,"pai":"0","zong":"38","zuo":"0","ban_ben":"0","jianjie":"04.开天辟地的大事变","xishu":"0.00","yizuo":"3","type_id":"89","biao_name":"Z_T_K_IJ"},{"id":"90","name":"05.中国革命的新道路","pid":"34","status":"0","pic":null,"pai":"0","zong":"29","zuo":"0","ban_ben":"0","jianjie":"05.中国革命的新道路","xishu":"0.00","yizuo":"3","type_id":"90","biao_name":"Z_T_K_JA"},{"id":"91","name":"06.中华民族的抗日战争","pid":"34","status":"0","pic":null,"pai":"0","zong":"40","zuo":"0","ban_ben":"0","jianjie":"06.中华民族的抗日战争","xishu":"0.00","yizuo":"1","type_id":"91","biao_name":"Z_T_K_JB"},{"id":"92","name":"07.为新中国而奋斗","pid":"34","status":"0","pic":null,"pai":"0","zong":"30","zuo":"0","ban_ben":"0","jianjie":"07.为新中国而奋斗","xishu":"0.00","yizuo":"2","type_id":"92","biao_name":"Z_T_K_JC"},{"id":"93","name":"08.社会主义基本制度在中国的确立","pid":"34","status":"0","pic":null,"pai":"0","zong":"31","zuo":"0","ban_ben":"0","jianjie":"08.社会主义基本制度在中国的确立","xishu":"0.00","yizuo":"0","type_id":"93","biao_name":"Z_T_K_JD"},{"id":"94","name":"09.社会主义建设在探索中曲折发展","pid":"34","status":"0","pic":null,"pai":"0","zong":"15","zuo":"0","ban_ben":"0","jianjie":"09.社会主义建设在探索中曲折发展","xishu":"0.00","yizuo":"1","type_id":"94","biao_name":"Z_T_K_JE"},{"id":"95","name":"10.中国特色社会主义的开创与接续发展","pid":"34","status":"0","pic":null,"pai":"0","zong":"13","zuo":"0","ban_ben":"0","jianjie":"10.中国特色社会主义的开创与接续发展","xishu":"0.00","yizuo":"0","type_id":"95","biao_name":"Z_T_K_JF"},{"id":"96","name":"11.中国特色社会主义进入新时代","pid":"34","status":"0","pic":null,"pai":"0","zong":"12","zuo":"0","ban_ben":"0","jianjie":"11.中国特色社会主义进入新时代","xishu":"0.00","yizuo":"3","type_id":"96","biao_name":"Z_T_K_JG"}]},{"id":"44","name":"思想道德修养与法律基础","pid":"0","status":"1","pic":null,"pai":"4","zong":"0","zuo":"0","ban_ben":"0","jianjie":"","xishu":"1.00","yizuo":"2000","type_id":"44","z_type":[{"id":"45","name":"历年真题 - 单选题","pid":"44","status":"0","pic":null,"pai":"0","zong":"6","zuo":"0","ban_ben":"486","jianjie":"","xishu":"1.00","yizuo":"2392","type_id":"45","biao_name":"Z_T_K_EF"},{"id":"46","name":"历年真题 - 多选题","pid":"44","status":"0","pic":null,"pai":"0","zong":"5","zuo":"0","ban_ben":"503","jianjie":"","xishu":"1.00","yizuo":"2197","type_id":"46","biao_name":"Z_T_K_EG"},{"id":"80","name":"01.人生的青春之问","pid":"44","status":"0","pic":null,"pai":"0","zong":"21","zuo":"0","ban_ben":"0","jianjie":"01.人生的青春之问","xishu":"0.00","yizuo":"8","type_id":"80","biao_name":"Z_T_K_IA"},{"id":"81","name":"02.坚定理想信念","pid":"44","status":"0","pic":null,"pai":"0","zong":"12","zuo":"0","ban_ben":"0","jianjie":"02.坚定理想信念","xishu":"0.00","yizuo":"2","type_id":"81","biao_name":"Z_T_K_IB"},{"id":"82","name":"03.弘扬中国精神","pid":"44","status":"0","pic":null,"pai":"0","zong":"23","zuo":"0","ban_ben":"0","jianjie":"03.弘扬中国精神","xishu":"0.00","yizuo":"4","type_id":"82","biao_name":"Z_T_K_IC"},{"id":"83","name":"04.践行社会主义核心价值观","pid":"44","status":"0","pic":null,"pai":"0","zong":"21","zuo":"0","ban_ben":"0","jianjie":"04.践行社会主义核心价值观","xishu":"0.00","yizuo":"2","type_id":"83","biao_name":"Z_T_K_ID"},{"id":"84","name":"05.明大德守公德严私德","pid":"44","status":"0","pic":null,"pai":"0","zong":"66","zuo":"0","ban_ben":"0","jianjie":"05.明大德守公德严私德","xishu":"0.00","yizuo":"0","type_id":"84","biao_name":"Z_T_K_IE"},{"id":"85","name":"06.尊法学法守法用法","pid":"44","status":"0","pic":null,"pai":"0","zong":"94","zuo":"0","ban_ben":"0","jianjie":"06.尊法学法守法用法","xishu":"0.00","yizuo":"1","type_id":"85","biao_name":"Z_T_K_IF"}]},{"id":"48","name":"形式与政策","pid":"0","status":"1","pic":null,"pai":"3","zong":"0","zuo":"0","ban_ben":"0","jianjie":"","xishu":"1.00","yizuo":"2000","type_id":"48","z_type":[{"id":"49","name":"历年真题 - 单选题","pid":"48","status":"0","pic":null,"pai":"0","zong":"5","zuo":"0","ban_ben":"488","jianjie":"","xishu":"1.00","yizuo":"2484","type_id":"49","biao_name":"Z_T_K_EJ"},{"id":"50","name":"历年真题 - 多选题","pid":"48","status":"0","pic":null,"pai":"0","zong":"4","zuo":"0","ban_ben":"505","jianjie":"","xishu":"1.00","yizuo":"2177","type_id":"50","biao_name":"Z_T_K_FA"}]}]
     * fen : 1
     */

    private String fen;
    private List<UTypeBean> u_type;

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

    public static class UTypeBean implements Serializable{
        @Override
        public String toString() {
            return "UTypeBean{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", pid='" + pid + '\'' +
                    ", status='" + status + '\'' +
                    ", pic=" + pic +
                    ", pai='" + pai + '\'' +
                    ", zong='" + zong + '\'' +
                    ", zuo='" + zuo + '\'' +
                    ", ban_ben='" + ban_ben + '\'' +
                    ", jianjie='" + jianjie + '\'' +
                    ", xishu='" + xishu + '\'' +
                    ", yizuo='" + yizuo + '\'' +
                    ", type_id='" + type_id + '\'' +
                    ", z_type=" + z_type +
                    '}';
        }

        /**
         * id : 26
         * name : 马克思主义基本原理概论
         * pid : 0
         * status : 1
         * pic : null
         * pai : 7
         * zong : 0
         * zuo : 0
         * ban_ben : 0
         * jianjie :
         * xishu : 1.00
         * yizuo : 2001
         * type_id : 26
         * z_type :
         * [{"id":"14","name":"历年真题 - 单选题","pid":"26","status":"0","pic":null,"pai":"12","zong":"98","zuo":"0","ban_ben":"599","jianjie":"","xishu":"1.00","yizuo":"5387","type_id":"14","biao_name":"Z_T_K_BE"},{"id":"37","name":"历年真题 - 多选题","pid":"26","status":"0","pic":null,"pai":"0","zong":"10","zuo":"0","ban_ben":"493","jianjie":"","xishu":"1.00","yizuo":"2656","type_id":"37","biao_name":"Z_T_K_DH"}
         * ,{"id":"57","name":"01.关于无产阶级和人类解放的科学","pid":"26","status":"0","pic":null,"pai":"0","zong":"16","zuo":"0","ban_ben":"0","jianjie":"马克思主义是关于无产阶级和人类解放的科学","xishu":"0.00","yizuo":"30","type_id":"57","biao_name":"Z_T_K_FH"},{"id":"58","name":"02.世界的物质性及发展规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"129","zuo":"0","ban_ben":"0","jianjie":"世界的物质性及发展规律","xishu":"0.00","yizuo":"16","type_id":"58","biao_name":"Z_T_K_FI"},{"id":"59","name":"03.实践与认识及其发展规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"67","zuo":"0","ban_ben":"0","jianjie":"实践与认识及其发展规律","xishu":"0.00","yizuo":"5","type_id":"59","biao_name":"Z_T_K_FJ"},
         * {"id":"60","name":"04.人类社会及其发展规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"53","zuo":"0","ban_ben":"0","jianjie":"人类社会及其发展规律","xishu":"0.00","yizuo":"3","type_id":"60","biao_name":"Z_T_K_GA"},{"id":"61","name":"05.资本主义的本质及规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"117","zuo":"0","ban_ben":"0","jianjie":"资本主义的本质及规律","xishu":"0.00","yizuo":"4","type_id":"61","biao_name":"Z_T_K_GB"},{"id":"62","name":"06.资本主义的发展及其趋势","pid":"26","status":"0","pic":null,"pai":"0","zong":"47","zuo":"0","ban_ben":"0","jianjie":"资本主义的发展及其趋势","xishu":"0.00","yizuo":"3","type_id":"62","biao_name":"Z_T_K_GC"},{"id":"63","name":"07.社会主义的发展及其规律","pid":"26","status":"0","pic":null,"pai":"0","zong":"31","zuo":"0","ban_ben":"0","jianjie":"社会主义的发展及其规律","xishu":"0.00","yizuo":"4","type_id":"63","biao_name":"Z_T_K_GD"},{"id":"64","name":"08.共产主义崇高理想及其最终实现","pid":"26","status":"0","pic":null,"pai":"0","zong":"10","zuo":"0","ban_ben":"0","jianjie":"共产主义崇高理想及其最终实现","xishu":"0.00","yizuo":"5","type_id":"64","biao_name":"Z_T_K_GE"}]
         */

        private String id;
        private String name;
        private String pid;
        private String status;
        private Object pic;
        private String pai;
        private String zong;
        private String zuo;
        private String ban_ben;
        private String jianjie;
        private String xishu;
        private String yizuo;
        private String type_id;
        private List<ZTypeBean> z_type;

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

        public Object getPic() {
            return pic;
        }

        public void setPic(Object pic) {
            this.pic = pic;
        }

        public String getPai() {
            return pai;
        }

        public void setPai(String pai) {
            this.pai = pai;
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

        public String getBan_ben() {
            return ban_ben;
        }

        public void setBan_ben(String ban_ben) {
            this.ban_ben = ban_ben;
        }

        public String getJianjie() {
            return jianjie;
        }

        public void setJianjie(String jianjie) {
            this.jianjie = jianjie;
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

        public String getType_id() {
            return type_id;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
        }

        public List<ZTypeBean> getZ_type() {
            return z_type;
        }

        public void setZ_type(List<ZTypeBean> z_type) {
            this.z_type = z_type;
        }

        public static class ZTypeBean implements Serializable{
            @Override
            public String toString() {
                return "ZTypeBean{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", pid='" + pid + '\'' +
                        ", status='" + status + '\'' +
                        ", pic=" + pic +
                        ", pai='" + pai + '\'' +
                        ", zong='" + zong + '\'' +
                        ", zuo='" + zuo + '\'' +
                        ", ban_ben='" + ban_ben + '\'' +
                        ", jianjie='" + jianjie + '\'' +
                        ", xishu='" + xishu + '\'' +
                        ", yizuo='" + yizuo + '\'' +
                        ", type_id='" + type_id + '\'' +
                        ", biao_name='" + biao_name + '\'' +
                        '}';
            }

            /**
             * id : 14
             * name : 历年真题 - 单选题
             * pid : 26
             * status : 0
             * pic : null
             * pai : 12
             * zong : 98
             * zuo : 0
             * ban_ben : 599
             * jianjie :
             * xishu : 1.00
             * yizuo : 5387
             * type_id : 14
             * biao_name : Z_T_K_BE
             */

            private String id;
            private String name;
            private String pid;
            private String status;
            private Object pic;
            private String pai;
            private String zong;
            private String zuo;
            private String ban_ben;
            private String jianjie;
            private String xishu;
            private String yizuo;
            private String type_id;
            private String biao_name;

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

            public Object getPic() {
                return pic;
            }

            public void setPic(Object pic) {
                this.pic = pic;
            }

            public String getPai() {
                return pai;
            }

            public void setPai(String pai) {
                this.pai = pai;
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

            public String getBan_ben() {
                return ban_ben;
            }

            public void setBan_ben(String ban_ben) {
                this.ban_ben = ban_ben;
            }

            public String getJianjie() {
                return jianjie;
            }

            public void setJianjie(String jianjie) {
                this.jianjie = jianjie;
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

            public String getType_id() {
                return type_id;
            }

            public void setType_id(String type_id) {
                this.type_id = type_id;
            }

            public String getBiao_name() {
                return biao_name;
            }

            public void setBiao_name(String biao_name) {
                this.biao_name = biao_name;
            }
        }
    }
}
