package com.yang.mymedicalpoject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/25 16:56
 */
public class TiKuLieBean implements Serializable {

    @Override
    public String toString() {
        return "TiKuLieBean{" +
                "fen='" + fen + '\'' +
                ", u_type=" + u_type +
                '}';
    }

    /**
     * u_type : [{"id":"57","name":"内科学","pid":"0","status":"1","pic":null,"pai":"5","zong":"0","zuo":"0","ban_ben":"0","jianjie":"医学考研一线名师反复审查","xishu":"1.00","yizuo":"2002","ti_ping_num":"0","image":"","des":"","type_id":"57","z_type":[{"id":"112","name":"第一章  诊断学","pid":"58","status":"0","pic":null,"pai":"0","zong":"56","zuo":"0","ban_ben":"12456","jianjie":"","xishu":"1.00","yizuo":"7922","ti_ping_num":"0","image":"","des":"","type_id":"112","biao_name":"T_K_BBC"},{"id":"114","name":"第二章  呼吸系统疾病","pid":"59","status":"0","pic":null,"pai":"0","zong":"220","zuo":"0","ban_ben":"11479","jianjie":"","xishu":"1.00","yizuo":"9263","ti_ping_num":"0","image":"","des":"","type_id":"114","biao_name":"T_K_BBE"},{"id":"116","name":"第三章  循环系统疾病","pid":"60","status":"0","pic":null,"pai":"0","zong":"258","zuo":"0","ban_ben":"11486","jianjie":"","xishu":"1.00","yizuo":"6103","ti_ping_num":"0","image":"","des":"","type_id":"116","biao_name":"T_K_BBG"},{"id":"117","name":"第四章  消化系统疾病和中毒","pid":"61","status":"0","pic":null,"pai":"0","zong":"243","zuo":"0","ban_ben":"11495","jianjie":"","xishu":"1.00","yizuo":"5521","ti_ping_num":"0","image":"","des":"","type_id":"117","biao_name":"T_K_BBH"},{"id":"271","name":"    第一节 问诊技巧与症状","pid":"61","status":"0","pic":null,"pai":"0","zong":"69","zuo":"0","ban_ben":"0","jianjie":"    第一节 问诊技巧与症状","xishu":"0.00","yizuo":"265","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd21319416.png","des":"    第一节 问诊技巧与症状","type_id":"271","biao_name":"T_K_CHB"},{"id":"272","name":"    第二节 胃食管反流病","pid":"61","status":"0","pic":null,"pai":"0","zong":"45","zuo":"0","ban_ben":"0","jianjie":"    第二节 胃食管反流病","xishu":"0.00","yizuo":"503","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd28a456dc.png","des":"    第二节 胃食管反流病","type_id":"272","biao_name":"T_K_CHC"},{"id":"273","name":"    第三节 食管癌","pid":"61","status":"0","pic":null,"pai":"0","zong":"24","zuo":"0","ban_ben":"0","jianjie":"    第三节 食管癌","xishu":"0.00","yizuo":"202","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd34274b8c.png","des":"    第三节 食管癌","type_id":"273","biao_name":"T_K_CHD"},{"id":"274","name":"    第四节 急性与慢性胃炎","pid":"61","status":"0","pic":null,"pai":"0","zong":"125","zuo":"0","ban_ben":"13115","jianjie":"    第四节 急性与慢性胃炎","xishu":"0.00","yizuo":"200","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd3a1d119c.png","des":"    第四节 急性与慢性胃炎","type_id":"274","biao_name":"T_K_CHE"},{"id":"275","name":"    第五节 消化性溃疡","pid":"61","status":"0","pic":null,"pai":"0","zong":"201","zuo":"0","ban_ben":"13089","jianjie":"    第五节 消化性溃疡","xishu":"0.00","yizuo":"183","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd4831d25a.png","des":"    第五节 消化性溃疡","type_id":"275","biao_name":"T_K_CHF"},{"id":"276","name":"    第六节 胃癌","pid":"61","status":"0","pic":null,"pai":"0","zong":"43","zuo":"0","ban_ben":"13088","jianjie":"    第六节 胃癌","xishu":"0.00","yizuo":"95","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd523ac613.png","des":"    第六节 胃癌","type_id":"276","biao_name":"T_K_CHG"},{"id":"277","name":"    第七节 肠结核与腹膜炎","pid":"61","status":"0","pic":null,"pai":"0","zong":"81","zuo":"0","ban_ben":"0","jianjie":"    第七节 肠结核与腹膜炎","xishu":"0.00","yizuo":"115","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd57451efe.png","des":"    第七节 肠结核与腹膜炎","type_id":"277","biao_name":"T_K_CHH"},{"id":"278","name":"    第八节 炎症性肠病","pid":"61","status":"0","pic":null,"pai":"0","zong":"161","zuo":"0","ban_ben":"0","jianjie":"    第八节 炎症性肠病","xishu":"0.00","yizuo":"96","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd5dfc7ba2.png","des":"    第八节 炎症性肠病","type_id":"278","biao_name":"T_K_CHI"},{"id":"279","name":"    第九节 功能性胃肠","pid":"61","status":"0","pic":null,"pai":"0","zong":"49","zuo":"0","ban_ben":"0","jianjie":"    第九节 功能性胃肠","xishu":"0.00","yizuo":"56","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd63d19c94.png","des":"    第九节 功能性胃肠","type_id":"279","biao_name":"T_K_CHJ"},{"id":"280","name":"    第十节 慢性腹泻","pid":"61","status":"0","pic":null,"pai":"0","zong":"25","zuo":"0","ban_ben":"0","jianjie":"    第十节 慢性腹泻","xishu":"0.00","yizuo":"50","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd680ec8cb.png","des":"    第十节 慢性腹泻","type_id":"280","biao_name":"T_K_CIA"},{"id":"281","name":"    第十一节 肝硬化","pid":"61","status":"0","pic":null,"pai":"0","zong":"147","zuo":"0","ban_ben":"0","jianjie":"    第十一节 肝硬化","xishu":"0.00","yizuo":"124","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd6cfdf5cd.png","des":"    第十一节 肝硬化","type_id":"281","biao_name":"T_K_CIB"},{"id":"282","name":"    第十二节 肝性脑病","pid":"61","status":"0","pic":null,"pai":"0","zong":"61","zuo":"0","ban_ben":"0","jianjie":"    第十二节 肝性脑病","xishu":"0.00","yizuo":"94","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd71de2011.png","des":"    第十二节 肝性脑病","type_id":"282","biao_name":"T_K_CIC"},{"id":"283","name":"    第十三节 原发性肝癌","pid":"61","status":"0","pic":null,"pai":"0","zong":"80","zuo":"0","ban_ben":"0","jianjie":"    第十三节 原发性肝癌","xishu":"0.00","yizuo":"82","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd760e7050.png","des":"    第十三节 原发性肝癌","type_id":"283","biao_name":"T_K_CID"},{"id":"284","name":"    第十四节 胰腺疾病","pid":"61","status":"0","pic":null,"pai":"0","zong":"88","zuo":"0","ban_ben":"0","jianjie":"    第十四节 胰腺疾病","xishu":"0.00","yizuo":"100","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd7a6284f6.png","des":"    第十四节 胰腺疾病","type_id":"284","biao_name":"T_K_CIE"},{"id":"102","name":"第五章  泌尿系统疾病","pid":"62","status":"0","pic":null,"pai":"0","zong":"129","zuo":"0","ban_ben":"11500","jianjie":"","xishu":"1.00","yizuo":"4649","ti_ping_num":"0","image":"","des":"","type_id":"102","biao_name":"T_K_BAC"},{"id":"110","name":"第六章  血液系统疾病","pid":"63","status":"0","pic":null,"pai":"0","zong":"153","zuo":"0","ban_ben":"11505","jianjie":"","xishu":"1.00","yizuo":"4607","ti_ping_num":"0","image":"","des":"","type_id":"110","biao_name":"T_K_BBA"},{"id":"109","name":"第七章  内分泌系统和营养代谢疾病","pid":"64","status":"0","pic":null,"pai":"0","zong":"143","zuo":"0","ban_ben":"11510","jianjie":"","xishu":"1.00","yizuo":"4343","ti_ping_num":"0","image":"","des":"","type_id":"109","biao_name":"T_K_BAJ"},{"id":"122","name":"第八章  风湿性疾病","pid":"65","status":"0","pic":null,"pai":"0","zong":"37","zuo":"0","ban_ben":"11513","jianjie":"","xishu":"1.00","yizuo":"4047","ti_ping_num":"0","image":"","des":"","type_id":"122","biao_name":"T_K_BCC"}]},{"id":"66","name":"外科学","pid":"0","status":"1","pic":null,"pai":"4","zong":"0","zuo":"0","ban_ben":"0","jianjie":"重新定义九版教材，打破固化教育","xishu":"1.00","yizuo":"2000","ti_ping_num":"0","image":"","des":"","type_id":"66","z_type":[{"id":"118","name":"第一章  外科总论","pid":"67","status":"0","pic":null,"pai":"0","zong":"195","zuo":"0","ban_ben":"11516","jianjie":"","xishu":"1.00","yizuo":"6339","ti_ping_num":"0","image":"","des":"","type_id":"118","biao_name":"T_K_BBI"},{"id":"206","name":"    第一节 绪论","pid":"67","status":"0","pic":null,"pai":"0","zong":"24","zuo":"0","ban_ben":"0","jianjie":"第一节 绪论","xishu":"0.00","yizuo":"1042","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-03-31/5e82dd02ac31f.png","des":"第一节 绪论","type_id":"206","biao_name":"T_K_CAG"},{"id":"207","name":"    第二节 无菌术","pid":"67","status":"0","pic":null,"pai":"0","zong":"45","zuo":"0","ban_ben":"13090","jianjie":"第二节 无菌术","xishu":"0.00","yizuo":"214","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-03-31/5e82dd1c8b923.png","des":"第二节 无菌术","type_id":"207","biao_name":"T_K_CAH"},{"id":"208","name":"    第三节 体液失调","pid":"67","status":"0","pic":null,"pai":"0","zong":"125","zuo":"0","ban_ben":"13095","jianjie":"    第三节 体液失调","xishu":"0.00","yizuo":"176","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-03-31/5e8301603aab3.png","des":"    第三节 体液失调","type_id":"208","biao_name":"T_K_CAI"},{"id":"209","name":"    第四节 输血","pid":"67","status":"0","pic":null,"pai":"0","zong":"69","zuo":"0","ban_ben":"13096","jianjie":"    第四节 输血","xishu":"0.00","yizuo":"236","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-03-31/5e8315ff7ee8d.png","des":"    第四节 输血","type_id":"209","biao_name":"T_K_CAJ"},{"id":"210","name":"    第五节 外科休克","pid":"67","status":"0","pic":null,"pai":"0","zong":"90","zuo":"0","ban_ben":"12773","jianjie":"    第五节 外科休克","xishu":"0.00","yizuo":"933","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-01/5e842497c0b3b.png","des":"    第五节 外科休克","type_id":"210","biao_name":"T_K_CBA"},{"id":"211","name":"    第六节 器官功能不全综合症","pid":"67","status":"0","pic":null,"pai":"0","zong":"81","zuo":"0","ban_ben":"0","jianjie":"    第六节 器官功能不全综合症","xishu":"0.00","yizuo":"82","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-01/5e8454b0e547e.png","des":"    第六节 器官功能不全综合症","type_id":"211","biao_name":"T_K_CBB"},{"id":"212","name":"    第七节 围手术期处理","pid":"67","status":"0","pic":null,"pai":"0","zong":"90","zuo":"0","ban_ben":"12884","jianjie":"    第七节 围手术期处理","xishu":"0.00","yizuo":"127","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-02/5e85616dda2fc.png","des":"    第七节 围手术期处理","type_id":"212","biao_name":"T_K_CBC"},{"id":"213","name":"    第八节 外科营养代谢","pid":"67","status":"0","pic":null,"pai":"0","zong":"29","zuo":"0","ban_ben":"0","jianjie":"    第八节 外科营养代谢","xishu":"0.00","yizuo":"119","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-02/5e85a649118e2.png","des":"    第八节 外科营养代谢","type_id":"213","biao_name":"T_K_CBD"},{"id":"214","name":"    第九节 外科感染","pid":"67","status":"0","pic":null,"pai":"0","zong":"124","zuo":"0","ban_ben":"13105","jianjie":"    第九节 外科感染","xishu":"0.00","yizuo":"211","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-02/5e85c3eb47586.png","des":"    第九节 外科感染","type_id":"214","biao_name":"T_K_CBE"},{"id":"215","name":"    第十节 肿瘤","pid":"67","status":"0","pic":null,"pai":"0","zong":"90","zuo":"0","ban_ben":"12865","jianjie":"    第十节 肿瘤","xishu":"0.00","yizuo":"71","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-03/5e86c5454c9b2.png","des":"    第十节 肿瘤","type_id":"215","biao_name":"T_K_CBF"},{"id":"216","name":"    第十一节 移植器官","pid":"67","status":"0","pic":null,"pai":"0","zong":"144","zuo":"0","ban_ben":"13028","jianjie":"    第十一节 移植器官","xishu":"0.00","yizuo":"44","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-03/5e86e55a1eda1.png","des":"    第十一节 移植器官","type_id":"216","biao_name":"T_K_CBG"},{"id":"217","name":"    第十二节 烧伤与冻伤","pid":"67","status":"0","pic":null,"pai":"0","zong":"130","zuo":"0","ban_ben":"13108","jianjie":"    第十二节 烧伤与冻伤","xishu":"0.00","yizuo":"91","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-03/5e870ddd328c6.png","des":"    第十二节 烧伤与冻伤","type_id":"217","biao_name":"T_K_CBH"},{"id":"218","name":"    第十三节 烧伤的判断与处理","pid":"67","status":"0","pic":null,"pai":"0","zong":"192","zuo":"0","ban_ben":"0","jianjie":"    第十三节 烧伤的判断与处理","xishu":"0.00","yizuo":"78","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-04/5e88316533475.png","des":"    第十三节 烧伤的判断与处理","type_id":"218","biao_name":"T_K_CBI"},{"id":"219","name":"    第十四节 皮肤及其它组织移植","pid":"67","status":"0","pic":null,"pai":"0","zong":"56","zuo":"0","ban_ben":"13109","jianjie":"    第十四节 皮肤及其它组织移植","xishu":"0.00","yizuo":"45","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-04/5e88455686d58.png","des":"    第十四节 皮肤及其它组织移植","type_id":"219","biao_name":"T_K_CBJ"},{"id":"119","name":"第二章  胸部外科疾病","pid":"68","status":"0","pic":null,"pai":"0","zong":"20","zuo":"0","ban_ben":"11518","jianjie":"","xishu":"1.00","yizuo":"4344","ti_ping_num":"0","image":"","des":"","type_id":"119","biao_name":"T_K_BBJ"},{"id":"220","name":"    第一节 胸部损伤","pid":"68","status":"0","pic":null,"pai":"0","zong":"158","zuo":"0","ban_ben":"13113","jianjie":"    第一节 胸部损伤","xishu":"0.00","yizuo":"251","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-05/5e895170c266e.png","des":"    第一节 胸部损伤","type_id":"220","biao_name":"T_K_CCA"},{"id":"221","name":"    第二节 胸壁疾病","pid":"68","status":"0","pic":null,"pai":"0","zong":"44","zuo":"0","ban_ben":"0","jianjie":"    第二节 胸壁疾病","xishu":"0.00","yizuo":"71","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-05/5e897b2f36599.png","des":"    第二节 胸壁疾病","type_id":"221","biao_name":"T_K_CCB"},{"id":"222","name":"    第三节 纵隔疾病","pid":"68","status":"0","pic":null,"pai":"0","zong":"60","zuo":"0","ban_ben":"12870","jianjie":"    第三节 纵隔疾病","xishu":"0.00","yizuo":"67","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-05/5e899bfd18382.png","des":"    第三节 纵隔疾病","type_id":"222","biao_name":"T_K_CCC"},{"id":"223","name":"    第四节 脓胸","pid":"68","status":"0","pic":null,"pai":"0","zong":"83","zuo":"0","ban_ben":"0","jianjie":"    第四节 脓胸","xishu":"0.00","yizuo":"47","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-06/5e8aa28f93903.png","des":"    第四节 脓胸","type_id":"223","biao_name":"T_K_CCD"},{"id":"224","name":"    第五节 肺部疾病","pid":"68","status":"0","pic":null,"pai":"0","zong":"118","zuo":"0","ban_ben":"0","jianjie":"    第五节 肺部疾病","xishu":"0.00","yizuo":"105","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-06/5e8af16cd7fc1.png","des":"    第五节 肺部疾病","type_id":"224","biao_name":"T_K_CCE"},{"id":"225","name":"    第六节 食管疾病","pid":"68","status":"0","pic":null,"pai":"0","zong":"87","zuo":"0","ban_ben":"12876","jianjie":"    第六节 食管疾病","xishu":"0.00","yizuo":"94","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-07/5e8c332fc11ee.png","des":"    第六节 食管疾病","type_id":"225","biao_name":"T_K_CCF"},{"id":"226","name":"    第七节 心脏疾病","pid":"68","status":"0","pic":null,"pai":"0","zong":"153","zuo":"0","ban_ben":"13098","jianjie":"    第七节 心脏疾病","xishu":"0.00","yizuo":"63","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-08/5e8d2e90cd279.png","des":"    第七节 心脏疾病","type_id":"226","biao_name":"T_K_CCG"},{"id":"139","name":"第三章  普通外科","pid":"69","status":"0","pic":null,"pai":"0","zong":"397","zuo":"0","ban_ben":"11538","jianjie":"","xishu":"1.00","yizuo":"6903","ti_ping_num":"0","image":"","des":"","type_id":"139","biao_name":"T_K_BDJ"},{"id":"227","name":"    第一节 颈部疾病","pid":"69","status":"0","pic":null,"pai":"0","zong":"60","zuo":"0","ban_ben":"0","jianjie":"    第一节 颈部疾病","xishu":"0.00","yizuo":"703","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-08/5e8d7d4e1c887.png","des":"    第一节 颈部疾病","type_id":"227","biao_name":"T_K_CCH"},{"id":"228","name":"    第二节 乳腺疾病","pid":"69","status":"0","pic":null,"pai":"0","zong":"52","zuo":"0","ban_ben":"0","jianjie":"    第二节 乳腺疾病","xishu":"0.00","yizuo":"505","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-08/5e8d635da866d.png","des":"    第二节 乳腺疾病","type_id":"228","biao_name":"T_K_CCI"},{"id":"229","name":"    第三节 腹部损伤","pid":"69","status":"0","pic":null,"pai":"0","zong":"54","zuo":"0","ban_ben":"0","jianjie":"    第三节 腹部损伤","xishu":"0.00","yizuo":"228","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-08/5e8d7da12c527.png","des":"    第三节 腹部损伤","type_id":"229","biao_name":"T_K_CCJ"},{"id":"230","name":"    第四节 急性化脓性腹膜炎","pid":"69","status":"0","pic":null,"pai":"0","zong":"58","zuo":"0","ban_ben":"0","jianjie":"    第四节 急性化脓性腹膜炎","xishu":"0.00","yizuo":"156","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-08/5e8d8f110c3c5.png","des":"    第四节 急性化脓性腹膜炎","type_id":"230","biao_name":"T_K_CDA"},{"id":"231","name":"    第五节 胃十二指肠","pid":"69","status":"0","pic":null,"pai":"0","zong":"179","zuo":"0","ban_ben":"13099","jianjie":"    第五节 胃十二指肠","xishu":"0.00","yizuo":"346","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-09/5e8e9096db0f6.png","des":"    第五节 胃十二指肠","type_id":"231","biao_name":"T_K_CDB"},{"id":"232","name":"    第六节 肠疾病","pid":"69","status":"0","pic":null,"pai":"0","zong":"164","zuo":"0","ban_ben":"0","jianjie":"    第六节 肠疾病","xishu":"0.00","yizuo":"268","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-09/5e8ed0df0bf96.png","des":"    第六节 肠疾病","type_id":"232","biao_name":"T_K_CDC"},{"id":"233","name":"    第七节 阑尾炎","pid":"69","status":"0","pic":null,"pai":"0","zong":"84","zuo":"0","ban_ben":"0","jianjie":"    第七节 阑尾炎","xishu":"0.00","yizuo":"323","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-09/5e8eedabdd7c1.png","des":"    第七节 阑尾炎","type_id":"233","biao_name":"T_K_CDD"},{"id":"234","name":"    第八节 直肠肛管","pid":"69","status":"0","pic":null,"pai":"0","zong":"122","zuo":"0","ban_ben":"0","jianjie":"    第八节 直肠肛管","xishu":"0.00","yizuo":"163","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-10/5e900cc0532dd.png","des":"    第八节 直肠肛管","type_id":"234","biao_name":"T_K_CDE"},{"id":"235","name":"    第九节 肝脏疾病","pid":"69","status":"0","pic":null,"pai":"0","zong":"77","zuo":"0","ban_ben":"13101","jianjie":"    第九节 肝脏疾病","xishu":"0.00","yizuo":"397","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-10/5e9020cec1d04.png","des":"    第九节 肝脏疾病","type_id":"235","biao_name":"T_K_CDF"},{"id":"236","name":"    第十节 门静脉高压症","pid":"69","status":"0","pic":null,"pai":"0","zong":"53","zuo":"0","ban_ben":"0","jianjie":"    第十节 门静脉高压症","xishu":"0.00","yizuo":"177","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-10/5e902acb965b8.png","des":"    第十节 门静脉高压症","type_id":"236","biao_name":"T_K_CDG"},{"id":"237","name":"    第十一节 胆道疾病","pid":"69","status":"0","pic":null,"pai":"0","zong":"111","zuo":"0","ban_ben":"0","jianjie":"    第十一节 胆道疾病","xishu":"0.00","yizuo":"269","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-10/5e9050144a3ea.png","des":"    第十一节 胆道疾病","type_id":"237","biao_name":"T_K_CDH"},{"id":"238","name":"    第十二节 胰腺疾病","pid":"69","status":"0","pic":null,"pai":"0","zong":"92","zuo":"0","ban_ben":"0","jianjie":"    第十二节 胰腺疾病","xishu":"0.00","yizuo":"218","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-11/5e913436ec754.png","des":"    第十二节 胰腺疾病","type_id":"238","biao_name":"T_K_CDI"},{"id":"239","name":"    第十三节 脾切除","pid":"69","status":"0","pic":null,"pai":"0","zong":"35","zuo":"0","ban_ben":"0","jianjie":"    第十三节 脾切除","xishu":"0.00","yizuo":"88","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-11/5e91575561eb0.png","des":"    第十三节 脾切除","type_id":"239","biao_name":"T_K_CDJ"},{"id":"121","name":"第四章  泌尿、男性生殖系统外科疾病","pid":"70","status":"0","pic":null,"pai":"0","zong":"20","zuo":"0","ban_ben":"11539","jianjie":"","xishu":"1.00","yizuo":"3948","ti_ping_num":"0","image":"","des":"","type_id":"121","biao_name":"T_K_BCB"},{"id":"240","name":"    第一节 解剖与生理","pid":"70","status":"0","pic":null,"pai":"0","zong":"57","zuo":"0","ban_ben":"0","jianjie":"    第一节 解剖与生理","xishu":"0.00","yizuo":"137","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-11/5e91783674ab7.png","des":"    第一节 解剖与生理","type_id":"240","biao_name":"T_K_CEA"},{"id":"241","name":"    第二节 泌尿诊断","pid":"70","status":"0","pic":null,"pai":"0","zong":"90","zuo":"0","ban_ben":"0","jianjie":"    第二节 泌尿诊断","xishu":"0.00","yizuo":"103","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-11/5e918d43e8c78.png","des":"    第二节 泌尿诊断","type_id":"241","biao_name":"T_K_CEB"},{"id":"242","name":"    第三节 畸形","pid":"70","status":"0","pic":null,"pai":"0","zong":"49","zuo":"0","ban_ben":"0","jianjie":"    第三节 畸形","xishu":"0.00","yizuo":"51","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-11/5e9199126b023.png","des":"    第三节 畸形","type_id":"242","biao_name":"T_K_CEC"},{"id":"243","name":"    第四节 泌尿损伤","pid":"70","status":"0","pic":null,"pai":"0","zong":"115","zuo":"0","ban_ben":"0","jianjie":"    第四节 泌尿损伤","xishu":"0.00","yizuo":"78","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-12/5e929aabe426c.png","des":"    第四节 泌尿损伤","type_id":"243","biao_name":"T_K_CED"},{"id":"245","name":"    第五节 泌尿感染","pid":"70","status":"0","pic":null,"pai":"0","zong":"79","zuo":"0","ban_ben":"0","jianjie":"    第五节 泌尿感染","xishu":"0.00","yizuo":"43","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-12/5e92b492da689.png","des":"    第五节 泌尿感染","type_id":"245","biao_name":"T_K_CEF"},{"id":"246","name":"    第六节 泌尿结核","pid":"70","status":"0","pic":null,"pai":"0","zong":"93","zuo":"0","ban_ben":"12877","jianjie":"    第六节 泌尿结核","xishu":"0.00","yizuo":"40","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-12/5e92d12c3cd2a.png","des":"    第六节 泌尿结核","type_id":"246","biao_name":"T_K_CEG"},{"id":"247","name":"    第七节 泌尿梗阻","pid":"70","status":"0","pic":null,"pai":"0","zong":"88","zuo":"0","ban_ben":"0","jianjie":"    第七节 泌尿梗阻","xishu":"0.00","yizuo":"41","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-12/5e92ed39298fb.png","des":"    第七节 泌尿梗阻","type_id":"247","biao_name":"T_K_CEH"},{"id":"248","name":"    第八节 尿石症","pid":"70","status":"0","pic":null,"pai":"0","zong":"132","zuo":"0","ban_ben":"13114","jianjie":"    第八节 尿石症","xishu":"0.00","yizuo":"58","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-13/5e93da0f90a1f.png","des":"    第八节 尿石症","type_id":"248","biao_name":"T_K_CEI"},{"id":"249","name":"    第九节 泌尿系统肿瘤","pid":"70","status":"0","pic":null,"pai":"0","zong":"137","zuo":"0","ban_ben":"0","jianjie":"    第九节 泌尿系统肿瘤","xishu":"0.00","yizuo":"101","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-13/5e942b48b600c.png","des":"    第九节 泌尿系统肿瘤","type_id":"249","biao_name":"T_K_CEJ"},{"id":"250","name":"    第十节 泌尿其它疾病","pid":"70","status":"0","pic":null,"pai":"0","zong":"74","zuo":"0","ban_ben":"13116","jianjie":"    第十节 泌尿其它疾病","xishu":"0.00","yizuo":"40","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-13/5e9438738432b.png","des":"    第十节 泌尿其它疾病","type_id":"250","biao_name":"T_K_CFA"},{"id":"101","name":"第五章  骨科","pid":"71","status":"0","pic":null,"pai":"0","zong":"218","zuo":"0","ban_ben":"11549","jianjie":"","xishu":"1.00","yizuo":"4432","ti_ping_num":"0","image":"","des":"","type_id":"101","biao_name":"T_K_BAB"},{"id":"251","name":"    第一节 骨折概述","pid":"71","status":"0","pic":null,"pai":"0","zong":"129","zuo":"0","ban_ben":"13112","jianjie":"    第一节 骨折概述","xishu":"0.00","yizuo":"211","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-16/5e980b8594b25.png","des":"    第一节 骨折概述","type_id":"251","biao_name":"T_K_CFB"},{"id":"252","name":"    第二节 上肢骨","pid":"71","status":"0","pic":null,"pai":"0","zong":"122","zuo":"0","ban_ben":"13103","jianjie":"    第二节 上肢骨","xishu":"0.00","yizuo":"86","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-16/5e9831edddc9f.png","des":"    第二节 上肢骨","type_id":"252","biao_name":"T_K_CFC"},{"id":"253","name":"    第三节 手外伤","pid":"71","status":"0","pic":null,"pai":"0","zong":"83","zuo":"0","ban_ben":"0","jianjie":"    第三节 手外伤","xishu":"0.00","yizuo":"37","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-18/5e9a7752686af.png","des":"    第三节 手外伤","type_id":"253","biao_name":"T_K_CFD"},{"id":"254","name":"    第四节 下肢骨关节损伤","pid":"71","status":"0","pic":null,"pai":"0","zong":"100","zuo":"0","ban_ben":"0","jianjie":"    第四节 下肢骨关节损伤","xishu":"0.00","yizuo":"49","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-18/5e9aca22d1052.png","des":"    第四节 下肢骨关节损伤","type_id":"254","biao_name":"T_K_CFE"},{"id":"255","name":"    第五节 脊柱、骨盆骨折","pid":"71","status":"0","pic":null,"pai":"0","zong":"93","zuo":"0","ban_ben":"0","jianjie":"    第五节 脊柱、骨盆骨折","xishu":"0.00","yizuo":"32","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-19/5e9be2fd27b88.png","des":"    第五节 脊柱、骨盆骨折","type_id":"255","biao_name":"T_K_CFF"},{"id":"256","name":"    第六节 周围神经损伤","pid":"71","status":"0","pic":null,"pai":"0","zong":"39","zuo":"0","ban_ben":"0","jianjie":"    第六节 周围神经损伤","xishu":"0.00","yizuo":"46","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-19/5e9c024d13758.png","des":"    第六节 周围神经损伤","type_id":"256","biao_name":"T_K_CFG"},{"id":"257","name":"    第七节 运动系统损伤","pid":"71","status":"0","pic":null,"pai":"0","zong":"74","zuo":"0","ban_ben":"0","jianjie":"    第七节 运动系统损伤","xishu":"0.00","yizuo":"53","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-19/5e9c218ea00e7.png","des":"    第七节 运动系统损伤","type_id":"257","biao_name":"T_K_CFH"},{"id":"258","name":"    第八节 腰椎、颈疾病","pid":"71","status":"0","pic":null,"pai":"0","zong":"141","zuo":"0","ban_ben":"13026","jianjie":"    第八节 腰椎、颈疾病","xishu":"0.00","yizuo":"117","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-20/5e9d6b603efc2.png","des":"    第八节 腰椎、颈疾病","type_id":"258","biao_name":"T_K_CFI"},{"id":"259","name":"    第九节 骨与关节化脓性感染","pid":"71","status":"0","pic":null,"pai":"0","zong":"99","zuo":"0","ban_ben":"0","jianjie":"    第九节 骨与关节化脓性感染","xishu":"0.00","yizuo":"38","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-21/5e9ea1feeb336.png","des":"    第九节 骨与关节化脓性感染","type_id":"259","biao_name":"T_K_CFJ"},{"id":"260","name":"    第十节 骨与关节结核","pid":"71","status":"0","pic":null,"pai":"0","zong":"100","zuo":"0","ban_ben":"0","jianjie":"    第十节 骨与关节结核","xishu":"0.00","yizuo":"41","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-21/5e9ec203053e2.png","des":"    第十节 骨与关节结核","type_id":"260","biao_name":"T_K_CGA"},{"id":"261","name":"    第十一节 非化脓性关节炎","pid":"71","status":"0","pic":null,"pai":"0","zong":"76","zuo":"0","ban_ben":"0","jianjie":"    第十一节 非化脓性关节炎","xishu":"0.00","yizuo":"28","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-22/5e9fb64c97713.png","des":"    第十一节 非化脓性关节炎","type_id":"261","biao_name":"T_K_CGB"},{"id":"262","name":"    第十二节 运动系统畸形","pid":"71","status":"0","pic":null,"pai":"0","zong":"49","zuo":"0","ban_ben":"13104","jianjie":"    第十二节 运动系统畸形","xishu":"0.00","yizuo":"51","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-22/5e9fec45bc103.png","des":"    第十二节 运动系统畸形","type_id":"262","biao_name":"T_K_CGC"},{"id":"263","name":"    第十三节 骨肿瘤","pid":"71","status":"0","pic":null,"pai":"0","zong":"71","zuo":"0","ban_ben":"0","jianjie":"    第十三节 骨肿瘤","xishu":"0.00","yizuo":"128","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-22/5ea015f7513ae.png","des":"    第十三节 骨肿瘤","type_id":"263","biao_name":"T_K_CGD"},{"id":"265","name":"第六章 神经外科","pid":"264","status":"0","pic":null,"pai":"0","zong":"188","zuo":"0","ban_ben":"0","jianjie":"第六章 神经外科","xishu":"0.00","yizuo":"47","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-25/5ea3b33a79b49.png","des":"第六章 神经外科","type_id":"265","biao_name":"T_K_CGF"},{"id":"266","name":"    第一节 颅脑损伤","pid":"264","status":"0","pic":null,"pai":"0","zong":"52","zuo":"0","ban_ben":"0","jianjie":"    第一节 颅脑损伤","xishu":"0.00","yizuo":"37","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-25/5ea3cb04d4c87.png","des":"    第一节 颅脑损伤","type_id":"266","biao_name":"T_K_CGG"},{"id":"267","name":"    第二节 颅脑和脊椎先天畸形","pid":"264","status":"0","pic":null,"pai":"0","zong":"57","zuo":"0","ban_ben":"13070","jianjie":"    第二节 颅脑和脊椎先天畸形","xishu":"0.00","yizuo":"11","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-25/5ea3dcf5662a5.png","des":"    第二节 颅脑和脊椎先天畸形","type_id":"267","biao_name":"T_K_CGH"},{"id":"268","name":"    第三节 颅内肿瘤","pid":"264","status":"0","pic":null,"pai":"0","zong":"51","zuo":"0","ban_ben":"0","jianjie":"    第三节 颅内肿瘤","xishu":"0.00","yizuo":"16","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-25/5ea3e5e2bd8c3.png","des":"    第三节 颅内肿瘤","type_id":"268","biao_name":"T_K_CGI"},{"id":"269","name":"    第四节 椎管内肿瘤","pid":"264","status":"0","pic":null,"pai":"0","zong":"58","zuo":"0","ban_ben":"0","jianjie":"    第四节 椎管内肿瘤","xishu":"0.00","yizuo":"10","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-25/5ea3f79cce34b.png","des":"    第四节 椎管内肿瘤","type_id":"269","biao_name":"T_K_CGJ"},{"id":"270","name":"    第五节 血管性疾病","pid":"264","status":"0","pic":null,"pai":"0","zong":"161","zuo":"0","ban_ben":"0","jianjie":"    第五节 血管性疾病","xishu":"0.00","yizuo":"70","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-04-26/5ea4eda512935.png","des":"    第五节 血管性疾病","type_id":"270","biao_name":"T_K_CHA"}]},{"id":"22","name":"生理学","pid":"0","status":"1","pic":null,"pai":"3","zong":"0","zuo":"0","ban_ben":"0","jianjie":"针对第九版教材，解析最全，正确率最高","xishu":"1.00","yizuo":"0","ti_ping_num":"264","image":"","des":"","type_id":"22","z_type":[{"id":"88","name":"第一章  绪论","pid":"23","status":"0","pic":null,"pai":"10","zong":"25","zuo":"0","ban_ben":"10681","jianjie":"","xishu":"1.00","yizuo":"8163","ti_ping_num":"0","image":"","des":"","type_id":"88","biao_name":"T_K_II"},{"id":"103","name":"第二章  细胞的基本功能","pid":"24","status":"0","pic":null,"pai":"0","zong":"92","zuo":"0","ban_ben":"10766","jianjie":"","xishu":"1.00","yizuo":"6107","ti_ping_num":"0","image":"","des":"","type_id":"103","biao_name":"T_K_BAD"},{"id":"98","name":"第三章  呼吸","pid":"14","status":"0","pic":null,"pai":"0","zong":"86","zuo":"0","ban_ben":"11413","jianjie":"","xishu":"1.00","yizuo":"4396","ti_ping_num":"0","image":"","des":"","type_id":"98","biao_name":"T_K_JI"},{"id":"106","name":"第四章  消化和吸收","pid":"2","status":"0","pic":null,"pai":"0","zong":"77","zuo":"0","ban_ben":"11415","jianjie":"","xishu":"1.00","yizuo":"3880","ti_ping_num":"0","image":"","des":"","type_id":"106","biao_name":"T_K_BAG"},{"id":"104","name":"第五章  能量代谢和体温","pid":"11","status":"0","pic":null,"pai":"0","zong":"36","zuo":"0","ban_ben":"11417","jianjie":"","xishu":"1.00","yizuo":"3415","ti_ping_num":"0","image":"","des":"","type_id":"104","biao_name":"T_K_BAE"},{"id":"115","name":"第六章  神经系统","pid":"13","status":"0","pic":null,"pai":"0","zong":"24","zuo":"0","ban_ben":"11157","jianjie":"","xishu":"1.00","yizuo":"3251","ti_ping_num":"0","image":"","des":"","type_id":"115","biao_name":"T_K_BBF"},{"id":"105","name":"第七章  内分泌","pid":"19","status":"0","pic":null,"pai":"0","zong":"73","zuo":"0","ban_ben":"11419","jianjie":"","xishu":"1.00","yizuo":"3299","ti_ping_num":"0","image":"","des":"","type_id":"105","biao_name":"T_K_BAF"},{"id":"107","name":"第八章  生殖","pid":"20","status":"0","pic":null,"pai":"0","zong":"22","zuo":"0","ban_ben":"3648","jianjie":"","xishu":"1.00","yizuo":"3063","ti_ping_num":"0","image":"","des":"","type_id":"107","biao_name":"T_K_BAH"},{"id":"161","name":"第八章  生殖（续）","pid":"20","status":"0","pic":null,"pai":"0","zong":"18","zuo":"0","ban_ben":"11420","jianjie":"","xishu":"1.00","yizuo":"2910","ti_ping_num":"0","image":"","des":"","type_id":"161","biao_name":"T_K_BGB"},{"id":"108","name":"第九章  血液","pid":"89","status":"0","pic":null,"pai":"0","zong":"52","zuo":"0","ban_ben":"11407","jianjie":"","xishu":"1.00","yizuo":"3885","ti_ping_num":"0","image":"","des":"","type_id":"108","biao_name":"T_K_BAI"},{"id":"111","name":"第十章  血液循环","pid":"93","status":"0","pic":null,"pai":"0","zong":"125","zuo":"0","ban_ben":"11411","jianjie":"","xishu":"1.00","yizuo":"4129","ti_ping_num":"0","image":"","des":"","type_id":"111","biao_name":"T_K_BBB"},{"id":"100","name":"第十一章  尿的生成和排出","pid":"96","status":"0","pic":null,"pai":"0","zong":"72","zuo":"0","ban_ben":"11082","jianjie":"","xishu":"1.00","yizuo":"3553","ti_ping_num":"0","image":"","des":"","type_id":"100","biao_name":"T_K_BAA"},{"id":"159","name":"第十二章  感觉器官","pid":"157","status":"0","pic":null,"pai":"0","zong":"44","zuo":"0","ban_ben":"11088","jianjie":"","xishu":"1.00","yizuo":"2983","ti_ping_num":"0","image":"","des":"","type_id":"159","biao_name":"T_K_BFJ"},{"id":"163","name":"第十三章  神经系统","pid":"162","status":"0","pic":null,"pai":"0","zong":"103","zuo":"0","ban_ben":"11181","jianjie":"","xishu":"1.00","yizuo":"3373","ti_ping_num":"0","image":"","des":"","type_id":"163","biao_name":"T_K_BGD"}]},{"id":"42","name":"病理学","pid":"0","status":"1","pic":null,"pai":"2","zong":"0","zuo":"0","ban_ben":"0","jianjie":"全国一线名师提供最精细、权威题库","xishu":"1.00","yizuo":"2000","ti_ping_num":"0","image":"","des":"","type_id":"42","z_type":[{"id":"140","name":"第一章  局部血液循环障碍","pid":"45","status":"0","pic":null,"pai":"0","zong":"36","zuo":"0","ban_ben":"1759","jianjie":"","xishu":"1.00","yizuo":"5477","ti_ping_num":"0","image":"","des":"","type_id":"140","biao_name":"T_K_BEA"},{"id":"285","name":"  第一节 局部血液循环障碍","pid":"45","status":"0","pic":null,"pai":"0","zong":"116","zuo":"0","ban_ben":"0","jianjie":"  第一节 局部血液循环障碍","xishu":"0.00","yizuo":"161","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6979be1f0.jpg","des":"  第一节 局部血液循环障碍","type_id":"285","biao_name":"T_K_CIF"},{"id":"128","name":"第二章  细胞和组织的适应与损伤","pid":"43","status":"0","pic":null,"pai":"0","zong":"65","zuo":"0","ban_ben":"11445","jianjie":"","xishu":"1.00","yizuo":"4713","ti_ping_num":"0","image":"","des":"","type_id":"128","biao_name":"T_K_BCI"},{"id":"141","name":"第三章  损伤的修复","pid":"44","status":"0","pic":null,"pai":"0","zong":"22","zuo":"0","ban_ben":"1499","jianjie":"","xishu":"1.00","yizuo":"3765","ti_ping_num":"0","image":"","des":"","type_id":"141","biao_name":"T_K_BEB"},{"id":"143","name":"第四章  炎症","pid":"46","status":"0","pic":null,"pai":"0","zong":"63","zuo":"0","ban_ben":"11448","jianjie":"","xishu":"1.00","yizuo":"3733","ti_ping_num":"0","image":"","des":"","type_id":"143","biao_name":"T_K_BED"},{"id":"286","name":"  第一节 炎症","pid":"46","status":"0","pic":null,"pai":"0","zong":"116","zuo":"0","ban_ben":"0","jianjie":"  第一节 炎症","xishu":"0.00","yizuo":"67","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6a232c4fd.jpg","des":"  第一节 炎症","type_id":"286","biao_name":"T_K_CIG"},{"id":"144","name":"第五章  肿瘤","pid":"47","status":"0","pic":null,"pai":"0","zong":"74","zuo":"0","ban_ben":"11450","jianjie":"","xishu":"1.00","yizuo":"3295","ti_ping_num":"0","image":"","des":"","type_id":"144","biao_name":"T_K_BEE"},{"id":"287","name":"  第一节 肿瘤","pid":"47","status":"0","pic":null,"pai":"0","zong":"77","zuo":"0","ban_ben":"0","jianjie":"  第一节 肿瘤","xishu":"0.00","yizuo":"46","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6d64dec6e.jpg","des":"  第一节 肿瘤","type_id":"287","biao_name":"T_K_CIH"},{"id":"146","name":"第六章  免疫病理","pid":"48","status":"0","pic":null,"pai":"0","zong":"21","zuo":"0","ban_ben":"11451","jianjie":"","xishu":"1.00","yizuo":"3546","ti_ping_num":"0","image":"","des":"","type_id":"146","biao_name":"T_K_BEG"},{"id":"147","name":"第七章  心血管系统疾病","pid":"49","status":"0","pic":null,"pai":"0","zong":"51","zuo":"0","ban_ben":"11453","jianjie":"","xishu":"1.00","yizuo":"3408","ti_ping_num":"0","image":"","des":"","type_id":"147","biao_name":"T_K_BEH"},{"id":"288","name":"  第一节 心血管系统疾病","pid":"49","status":"0","pic":null,"pai":"0","zong":"46","zuo":"0","ban_ben":"0","jianjie":"  第一节 心血管系统疾病","xishu":"0.00","yizuo":"38","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6db02cea5.jpg","des":"  第一节 心血管系统疾病","type_id":"288","biao_name":"T_K_CII"},{"id":"148","name":"第八章  呼吸系统疾病","pid":"50","status":"0","pic":null,"pai":"0","zong":"51","zuo":"0","ban_ben":"11454","jianjie":"","xishu":"1.00","yizuo":"3203","ti_ping_num":"0","image":"","des":"","type_id":"148","biao_name":"T_K_BEI"},{"id":"289","name":"  第一节 呼吸系统疾病","pid":"50","status":"0","pic":null,"pai":"0","zong":"47","zuo":"0","ban_ben":"0","jianjie":"  第一节 呼吸系统疾病","xishu":"0.00","yizuo":"39","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6df9c5640.jpg","des":"  第一节 呼吸系统疾病","type_id":"289","biao_name":"T_K_CIJ"},{"id":"150","name":"第九章  消化系统疾病","pid":"51","status":"0","pic":null,"pai":"0","zong":"72","zuo":"0","ban_ben":"11457","jianjie":"","xishu":"1.00","yizuo":"3281","ti_ping_num":"0","image":"","des":"","type_id":"150","biao_name":"T_K_BFA"},{"id":"290","name":"  第一节 消化系统疾病","pid":"51","status":"0","pic":null,"pai":"0","zong":"109","zuo":"0","ban_ben":"0","jianjie":"  第一节 消化系统疾病","xishu":"0.00","yizuo":"39","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6e5c4230c.jpg","des":"  第一节 消化系统疾病","type_id":"290","biao_name":"T_K_CJA"},{"id":"152","name":"第十章  淋巴造血系统疾病","pid":"52","status":"0","pic":null,"pai":"0","zong":"30","zuo":"0","ban_ben":"2931","jianjie":"","xishu":"1.00","yizuo":"4011","ti_ping_num":"0","image":"","des":"","type_id":"152","biao_name":"T_K_BFC"},{"id":"153","name":"第十一章  泌尿系统疾病","pid":"53","status":"0","pic":null,"pai":"0","zong":"38","zuo":"0","ban_ben":"11458","jianjie":"","xishu":"1.00","yizuo":"3406","ti_ping_num":"0","image":"","des":"","type_id":"153","biao_name":"T_K_BFD"},{"id":"291","name":"  第一节 泌尿系统疾病","pid":"53","status":"0","pic":null,"pai":"0","zong":"47","zuo":"0","ban_ben":"0","jianjie":"  第一节 泌尿系统疾病","xishu":"0.00","yizuo":"46","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-08-21/5f3f85e7d967b.jpg","des":"  第一节 泌尿系统疾病","type_id":"291","biao_name":"T_K_CJB"},{"id":"156","name":"第十二章  生殖系统疾病","pid":"54","status":"0","pic":null,"pai":"0","zong":"23","zuo":"0","ban_ben":"11459","jianjie":"","xishu":"1.00","yizuo":"3225","ti_ping_num":"0","image":"","des":"","type_id":"156","biao_name":"T_K_BFG"},{"id":"292","name":"  第一节 生殖系统疾病","pid":"54","status":"0","pic":null,"pai":"0","zong":"46","zuo":"0","ban_ben":"0","jianjie":"  第一节 生殖系统疾病","xishu":"0.00","yizuo":"43","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-08-21/5f3f866631901.jpg","des":"  第一节 生殖系统疾病","type_id":"292","biao_name":"T_K_CJC"},{"id":"158","name":"第十三章  内分泌系统疾病","pid":"55","status":"0","pic":null,"pai":"0","zong":"13","zuo":"0","ban_ben":"11461","jianjie":"","xishu":"1.00","yizuo":"3436","ti_ping_num":"0","image":"","des":"","type_id":"158","biao_name":"T_K_BFI"},{"id":"293","name":"  第一节 内分泌系统疾病","pid":"55","status":"0","pic":null,"pai":"0","zong":"100","zuo":"0","ban_ben":"0","jianjie":"  第一节 内分泌系统疾病","xishu":"0.00","yizuo":"51","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-08-21/5f3f86fc8e407.jpg","des":"  第一节 内分泌系统疾病","type_id":"293","biao_name":"T_K_CJD"},{"id":"155","name":"第十四章  传染病及寄生虫病","pid":"56","status":"0","pic":null,"pai":"0","zong":"67","zuo":"0","ban_ben":"11464","jianjie":"","xishu":"1.00","yizuo":"3565","ti_ping_num":"0","image":"","des":"","type_id":"155","biao_name":"T_K_BFF"},{"id":"127","name":"细胞和组织的适用与损伤","pid":"42","status":"0","pic":null,"pai":"0","zong":"1","zuo":"0","ban_ben":"1606","jianjie":"","xishu":"1.00","yizuo":"3479","ti_ping_num":"0","image":"","des":"","type_id":"127","biao_name":"T_K_BCH"}]},{"id":"37","name":"生物化学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"手把手让你考研初试冲刺高分","xishu":"1.00","yizuo":"2000","ti_ping_num":"0","image":"","des":"","type_id":"37","z_type":[{"id":"135","name":"第一章  生物大分子的结构和功能","pid":"38","status":"0","pic":null,"pai":"0","zong":"109","zuo":"0","ban_ben":"11423","jianjie":"","xishu":"1.00","yizuo":"5321","ti_ping_num":"0","image":"","des":"","type_id":"135","biao_name":"T_K_BDF"},{"id":"142","name":"第二章  物质代谢及调节","pid":"39","status":"0","pic":null,"pai":"0","zong":"252","zuo":"0","ban_ben":"11429","jianjie":"","xishu":"1.00","yizuo":"3690","ti_ping_num":"0","image":"","des":"","type_id":"142","biao_name":"T_K_BEC"},{"id":"149","name":"第三章  基因的信息传递","pid":"40","status":"0","pic":null,"pai":"0","zong":"173","zuo":"0","ban_ben":"11438","jianjie":"","xishu":"1.00","yizuo":"3117","ti_ping_num":"0","image":"","des":"","type_id":"149","biao_name":"T_K_BEJ"},{"id":"151","name":"第四章  生化专题","pid":"41","status":"0","pic":null,"pai":"0","zong":"85","zuo":"0","ban_ben":"11442","jianjie":"","xishu":"1.00","yizuo":"3293","ti_ping_num":"0","image":"","des":"","type_id":"151","biao_name":"T_K_BFB"}]},{"id":"72","name":"临床医学人文精神","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"","xishu":"1.00","yizuo":"2003","ti_ping_num":"0","image":"","des":"","type_id":"72","z_type":[{"id":"188","name":"医学人文","pid":"187","status":"0","pic":null,"pai":"0","zong":"16","zuo":"0","ban_ben":"11557","jianjie":"","xishu":"1.00","yizuo":"4667","ti_ping_num":"0","image":"","des":"","type_id":"188","biao_name":"T_K_BII"}]}]
     * fen : 0
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

    public static class UTypeBean implements Serializable {
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
                    ", ti_ping_num='" + ti_ping_num + '\'' +
                    ", image='" + image + '\'' +
                    ", des='" + des + '\'' +
                    ", type_id='" + type_id + '\'' +
                    ", z_type=" + z_type +
                    '}';
        }

        /**
         * id : 57
         * name : 内科学
         * pid : 0
         * status : 1
         * pic : null
         * pai : 5
         * zong : 0
         * zuo : 0
         * ban_ben : 0
         * jianjie : 医学考研一线名师反复审查
         * xishu : 1.00
         * yizuo : 2002
         * ti_ping_num : 0
         * image :
         * des :
         * type_id : 57
         * z_type : [{"id":"112","name":"第一章  诊断学","pid":"58","status":"0","pic":null,"pai":"0","zong":"56","zuo":"0","ban_ben":"12456","jianjie":"","xishu":"1.00","yizuo":"7922","ti_ping_num":"0","image":"","des":"","type_id":"112","biao_name":"T_K_BBC"},{"id":"114","name":"第二章  呼吸系统疾病","pid":"59","status":"0","pic":null,"pai":"0","zong":"220","zuo":"0","ban_ben":"11479","jianjie":"","xishu":"1.00","yizuo":"9263","ti_ping_num":"0","image":"","des":"","type_id":"114","biao_name":"T_K_BBE"},{"id":"116","name":"第三章  循环系统疾病","pid":"60","status":"0","pic":null,"pai":"0","zong":"258","zuo":"0","ban_ben":"11486","jianjie":"","xishu":"1.00","yizuo":"6103","ti_ping_num":"0","image":"","des":"","type_id":"116","biao_name":"T_K_BBG"},{"id":"117","name":"第四章  消化系统疾病和中毒","pid":"61","status":"0","pic":null,"pai":"0","zong":"243","zuo":"0","ban_ben":"11495","jianjie":"","xishu":"1.00","yizuo":"5521","ti_ping_num":"0","image":"","des":"","type_id":"117","biao_name":"T_K_BBH"},{"id":"271","name":"    第一节 问诊技巧与症状","pid":"61","status":"0","pic":null,"pai":"0","zong":"69","zuo":"0","ban_ben":"0","jianjie":"    第一节 问诊技巧与症状","xishu":"0.00","yizuo":"265","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd21319416.png","des":"    第一节 问诊技巧与症状","type_id":"271","biao_name":"T_K_CHB"},{"id":"272","name":"    第二节 胃食管反流病","pid":"61","status":"0","pic":null,"pai":"0","zong":"45","zuo":"0","ban_ben":"0","jianjie":"    第二节 胃食管反流病","xishu":"0.00","yizuo":"503","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd28a456dc.png","des":"    第二节 胃食管反流病","type_id":"272","biao_name":"T_K_CHC"},{"id":"273","name":"    第三节 食管癌","pid":"61","status":"0","pic":null,"pai":"0","zong":"24","zuo":"0","ban_ben":"0","jianjie":"    第三节 食管癌","xishu":"0.00","yizuo":"202","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd34274b8c.png","des":"    第三节 食管癌","type_id":"273","biao_name":"T_K_CHD"},{"id":"274","name":"    第四节 急性与慢性胃炎","pid":"61","status":"0","pic":null,"pai":"0","zong":"125","zuo":"0","ban_ben":"13115","jianjie":"    第四节 急性与慢性胃炎","xishu":"0.00","yizuo":"200","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd3a1d119c.png","des":"    第四节 急性与慢性胃炎","type_id":"274","biao_name":"T_K_CHE"},{"id":"275","name":"    第五节 消化性溃疡","pid":"61","status":"0","pic":null,"pai":"0","zong":"201","zuo":"0","ban_ben":"13089","jianjie":"    第五节 消化性溃疡","xishu":"0.00","yizuo":"183","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd4831d25a.png","des":"    第五节 消化性溃疡","type_id":"275","biao_name":"T_K_CHF"},{"id":"276","name":"    第六节 胃癌","pid":"61","status":"0","pic":null,"pai":"0","zong":"43","zuo":"0","ban_ben":"13088","jianjie":"    第六节 胃癌","xishu":"0.00","yizuo":"95","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd523ac613.png","des":"    第六节 胃癌","type_id":"276","biao_name":"T_K_CHG"},{"id":"277","name":"    第七节 肠结核与腹膜炎","pid":"61","status":"0","pic":null,"pai":"0","zong":"81","zuo":"0","ban_ben":"0","jianjie":"    第七节 肠结核与腹膜炎","xishu":"0.00","yizuo":"115","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd57451efe.png","des":"    第七节 肠结核与腹膜炎","type_id":"277","biao_name":"T_K_CHH"},{"id":"278","name":"    第八节 炎症性肠病","pid":"61","status":"0","pic":null,"pai":"0","zong":"161","zuo":"0","ban_ben":"0","jianjie":"    第八节 炎症性肠病","xishu":"0.00","yizuo":"96","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd5dfc7ba2.png","des":"    第八节 炎症性肠病","type_id":"278","biao_name":"T_K_CHI"},{"id":"279","name":"    第九节 功能性胃肠","pid":"61","status":"0","pic":null,"pai":"0","zong":"49","zuo":"0","ban_ben":"0","jianjie":"    第九节 功能性胃肠","xishu":"0.00","yizuo":"56","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd63d19c94.png","des":"    第九节 功能性胃肠","type_id":"279","biao_name":"T_K_CHJ"},{"id":"280","name":"    第十节 慢性腹泻","pid":"61","status":"0","pic":null,"pai":"0","zong":"25","zuo":"0","ban_ben":"0","jianjie":"    第十节 慢性腹泻","xishu":"0.00","yizuo":"50","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd680ec8cb.png","des":"    第十节 慢性腹泻","type_id":"280","biao_name":"T_K_CIA"},{"id":"281","name":"    第十一节 肝硬化","pid":"61","status":"0","pic":null,"pai":"0","zong":"147","zuo":"0","ban_ben":"0","jianjie":"    第十一节 肝硬化","xishu":"0.00","yizuo":"124","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd6cfdf5cd.png","des":"    第十一节 肝硬化","type_id":"281","biao_name":"T_K_CIB"},{"id":"282","name":"    第十二节 肝性脑病","pid":"61","status":"0","pic":null,"pai":"0","zong":"61","zuo":"0","ban_ben":"0","jianjie":"    第十二节 肝性脑病","xishu":"0.00","yizuo":"94","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd71de2011.png","des":"    第十二节 肝性脑病","type_id":"282","biao_name":"T_K_CIC"},{"id":"283","name":"    第十三节 原发性肝癌","pid":"61","status":"0","pic":null,"pai":"0","zong":"80","zuo":"0","ban_ben":"0","jianjie":"    第十三节 原发性肝癌","xishu":"0.00","yizuo":"82","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd760e7050.png","des":"    第十三节 原发性肝癌","type_id":"283","biao_name":"T_K_CID"},{"id":"284","name":"    第十四节 胰腺疾病","pid":"61","status":"0","pic":null,"pai":"0","zong":"88","zuo":"0","ban_ben":"0","jianjie":"    第十四节 胰腺疾病","xishu":"0.00","yizuo":"100","ti_ping_num":"0","image":"/Public/shop_xiang_qing/2020-05-02/5eacd7a6284f6.png","des":"    第十四节 胰腺疾病","type_id":"284","biao_name":"T_K_CIE"},{"id":"102","name":"第五章  泌尿系统疾病","pid":"62","status":"0","pic":null,"pai":"0","zong":"129","zuo":"0","ban_ben":"11500","jianjie":"","xishu":"1.00","yizuo":"4649","ti_ping_num":"0","image":"","des":"","type_id":"102","biao_name":"T_K_BAC"},{"id":"110","name":"第六章  血液系统疾病","pid":"63","status":"0","pic":null,"pai":"0","zong":"153","zuo":"0","ban_ben":"11505","jianjie":"","xishu":"1.00","yizuo":"4607","ti_ping_num":"0","image":"","des":"","type_id":"110","biao_name":"T_K_BBA"},{"id":"109","name":"第七章  内分泌系统和营养代谢疾病","pid":"64","status":"0","pic":null,"pai":"0","zong":"143","zuo":"0","ban_ben":"11510","jianjie":"","xishu":"1.00","yizuo":"4343","ti_ping_num":"0","image":"","des":"","type_id":"109","biao_name":"T_K_BAJ"},{"id":"122","name":"第八章  风湿性疾病","pid":"65","status":"0","pic":null,"pai":"0","zong":"37","zuo":"0","ban_ben":"11513","jianjie":"","xishu":"1.00","yizuo":"4047","ti_ping_num":"0","image":"","des":"","type_id":"122","biao_name":"T_K_BCC"}]
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
        private String ti_ping_num;
        private String image;
        private String des;
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

        public String getTi_ping_num() {
            return ti_ping_num;
        }

        public void setTi_ping_num(String ti_ping_num) {
            this.ti_ping_num = ti_ping_num;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
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

        public static class ZTypeBean implements Serializable {
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
                        ", ti_ping_num='" + ti_ping_num + '\'' +
                        ", image='" + image + '\'' +
                        ", des='" + des + '\'' +
                        ", type_id='" + type_id + '\'' +
                        ", biao_name='" + biao_name + '\'' +
                        '}';
            }

            /**
             * id : 112
             * name : 第一章  诊断学
             * pid : 58
             * status : 0
             * pic : null
             * pai : 0
             * zong : 56
             * zuo : 0
             * ban_ben : 12456
             * jianjie :
             * xishu : 1.00
             * yizuo : 7922
             * ti_ping_num : 0
             * image :
             * des :
             * type_id : 112
             * biao_name : T_K_BBC
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
            private String ti_ping_num;
            private String image;
            private String des;
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

            public String getTi_ping_num() {
                return ti_ping_num;
            }

            public void setTi_ping_num(String ti_ping_num) {
                this.ti_ping_num = ti_ping_num;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
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
