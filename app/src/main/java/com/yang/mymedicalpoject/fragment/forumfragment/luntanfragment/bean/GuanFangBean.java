package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean;

import java.util.List;

public class GuanFangBean {
    private List<PlateBean> plate;
    private List<ArticleBean> article;

    public List<PlateBean> getPlate() {
        return plate;
    }

    public void setPlate(List<PlateBean> plate) {
        this.plate = plate;
    }

    public List<ArticleBean> getArticle() {
        return article;
    }

    public void setArticle(List<ArticleBean> article) {
        this.article = article;
    }

    public static class PlateBean {
        /**
         * title : 以例举题
         * id : 10
         * num : 13
         * image : https://app.yiyanmeng.com:443/Upload/article/2020-08-06/5f2b855d0c730.png
         */

        private String title;
        private String id;
        private String num;
        private String image;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

    public static class ArticleBean {
        /**
         * commenId : 344
         * title : 医学生考研选对科室 ，一生受益！！【上】
         * images : null
         * content :     一入医门深似海，大多数人在考研时选择的科室方向，一是出自兴趣，还有的就是薪资待遇和夜班忙不忙了~有的科室相对轻松，有的科室却非常辛苦。那句话是怎么说来着？“金眼科，银外科，累死累活妇产科，腻腻歪歪大内科，一钱不值小儿科，死都不去急诊科。”准备考研的同学们，一定要想清楚再做选择，毕竟所选择的专业关系到就业，薪资等各个方面，甚至可以说是将会伴随你一生。

         一：首先我们说说内科与外科：
         先记住这个公式：
         内科＝临床思路极其重要＋写无穷无尽的病史＋漫长的查房
         外科＝动手能力极其重要＋挨无穷无尽的骂＋漫长的手术＋手术费

         当然，这两个公式都是针对年轻医生的。内科医生早晚要脱离写病史的阶段，外科医生也不会挨无穷无尽的骂。根据自己的喜好去选择吧。可以肯定的是，临床思路和动手能力都是可以培养的。据传，外科医生的工资永远是同阶段内科医生的1.5倍。这句话还是蛮有道理的。外科医生的“手术费”是正大光明的辛苦钱，当然也有人在手术费之外再弄点“手术费”，那就不只是1.5倍了。
         “漫长的查房”还有另一层含义：你永远不知道上级医生什么时候开始查房，喜欢中午12点或者下午5点开始查房的上级医生总是默默地存在着，存在着，存在着……
         “漫长的手术”还有另外好几层含义：饿了不能随时吃饭＋渴了不能随时喝水＋不能随时大小便（当然更不能随地大小便）＋累了不能随时坐下休息。后果就是胃不好＋便秘＋下肢静脉曲张……

         二：大内大外 还是“专业科室”
         不要认为你的导师来自哪个内外科下的三级学科（如心内科、胸外科），你就只学习那个科室的知识。事实上，科研型研究生基本不学习临床知识技能，临床型研究生要在大内科和大外科轮转。换句话说，你选择的科室和你未来要学习什么东西是没有关系的。
         而且，千万不要认为你选择了哪个科室的导师，你以后就要在哪个科室干一辈子，找工作的时候很有可能会去其他科室，比如小医有个学姐研究生貌似是急诊，但最后去了儿科工作。从这一点上来看，选择大内科或者大外科，以后转换科室的自由度会更大一些。

         三：大内科
         1.消化内科：
         病种多，经常要看患者的排泄物，有内镜等操作，ERCP有辐射消化内科内镜技术日新月异，ESD/EMR在早期胃癌治疗方面具备极大的优势，可以与胃肠外科竞争病源，同时待遇相当不错，属于“内科中的外科”。消化科针对的患者群很大，涉及疾病很多，是一个很有“被需要感”的科室。对消化科某些常见疾病而言，只要用药对证，则可达到症状消失、效如桴鼓的境界。随着时代的发展，人们生活水平的提升，李东垣的脾胃学硕也是再次散发了它应有的光彩。而且医院一般对其非常重视，每年均有不同数量的人才需求，值得选择。

         2.肾内科：病种少，容易学，有透析、动静脉造瘘等操作
         肾内科在动静脉造瘘、腹膜透析等技术有独特的优势，待遇尚可。但就业形势不明朗，各个医院差异较大。推荐指数：一般

         3.内分泌科：
         内分泌科更多地涉及人体“功能”方面的问题，很多疾病有全身症状，对临床思路要求高，诊断疾病像破案一样。内分泌科号称内科中的“白富美”，也是最能体现内科本质的科室。一般都是学习成绩最优异的女生选择，轻松愉快，待遇很好。但相对的，竞争压力非常大，同时对于研究生需求不大。建议根据自身能力，慎重选择。

         4.风湿科：
         风湿科在内科中待遇应该属于最低，因为使用的基本都是基础药物，而且病人情况一般较轻但容易反复。所以比较轻松，就业形势一般。推荐指数：一般

         5.呼吸内科：容易被飞沫传染，有纤维支气管镜等操作
         现在呼吸内科住院病人很多都是肺癌化疗，原因无他，方案固定，容易处理，同时对科室回报较高。而呼内人才需求也不小，工作好找一些。

         6.心内科：介入手术有辐射，实际上像个外科，理论复杂难懂
         心内科可谓内科中最忙碌、危重、紧急的科室，没有之一。急诊号称全院最多，在心内科睡完一个完整的觉永远是种奢侈，即使第二天睡一整天都还是头痛。从先心到风湿，从高血压到冠心病，从心梗到心衰……无一不是让其他科室措手不及的大病。由于介入的巨大优势，医生待遇冠绝全院。相应的，男女生竞争都很激烈，做介入治疗的话，穿铅服吃射线，女性会老得快。如花似玉的姑娘进去，面容枯槁的婆婆出来，更别说对生育能力的影响了。而且介入一般只让男生去做，女生有一定劣势。心内科病人多数属于危重症病人，分分钟死给你看，很容易引起医疗纠纷，心累。收入高，竞争压力大，可以考虑。喜欢挑战、追求成就感的同学，心内科是你们的不二之选啊！

         7.血液内科：
         血液内科住院病人多为肿瘤化疗，所以待遇相对较高。但遇到的病人基本都是形销骨立，即使坚强，但也让人心疼。同时生离死别太多，非心地坚定者不能为。医院对于研究生需求较大，工作好找。

         8.肿瘤科：
         肿瘤科一般是女生兵家必争之地，工作轻松，待遇好，科研成果易出，一切看着都这么美好。但怎么可能呢？轻松又赚钱的工作谁不想干？医院在有这么多廉价劳动力的时候为什么要招人分钱？明白这两点后，你的择业就有了方向。肿瘤科竞争压力极大，同时研究生需求极小，望三思。

         9.神经内科：
         神经内科，是治疗神经方面疾病的二级学科，主要收治脑血管病、颅内炎症性疾病、相关代谢病、遗传病、癫痫、痴呆等。有时也与心理科交叉，治疗一些神经精神疾病。这个学科相对其他学科而言，目前研究得较少，入门较难，但相对也很有趣，在科研上大有可为。同时医院招人也是玄学，各院差异极大，以当地为准。
         * ping_num : 1
         * addtime : 2020-08-06 15:21:01
         * authImg : https://app.yiyanmeng.com:443/Upload/article/2020-08-06/5f2b7ecfb39c6.png
         * authName : 职业规划
         * authId :
         */

        private String commenId;
        private String title;
        private Object images;
        private String content;
        private String ping_num;
        private String addtime;
        private String authImg;
        private String authName;
        private String authId;

        public String getCommenId() {
            return commenId;
        }

        public void setCommenId(String commenId) {
            this.commenId = commenId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Object getImages() {
            return images;
        }

        public void setImages(Object images) {
            this.images = images;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPing_num() {
            return ping_num;
        }

        public void setPing_num(String ping_num) {
            this.ping_num = ping_num;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getAuthImg() {
            return authImg;
        }

        public void setAuthImg(String authImg) {
            this.authImg = authImg;
        }

        public String getAuthName() {
            return authName;
        }

        public void setAuthName(String authName) {
            this.authName = authName;
        }

        public String getAuthId() {
            return authId;
        }

        public void setAuthId(String authId) {
            this.authId = authId;
        }
    }
}
