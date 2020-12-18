package com.yang.mymedicalpoject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/12/9 20:14
 */
public class Ti_Ying_Recy_Bean implements Serializable {

    @Override
    public String toString() {
        return "Ti_Ying_Recy_Bean{" +
                "fen='" + fen + '\'' +
                ", u_type=" + u_type +
                '}';
    }

    /**
     * u_type : [{"id":"29","name":"执业医 - 内科学","pid":"0","status":"1","pic":null,"pai":"5","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计四十一章节题库","xishu":"1.00","yizuo":"2000","type_id":"29","z_type":[{"id":"60","name":"第一章：慢性阻塞性肺疾病与支气管哮喘","pid":"29","status":"0","pic":null,"pai":"50","zong":"60","zuo":"0","ban_ben":"4743","jianjie":"","xishu":"0.00","yizuo":"450","type_id":"60","biao_name":"Y_T_K_GA"},{"id":"61","name":"第二章：支气管扩张症","pid":"29","status":"0","pic":null,"pai":"49","zong":"21","zuo":"0","ban_ben":"599","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"61","biao_name":"Y_T_K_GB"},{"id":"62","name":"第三章：肺部感染性疾病（肺炎与肺脓肿）","pid":"29","status":"0","pic":null,"pai":"48","zong":"84","zuo":"0","ban_ben":"2590","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"62","biao_name":"Y_T_K_GC"},{"id":"63","name":"第四章：肺结核","pid":"29","status":"0","pic":null,"pai":"47","zong":"32","zuo":"0","ban_ben":"2591","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"63","biao_name":"Y_T_K_GD"},{"id":"64","name":"第五章：血栓栓塞症","pid":"29","status":"0","pic":null,"pai":"46","zong":"9","zuo":"0","ban_ben":"1039","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"64","biao_name":"Y_T_K_GE"},{"id":"65","name":"第六章：肺动脉高压与肺源性心脏病","pid":"29","status":"0","pic":null,"pai":"44","zong":"39","zuo":"0","ban_ben":"1152","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"65","biao_name":"Y_T_K_GF"},{"id":"66","name":"第七章：急性呼吸窘迫综合征","pid":"29","status":"0","pic":null,"pai":"43","zong":"38","zuo":"0","ban_ben":"1368","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"66","biao_name":"Y_T_K_GG"},{"id":"67","name":"第八章：胸腔积液","pid":"29","status":"0","pic":null,"pai":"42","zong":"19","zuo":"0","ban_ben":"1429","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"67","biao_name":"Y_T_K_GH"},{"id":"68","name":"第九章：呼吸衰竭与呼吸支持技术","pid":"29","status":"0","pic":null,"pai":"41","zong":"37","zuo":"0","ban_ben":"1472","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"68","biao_name":"Y_T_K_GI"},{"id":"69","name":"第十章：心力衰竭","pid":"29","status":"0","pic":null,"pai":"40","zong":"87","zuo":"0","ban_ben":"1559","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"69","biao_name":"Y_T_K_GJ"},{"id":"70","name":"第十一章：心律失常","pid":"29","status":"0","pic":null,"pai":"39","zong":"107","zuo":"0","ban_ben":"1666","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"70","biao_name":"Y_T_K_HA"},{"id":"71","name":"第十二章：冠状动脉粥样硬化性心脏病","pid":"29","status":"0","pic":null,"pai":"38","zong":"103","zuo":"0","ban_ben":"1916","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"71","biao_name":"Y_T_K_HB"},{"id":"72","name":"第十三章：高血压","pid":"29","status":"0","pic":null,"pai":"37","zong":"52","zuo":"0","ban_ben":"1934","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"72","biao_name":"Y_T_K_HC"},{"id":"73","name":"第十四章：心肌疾病","pid":"29","status":"0","pic":null,"pai":"36","zong":"44","zuo":"0","ban_ben":"1987","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"73","biao_name":"Y_T_K_HD"},{"id":"74","name":"第十五章：心脏瓣膜病","pid":"29","status":"0","pic":null,"pai":"35","zong":"61","zuo":"0","ban_ben":"2045","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"74","biao_name":"Y_T_K_HE"},{"id":"75","name":"第十六章：心包疾病（急性心包炎与心脏压塞）","pid":"29","status":"0","pic":null,"pai":"34","zong":"38","zuo":"0","ban_ben":"2113","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"75","biao_name":"Y_T_K_HF"},{"id":"76","name":"第十七章：感染性心内膜炎","pid":"29","status":"0","pic":null,"pai":"33","zong":"24","zuo":"0","ban_ben":"2146","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"76","biao_name":"Y_T_K_HG"},{"id":"77","name":"第十八章：心脏骤停与心脏性猝死","pid":"29","status":"0","pic":null,"pai":"32","zong":"27","zuo":"0","ban_ben":"2195","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"77","biao_name":"Y_T_K_HH"},{"id":"78","name":"第十九章：胃食管反流病与胃炎","pid":"29","status":"0","pic":null,"pai":"31","zong":"70","zuo":"0","ban_ben":"2240","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"78","biao_name":"Y_T_K_HI"},{"id":"79","name":"第二十章：消化性溃疡","pid":"29","status":"0","pic":null,"pai":"30","zong":"84","zuo":"0","ban_ben":"2516","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"79","biao_name":"Y_T_K_HJ"},{"id":"80","name":"第二十一章：肠结核与结核性腹膜炎","pid":"29","status":"0","pic":null,"pai":"26","zong":"31","zuo":"0","ban_ben":"367","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"80","biao_name":"Y_T_K_IA"},{"id":"81","name":"第二十二章：炎症性肠病与功能性胃肠病","pid":"29","status":"0","pic":null,"pai":"25","zong":"57","zuo":"0","ban_ben":"613","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"81","biao_name":"Y_T_K_IB"},{"id":"82","name":"第二十三章：脂肪性肝病与肝硬化","pid":"29","status":"0","pic":null,"pai":"24","zong":"53","zuo":"0","ban_ben":"817","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"82","biao_name":"Y_T_K_IC"},{"id":"83","name":"第二十四章：原发性肝癌与肝性脑病","pid":"29","status":"0","pic":null,"pai":"23","zong":"50","zuo":"0","ban_ben":"1056","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"83","biao_name":"Y_T_K_ID"},{"id":"84","name":"第二十五章：消化道大出血","pid":"29","status":"0","pic":null,"pai":"22","zong":"38","zuo":"0","ban_ben":"1175","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"84","biao_name":"Y_T_K_IE"},{"id":"85","name":"第二十六章：尿液检查与肾小球疾病","pid":"29","status":"0","pic":null,"pai":"21","zong":"127","zuo":"0","ban_ben":"3347","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"85","biao_name":"Y_T_K_IF"},{"id":"86","name":"第二十七章：尿路感染","pid":"29","status":"0","pic":null,"pai":"20","zong":"36","zuo":"0","ban_ben":"2720","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"86","biao_name":"Y_T_K_IG"},{"id":"87","name":"第二十八章：肾功能不全","pid":"29","status":"0","pic":null,"pai":"19","zong":"75","zuo":"0","ban_ben":"2791","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"87","biao_name":"Y_T_K_IH"},{"id":"88","name":"第二十九章：贫血","pid":"29","status":"0","pic":null,"pai":"18","zong":"97","zuo":"0","ban_ben":"2948","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"88","biao_name":"Y_T_K_II"},{"id":"89","name":"第三十章：白细胞减少和粒细胞缺乏症","pid":"29","status":"0","pic":null,"pai":"17","zong":"5","zuo":"0","ban_ben":"2953","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"89","biao_name":"Y_T_K_IJ"},{"id":"90","name":"第三十一章：骨髓增生异常综合征与白血病","pid":"29","status":"0","pic":null,"pai":"16","zong":"84","zuo":"0","ban_ben":"3037","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"90","biao_name":"Y_T_K_JA"},{"id":"91","name":"第三十二章：淋巴瘤与多发性骨髓瘤","pid":"29","status":"0","pic":null,"pai":"15","zong":"26","zuo":"0","ban_ben":"3064","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"91","biao_name":"Y_T_K_JB"},{"id":"92","name":"第三十三章：出血性疾病","pid":"29","status":"0","pic":null,"pai":"14","zong":"56","zuo":"0","ban_ben":"3119","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"92","biao_name":"Y_T_K_JC"},{"id":"93","name":"第三十四章：输血","pid":"29","status":"0","pic":null,"pai":"13","zong":"67","zuo":"0","ban_ben":"3186","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"93","biao_name":"Y_T_K_JD"},{"id":"94","name":"第三十五章：内分泌疾病总论与下丘脑-垂体疾病","pid":"29","status":"0","pic":null,"pai":"12","zong":"39","zuo":"0","ban_ben":"3225","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"94","biao_name":"Y_T_K_JE"},{"id":"95","name":"第三十六章：甲状腺功能亢进症与甲状腺功能减退症","pid":"29","status":"0","pic":null,"pai":"11","zong":"92","zuo":"0","ban_ben":"3494","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"95","biao_name":"Y_T_K_JF"},{"id":"96","name":"第三十七章：库欣综合征与原发性醛固酮增多症","pid":"29","status":"0","pic":null,"pai":"10","zong":"19","zuo":"0","ban_ben":"3533","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"96","biao_name":"Y_T_K_JG"},{"id":"97","name":"第三十八章：原发性慢性肾上腺皮质功能减退症与嗜铬细胞瘤","pid":"29","status":"0","pic":null,"pai":"9","zong":"18","zuo":"0","ban_ben":"3562","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"97","biao_name":"Y_T_K_JH"},{"id":"98","name":"第三十九章：糖尿病与低血糖症","pid":"29","status":"0","pic":null,"pai":"8","zong":"114","zuo":"0","ban_ben":"3721","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"98","biao_name":"Y_T_K_JI"},{"id":"99","name":"第四十章：风湿性疾病","pid":"29","status":"0","pic":null,"pai":"7","zong":"93","zuo":"0","ban_ben":"3814","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"99","biao_name":"Y_T_K_JJ"},{"id":"100","name":"第四十一章：中毒与中暑","pid":"29","status":"0","pic":null,"pai":"6","zong":"49","zuo":"0","ban_ben":"3863","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"100","biao_name":"Y_T_K_BAA"}]},{"id":"28","name":"执业医 - 外科学","pid":"0","status":"1","pic":null,"pai":"3","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计三十八章节题库","xishu":"1.00","yizuo":"2000","type_id":"28","z_type":[{"id":"101","name":"第一章：外科病人的体液和酸碱平衡失调","pid":"28","status":"0","pic":null,"pai":"39","zong":"63","zuo":"0","ban_ben":"395","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"101","biao_name":"Y_T_K_BAB"},{"id":"102","name":"第二章：休克","pid":"28","status":"0","pic":null,"pai":"38","zong":"51","zuo":"0","ban_ben":"514","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"102","biao_name":"Y_T_K_BAC"},{"id":"103","name":"第三章：围术期处理","pid":"28","status":"0","pic":null,"pai":"37","zong":"37","zuo":"0","ban_ben":"549","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"103","biao_name":"Y_T_K_BAD"},{"id":"104","name":"第四章：外科病人的代谢与营养治疗","pid":"28","status":"0","pic":null,"pai":"36","zong":"34","zuo":"0","ban_ben":"657","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"104","biao_name":"Y_T_K_BAE"},{"id":"105","name":"第五章：外科感染","pid":"28","status":"0","pic":null,"pai":"35","zong":"85","zuo":"0","ban_ben":"1014","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"105","biao_name":"Y_T_K_BAF"},{"id":"106","name":"第六章：创伤与烧伤","pid":"28","status":"0","pic":null,"pai":"34","zong":"58","zuo":"0","ban_ben":"1263","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"106","biao_name":"Y_T_K_BAG"},{"id":"107","name":"第七章：颅内压增高与脑疝","pid":"28","status":"0","pic":null,"pai":"33","zong":"28","zuo":"0","ban_ben":"1276","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"107","biao_name":"Y_T_K_BAH"},{"id":"108","name":"第八章：颅脑损伤与颅内肿瘤","pid":"28","status":"0","pic":null,"pai":"32","zong":"57","zuo":"0","ban_ben":"1777","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"108","biao_name":"Y_T_K_BAI"},{"id":"109","name":"第九章：甲状腺与甲状旁腺疾病","pid":"28","status":"0","pic":null,"pai":"31","zong":"95","zuo":"0","ban_ben":"2338","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"109","biao_name":"Y_T_K_BAJ"},{"id":"110","name":"第十章：乳房疾病","pid":"28","status":"0","pic":null,"pai":"30","zong":"63","zuo":"0","ban_ben":"2551","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"110","biao_name":"Y_T_K_BBA"},{"id":"111","name":"第十一章：胸部损伤与脓胸","pid":"28","status":"0","pic":null,"pai":"29","zong":"51","zuo":"0","ban_ben":"2639","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"111","biao_name":"Y_T_K_BBB"},{"id":"112","name":"第十二章：肺癌、食管癌与纵隔肿瘤","pid":"28","status":"0","pic":null,"pai":"28","zong":"60","zuo":"0","ban_ben":"2771","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"112","biao_name":"Y_T_K_BBC"},{"id":"113","name":"第十三章：腹外疝","pid":"28","status":"0","pic":null,"pai":"27","zong":"67","zuo":"0","ban_ben":"3299","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"113","biao_name":"Y_T_K_BBD"},{"id":"114","name":"第十四章：腹部损伤","pid":"28","status":"0","pic":null,"pai":"26","zong":"71","zuo":"0","ban_ben":"3345","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"114","biao_name":"Y_T_K_BBE"},{"id":"115","name":"第十五章：急性化脓性腹膜炎","pid":"28","status":"0","pic":null,"pai":"25","zong":"28","zuo":"0","ban_ben":"3383","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"115","biao_name":"Y_T_K_BBF"},{"id":"116","name":"第十六章：消化性溃疡与胃癌","pid":"28","status":"0","pic":null,"pai":"24","zong":"75","zuo":"0","ban_ben":"3502","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"116","biao_name":"Y_T_K_BBG"},{"id":"117","name":"第十七章：肠梗阻与阑尾炎","pid":"28","status":"0","pic":null,"pai":"23","zong":"72","zuo":"0","ban_ben":"3625","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"117","biao_name":"Y_T_K_BBH"},{"id":"118","name":"第十八章：结、直肠与肛管疾病","pid":"28","status":"0","pic":null,"pai":"22","zong":"105","zuo":"0","ban_ben":"4487","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"118","biao_name":"Y_T_K_BBI"},{"id":"119","name":"第十九章：肝脓肿与门静脉高压症","pid":"28","status":"0","pic":null,"pai":"21","zong":"43","zuo":"0","ban_ben":"4531","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"119","biao_name":"Y_T_K_BBJ"},{"id":"120","name":"第二十章：胆道疾病","pid":"28","status":"0","pic":null,"pai":"20","zong":"80","zuo":"0","ban_ben":"4611","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"120","biao_name":"Y_T_K_BCA"},{"id":"121","name":"第二十一章：胰腺疾病","pid":"28","status":"0","pic":null,"pai":"18","zong":"101","zuo":"0","ban_ben":"2265","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"121","biao_name":"Y_T_K_BCB"},{"id":"122","name":"第二十二章：周围血管疾病","pid":"28","status":"0","pic":null,"pai":"17","zong":"44","zuo":"0","ban_ben":"2309","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"122","biao_name":"Y_T_K_BCC"},{"id":"123","name":"第二十三章：隐睾症与泌尿系统损伤","pid":"28","status":"0","pic":null,"pai":"16","zong":"28","zuo":"0","ban_ben":"2358","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"123","biao_name":"Y_T_K_BCD"},{"id":"124","name":"第二十四章：前列腺炎、附睾炎与肾结核","pid":"28","status":"0","pic":null,"pai":"15","zong":"24","zuo":"0","ban_ben":"2423","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"124","biao_name":"Y_T_K_BCE"},{"id":"125","name":"第二十五章：泌尿系统梗阻","pid":"28","status":"0","pic":null,"pai":"14","zong":"26","zuo":"0","ban_ben":"3889","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"125","biao_name":"Y_T_K_BCF"},{"id":"126","name":"第二十六章：尿石症","pid":"28","status":"0","pic":null,"pai":"13","zong":"36","zuo":"0","ban_ben":"3925","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"126","biao_name":"Y_T_K_BCG"},{"id":"127","name":"第二十七章：泌尿系统肿瘤","pid":"28","status":"0","pic":null,"pai":"12","zong":"62","zuo":"0","ban_ben":"3987","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"127","biao_name":"Y_T_K_BCH"},{"id":"128","name":"第二十八章：精索静脉曲张与鞘膜积液","pid":"28","status":"0","pic":null,"pai":"11","zong":"13","zuo":"0","ban_ben":"4000","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"128","biao_name":"Y_T_K_BCI"},{"id":"129","name":"第二十九章：骨折概论","pid":"28","status":"0","pic":null,"pai":"10","zong":"73","zuo":"0","ban_ben":"4529","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"129","biao_name":"Y_T_K_BCJ"},{"id":"130","name":"第三十章：上肢骨折","pid":"28","status":"0","pic":null,"pai":"9","zong":"29","zuo":"0","ban_ben":"4102","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"130","biao_name":"Y_T_K_BDA"},{"id":"131","name":"第三十一章：下肢骨折","pid":"28","status":"0","pic":null,"pai":"8","zong":"40","zuo":"0","ban_ben":"4143","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"131","biao_name":"Y_T_K_BDB"},{"id":"132","name":"第三十二章：脊柱骨折与骨盆骨折","pid":"28","status":"0","pic":null,"pai":"7","zong":"21","zuo":"0","ban_ben":"4162","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"132","biao_name":"Y_T_K_BDC"},{"id":"133","name":"第三十三章：关节脱位与损伤","pid":"28","status":"0","pic":null,"pai":"6","zong":"29","zuo":"0","ban_ben":"4196","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"133","biao_name":"Y_T_K_BDD"},{"id":"134","name":"第三十四章：手外伤与断肢（指）再植","pid":"28","status":"0","pic":null,"pai":"5","zong":"16","zuo":"0","ban_ben":"4207","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"134","biao_name":"Y_T_K_BDE"},{"id":"135","name":"第三十五章：周围神经损伤","pid":"28","status":"0","pic":null,"pai":"4","zong":"11","zuo":"0","ban_ben":"4218","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"135","biao_name":"Y_T_K_BDF"},{"id":"136","name":"第三十六章：运动系统慢性疾病","pid":"28","status":"0","pic":null,"pai":"3","zong":"73","zuo":"0","ban_ben":"4291","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"136","biao_name":"Y_T_K_BDG"},{"id":"137","name":"第三十七章：骨与关节感染","pid":"28","status":"0","pic":null,"pai":"2","zong":"57","zuo":"0","ban_ben":"4348","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"137","biao_name":"Y_T_K_BDH"},{"id":"138","name":"第三十八章：骨肿瘤","pid":"28","status":"0","pic":null,"pai":"1","zong":"42","zuo":"0","ban_ben":"4390","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"138","biao_name":"Y_T_K_BDI"}]},{"id":"139","name":"执业医 - 生物化学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计十三章节题库","xishu":"0.00","yizuo":"0","type_id":"139","z_type":[{"id":"175","name":"第一章：蛋白质的结构与功能","pid":"139","status":"0","pic":null,"pai":"13","zong":"29","zuo":"0","ban_ben":"4612","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"175","biao_name":"Y_T_K_BHF"},{"id":"176","name":"第二章：核酸的结构与功能","pid":"139","status":"0","pic":null,"pai":"12","zong":"32","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"176","biao_name":"Y_T_K_BHG"},{"id":"177","name":"第三章：酶","pid":"139","status":"0","pic":null,"pai":"11","zong":"30","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"177","biao_name":"Y_T_K_BHH"},{"id":"178","name":"第四章：糖代谢","pid":"139","status":"0","pic":null,"pai":"10","zong":"45","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"178","biao_name":"Y_T_K_BHI"},{"id":"170","name":"第五章：脂类代谢","pid":"139","status":"0","pic":null,"pai":"9","zong":"0","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"170","biao_name":"Y_T_K_BHA"},{"id":"169","name":"第六章：生物氧化","pid":"139","status":"0","pic":null,"pai":"8","zong":"14","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"169","biao_name":"Y_T_K_BGJ"},{"id":"168","name":"第七章：氨基酸代谢","pid":"139","status":"0","pic":null,"pai":"7","zong":"30","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"168","biao_name":"Y_T_K_BGI"},{"id":"167","name":"第八章：核苷酸代谢","pid":"139","status":"0","pic":null,"pai":"6","zong":"12","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"167","biao_name":"Y_T_K_BGH"},{"id":"166","name":"第九章：基因信息的传递","pid":"139","status":"0","pic":null,"pai":"5","zong":"53","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"166","biao_name":"Y_T_K_BGG"},{"id":"165","name":"第十章：癌基因与抑癌基因","pid":"139","status":"0","pic":null,"pai":"4","zong":"4","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"165","biao_name":"Y_T_K_BGF"},{"id":"164","name":"第十一章：细胞信号转导","pid":"139","status":"0","pic":null,"pai":"3","zong":"9","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"164","biao_name":"Y_T_K_BGE"},{"id":"163","name":"第十二章：血液与肝的生物化学","pid":"139","status":"0","pic":null,"pai":"2","zong":"25","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"163","biao_name":"Y_T_K_BGD"},{"id":"162","name":"第十三章：维生素","pid":"139","status":"0","pic":null,"pai":"0","zong":"9","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"162","biao_name":"Y_T_K_BGC"}]},{"id":"140","name":"执业医 - 生理学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计十一章节题库","xishu":"0.00","yizuo":"0","type_id":"140","z_type":[{"id":"179","name":"第一章：绪论","pid":"140","status":"0","pic":null,"pai":"12","zong":"1","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"179","biao_name":"Y_T_K_BHJ"},{"id":"180","name":"第二章：细胞的基本功能","pid":"140","status":"0","pic":null,"pai":"10","zong":"29","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"180","biao_name":"Y_T_K_BIA"},{"id":"181","name":"第三章：血液","pid":"140","status":"0","pic":null,"pai":"9","zong":"23","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"181","biao_name":"Y_T_K_BIB"},{"id":"183","name":"第四章：血液循环","pid":"140","status":"0","pic":null,"pai":"8","zong":"67","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"183","biao_name":"Y_T_K_BID"},{"id":"184","name":"第五章：呼吸","pid":"140","status":"0","pic":null,"pai":"7","zong":"36","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"184","biao_name":"Y_T_K_BIE"},{"id":"190","name":"第六章：消化和呼吸","pid":"140","status":"0","pic":null,"pai":"6","zong":"43","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"190","biao_name":"Y_T_K_BJA"},{"id":"193","name":"第七章：能量代谢与体温","pid":"140","status":"0","pic":null,"pai":"5","zong":"22","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"193","biao_name":"Y_T_K_BJD"},{"id":"194","name":"第八章：尿的生成和排出","pid":"140","status":"0","pic":null,"pai":"4","zong":"30","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"194","biao_name":"Y_T_K_BJE"},{"id":"195","name":"第九章：神经系统的功能","pid":"140","status":"0","pic":null,"pai":"3","zong":"61","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"195","biao_name":"Y_T_K_BJF"},{"id":"196","name":"第十章：内分泌","pid":"140","status":"0","pic":null,"pai":"2","zong":"34","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"196","biao_name":"Y_T_K_BJG"},{"id":"197","name":"第十一章：生殖","pid":"140","status":"0","pic":null,"pai":"1","zong":"11","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"197","biao_name":"Y_T_K_BJH"}]},{"id":"141","name":"执业医 - 微生物学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计十三章节题库","xishu":"0.00","yizuo":"0","type_id":"141","z_type":[{"id":"198","name":"第一章：微生物的基本概念、细菌形态结构与细菌生理","pid":"141","status":"0","pic":null,"pai":"14","zong":"19","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"198","biao_name":"Y_T_K_BJI"},{"id":"199","name":"第二章：消毒灭菌、噬菌体与细菌的遗传变异","pid":"141","status":"0","pic":null,"pai":"12","zong":"4","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"199","biao_name":"Y_T_K_BJJ"},{"id":"200","name":"第三章：细菌的感染与免疫","pid":"141","status":"0","pic":null,"pai":"11","zong":"8","zuo":"0","ban_ben":"4739","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"200","biao_name":"Y_T_K_CAA"},{"id":"201","name":"第四章：病原体球菌、肠道杆菌、弧菌","pid":"141","status":"0","pic":null,"pai":"10","zong":"23","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"201","biao_name":"Y_T_K_CAB"},{"id":"202","name":"第五章：厌氧菌、分枝杆菌与嗜血杆菌","pid":"141","status":"0","pic":null,"pai":"9","zong":"7","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"202","biao_name":"Y_T_K_CAC"},{"id":"203","name":"第六章：动物源性细菌、其它细菌与放线菌","pid":"141","status":"0","pic":null,"pai":"8","zong":"5","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"203","biao_name":"Y_T_K_CAD"},{"id":"204","name":"第七章：支原体、立克次体、衣原体","pid":"141","status":"0","pic":null,"pai":"7","zong":"6","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"204","biao_name":"Y_T_K_CAE"},{"id":"205","name":"第八章：病毒的基本性状、病毒的感染与免疫","pid":"141","status":"0","pic":null,"pai":"6","zong":"7","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"205","biao_name":"Y_T_K_CAF"},{"id":"206","name":"第九章：病毒感染的检查方法与呼吸道病毒","pid":"141","status":"0","pic":null,"pai":"5","zong":"7","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"206","biao_name":"Y_T_K_CAG"},{"id":"207","name":"第十章：肠道病毒与肝炎病毒","pid":"141","status":"0","pic":null,"pai":"4","zong":"5","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"207","biao_name":"Y_T_K_CAH"},{"id":"208","name":"第十一章：虫媒病毒、出血热病毒与疱疹病毒","pid":"141","status":"0","pic":null,"pai":"3","zong":"7","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"208","biao_name":"Y_T_K_CAI"},{"id":"209","name":"第十二章：逆转录病毒、狂犬病病毒、人乳头瘤病毒与阮粒","pid":"141","status":"0","pic":null,"pai":"2","zong":"4","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"209","biao_name":"Y_T_K_CAJ"},{"id":"210","name":"第十三章：真菌","pid":"141","status":"0","pic":null,"pai":"1","zong":"5","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"210","biao_name":"Y_T_K_CBA"}]},{"id":"142","name":"执业医 - 免疫学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计十章节题库","xishu":"0.00","yizuo":"0","type_id":"142","z_type":[{"id":"211","name":"第一章：免疫学绪论与抗原","pid":"142","status":"0","pic":null,"pai":"9","zong":"9","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"211","biao_name":"Y_T_K_CBB"},{"id":"212","name":"第二章：免疫器官与免疫细胞","pid":"142","status":"0","pic":null,"pai":"8","zong":"34","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"212","biao_name":"Y_T_K_CBC"},{"id":"213","name":"第三章：免疫球蛋白与补体系统","pid":"142","status":"0","pic":null,"pai":"7","zong":"16","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"213","biao_name":"Y_T_K_CBD"},{"id":"214","name":"第四章：细胞因子、白细胞分化抗原与黏附分子","pid":"142","status":"0","pic":null,"pai":"6","zong":"5","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"214","biao_name":"Y_T_K_CBE"},{"id":"215","name":"第五章：主要组织相容性复合体与免疫应答","pid":"142","status":"0","pic":null,"pai":"5","zong":"7","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"215","biao_name":"Y_T_K_CBF"},{"id":"216","name":"第六章：黏膜免疫系统与免疫耐受","pid":"142","status":"0","pic":null,"pai":"4","zong":"3","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"216","biao_name":"Y_T_K_CBG"},{"id":"217","name":"第七章：抗感染免疫与超敏反应","pid":"142","status":"0","pic":null,"pai":"3","zong":"12","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"217","biao_name":"Y_T_K_CBH"},{"id":"218","name":"第八章：自身免疫病与免疫缺陷病","pid":"142","status":"0","pic":null,"pai":"2","zong":"6","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"218","biao_name":"Y_T_K_CBI"},{"id":"219","name":"第九章：肿瘤免疫与移植免疫","pid":"142","status":"0","pic":null,"pai":"1","zong":"12","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"219","biao_name":"Y_T_K_CBJ"},{"id":"220","name":"第十章：免疫学检测技术与免疫学防治","pid":"142","status":"0","pic":null,"pai":"0","zong":"5","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"220","biao_name":"Y_T_K_CCA"}]},{"id":"143","name":"执业医 - 病理学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计十四章节题库","xishu":"0.00","yizuo":"0","type_id":"143","z_type":[{"id":"221","name":"第一章：细胞组织的适应、损伤与修复","pid":"143","status":"0","pic":null,"pai":"14","zong":"50","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"221","biao_name":"Y_T_K_CCB"},{"id":"222","name":"第二章：局部血液循环障碍","pid":"143","status":"0","pic":null,"pai":"13","zong":"41","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"222","biao_name":"Y_T_K_CCC"},{"id":"223","name":"第三章：炎症","pid":"143","status":"0","pic":null,"pai":"12","zong":"36","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"223","biao_name":"Y_T_K_CCD"},{"id":"224","name":"第四章：肿瘤","pid":"143","status":"0","pic":null,"pai":"11","zong":"62","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"224","biao_name":"Y_T_K_CCE"},{"id":"225","name":"第五章：心血管系统疾病","pid":"143","status":"0","pic":null,"pai":"10","zong":"33","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"225","biao_name":"Y_T_K_CCF"},{"id":"226","name":"第六章：呼吸系统疾病","pid":"143","status":"0","pic":null,"pai":"9","zong":"26","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"226","biao_name":"Y_T_K_CCG"},{"id":"227","name":"第七章：消化系统疾病","pid":"143","status":"0","pic":null,"pai":"8","zong":"49","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"227","biao_name":"Y_T_K_CCH"},{"id":"228","name":"第八章：淋巴造血系统疾病","pid":"143","status":"0","pic":null,"pai":"7","zong":"2","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"228","biao_name":"Y_T_K_CCI"},{"id":"229","name":"第九章：泌尿系统疾病","pid":"143","status":"0","pic":null,"pai":"6","zong":"22","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"229","biao_name":"Y_T_K_CCJ"},{"id":"230","name":"第十章：生殖系统与乳腺疾病","pid":"143","status":"0","pic":null,"pai":"5","zong":"23","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"230","biao_name":"Y_T_K_CDA"},{"id":"231","name":"第十一章：内分泌系统疾病","pid":"143","status":"0","pic":null,"pai":"4","zong":"7","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"231","biao_name":"Y_T_K_CDB"},{"id":"232","name":"第十二章：流行性脑脊髓膜炎与流行性乙型脑炎","pid":"143","status":"0","pic":null,"pai":"3","zong":"10","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"232","biao_name":"Y_T_K_CDC"},{"id":"233","name":"第十三章：传染病与寄生虫病","pid":"143","status":"0","pic":null,"pai":"2","zong":"28","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"233","biao_name":"Y_T_K_CDD"},{"id":"234","name":"第十四章：艾滋病与性传播疾病","pid":"143","status":"0","pic":null,"pai":"1","zong":"10","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"234","biao_name":"Y_T_K_CDE"}]},{"id":"144","name":"执业医 - 心理学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计四章节题库","xishu":"0.00","yizuo":"0","type_id":"144","z_type":[{"id":"253","name":"第一章：总论与医学心理学基础","pid":"144","status":"0","pic":null,"pai":"4","zong":"37","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"253","biao_name":"Y_T_K_CFD"},{"id":"254","name":"第二章：心理健康与心身疾病","pid":"144","status":"0","pic":null,"pai":"3","zong":"12","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"254","biao_name":"Y_T_K_CFE"},{"id":"255","name":"第三章：心理评估、心理治疗与心理咨询","pid":"144","status":"0","pic":null,"pai":"2","zong":"47","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"255","biao_name":"Y_T_K_CFF"},{"id":"256","name":"第四章：医患关系与患者的心理问题","pid":"144","status":"0","pic":null,"pai":"1","zong":"19","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"256","biao_name":"Y_T_K_CFG"}]},{"id":"145","name":"执业医 - 伦理学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计四章节题库","xishu":"0.00","yizuo":"0","type_id":"145","z_type":[{"id":"257","name":"第一章：伦理学、医学伦理学的基本原则与规范","pid":"145","status":"0","pic":null,"pai":"4","zong":"37","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"257","biao_name":"Y_T_K_CFH"},{"id":"258","name":"第二章：医疗人际关系伦理与临床诊疗伦理","pid":"145","status":"0","pic":null,"pai":"3","zong":"27","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"258","biao_name":"Y_T_K_CFI"},{"id":"259","name":"第三章：临终关怀、公共卫生伦理与健康伦理","pid":"145","status":"0","pic":null,"pai":"2","zong":"10","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"259","biao_name":"Y_T_K_CFJ"},{"id":"260","name":"第四章：医学科研、医学新技术研究伦理与医学道德","pid":"145","status":"0","pic":null,"pai":"1","zong":"27","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"260","biao_name":"Y_T_K_CGA"}]},{"id":"146","name":"执业医 - 统计学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计四章节题库","xishu":"0.00","yizuo":"0","type_id":"146","z_type":[{"id":"261","name":"第一章：概论与数值变量数据","pid":"146","status":"0","pic":null,"pai":"4","zong":"30","zuo":"0","ban_ben":"0","jianjie":"总计四章节题库","xishu":"0.00","yizuo":"0","type_id":"261","biao_name":"Y_T_K_CGB"},{"id":"262","name":"第二章：分类变量资料","pid":"146","status":"0","pic":null,"pai":"3","zong":"13","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"262","biao_name":"Y_T_K_CGC"},{"id":"263","name":"第三章：直线相关和回归、统计图表","pid":"146","status":"0","pic":null,"pai":"2","zong":"10","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"263","biao_name":"Y_T_K_CGD"},{"id":"264","name":"第四章：秩和检验、Logistic回归分析和生存分析","pid":"146","status":"0","pic":null,"pai":"1","zong":"2","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"264","biao_name":"Y_T_K_CGE"}]},{"id":"147","name":"执业医 - 预防医学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计五章节题库","xishu":"0.00","yizuo":"0","type_id":"147","z_type":[{"id":"265","name":"第一章：绪论","pid":"147","status":"0","pic":null,"pai":"5","zong":"6","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"265","biao_name":"Y_T_K_CGF"},{"id":"266","name":"第二章：流行病学原理和方法","pid":"147","status":"0","pic":null,"pai":"4","zong":"60","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"266","biao_name":"Y_T_K_CGG"},{"id":"267","name":"第三章：临床预防服务","pid":"147","status":"0","pic":null,"pai":"3","zong":"29","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"267","biao_name":"Y_T_K_CGH"},{"id":"268","name":"第四章：社区公共卫生","pid":"147","status":"0","pic":null,"pai":"2","zong":"51","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"268","biao_name":"Y_T_K_CGI"},{"id":"269","name":"第五章：卫生服务体系与卫生管理","pid":"147","status":"0","pic":null,"pai":"1","zong":"21","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"269","biao_name":"Y_T_K_CGJ"}]},{"id":"148","name":"执业医 - 卫生法规","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计十章节题库","xishu":"0.00","yizuo":"0","type_id":"148","z_type":[{"id":"270","name":"第二章：执业医师法与医疗机构管理条例","pid":"148","status":"0","pic":null,"pai":"10","zong":"38","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"270","biao_name":"Y_T_K_CHA"},{"id":"271","name":"第三章：医疗事故处理条例与母婴保健法及其实施办法","pid":"148","status":"0","pic":null,"pai":"9","zong":"21","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"271","biao_name":"Y_T_K_CHB"},{"id":"272","name":"第四章：传染病防治法与艾滋病防治条例","pid":"148","status":"0","pic":null,"pai":"8","zong":"34","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"272","biao_name":"Y_T_K_CHC"},{"id":"273","name":"第五章：突发公共卫生事件应急条例与药品管理法实施条例","pid":"148","status":"0","pic":null,"pai":"7","zong":"15","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"273","biao_name":"Y_T_K_CHD"},{"id":"274","name":"第六章：麻醉药品和精神药品管理条例与处方管理方法","pid":"148","status":"0","pic":null,"pai":"6","zong":"10","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"274","biao_name":"Y_T_K_CHE"},{"id":"275","name":"第七章：献血法与医疗机构临床用学管理办法","pid":"148","status":"0","pic":null,"pai":"5","zong":"19","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"275","biao_name":"Y_T_K_CHF"},{"id":"276","name":"第八章：侵权责任法与人体器官移植条例","pid":"148","status":"0","pic":null,"pai":"4","zong":"6","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"276","biao_name":"Y_T_K_CHG"},{"id":"277","name":"第九章：放射诊疗管理规定与抗菌药物临床应用管理办法","pid":"148","status":"0","pic":null,"pai":"3","zong":"8","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"277","biao_name":"Y_T_K_CHH"},{"id":"278","name":"第十章：精神卫生法与一秒流通和预防接种管理条例","pid":"148","status":"0","pic":null,"pai":"2","zong":"15","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"278","biao_name":"Y_T_K_CHI"}]},{"id":"149","name":"执业医 - 传染病学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计八章节题库","xishu":"0.00","yizuo":"0","type_id":"149","z_type":[{"id":"279","name":"第一章：传染病学总论","pid":"149","status":"0","pic":null,"pai":"9","zong":"17","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"279","biao_name":"Y_T_K_CHJ"},{"id":"280","name":"第二章：病毒性肝炎与肾综合征出血热","pid":"149","status":"0","pic":null,"pai":"8","zong":"37","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"280","biao_name":"Y_T_K_CIA"},{"id":"281","name":"第三章：流行性乙型脑炎与艾滋病","pid":"149","status":"0","pic":null,"pai":"7","zong":"23","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"281","biao_name":"Y_T_K_CIB"},{"id":"282","name":"第四章：伤寒与霍乱","pid":"149","status":"0","pic":null,"pai":"6","zong":"30","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"282","biao_name":"Y_T_K_CIC"},{"id":"283","name":"第五章：细菌性痢疾与流行性脑脊髓膜炎","pid":"149","status":"0","pic":null,"pai":"5","zong":"27","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"283","biao_name":"Y_T_K_CID"},{"id":"284","name":"第六章：钩端螺旋体病与疟疾","pid":"149","status":"0","pic":null,"pai":"4","zong":"23","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"284","biao_name":"Y_T_K_CIE"},{"id":"285","name":"第七章：日本血吸虫病与囊尾蚴病","pid":"149","status":"0","pic":null,"pai":"3","zong":"12","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"285","biao_name":"Y_T_K_CIF"},{"id":"286","name":"第八章：性传播疾病","pid":"149","status":"0","pic":null,"pai":"2","zong":"24","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"286","biao_name":"Y_T_K_CIG"}]},{"id":"150","name":"执业医 - 神经病学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计八章节题库","xishu":"0.00","yizuo":"0","type_id":"150","z_type":[{"id":"287","name":"第一章：神经病学概论","pid":"150","status":"0","pic":null,"pai":"9","zong":"24","zuo":"0","ban_ben":"4772","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"287","biao_name":"Y_T_K_CIH"},{"id":"288","name":"第二章：偏头痛","pid":"150","status":"0","pic":null,"pai":"8","zong":"5","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"288","biao_name":"Y_T_K_CII"},{"id":"289","name":"第三章：脑血管疾病","pid":"150","status":"0","pic":null,"pai":"7","zong":"40","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"289","biao_name":"Y_T_K_CIJ"},{"id":"290","name":"第五章：帕金森病与癫痫","pid":"150","status":"0","pic":null,"pai":"5","zong":"31","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"290","biao_name":"Y_T_K_CJA"},{"id":"291","name":"第六章：视神经脊髓炎、急性脊髓炎与脊髓压迫症","pid":"150","status":"0","pic":null,"pai":"4","zong":"8","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"291","biao_name":"Y_T_K_CJB"},{"id":"292","name":"第七章：周围神经疾病","pid":"150","status":"0","pic":null,"pai":"3","zong":"18","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"292","biao_name":"Y_T_K_CJC"},{"id":"293","name":"第八章：重症肌无力与周期性瘫痪","pid":"150","status":"0","pic":null,"pai":"2","zong":"16","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"293","biao_name":"Y_T_K_CJD"}]},{"id":"151","name":"执业医 - 精神病学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计五章节题库","xishu":"0.00","yizuo":"0","type_id":"151","z_type":[{"id":"294","name":"第一章：概述与症状学","pid":"151","status":"0","pic":null,"pai":"5","zong":"45","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"294","biao_name":"Y_T_K_CJE"},{"id":"295","name":"第二章：器质性精神障碍与精神活性物质所致精神障碍","pid":"151","status":"0","pic":null,"pai":"4","zong":"26","zuo":"0","ban_ben":"4748","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"295","biao_name":"Y_T_K_CJF"},{"id":"296","name":"第三章：精神分裂症与心境障碍","pid":"151","status":"0","pic":null,"pai":"3","zong":"30","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"296","biao_name":"Y_T_K_CJG"},{"id":"297","name":"第四章：神经症性障碍与分离性障碍","pid":"151","status":"0","pic":null,"pai":"1","zong":"18","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"297","biao_name":"Y_T_K_CJH"},{"id":"298","name":"第五章：应激相关障碍与心理生理障碍","pid":"151","status":"0","pic":null,"pai":"0","zong":"12","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"298","biao_name":"Y_T_K_CJI"}]},{"id":"152","name":"执业医 - 妇产科学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计二十章节题库","xishu":"0.00","yizuo":"0","type_id":"152","z_type":[{"id":"299","name":"第一章：女性生殖系统解剖与生理","pid":"152","status":"0","pic":null,"pai":"19","zong":"55","zuo":"0","ban_ben":"0","jianjie":"总计二十章节题库","xishu":"0.00","yizuo":"0","type_id":"299","biao_name":"Y_T_K_CJJ"},{"id":"300","name":"第二章：妊娠生理与妊娠诊断","pid":"152","status":"0","pic":null,"pai":"18","zong":"42","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"300","biao_name":"Y_T_K_DAA"},{"id":"301","name":"第三章：异常妊娠","pid":"152","status":"0","pic":null,"pai":"17","zong":"66","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"301","biao_name":"Y_T_K_DAB"},{"id":"302","name":"第四章：妊娠特有疾病与妊娠合并内外科疾病","pid":"152","status":"0","pic":null,"pai":"16","zong":"53","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"302","biao_name":"Y_T_K_DAC"},{"id":"303","name":"第五章：胎儿异常与多胎妊娠","pid":"152","status":"0","pic":null,"pai":"15","zong":"19","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"303","biao_name":"Y_T_K_DAD"},{"id":"304","name":"第六章：前置胎盘、胎盘早剥与胎膜早破","pid":"152","status":"0","pic":null,"pai":"14","zong":"48","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"304","biao_name":"Y_T_K_DAE"},{"id":"305","name":"第七章：产前检查与孕期保健","pid":"152","status":"0","pic":null,"pai":"13","zong":"36","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"305","biao_name":"Y_T_K_DAF"},{"id":"306","name":"第八章：遗传咨询、产前筛查与产前诊断","pid":"152","status":"0","pic":null,"pai":"12","zong":"4","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"306","biao_name":"Y_T_K_DAG"},{"id":"307","name":"第九章：正常分娩","pid":"152","status":"0","pic":null,"pai":"11","zong":"43","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"307","biao_name":"Y_T_K_DAH"},{"id":"308","name":"第十章：异常分娩","pid":"152","status":"0","pic":null,"pai":"10","zong":"77","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"308","biao_name":"Y_T_K_DAI"},{"id":"309","name":"第十一章：分娩期并发症","pid":"152","status":"0","pic":null,"pai":"9","zong":"38","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"309","biao_name":"Y_T_K_DAJ"},{"id":"310","name":"第十二章：正常产褥与产褥期并发症","pid":"152","status":"0","pic":null,"pai":"8","zong":"0","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"310","biao_name":"Y_T_K_DBA"},{"id":"311","name":"第十三章：女性生殖系统炎症","pid":"152","status":"0","pic":null,"pai":"7","zong":"49","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"311","biao_name":"Y_T_K_DBB"},{"id":"312","name":"第十四章：子宫内膜异位症、子宫腺肌病与子宫脱垂","pid":"152","status":"0","pic":null,"pai":"6","zong":"44","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"312","biao_name":"Y_T_K_DBC"},{"id":"313","name":"第十五章：子宫颈癌、子宫肌瘤与子宫内膜癌","pid":"152","status":"0","pic":null,"pai":"5","zong":"99","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"313","biao_name":"Y_T_K_DBD"},{"id":"314","name":"第十六章：卵巢肿瘤","pid":"152","status":"0","pic":null,"pai":"4","zong":"56","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"314","biao_name":"Y_T_K_DBE"},{"id":"315","name":"第十七章：妊娠滋养细胞疾病","pid":"152","status":"0","pic":null,"pai":"3","zong":"43","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"315","biao_name":"Y_T_K_DBF"},{"id":"316","name":"第十八章：生殖内分泌疾病","pid":"152","status":"0","pic":null,"pai":"2","zong":"57","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"316","biao_name":"Y_T_K_DBG"},{"id":"317","name":"第十九章：不孕症与辅助生殖技术","pid":"152","status":"0","pic":null,"pai":"1","zong":"8","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"317","biao_name":"Y_T_K_DBH"},{"id":"318","name":"第二十章：计划生育与妇女保健","pid":"152","status":"0","pic":null,"pai":"0","zong":"75","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"318","biao_name":"Y_T_K_DBI"}]},{"id":"153","name":"执业医 - 儿科学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计十二章节题库","xishu":"0.00","yizuo":"0","type_id":"153","z_type":[{"id":"319","name":"第一章：绪论、生长发育与儿童保健","pid":"153","status":"0","pic":null,"pai":"14","zong":"74","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"319","biao_name":"Y_T_K_DBJ"},{"id":"320","name":"第二章：营养与营养障碍疾病","pid":"153","status":"0","pic":null,"pai":"13","zong":"97","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"320","biao_name":"Y_T_K_DCA"},{"id":"321","name":"第三章：新生儿与新生儿疾病","pid":"153","status":"0","pic":null,"pai":"12","zong":"86","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"321","biao_name":"Y_T_K_DCB"},{"id":"322","name":"第四章：遗传性疾病","pid":"153","status":"0","pic":null,"pai":"11","zong":"50","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"322","biao_name":"Y_T_K_DCC"},{"id":"323","name":"第五章：免疫性疾病","pid":"153","status":"0","pic":null,"pai":"10","zong":"20","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"323","biao_name":"Y_T_K_DCD"},{"id":"324","name":"第六章：感染性疾病","pid":"153","status":"0","pic":null,"pai":"9","zong":"98","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"324","biao_name":"Y_T_K_DCE"},{"id":"325","name":"第七章：消化系统疾病","pid":"153","status":"0","pic":null,"pai":"8","zong":"77","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"325","biao_name":"Y_T_K_DCF"},{"id":"326","name":"第八章：呼吸系统疾病","pid":"153","status":"0","pic":null,"pai":"7","zong":"80","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"326","biao_name":"Y_T_K_DCG"},{"id":"327","name":"第九章：心血管系统疾病","pid":"153","status":"0","pic":null,"pai":"6","zong":"73","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"327","biao_name":"Y_T_K_DCH"},{"id":"328","name":"第十章：泌尿系统疾病","pid":"153","status":"0","pic":null,"pai":"5","zong":"66","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"328","biao_name":"Y_T_K_DCI"},{"id":"329","name":"第十一章：血液系统疾病","pid":"153","status":"0","pic":null,"pai":"4","zong":"62","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"329","biao_name":"Y_T_K_DCJ"},{"id":"330","name":" 第十二章：神经系统与内分泌系统疾病","pid":"153","status":"0","pic":null,"pai":"0","zong":"82","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"330","biao_name":"Y_T_K_DDA"}]},{"id":"235","name":"执业医 - 药理学","pid":"0","status":"1","pic":null,"pai":"0","zong":"0","zuo":"0","ban_ben":"0","jianjie":"总计十八章节题库","xishu":"0.00","yizuo":"0","type_id":"235","z_type":[{"id":"236","name":"第一章：药物代谢动力学与药物效应动力学","pid":"235","status":"0","pic":null,"pai":"19","zong":"11","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"236","biao_name":"Y_T_K_CDG"},{"id":"237","name":"第二章：胆碱受体激动药、抗胆碱酯酶药与胆碱酯酶复活药","pid":"235","status":"0","pic":null,"pai":"18","zong":"4","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"237","biao_name":"Y_T_K_CDH"},{"id":"238","name":"第三章：胆碱受体阻断药、肾上腺受体激动药与阻断药","pid":"235","status":"0","pic":null,"pai":"17","zong":"14","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"238","biao_name":"Y_T_K_CDI"},{"id":"239","name":"第四章：局麻醉药与镇静催眠药","pid":"235","status":"0","pic":null,"pai":"16","zong":"8","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"239","biao_name":"Y_T_K_CDJ"},{"id":"240","name":"第五章：抗癫痫药与抗惊厥药","pid":"235","status":"0","pic":null,"pai":"15","zong":"7","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"240","biao_name":"Y_T_K_CEA"},{"id":"241","name":"第六章：抗帕金森病药与抗精神失常药","pid":"235","status":"0","pic":null,"pai":"14","zong":"14","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"241","biao_name":"Y_T_K_CEB"},{"id":"242","name":"第七章：镇痛药与解热镇痛抗炎药","pid":"235","status":"0","pic":null,"pai":"13","zong":"8","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"242","biao_name":"Y_T_K_CEC"},{"id":"243","name":"第八章：钙通道阻滞药与抗心律失常药","pid":"235","status":"0","pic":null,"pai":"12","zong":"12","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"243","biao_name":"Y_T_K_CED"},{"id":"244","name":"第九章：利尿药与抗血压药","pid":"235","status":"0","pic":null,"pai":"11","zong":"27","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"244","biao_name":"Y_T_K_CEE"},{"id":"245","name":"第十章：治疗心衰的药物、抗动脉粥样硬化药与抗心绞痛药","pid":"235","status":"0","pic":null,"pai":"10","zong":"13","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"245","biao_name":"Y_T_K_CEF"},{"id":"246","name":"第十一章：作用于血液及造血器官的药物与组胺受体阻断药","pid":"235","status":"0","pic":null,"pai":"9","zong":"10","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"246","biao_name":"Y_T_K_CEG"},{"id":"247","name":"第十二章：作用于呼吸系统与消化系统的药物","pid":"235","status":"0","pic":null,"pai":"8","zong":"7","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"247","biao_name":"Y_T_K_CEH"},{"id":"248","name":"第十三章：糖皮质激素类药、抗甲状腺药与降糖药","pid":"235","status":"0","pic":null,"pai":"7","zong":"11","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"248","biao_name":"Y_T_K_CEI"},{"id":"249","name":"第十五章：β-内酰胺类、大环内酯类与林可霉素类抗生素","pid":"235","status":"0","pic":null,"pai":"5","zong":"13","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"249","biao_name":"Y_T_K_CEJ"},{"id":"250","name":"第十六章：氨基糖苷类与四环素类抗生素","pid":"235","status":"0","pic":null,"pai":"4","zong":"10","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"250","biao_name":"Y_T_K_CFA"},{"id":"251","name":"第十七章：人工合成的抗菌药、抗病毒与抗真菌药","pid":"235","status":"0","pic":null,"pai":"3","zong":"10","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"251","biao_name":"Y_T_K_CFB"},{"id":"252","name":"第十八章：抗结核药、抗疟药与抗肿瘤药","pid":"235","status":"0","pic":null,"pai":"2","zong":"15","zuo":"0","ban_ben":"0","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"252","biao_name":"Y_T_K_CFC"}]}]
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
         * id : 29
         * name : 执业医 - 内科学
         * pid : 0
         * status : 1
         * pic : null
         * pai : 5
         * zong : 0
         * zuo : 0
         * ban_ben : 0
         * jianjie : 总计四十一章节题库
         * xishu : 1.00
         * yizuo : 2000
         * type_id : 29
         * z_type : [{"id":"60","name":"第一章：慢性阻塞性肺疾病与支气管哮喘","pid":"29","status":"0","pic":null,"pai":"50","zong":"60","zuo":"0","ban_ben":"4743","jianjie":"","xishu":"0.00","yizuo":"450","type_id":"60","biao_name":"Y_T_K_GA"},{"id":"61","name":"第二章：支气管扩张症","pid":"29","status":"0","pic":null,"pai":"49","zong":"21","zuo":"0","ban_ben":"599","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"61","biao_name":"Y_T_K_GB"},{"id":"62","name":"第三章：肺部感染性疾病（肺炎与肺脓肿）","pid":"29","status":"0","pic":null,"pai":"48","zong":"84","zuo":"0","ban_ben":"2590","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"62","biao_name":"Y_T_K_GC"},{"id":"63","name":"第四章：肺结核","pid":"29","status":"0","pic":null,"pai":"47","zong":"32","zuo":"0","ban_ben":"2591","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"63","biao_name":"Y_T_K_GD"},{"id":"64","name":"第五章：血栓栓塞症","pid":"29","status":"0","pic":null,"pai":"46","zong":"9","zuo":"0","ban_ben":"1039","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"64","biao_name":"Y_T_K_GE"},{"id":"65","name":"第六章：肺动脉高压与肺源性心脏病","pid":"29","status":"0","pic":null,"pai":"44","zong":"39","zuo":"0","ban_ben":"1152","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"65","biao_name":"Y_T_K_GF"},{"id":"66","name":"第七章：急性呼吸窘迫综合征","pid":"29","status":"0","pic":null,"pai":"43","zong":"38","zuo":"0","ban_ben":"1368","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"66","biao_name":"Y_T_K_GG"},{"id":"67","name":"第八章：胸腔积液","pid":"29","status":"0","pic":null,"pai":"42","zong":"19","zuo":"0","ban_ben":"1429","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"67","biao_name":"Y_T_K_GH"},{"id":"68","name":"第九章：呼吸衰竭与呼吸支持技术","pid":"29","status":"0","pic":null,"pai":"41","zong":"37","zuo":"0","ban_ben":"1472","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"68","biao_name":"Y_T_K_GI"},{"id":"69","name":"第十章：心力衰竭","pid":"29","status":"0","pic":null,"pai":"40","zong":"87","zuo":"0","ban_ben":"1559","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"69","biao_name":"Y_T_K_GJ"},{"id":"70","name":"第十一章：心律失常","pid":"29","status":"0","pic":null,"pai":"39","zong":"107","zuo":"0","ban_ben":"1666","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"70","biao_name":"Y_T_K_HA"},{"id":"71","name":"第十二章：冠状动脉粥样硬化性心脏病","pid":"29","status":"0","pic":null,"pai":"38","zong":"103","zuo":"0","ban_ben":"1916","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"71","biao_name":"Y_T_K_HB"},{"id":"72","name":"第十三章：高血压","pid":"29","status":"0","pic":null,"pai":"37","zong":"52","zuo":"0","ban_ben":"1934","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"72","biao_name":"Y_T_K_HC"},{"id":"73","name":"第十四章：心肌疾病","pid":"29","status":"0","pic":null,"pai":"36","zong":"44","zuo":"0","ban_ben":"1987","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"73","biao_name":"Y_T_K_HD"},{"id":"74","name":"第十五章：心脏瓣膜病","pid":"29","status":"0","pic":null,"pai":"35","zong":"61","zuo":"0","ban_ben":"2045","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"74","biao_name":"Y_T_K_HE"},{"id":"75","name":"第十六章：心包疾病（急性心包炎与心脏压塞）","pid":"29","status":"0","pic":null,"pai":"34","zong":"38","zuo":"0","ban_ben":"2113","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"75","biao_name":"Y_T_K_HF"},{"id":"76","name":"第十七章：感染性心内膜炎","pid":"29","status":"0","pic":null,"pai":"33","zong":"24","zuo":"0","ban_ben":"2146","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"76","biao_name":"Y_T_K_HG"},{"id":"77","name":"第十八章：心脏骤停与心脏性猝死","pid":"29","status":"0","pic":null,"pai":"32","zong":"27","zuo":"0","ban_ben":"2195","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"77","biao_name":"Y_T_K_HH"},{"id":"78","name":"第十九章：胃食管反流病与胃炎","pid":"29","status":"0","pic":null,"pai":"31","zong":"70","zuo":"0","ban_ben":"2240","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"78","biao_name":"Y_T_K_HI"},{"id":"79","name":"第二十章：消化性溃疡","pid":"29","status":"0","pic":null,"pai":"30","zong":"84","zuo":"0","ban_ben":"2516","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"79","biao_name":"Y_T_K_HJ"},{"id":"80","name":"第二十一章：肠结核与结核性腹膜炎","pid":"29","status":"0","pic":null,"pai":"26","zong":"31","zuo":"0","ban_ben":"367","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"80","biao_name":"Y_T_K_IA"},{"id":"81","name":"第二十二章：炎症性肠病与功能性胃肠病","pid":"29","status":"0","pic":null,"pai":"25","zong":"57","zuo":"0","ban_ben":"613","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"81","biao_name":"Y_T_K_IB"},{"id":"82","name":"第二十三章：脂肪性肝病与肝硬化","pid":"29","status":"0","pic":null,"pai":"24","zong":"53","zuo":"0","ban_ben":"817","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"82","biao_name":"Y_T_K_IC"},{"id":"83","name":"第二十四章：原发性肝癌与肝性脑病","pid":"29","status":"0","pic":null,"pai":"23","zong":"50","zuo":"0","ban_ben":"1056","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"83","biao_name":"Y_T_K_ID"},{"id":"84","name":"第二十五章：消化道大出血","pid":"29","status":"0","pic":null,"pai":"22","zong":"38","zuo":"0","ban_ben":"1175","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"84","biao_name":"Y_T_K_IE"},{"id":"85","name":"第二十六章：尿液检查与肾小球疾病","pid":"29","status":"0","pic":null,"pai":"21","zong":"127","zuo":"0","ban_ben":"3347","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"85","biao_name":"Y_T_K_IF"},{"id":"86","name":"第二十七章：尿路感染","pid":"29","status":"0","pic":null,"pai":"20","zong":"36","zuo":"0","ban_ben":"2720","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"86","biao_name":"Y_T_K_IG"},{"id":"87","name":"第二十八章：肾功能不全","pid":"29","status":"0","pic":null,"pai":"19","zong":"75","zuo":"0","ban_ben":"2791","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"87","biao_name":"Y_T_K_IH"},{"id":"88","name":"第二十九章：贫血","pid":"29","status":"0","pic":null,"pai":"18","zong":"97","zuo":"0","ban_ben":"2948","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"88","biao_name":"Y_T_K_II"},{"id":"89","name":"第三十章：白细胞减少和粒细胞缺乏症","pid":"29","status":"0","pic":null,"pai":"17","zong":"5","zuo":"0","ban_ben":"2953","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"89","biao_name":"Y_T_K_IJ"},{"id":"90","name":"第三十一章：骨髓增生异常综合征与白血病","pid":"29","status":"0","pic":null,"pai":"16","zong":"84","zuo":"0","ban_ben":"3037","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"90","biao_name":"Y_T_K_JA"},{"id":"91","name":"第三十二章：淋巴瘤与多发性骨髓瘤","pid":"29","status":"0","pic":null,"pai":"15","zong":"26","zuo":"0","ban_ben":"3064","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"91","biao_name":"Y_T_K_JB"},{"id":"92","name":"第三十三章：出血性疾病","pid":"29","status":"0","pic":null,"pai":"14","zong":"56","zuo":"0","ban_ben":"3119","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"92","biao_name":"Y_T_K_JC"},{"id":"93","name":"第三十四章：输血","pid":"29","status":"0","pic":null,"pai":"13","zong":"67","zuo":"0","ban_ben":"3186","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"93","biao_name":"Y_T_K_JD"},{"id":"94","name":"第三十五章：内分泌疾病总论与下丘脑-垂体疾病","pid":"29","status":"0","pic":null,"pai":"12","zong":"39","zuo":"0","ban_ben":"3225","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"94","biao_name":"Y_T_K_JE"},{"id":"95","name":"第三十六章：甲状腺功能亢进症与甲状腺功能减退症","pid":"29","status":"0","pic":null,"pai":"11","zong":"92","zuo":"0","ban_ben":"3494","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"95","biao_name":"Y_T_K_JF"},{"id":"96","name":"第三十七章：库欣综合征与原发性醛固酮增多症","pid":"29","status":"0","pic":null,"pai":"10","zong":"19","zuo":"0","ban_ben":"3533","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"96","biao_name":"Y_T_K_JG"},{"id":"97","name":"第三十八章：原发性慢性肾上腺皮质功能减退症与嗜铬细胞瘤","pid":"29","status":"0","pic":null,"pai":"9","zong":"18","zuo":"0","ban_ben":"3562","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"97","biao_name":"Y_T_K_JH"},{"id":"98","name":"第三十九章：糖尿病与低血糖症","pid":"29","status":"0","pic":null,"pai":"8","zong":"114","zuo":"0","ban_ben":"3721","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"98","biao_name":"Y_T_K_JI"},{"id":"99","name":"第四十章：风湿性疾病","pid":"29","status":"0","pic":null,"pai":"7","zong":"93","zuo":"0","ban_ben":"3814","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"99","biao_name":"Y_T_K_JJ"},{"id":"100","name":"第四十一章：中毒与中暑","pid":"29","status":"0","pic":null,"pai":"6","zong":"49","zuo":"0","ban_ben":"3863","jianjie":"","xishu":"0.00","yizuo":"0","type_id":"100","biao_name":"Y_T_K_BAA"}]
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
             * id : 60
             * name : 第一章：慢性阻塞性肺疾病与支气管哮喘
             * pid : 29
             * status : 0
             * pic : null
             * pai : 50
             * zong : 60
             * zuo : 0
             * ban_ben : 4743
             * jianjie :
             * xishu : 0.00
             * yizuo : 450
             * type_id : 60
             * biao_name : Y_T_K_GA
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
