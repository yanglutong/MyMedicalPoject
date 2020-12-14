package com.yang.mymedicalpoject.fragment.homefragment.bean;

import java.io.Serializable;
import java.util.List;

public class HomeBean implements Serializable{

    /**
     * fen : 0
     * u_type : [{"ban_ben":"0","des":"","id":"57","image":"","jianjie":"医学考研一线名师反复审查","name":"内科学","pai":"5","pid":"0","status":"1","ti_ping_num":"0","type_id":"57","xishu":"1.00","yizuo":"2002","z_type":[{"ban_ben":"12456","biao_name":"T_K_BBC","des":"","id":"112","image":"","jianjie":"","name":"第一章  诊断学","pai":"0","pid":"58","status":"0","ti_ping_num":"0","type_id":"112","xishu":"1.00","yizuo":"7971","zong":"60","zuo":"0"},{"ban_ben":"11479","biao_name":"T_K_BBE","des":"","id":"114","image":"","jianjie":"","name":"第二章  呼吸系统疾病","pai":"0","pid":"59","status":"0","ti_ping_num":"0","type_id":"114","xishu":"1.00","yizuo":"9322","zong":"220","zuo":"0"},{"ban_ben":"11486","biao_name":"T_K_BBG","des":"","id":"116","image":"","jianjie":"","name":"第三章  循环系统疾病","pai":"0","pid":"60","status":"0","ti_ping_num":"0","type_id":"116","xishu":"1.00","yizuo":"6139","zong":"258","zuo":"0"},{"ban_ben":"11495","biao_name":"T_K_BBH","des":"","id":"117","image":"","jianjie":"","name":"第四章  消化系统疾病和中毒","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"117","xishu":"1.00","yizuo":"5532","zong":"243","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHB","des":"    第一节 问诊技巧与症状","id":"271","image":"/Public/shop_xiang_qing/2020-05-02/5eacd21319416.png","jianjie":"    第一节 问诊技巧与症状","name":"    第一节 问诊技巧与症状","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"271","xishu":"0.00","yizuo":"272","zong":"69","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHC","des":"    第二节 胃食管反流病","id":"272","image":"/Public/shop_xiang_qing/2020-05-02/5eacd28a456dc.png","jianjie":"    第二节 胃食管反流病","name":"    第二节 胃食管反流病","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"272","xishu":"0.00","yizuo":"516","zong":"45","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHD","des":"    第三节 食管癌","id":"273","image":"/Public/shop_xiang_qing/2020-05-02/5eacd34274b8c.png","jianjie":"    第三节 食管癌","name":"    第三节 食管癌","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"273","xishu":"0.00","yizuo":"204","zong":"24","zuo":"0"},{"ban_ben":"13115","biao_name":"T_K_CHE","des":"    第四节 急性与慢性胃炎","id":"274","image":"/Public/shop_xiang_qing/2020-05-02/5eacd3a1d119c.png","jianjie":"    第四节 急性与慢性胃炎","name":"    第四节 急性与慢性胃炎","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"274","xishu":"0.00","yizuo":"202","zong":"125","zuo":"0"},{"ban_ben":"13089","biao_name":"T_K_CHF","des":"    第五节 消化性溃疡","id":"275","image":"/Public/shop_xiang_qing/2020-05-02/5eacd4831d25a.png","jianjie":"    第五节 消化性溃疡","name":"    第五节 消化性溃疡","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"275","xishu":"0.00","yizuo":"183","zong":"201","zuo":"0"},{"ban_ben":"13088","biao_name":"T_K_CHG","des":"    第六节 胃癌","id":"276","image":"/Public/shop_xiang_qing/2020-05-02/5eacd523ac613.png","jianjie":"    第六节 胃癌","name":"    第六节 胃癌","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"276","xishu":"0.00","yizuo":"99","zong":"43","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHH","des":"    第七节 肠结核与腹膜炎","id":"277","image":"/Public/shop_xiang_qing/2020-05-02/5eacd57451efe.png","jianjie":"    第七节 肠结核与腹膜炎","name":"    第七节 肠结核与腹膜炎","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"277","xishu":"0.00","yizuo":"119","zong":"81","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHI","des":"    第八节 炎症性肠病","id":"278","image":"/Public/shop_xiang_qing/2020-05-02/5eacd5dfc7ba2.png","jianjie":"    第八节 炎症性肠病","name":"    第八节 炎症性肠病","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"278","xishu":"0.00","yizuo":"100","zong":"161","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHJ","des":"    第九节 功能性胃肠","id":"279","image":"/Public/shop_xiang_qing/2020-05-02/5eacd63d19c94.png","jianjie":"    第九节 功能性胃肠","name":"    第九节 功能性胃肠","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"279","xishu":"0.00","yizuo":"60","zong":"49","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIA","des":"    第十节 慢性腹泻","id":"280","image":"/Public/shop_xiang_qing/2020-05-02/5eacd680ec8cb.png","jianjie":"    第十节 慢性腹泻","name":"    第十节 慢性腹泻","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"280","xishu":"0.00","yizuo":"51","zong":"25","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIB","des":"    第十一节 肝硬化","id":"281","image":"/Public/shop_xiang_qing/2020-05-02/5eacd6cfdf5cd.png","jianjie":"    第十一节 肝硬化","name":"    第十一节 肝硬化","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"281","xishu":"0.00","yizuo":"129","zong":"147","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIC","des":"    第十二节 肝性脑病","id":"282","image":"/Public/shop_xiang_qing/2020-05-02/5eacd71de2011.png","jianjie":"    第十二节 肝性脑病","name":"    第十二节 肝性脑病","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"282","xishu":"0.00","yizuo":"98","zong":"61","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CID","des":"    第十三节 原发性肝癌","id":"283","image":"/Public/shop_xiang_qing/2020-05-02/5eacd760e7050.png","jianjie":"    第十三节 原发性肝癌","name":"    第十三节 原发性肝癌","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"283","xishu":"0.00","yizuo":"87","zong":"80","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIE","des":"    第十四节 胰腺疾病","id":"284","image":"/Public/shop_xiang_qing/2020-05-02/5eacd7a6284f6.png","jianjie":"    第十四节 胰腺疾病","name":"    第十四节 胰腺疾病","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"284","xishu":"0.00","yizuo":"105","zong":"88","zuo":"0"},{"ban_ben":"11500","biao_name":"T_K_BAC","des":"","id":"102","image":"","jianjie":"","name":"第五章  泌尿系统疾病","pai":"0","pid":"62","status":"0","ti_ping_num":"0","type_id":"102","xishu":"1.00","yizuo":"4658","zong":"129","zuo":"0"},{"ban_ben":"11505","biao_name":"T_K_BBA","des":"","id":"110","image":"","jianjie":"","name":"第六章  血液系统疾病","pai":"0","pid":"63","status":"0","ti_ping_num":"0","type_id":"110","xishu":"1.00","yizuo":"4622","zong":"153","zuo":"0"},{"ban_ben":"11510","biao_name":"T_K_BAJ","des":"","id":"109","image":"","jianjie":"","name":"第七章  内分泌系统和营养代谢疾病","pai":"0","pid":"64","status":"0","ti_ping_num":"0","type_id":"109","xishu":"1.00","yizuo":"4361","zong":"143","zuo":"0"},{"ban_ben":"11513","biao_name":"T_K_BCC","des":"","id":"122","image":"","jianjie":"","name":"第八章  风湿性疾病","pai":"0","pid":"65","status":"0","ti_ping_num":"0","type_id":"122","xishu":"1.00","yizuo":"4064","zong":"37","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","des":"","id":"66","image":"","jianjie":"重新定义九版教材，打破固化教育","name":"外科学","pai":"4","pid":"0","status":"1","ti_ping_num":"0","type_id":"66","xishu":"1.00","yizuo":"2000","z_type":[{"ban_ben":"11516","biao_name":"T_K_BBI","des":"","id":"118","image":"","jianjie":"","name":"第一章  外科总论","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"118","xishu":"1.00","yizuo":"6357","zong":"195","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CAG","des":"第一节 绪论","id":"206","image":"/Public/shop_xiang_qing/2020-03-31/5e82dd02ac31f.png","jianjie":"第一节 绪论","name":"    第一节 绪论","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"206","xishu":"0.00","yizuo":"1046","zong":"24","zuo":"0"},{"ban_ben":"13090","biao_name":"T_K_CAH","des":"第二节 无菌术","id":"207","image":"/Public/shop_xiang_qing/2020-03-31/5e82dd1c8b923.png","jianjie":"第二节 无菌术","name":"    第二节 无菌术","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"207","xishu":"0.00","yizuo":"218","zong":"45","zuo":"0"},{"ban_ben":"13095","biao_name":"T_K_CAI","des":"    第三节 体液失调","id":"208","image":"/Public/shop_xiang_qing/2020-03-31/5e8301603aab3.png","jianjie":"    第三节 体液失调","name":"    第三节 体液失调","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"208","xishu":"0.00","yizuo":"179","zong":"125","zuo":"0"},{"ban_ben":"13096","biao_name":"T_K_CAJ","des":"    第四节 输血","id":"209","image":"/Public/shop_xiang_qing/2020-03-31/5e8315ff7ee8d.png","jianjie":"    第四节 输血","name":"    第四节 输血","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"209","xishu":"0.00","yizuo":"240","zong":"69","zuo":"0"},{"ban_ben":"12773","biao_name":"T_K_CBA","des":"    第五节 外科休克","id":"210","image":"/Public/shop_xiang_qing/2020-04-01/5e842497c0b3b.png","jianjie":"    第五节 外科休克","name":"    第五节 外科休克","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"210","xishu":"0.00","yizuo":"937","zong":"90","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CBB","des":"    第六节 器官功能不全综合症","id":"211","image":"/Public/shop_xiang_qing/2020-04-01/5e8454b0e547e.png","jianjie":"    第六节 器官功能不全综合症","name":"    第六节 器官功能不全综合症","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"211","xishu":"0.00","yizuo":"84","zong":"81","zuo":"0"},{"ban_ben":"12884","biao_name":"T_K_CBC","des":"    第七节 围手术期处理","id":"212","image":"/Public/shop_xiang_qing/2020-04-02/5e85616dda2fc.png","jianjie":"    第七节 围手术期处理","name":"    第七节 围手术期处理","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"212","xishu":"0.00","yizuo":"127","zong":"90","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CBD","des":"    第八节 外科营养代谢","id":"213","image":"/Public/shop_xiang_qing/2020-04-02/5e85a649118e2.png","jianjie":"    第八节 外科营养代谢","name":"    第八节 外科营养代谢","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"213","xishu":"0.00","yizuo":"123","zong":"29","zuo":"0"},{"ban_ben":"13105","biao_name":"T_K_CBE","des":"    第九节 外科感染","id":"214","image":"/Public/shop_xiang_qing/2020-04-02/5e85c3eb47586.png","jianjie":"    第九节 外科感染","name":"    第九节 外科感染","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"214","xishu":"0.00","yizuo":"217","zong":"124","zuo":"0"},{"ban_ben":"12865","biao_name":"T_K_CBF","des":"    第十节 肿瘤","id":"215","image":"/Public/shop_xiang_qing/2020-04-03/5e86c5454c9b2.png","jianjie":"    第十节 肿瘤","name":"    第十节 肿瘤","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"215","xishu":"0.00","yizuo":"72","zong":"90","zuo":"0"},{"ban_ben":"13028","biao_name":"T_K_CBG","des":"    第十一节 移植器官","id":"216","image":"/Public/shop_xiang_qing/2020-04-03/5e86e55a1eda1.png","jianjie":"    第十一节 移植器官","name":"    第十一节 移植器官","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"216","xishu":"0.00","yizuo":"44","zong":"144","zuo":"0"},{"ban_ben":"13108","biao_name":"T_K_CBH","des":"    第十二节 烧伤与冻伤","id":"217","image":"/Public/shop_xiang_qing/2020-04-03/5e870ddd328c6.png","jianjie":"    第十二节 烧伤与冻伤","name":"    第十二节 烧伤与冻伤","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"217","xishu":"0.00","yizuo":"92","zong":"130","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CBI","des":"    第十三节 烧伤的判断与处理","id":"218","image":"/Public/shop_xiang_qing/2020-04-04/5e88316533475.png","jianjie":"    第十三节 烧伤的判断与处理","name":"    第十三节 烧伤的判断与处理","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"218","xishu":"0.00","yizuo":"79","zong":"192","zuo":"0"},{"ban_ben":"13109","biao_name":"T_K_CBJ","des":"    第十四节 皮肤及其它组织移植","id":"219","image":"/Public/shop_xiang_qing/2020-04-04/5e88455686d58.png","jianjie":"    第十四节 皮肤及其它组织移植","name":"    第十四节 皮肤及其它组织移植","pai":"0","pid":"67","status":"0","ti_ping_num":"0","type_id":"219","xishu":"0.00","yizuo":"47","zong":"56","zuo":"0"},{"ban_ben":"11518","biao_name":"T_K_BBJ","des":"","id":"119","image":"","jianjie":"","name":"第二章  胸部外科疾病","pai":"0","pid":"68","status":"0","ti_ping_num":"0","type_id":"119","xishu":"1.00","yizuo":"4351","zong":"20","zuo":"0"},{"ban_ben":"13113","biao_name":"T_K_CCA","des":"    第一节 胸部损伤","id":"220","image":"/Public/shop_xiang_qing/2020-04-05/5e895170c266e.png","jianjie":"    第一节 胸部损伤","name":"    第一节 胸部损伤","pai":"0","pid":"68","status":"0","ti_ping_num":"0","type_id":"220","xishu":"0.00","yizuo":"256","zong":"158","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CCB","des":"    第二节 胸壁疾病","id":"221","image":"/Public/shop_xiang_qing/2020-04-05/5e897b2f36599.png","jianjie":"    第二节 胸壁疾病","name":"    第二节 胸壁疾病","pai":"0","pid":"68","status":"0","ti_ping_num":"0","type_id":"221","xishu":"0.00","yizuo":"72","zong":"44","zuo":"0"},{"ban_ben":"12870","biao_name":"T_K_CCC","des":"    第三节 纵隔疾病","id":"222","image":"/Public/shop_xiang_qing/2020-04-05/5e899bfd18382.png","jianjie":"    第三节 纵隔疾病","name":"    第三节 纵隔疾病","pai":"0","pid":"68","status":"0","ti_ping_num":"0","type_id":"222","xishu":"0.00","yizuo":"68","zong":"60","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CCD","des":"    第四节 脓胸","id":"223","image":"/Public/shop_xiang_qing/2020-04-06/5e8aa28f93903.png","jianjie":"    第四节 脓胸","name":"    第四节 脓胸","pai":"0","pid":"68","status":"0","ti_ping_num":"0","type_id":"223","xishu":"0.00","yizuo":"47","zong":"83","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CCE","des":"    第五节 肺部疾病","id":"224","image":"/Public/shop_xiang_qing/2020-04-06/5e8af16cd7fc1.png","jianjie":"    第五节 肺部疾病","name":"    第五节 肺部疾病","pai":"0","pid":"68","status":"0","ti_ping_num":"0","type_id":"224","xishu":"0.00","yizuo":"105","zong":"118","zuo":"0"},{"ban_ben":"12876","biao_name":"T_K_CCF","des":"    第六节 食管疾病","id":"225","image":"/Public/shop_xiang_qing/2020-04-07/5e8c332fc11ee.png","jianjie":"    第六节 食管疾病","name":"    第六节 食管疾病","pai":"0","pid":"68","status":"0","ti_ping_num":"0","type_id":"225","xishu":"0.00","yizuo":"95","zong":"87","zuo":"0"},{"ban_ben":"13098","biao_name":"T_K_CCG","des":"    第七节 心脏疾病","id":"226","image":"/Public/shop_xiang_qing/2020-04-08/5e8d2e90cd279.png","jianjie":"    第七节 心脏疾病","name":"    第七节 心脏疾病","pai":"0","pid":"68","status":"0","ti_ping_num":"0","type_id":"226","xishu":"0.00","yizuo":"66","zong":"153","zuo":"0"},{"ban_ben":"11538","biao_name":"T_K_BDJ","des":"","id":"139","image":"","jianjie":"","name":"第三章  普通外科","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"139","xishu":"1.00","yizuo":"6916","zong":"397","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CCH","des":"    第一节 颈部疾病","id":"227","image":"/Public/shop_xiang_qing/2020-04-08/5e8d7d4e1c887.png","jianjie":"    第一节 颈部疾病","name":"    第一节 颈部疾病","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"227","xishu":"0.00","yizuo":"720","zong":"60","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CCI","des":"    第二节 乳腺疾病","id":"228","image":"/Public/shop_xiang_qing/2020-04-08/5e8d635da866d.png","jianjie":"    第二节 乳腺疾病","name":"    第二节 乳腺疾病","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"228","xishu":"0.00","yizuo":"515","zong":"52","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CCJ","des":"    第三节 腹部损伤","id":"229","image":"/Public/shop_xiang_qing/2020-04-08/5e8d7da12c527.png","jianjie":"    第三节 腹部损伤","name":"    第三节 腹部损伤","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"229","xishu":"0.00","yizuo":"235","zong":"54","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CDA","des":"    第四节 急性化脓性腹膜炎","id":"230","image":"/Public/shop_xiang_qing/2020-04-08/5e8d8f110c3c5.png","jianjie":"    第四节 急性化脓性腹膜炎","name":"    第四节 急性化脓性腹膜炎","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"230","xishu":"0.00","yizuo":"160","zong":"58","zuo":"0"},{"ban_ben":"13099","biao_name":"T_K_CDB","des":"    第五节 胃十二指肠","id":"231","image":"/Public/shop_xiang_qing/2020-04-09/5e8e9096db0f6.png","jianjie":"    第五节 胃十二指肠","name":"    第五节 胃十二指肠","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"231","xishu":"0.00","yizuo":"351","zong":"179","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CDC","des":"    第六节 肠疾病","id":"232","image":"/Public/shop_xiang_qing/2020-04-09/5e8ed0df0bf96.png","jianjie":"    第六节 肠疾病","name":"    第六节 肠疾病","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"232","xishu":"0.00","yizuo":"273","zong":"164","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CDD","des":"    第七节 阑尾炎","id":"233","image":"/Public/shop_xiang_qing/2020-04-09/5e8eedabdd7c1.png","jianjie":"    第七节 阑尾炎","name":"    第七节 阑尾炎","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"233","xishu":"0.00","yizuo":"330","zong":"84","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CDE","des":"    第八节 直肠肛管","id":"234","image":"/Public/shop_xiang_qing/2020-04-10/5e900cc0532dd.png","jianjie":"    第八节 直肠肛管","name":"    第八节 直肠肛管","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"234","xishu":"0.00","yizuo":"169","zong":"122","zuo":"0"},{"ban_ben":"13101","biao_name":"T_K_CDF","des":"    第九节 肝脏疾病","id":"235","image":"/Public/shop_xiang_qing/2020-04-10/5e9020cec1d04.png","jianjie":"    第九节 肝脏疾病","name":"    第九节 肝脏疾病","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"235","xishu":"0.00","yizuo":"400","zong":"77","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CDG","des":"    第十节 门静脉高压症","id":"236","image":"/Public/shop_xiang_qing/2020-04-10/5e902acb965b8.png","jianjie":"    第十节 门静脉高压症","name":"    第十节 门静脉高压症","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"236","xishu":"0.00","yizuo":"182","zong":"53","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CDH","des":"    第十一节 胆道疾病","id":"237","image":"/Public/shop_xiang_qing/2020-04-10/5e9050144a3ea.png","jianjie":"    第十一节 胆道疾病","name":"    第十一节 胆道疾病","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"237","xishu":"0.00","yizuo":"273","zong":"111","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CDI","des":"    第十二节 胰腺疾病","id":"238","image":"/Public/shop_xiang_qing/2020-04-11/5e913436ec754.png","jianjie":"    第十二节 胰腺疾病","name":"    第十二节 胰腺疾病","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"238","xishu":"0.00","yizuo":"228","zong":"92","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CDJ","des":"    第十三节 脾切除","id":"239","image":"/Public/shop_xiang_qing/2020-04-11/5e91575561eb0.png","jianjie":"    第十三节 脾切除","name":"    第十三节 脾切除","pai":"0","pid":"69","status":"0","ti_ping_num":"0","type_id":"239","xishu":"0.00","yizuo":"93","zong":"35","zuo":"0"},{"ban_ben":"11539","biao_name":"T_K_BCB","des":"","id":"121","image":"","jianjie":"","name":"第四章  泌尿、男性生殖系统外科疾病","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"121","xishu":"1.00","yizuo":"3955","zong":"20","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CEA","des":"    第一节 解剖与生理","id":"240","image":"/Public/shop_xiang_qing/2020-04-11/5e91783674ab7.png","jianjie":"    第一节 解剖与生理","name":"    第一节 解剖与生理","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"240","xishu":"0.00","yizuo":"142","zong":"57","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CEB","des":"    第二节 泌尿诊断","id":"241","image":"/Public/shop_xiang_qing/2020-04-11/5e918d43e8c78.png","jianjie":"    第二节 泌尿诊断","name":"    第二节 泌尿诊断","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"241","xishu":"0.00","yizuo":"105","zong":"90","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CEC","des":"    第三节 畸形","id":"242","image":"/Public/shop_xiang_qing/2020-04-11/5e9199126b023.png","jianjie":"    第三节 畸形","name":"    第三节 畸形","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"242","xishu":"0.00","yizuo":"51","zong":"49","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CED","des":"    第四节 泌尿损伤","id":"243","image":"/Public/shop_xiang_qing/2020-04-12/5e929aabe426c.png","jianjie":"    第四节 泌尿损伤","name":"    第四节 泌尿损伤","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"243","xishu":"0.00","yizuo":"79","zong":"115","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CEF","des":"    第五节 泌尿感染","id":"245","image":"/Public/shop_xiang_qing/2020-04-12/5e92b492da689.png","jianjie":"    第五节 泌尿感染","name":"    第五节 泌尿感染","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"245","xishu":"0.00","yizuo":"44","zong":"79","zuo":"0"},{"ban_ben":"12877","biao_name":"T_K_CEG","des":"    第六节 泌尿结核","id":"246","image":"/Public/shop_xiang_qing/2020-04-12/5e92d12c3cd2a.png","jianjie":"    第六节 泌尿结核","name":"    第六节 泌尿结核","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"246","xishu":"0.00","yizuo":"40","zong":"93","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CEH","des":"    第七节 泌尿梗阻","id":"247","image":"/Public/shop_xiang_qing/2020-04-12/5e92ed39298fb.png","jianjie":"    第七节 泌尿梗阻","name":"    第七节 泌尿梗阻","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"247","xishu":"0.00","yizuo":"41","zong":"88","zuo":"0"},{"ban_ben":"13114","biao_name":"T_K_CEI","des":"    第八节 尿石症","id":"248","image":"/Public/shop_xiang_qing/2020-04-13/5e93da0f90a1f.png","jianjie":"    第八节 尿石症","name":"    第八节 尿石症","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"248","xishu":"0.00","yizuo":"59","zong":"132","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CEJ","des":"    第九节 泌尿系统肿瘤","id":"249","image":"/Public/shop_xiang_qing/2020-04-13/5e942b48b600c.png","jianjie":"    第九节 泌尿系统肿瘤","name":"    第九节 泌尿系统肿瘤","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"249","xishu":"0.00","yizuo":"101","zong":"137","zuo":"0"},{"ban_ben":"13116","biao_name":"T_K_CFA","des":"    第十节 泌尿其它疾病","id":"250","image":"/Public/shop_xiang_qing/2020-04-13/5e9438738432b.png","jianjie":"    第十节 泌尿其它疾病","name":"    第十节 泌尿其它疾病","pai":"0","pid":"70","status":"0","ti_ping_num":"0","type_id":"250","xishu":"0.00","yizuo":"41","zong":"74","zuo":"0"},{"ban_ben":"11549","biao_name":"T_K_BAB","des":"","id":"101","image":"","jianjie":"","name":"第五章  骨科","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"101","xishu":"1.00","yizuo":"4440","zong":"218","zuo":"0"},{"ban_ben":"13112","biao_name":"T_K_CFB","des":"    第一节 骨折概述","id":"251","image":"/Public/shop_xiang_qing/2020-04-16/5e980b8594b25.png","jianjie":"    第一节 骨折概述","name":"    第一节 骨折概述","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"251","xishu":"0.00","yizuo":"212","zong":"129","zuo":"0"},{"ban_ben":"13103","biao_name":"T_K_CFC","des":"    第二节 上肢骨","id":"252","image":"/Public/shop_xiang_qing/2020-04-16/5e9831edddc9f.png","jianjie":"    第二节 上肢骨","name":"    第二节 上肢骨","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"252","xishu":"0.00","yizuo":"86","zong":"122","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CFD","des":"    第三节 手外伤","id":"253","image":"/Public/shop_xiang_qing/2020-04-18/5e9a7752686af.png","jianjie":"    第三节 手外伤","name":"    第三节 手外伤","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"253","xishu":"0.00","yizuo":"38","zong":"83","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CFE","des":"    第四节 下肢骨关节损伤","id":"254","image":"/Public/shop_xiang_qing/2020-04-18/5e9aca22d1052.png","jianjie":"    第四节 下肢骨关节损伤","name":"    第四节 下肢骨关节损伤","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"254","xishu":"0.00","yizuo":"50","zong":"100","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CFF","des":"    第五节 脊柱、骨盆骨折","id":"255","image":"/Public/shop_xiang_qing/2020-04-19/5e9be2fd27b88.png","jianjie":"    第五节 脊柱、骨盆骨折","name":"    第五节 脊柱、骨盆骨折","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"255","xishu":"0.00","yizuo":"32","zong":"93","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CFG","des":"    第六节 周围神经损伤","id":"256","image":"/Public/shop_xiang_qing/2020-04-19/5e9c024d13758.png","jianjie":"    第六节 周围神经损伤","name":"    第六节 周围神经损伤","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"256","xishu":"0.00","yizuo":"47","zong":"39","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CFH","des":"    第七节 运动系统损伤","id":"257","image":"/Public/shop_xiang_qing/2020-04-19/5e9c218ea00e7.png","jianjie":"    第七节 运动系统损伤","name":"    第七节 运动系统损伤","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"257","xishu":"0.00","yizuo":"53","zong":"74","zuo":"0"},{"ban_ben":"13026","biao_name":"T_K_CFI","des":"    第八节 腰椎、颈疾病","id":"258","image":"/Public/shop_xiang_qing/2020-04-20/5e9d6b603efc2.png","jianjie":"    第八节 腰椎、颈疾病","name":"    第八节 腰椎、颈疾病","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"258","xishu":"0.00","yizuo":"119","zong":"141","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CFJ","des":"    第九节 骨与关节化脓性感染","id":"259","image":"/Public/shop_xiang_qing/2020-04-21/5e9ea1feeb336.png","jianjie":"    第九节 骨与关节化脓性感染","name":"    第九节 骨与关节化脓性感染","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"259","xishu":"0.00","yizuo":"39","zong":"99","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CGA","des":"    第十节 骨与关节结核","id":"260","image":"/Public/shop_xiang_qing/2020-04-21/5e9ec203053e2.png","jianjie":"    第十节 骨与关节结核","name":"    第十节 骨与关节结核","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"260","xishu":"0.00","yizuo":"42","zong":"100","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CGB","des":"    第十一节 非化脓性关节炎","id":"261","image":"/Public/shop_xiang_qing/2020-04-22/5e9fb64c97713.png","jianjie":"    第十一节 非化脓性关节炎","name":"    第十一节 非化脓性关节炎","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"261","xishu":"0.00","yizuo":"28","zong":"76","zuo":"0"},{"ban_ben":"13104","biao_name":"T_K_CGC","des":"    第十二节 运动系统畸形","id":"262","image":"/Public/shop_xiang_qing/2020-04-22/5e9fec45bc103.png","jianjie":"    第十二节 运动系统畸形","name":"    第十二节 运动系统畸形","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"262","xishu":"0.00","yizuo":"51","zong":"49","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CGD","des":"    第十三节 骨肿瘤","id":"263","image":"/Public/shop_xiang_qing/2020-04-22/5ea015f7513ae.png","jianjie":"    第十三节 骨肿瘤","name":"    第十三节 骨肿瘤","pai":"0","pid":"71","status":"0","ti_ping_num":"0","type_id":"263","xishu":"0.00","yizuo":"131","zong":"71","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CGF","des":"第六章 神经外科","id":"265","image":"/Public/shop_xiang_qing/2020-04-25/5ea3b33a79b49.png","jianjie":"第六章 神经外科","name":"第六章 神经外科","pai":"0","pid":"264","status":"0","ti_ping_num":"0","type_id":"265","xishu":"0.00","yizuo":"48","zong":"188","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CGG","des":"    第一节 颅脑损伤","id":"266","image":"/Public/shop_xiang_qing/2020-04-25/5ea3cb04d4c87.png","jianjie":"    第一节 颅脑损伤","name":"    第一节 颅脑损伤","pai":"0","pid":"264","status":"0","ti_ping_num":"0","type_id":"266","xishu":"0.00","yizuo":"37","zong":"52","zuo":"0"},{"ban_ben":"13070","biao_name":"T_K_CGH","des":"    第二节 颅脑和脊椎先天畸形","id":"267","image":"/Public/shop_xiang_qing/2020-04-25/5ea3dcf5662a5.png","jianjie":"    第二节 颅脑和脊椎先天畸形","name":"    第二节 颅脑和脊椎先天畸形","pai":"0","pid":"264","status":"0","ti_ping_num":"0","type_id":"267","xishu":"0.00","yizuo":"12","zong":"57","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CGI","des":"    第三节 颅内肿瘤","id":"268","image":"/Public/shop_xiang_qing/2020-04-25/5ea3e5e2bd8c3.png","jianjie":"    第三节 颅内肿瘤","name":"    第三节 颅内肿瘤","pai":"0","pid":"264","status":"0","ti_ping_num":"0","type_id":"268","xishu":"0.00","yizuo":"16","zong":"51","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CGJ","des":"    第四节 椎管内肿瘤","id":"269","image":"/Public/shop_xiang_qing/2020-04-25/5ea3f79cce34b.png","jianjie":"    第四节 椎管内肿瘤","name":"    第四节 椎管内肿瘤","pai":"0","pid":"264","status":"0","ti_ping_num":"0","type_id":"269","xishu":"0.00","yizuo":"10","zong":"58","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHA","des":"    第五节 血管性疾病","id":"270","image":"/Public/shop_xiang_qing/2020-04-26/5ea4eda512935.png","jianjie":"    第五节 血管性疾病","name":"    第五节 血管性疾病","pai":"0","pid":"264","status":"0","ti_ping_num":"0","type_id":"270","xishu":"0.00","yizuo":"72","zong":"161","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","des":"","id":"22","image":"","jianjie":"针对第九版教材，解析最全，正确率最高","name":"生理学","pai":"3","pid":"0","status":"1","ti_ping_num":"264","type_id":"22","xishu":"1.00","yizuo":"0","z_type":[{"ban_ben":"10681","biao_name":"T_K_II","des":"","id":"88","image":"","jianjie":"","name":"第一章  绪论","pai":"10","pid":"23","status":"0","ti_ping_num":"0","type_id":"88","xishu":"1.00","yizuo":"8176","zong":"25","zuo":"0"},{"ban_ben":"10766","biao_name":"T_K_BAD","des":"","id":"103","image":"","jianjie":"","name":"第二章  细胞的基本功能","pai":"0","pid":"24","status":"0","ti_ping_num":"0","type_id":"103","xishu":"1.00","yizuo":"6125","zong":"92","zuo":"0"},{"ban_ben":"11413","biao_name":"T_K_JI","des":"","id":"98","image":"","jianjie":"","name":"第三章  呼吸","pai":"0","pid":"14","status":"0","ti_ping_num":"0","type_id":"98","xishu":"1.00","yizuo":"4417","zong":"86","zuo":"0"},{"ban_ben":"11415","biao_name":"T_K_BAG","des":"","id":"106","image":"","jianjie":"","name":"第四章  消化和吸收","pai":"0","pid":"2","status":"0","ti_ping_num":"0","type_id":"106","xishu":"1.00","yizuo":"3892","zong":"77","zuo":"0"},{"ban_ben":"11417","biao_name":"T_K_BAE","des":"","id":"104","image":"","jianjie":"","name":"第五章  能量代谢和体温","pai":"0","pid":"11","status":"0","ti_ping_num":"0","type_id":"104","xishu":"1.00","yizuo":"3420","zong":"36","zuo":"0"},{"ban_ben":"11157","biao_name":"T_K_BBF","des":"","id":"115","image":"","jianjie":"","name":"第六章  神经系统","pai":"0","pid":"13","status":"0","ti_ping_num":"0","type_id":"115","xishu":"1.00","yizuo":"3261","zong":"24","zuo":"0"},{"ban_ben":"11419","biao_name":"T_K_BAF","des":"","id":"105","image":"","jianjie":"","name":"第七章  内分泌","pai":"0","pid":"19","status":"0","ti_ping_num":"0","type_id":"105","xishu":"1.00","yizuo":"3313","zong":"73","zuo":"0"},{"ban_ben":"3648","biao_name":"T_K_BAH","des":"","id":"107","image":"","jianjie":"","name":"第八章  生殖","pai":"0","pid":"20","status":"0","ti_ping_num":"0","type_id":"107","xishu":"1.00","yizuo":"3068","zong":"22","zuo":"0"},{"ban_ben":"11420","biao_name":"T_K_BGB","des":"","id":"161","image":"","jianjie":"","name":"第八章  生殖（续）","pai":"0","pid":"20","status":"0","ti_ping_num":"0","type_id":"161","xishu":"1.00","yizuo":"2916","zong":"18","zuo":"0"},{"ban_ben":"11407","biao_name":"T_K_BAI","des":"","id":"108","image":"","jianjie":"","name":"第九章  血液","pai":"0","pid":"89","status":"0","ti_ping_num":"0","type_id":"108","xishu":"1.00","yizuo":"3895","zong":"52","zuo":"0"},{"ban_ben":"11411","biao_name":"T_K_BBB","des":"","id":"111","image":"","jianjie":"","name":"第十章  血液循环","pai":"0","pid":"93","status":"0","ti_ping_num":"0","type_id":"111","xishu":"1.00","yizuo":"4142","zong":"125","zuo":"0"},{"ban_ben":"11082","biao_name":"T_K_BAA","des":"","id":"100","image":"","jianjie":"","name":"第十一章  尿的生成和排出","pai":"0","pid":"96","status":"0","ti_ping_num":"0","type_id":"100","xishu":"1.00","yizuo":"3563","zong":"72","zuo":"0"},{"ban_ben":"11088","biao_name":"T_K_BFJ","des":"","id":"159","image":"","jianjie":"","name":"第十二章  感觉器官","pai":"0","pid":"157","status":"0","ti_ping_num":"0","type_id":"159","xishu":"1.00","yizuo":"2993","zong":"44","zuo":"0"},{"ban_ben":"11181","biao_name":"T_K_BGD","des":"","id":"163","image":"","jianjie":"","name":"第十三章  神经系统","pai":"0","pid":"162","status":"0","ti_ping_num":"0","type_id":"163","xishu":"1.00","yizuo":"3387","zong":"103","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","des":"","id":"42","image":"","jianjie":"全国一线名师提供最精细、权威题库","name":"病理学","pai":"2","pid":"0","status":"1","ti_ping_num":"0","type_id":"42","xishu":"1.00","yizuo":"2000","z_type":[{"ban_ben":"1759","biao_name":"T_K_BEA","des":"","id":"140","image":"","jianjie":"","name":"第一章  局部血液循环障碍","pai":"0","pid":"45","status":"0","ti_ping_num":"0","type_id":"140","xishu":"1.00","yizuo":"5495","zong":"36","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIF","des":"  第一节 局部血液循环障碍","id":"285","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6979be1f0.jpg","jianjie":"  第一节 局部血液循环障碍","name":"  第一节 局部血液循环障碍","pai":"0","pid":"45","status":"0","ti_ping_num":"0","type_id":"285","xishu":"0.00","yizuo":"174","zong":"116","zuo":"0"},{"ban_ben":"11445","biao_name":"T_K_BCI","des":"","id":"128","image":"","jianjie":"","name":"第二章  细胞和组织的适应与损伤","pai":"0","pid":"43","status":"0","ti_ping_num":"0","type_id":"128","xishu":"1.00","yizuo":"4733","zong":"65","zuo":"0"},{"ban_ben":"1499","biao_name":"T_K_BEB","des":"","id":"141","image":"","jianjie":"","name":"第三章  损伤的修复","pai":"0","pid":"44","status":"0","ti_ping_num":"0","type_id":"141","xishu":"1.00","yizuo":"3779","zong":"22","zuo":"0"},{"ban_ben":"11448","biao_name":"T_K_BED","des":"","id":"143","image":"","jianjie":"","name":"第四章  炎症","pai":"0","pid":"46","status":"0","ti_ping_num":"0","type_id":"143","xishu":"1.00","yizuo":"3741","zong":"63","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIG","des":"  第一节 炎症","id":"286","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6a232c4fd.jpg","jianjie":"  第一节 炎症","name":"  第一节 炎症","pai":"0","pid":"46","status":"0","ti_ping_num":"0","type_id":"286","xishu":"0.00","yizuo":"71","zong":"116","zuo":"0"},{"ban_ben":"11450","biao_name":"T_K_BEE","des":"","id":"144","image":"","jianjie":"","name":"第五章  肿瘤","pai":"0","pid":"47","status":"0","ti_ping_num":"0","type_id":"144","xishu":"1.00","yizuo":"3303","zong":"74","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIH","des":"  第一节 肿瘤","id":"287","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6d64dec6e.jpg","jianjie":"  第一节 肿瘤","name":"  第一节 肿瘤","pai":"0","pid":"47","status":"0","ti_ping_num":"0","type_id":"287","xishu":"0.00","yizuo":"55","zong":"77","zuo":"0"},{"ban_ben":"11451","biao_name":"T_K_BEG","des":"","id":"146","image":"","jianjie":"","name":"第六章  免疫病理","pai":"0","pid":"48","status":"0","ti_ping_num":"0","type_id":"146","xishu":"1.00","yizuo":"3550","zong":"21","zuo":"0"},{"ban_ben":"11453","biao_name":"T_K_BEH","des":"","id":"147","image":"","jianjie":"","name":"第七章  心血管系统疾病","pai":"0","pid":"49","status":"0","ti_ping_num":"0","type_id":"147","xishu":"1.00","yizuo":"3413","zong":"51","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CII","des":"  第一节 心血管系统疾病","id":"288","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6db02cea5.jpg","jianjie":"  第一节 心血管系统疾病","name":"  第一节 心血管系统疾病","pai":"0","pid":"49","status":"0","ti_ping_num":"0","type_id":"288","xishu":"0.00","yizuo":"42","zong":"46","zuo":"0"},{"ban_ben":"11454","biao_name":"T_K_BEI","des":"","id":"148","image":"","jianjie":"","name":"第八章  呼吸系统疾病","pai":"0","pid":"50","status":"0","ti_ping_num":"0","type_id":"148","xishu":"1.00","yizuo":"3211","zong":"51","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIJ","des":"  第一节 呼吸系统疾病","id":"289","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6df9c5640.jpg","jianjie":"  第一节 呼吸系统疾病","name":"  第一节 呼吸系统疾病","pai":"0","pid":"50","status":"0","ti_ping_num":"0","type_id":"289","xishu":"0.00","yizuo":"46","zong":"47","zuo":"0"},{"ban_ben":"11457","biao_name":"T_K_BFA","des":"","id":"150","image":"","jianjie":"","name":"第九章  消化系统疾病","pai":"0","pid":"51","status":"0","ti_ping_num":"0","type_id":"150","xishu":"1.00","yizuo":"3285","zong":"72","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CJA","des":"  第一节 消化系统疾病","id":"290","image":"/Public/shop_xiang_qing/2020-08-21/5f3f6e5c4230c.jpg","jianjie":"  第一节 消化系统疾病","name":"  第一节 消化系统疾病","pai":"0","pid":"51","status":"0","ti_ping_num":"0","type_id":"290","xishu":"0.00","yizuo":"41","zong":"109","zuo":"0"},{"ban_ben":"2931","biao_name":"T_K_BFC","des":"","id":"152","image":"","jianjie":"","name":"第十章  淋巴造血系统疾病","pai":"0","pid":"52","status":"0","ti_ping_num":"0","type_id":"152","xishu":"1.00","yizuo":"4017","zong":"30","zuo":"0"},{"ban_ben":"11458","biao_name":"T_K_BFD","des":"","id":"153","image":"","jianjie":"","name":"第十一章  泌尿系统疾病","pai":"0","pid":"53","status":"0","ti_ping_num":"0","type_id":"153","xishu":"1.00","yizuo":"3414","zong":"38","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CJB","des":"  第一节 泌尿系统疾病","id":"291","image":"/Public/shop_xiang_qing/2020-08-21/5f3f85e7d967b.jpg","jianjie":"  第一节 泌尿系统疾病","name":"  第一节 泌尿系统疾病","pai":"0","pid":"53","status":"0","ti_ping_num":"0","type_id":"291","xishu":"0.00","yizuo":"54","zong":"47","zuo":"0"},{"ban_ben":"11459","biao_name":"T_K_BFG","des":"","id":"156","image":"","jianjie":"","name":"第十二章  生殖系统疾病","pai":"0","pid":"54","status":"0","ti_ping_num":"0","type_id":"156","xishu":"1.00","yizuo":"3232","zong":"23","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CJC","des":"  第一节 生殖系统疾病","id":"292","image":"/Public/shop_xiang_qing/2020-08-21/5f3f866631901.jpg","jianjie":"  第一节 生殖系统疾病","name":"  第一节 生殖系统疾病","pai":"0","pid":"54","status":"0","ti_ping_num":"0","type_id":"292","xishu":"0.00","yizuo":"47","zong":"46","zuo":"0"},{"ban_ben":"11461","biao_name":"T_K_BFI","des":"","id":"158","image":"","jianjie":"","name":"第十三章  内分泌系统疾病","pai":"0","pid":"55","status":"0","ti_ping_num":"0","type_id":"158","xishu":"1.00","yizuo":"3444","zong":"13","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CJD","des":"  第一节 内分泌系统疾病","id":"293","image":"/Public/shop_xiang_qing/2020-08-21/5f3f86fc8e407.jpg","jianjie":"  第一节 内分泌系统疾病","name":"  第一节 内分泌系统疾病","pai":"0","pid":"55","status":"0","ti_ping_num":"0","type_id":"293","xishu":"0.00","yizuo":"57","zong":"100","zuo":"0"},{"ban_ben":"11464","biao_name":"T_K_BFF","des":"","id":"155","image":"","jianjie":"","name":"第十四章  传染病及寄生虫病","pai":"0","pid":"56","status":"0","ti_ping_num":"0","type_id":"155","xishu":"1.00","yizuo":"3574","zong":"67","zuo":"0"},{"ban_ben":"1606","biao_name":"T_K_BCH","des":"","id":"127","image":"","jianjie":"","name":"细胞和组织的适用与损伤","pai":"0","pid":"42","status":"0","ti_ping_num":"0","type_id":"127","xishu":"1.00","yizuo":"3487","zong":"1","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","des":"","id":"37","image":"","jianjie":"手把手让你考研初试冲刺高分","name":"生物化学","pai":"0","pid":"0","status":"1","ti_ping_num":"0","type_id":"37","xishu":"1.00","yizuo":"2000","z_type":[{"ban_ben":"11423","biao_name":"T_K_BDF","des":"","id":"135","image":"","jianjie":"","name":"第一章  生物大分子的结构和功能","pai":"0","pid":"38","status":"0","ti_ping_num":"0","type_id":"135","xishu":"1.00","yizuo":"5336","zong":"109","zuo":"0"},{"ban_ben":"11429","biao_name":"T_K_BEC","des":"","id":"142","image":"","jianjie":"","name":"第二章  物质代谢及调节","pai":"0","pid":"39","status":"0","ti_ping_num":"0","type_id":"142","xishu":"1.00","yizuo":"3707","zong":"252","zuo":"0"},{"ban_ben":"11438","biao_name":"T_K_BEJ","des":"","id":"149","image":"","jianjie":"","name":"第三章  基因的信息传递","pai":"0","pid":"40","status":"0","ti_ping_num":"0","type_id":"149","xishu":"1.00","yizuo":"3128","zong":"173","zuo":"0"},{"ban_ben":"11442","biao_name":"T_K_BFB","des":"","id":"151","image":"","jianjie":"","name":"第四章  生化专题","pai":"0","pid":"41","status":"0","ti_ping_num":"0","type_id":"151","xishu":"1.00","yizuo":"3300","zong":"85","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","des":"","id":"72","image":"","jianjie":"","name":"临床医学人文精神","pai":"0","pid":"0","status":"1","ti_ping_num":"0","type_id":"72","xishu":"1.00","yizuo":"2003","z_type":[{"ban_ben":"11557","biao_name":"T_K_BII","des":"","id":"188","image":"","jianjie":"","name":"医学人文","pai":"0","pid":"187","status":"0","ti_ping_num":"0","type_id":"188","xishu":"1.00","yizuo":"4678","zong":"16","zuo":"0"}],"zong":"0","zuo":"0"}]
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
        /**
         * ban_ben : 0
         * des :
         * id : 57
         * image :
         * jianjie : 医学考研一线名师反复审查
         * name : 内科学
         * pai : 5
         * pid : 0
         * status : 1
         * ti_ping_num : 0
         * type_id : 57
         * xishu : 1.00
         * yizuo : 2002
         * z_type : [{"ban_ben":"12456","biao_name":"T_K_BBC","des":"","id":"112","image":"","jianjie":"","name":"第一章  诊断学","pai":"0","pid":"58","status":"0","ti_ping_num":"0","type_id":"112","xishu":"1.00","yizuo":"7971","zong":"60","zuo":"0"},{"ban_ben":"11479","biao_name":"T_K_BBE","des":"","id":"114","image":"","jianjie":"","name":"第二章  呼吸系统疾病","pai":"0","pid":"59","status":"0","ti_ping_num":"0","type_id":"114","xishu":"1.00","yizuo":"9322","zong":"220","zuo":"0"},{"ban_ben":"11486","biao_name":"T_K_BBG","des":"","id":"116","image":"","jianjie":"","name":"第三章  循环系统疾病","pai":"0","pid":"60","status":"0","ti_ping_num":"0","type_id":"116","xishu":"1.00","yizuo":"6139","zong":"258","zuo":"0"},{"ban_ben":"11495","biao_name":"T_K_BBH","des":"","id":"117","image":"","jianjie":"","name":"第四章  消化系统疾病和中毒","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"117","xishu":"1.00","yizuo":"5532","zong":"243","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHB","des":"    第一节 问诊技巧与症状","id":"271","image":"/Public/shop_xiang_qing/2020-05-02/5eacd21319416.png","jianjie":"    第一节 问诊技巧与症状","name":"    第一节 问诊技巧与症状","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"271","xishu":"0.00","yizuo":"272","zong":"69","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHC","des":"    第二节 胃食管反流病","id":"272","image":"/Public/shop_xiang_qing/2020-05-02/5eacd28a456dc.png","jianjie":"    第二节 胃食管反流病","name":"    第二节 胃食管反流病","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"272","xishu":"0.00","yizuo":"516","zong":"45","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHD","des":"    第三节 食管癌","id":"273","image":"/Public/shop_xiang_qing/2020-05-02/5eacd34274b8c.png","jianjie":"    第三节 食管癌","name":"    第三节 食管癌","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"273","xishu":"0.00","yizuo":"204","zong":"24","zuo":"0"},{"ban_ben":"13115","biao_name":"T_K_CHE","des":"    第四节 急性与慢性胃炎","id":"274","image":"/Public/shop_xiang_qing/2020-05-02/5eacd3a1d119c.png","jianjie":"    第四节 急性与慢性胃炎","name":"    第四节 急性与慢性胃炎","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"274","xishu":"0.00","yizuo":"202","zong":"125","zuo":"0"},{"ban_ben":"13089","biao_name":"T_K_CHF","des":"    第五节 消化性溃疡","id":"275","image":"/Public/shop_xiang_qing/2020-05-02/5eacd4831d25a.png","jianjie":"    第五节 消化性溃疡","name":"    第五节 消化性溃疡","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"275","xishu":"0.00","yizuo":"183","zong":"201","zuo":"0"},{"ban_ben":"13088","biao_name":"T_K_CHG","des":"    第六节 胃癌","id":"276","image":"/Public/shop_xiang_qing/2020-05-02/5eacd523ac613.png","jianjie":"    第六节 胃癌","name":"    第六节 胃癌","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"276","xishu":"0.00","yizuo":"99","zong":"43","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHH","des":"    第七节 肠结核与腹膜炎","id":"277","image":"/Public/shop_xiang_qing/2020-05-02/5eacd57451efe.png","jianjie":"    第七节 肠结核与腹膜炎","name":"    第七节 肠结核与腹膜炎","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"277","xishu":"0.00","yizuo":"119","zong":"81","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHI","des":"    第八节 炎症性肠病","id":"278","image":"/Public/shop_xiang_qing/2020-05-02/5eacd5dfc7ba2.png","jianjie":"    第八节 炎症性肠病","name":"    第八节 炎症性肠病","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"278","xishu":"0.00","yizuo":"100","zong":"161","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CHJ","des":"    第九节 功能性胃肠","id":"279","image":"/Public/shop_xiang_qing/2020-05-02/5eacd63d19c94.png","jianjie":"    第九节 功能性胃肠","name":"    第九节 功能性胃肠","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"279","xishu":"0.00","yizuo":"60","zong":"49","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIA","des":"    第十节 慢性腹泻","id":"280","image":"/Public/shop_xiang_qing/2020-05-02/5eacd680ec8cb.png","jianjie":"    第十节 慢性腹泻","name":"    第十节 慢性腹泻","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"280","xishu":"0.00","yizuo":"51","zong":"25","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIB","des":"    第十一节 肝硬化","id":"281","image":"/Public/shop_xiang_qing/2020-05-02/5eacd6cfdf5cd.png","jianjie":"    第十一节 肝硬化","name":"    第十一节 肝硬化","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"281","xishu":"0.00","yizuo":"129","zong":"147","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIC","des":"    第十二节 肝性脑病","id":"282","image":"/Public/shop_xiang_qing/2020-05-02/5eacd71de2011.png","jianjie":"    第十二节 肝性脑病","name":"    第十二节 肝性脑病","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"282","xishu":"0.00","yizuo":"98","zong":"61","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CID","des":"    第十三节 原发性肝癌","id":"283","image":"/Public/shop_xiang_qing/2020-05-02/5eacd760e7050.png","jianjie":"    第十三节 原发性肝癌","name":"    第十三节 原发性肝癌","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"283","xishu":"0.00","yizuo":"87","zong":"80","zuo":"0"},{"ban_ben":"0","biao_name":"T_K_CIE","des":"    第十四节 胰腺疾病","id":"284","image":"/Public/shop_xiang_qing/2020-05-02/5eacd7a6284f6.png","jianjie":"    第十四节 胰腺疾病","name":"    第十四节 胰腺疾病","pai":"0","pid":"61","status":"0","ti_ping_num":"0","type_id":"284","xishu":"0.00","yizuo":"105","zong":"88","zuo":"0"},{"ban_ben":"11500","biao_name":"T_K_BAC","des":"","id":"102","image":"","jianjie":"","name":"第五章  泌尿系统疾病","pai":"0","pid":"62","status":"0","ti_ping_num":"0","type_id":"102","xishu":"1.00","yizuo":"4658","zong":"129","zuo":"0"},{"ban_ben":"11505","biao_name":"T_K_BBA","des":"","id":"110","image":"","jianjie":"","name":"第六章  血液系统疾病","pai":"0","pid":"63","status":"0","ti_ping_num":"0","type_id":"110","xishu":"1.00","yizuo":"4622","zong":"153","zuo":"0"},{"ban_ben":"11510","biao_name":"T_K_BAJ","des":"","id":"109","image":"","jianjie":"","name":"第七章  内分泌系统和营养代谢疾病","pai":"0","pid":"64","status":"0","ti_ping_num":"0","type_id":"109","xishu":"1.00","yizuo":"4361","zong":"143","zuo":"0"},{"ban_ben":"11513","biao_name":"T_K_BCC","des":"","id":"122","image":"","jianjie":"","name":"第八章  风湿性疾病","pai":"0","pid":"65","status":"0","ti_ping_num":"0","type_id":"122","xishu":"1.00","yizuo":"4064","zong":"37","zuo":"0"}]
         * zong : 0
         * zuo : 0
         */

        private String ban_ben;
        private String des;
        private String id;
        private String image;
        private String jianjie;
        private String name;
        private String pai;
        private String pid;
        private String status;
        private String ti_ping_num;
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

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
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

        public String getTi_ping_num() {
            return ti_ping_num;
        }

        public void setTi_ping_num(String ti_ping_num) {
            this.ti_ping_num = ti_ping_num;
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

        public static class ZTypeBean implements Serializable {
            /**
             * ban_ben : 12456
             * biao_name : T_K_BBC
             * des :
             * id : 112
             * image :
             * jianjie :
             * name : 第一章  诊断学
             * pai : 0
             * pid : 58
             * status : 0
             * ti_ping_num : 0
             * type_id : 112
             * xishu : 1.00
             * yizuo : 7971
             * zong : 60
             * zuo : 0
             */

            private String ban_ben;
            private String biao_name;
            private String des;
            private String id;
            private String image;
            private String jianjie;
            private String name;
            private String pai;
            private String pid;
            private String status;
            private String ti_ping_num;
            private String type_id;
            private String xishu;
            private String yizuo;
            private String zong;
            private String zuo;

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

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
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

            public String getTi_ping_num() {
                return ti_ping_num;
            }

            public void setTi_ping_num(String ti_ping_num) {
                this.ti_ping_num = ti_ping_num;
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
