package com.yang.mymedicalpoject.bean;

import java.util.List;

/**
 * @author gzp
 * @description:
 * @date : 2020/11/28 19:53
 */
public class Ti_Ying_Bean {

    @Override
    public String toString() {
        return "Ti_Ying_Bean{" +
                "fen='" + fen + '\'' +
                ", u_type=" + u_type +
                '}';
    }

    /**
     * fen : 0
     * u_type : [{"ban_ben":"0","id":"29","jianjie":"总计四十一章节题库","name":"执业医 - 内科学","pai":"5","pid":"0","status":"1","type_id":"29","xishu":"1.00","yizuo":"2000","z_type":[{"ban_ben":"4743","biao_name":"Y_T_K_GA","id":"60","jianjie":"","name":"第一章：慢性阻塞性肺疾病与支气管哮喘","pai":"50","pid":"29","status":"0","type_id":"60","xishu":"0.00","yizuo":"450","zong":"60","zuo":"0"},{"ban_ben":"599","biao_name":"Y_T_K_GB","id":"61","jianjie":"","name":"第二章：支气管扩张症","pai":"49","pid":"29","status":"0","type_id":"61","xishu":"0.00","yizuo":"0","zong":"21","zuo":"0"},{"ban_ben":"2590","biao_name":"Y_T_K_GC","id":"62","jianjie":"","name":"第三章：肺部感染性疾病（肺炎与肺脓肿）","pai":"48","pid":"29","status":"0","type_id":"62","xishu":"0.00","yizuo":"0","zong":"84","zuo":"0"},{"ban_ben":"2591","biao_name":"Y_T_K_GD","id":"63","jianjie":"","name":"第四章：肺结核","pai":"47","pid":"29","status":"0","type_id":"63","xishu":"0.00","yizuo":"0","zong":"32","zuo":"0"},{"ban_ben":"1039","biao_name":"Y_T_K_GE","id":"64","jianjie":"","name":"第五章：血栓栓塞症","pai":"46","pid":"29","status":"0","type_id":"64","xishu":"0.00","yizuo":"0","zong":"9","zuo":"0"},{"ban_ben":"1152","biao_name":"Y_T_K_GF","id":"65","jianjie":"","name":"第六章：肺动脉高压与肺源性心脏病","pai":"44","pid":"29","status":"0","type_id":"65","xishu":"0.00","yizuo":"0","zong":"39","zuo":"0"},{"ban_ben":"1368","biao_name":"Y_T_K_GG","id":"66","jianjie":"","name":"第七章：急性呼吸窘迫综合征","pai":"43","pid":"29","status":"0","type_id":"66","xishu":"0.00","yizuo":"0","zong":"38","zuo":"0"},{"ban_ben":"1429","biao_name":"Y_T_K_GH","id":"67","jianjie":"","name":"第八章：胸腔积液","pai":"42","pid":"29","status":"0","type_id":"67","xishu":"0.00","yizuo":"0","zong":"19","zuo":"0"},{"ban_ben":"1472","biao_name":"Y_T_K_GI","id":"68","jianjie":"","name":"第九章：呼吸衰竭与呼吸支持技术","pai":"41","pid":"29","status":"0","type_id":"68","xishu":"0.00","yizuo":"0","zong":"37","zuo":"0"},{"ban_ben":"1559","biao_name":"Y_T_K_GJ","id":"69","jianjie":"","name":"第十章：心力衰竭","pai":"40","pid":"29","status":"0","type_id":"69","xishu":"0.00","yizuo":"0","zong":"87","zuo":"0"},{"ban_ben":"1666","biao_name":"Y_T_K_HA","id":"70","jianjie":"","name":"第十一章：心律失常","pai":"39","pid":"29","status":"0","type_id":"70","xishu":"0.00","yizuo":"0","zong":"107","zuo":"0"},{"ban_ben":"1916","biao_name":"Y_T_K_HB","id":"71","jianjie":"","name":"第十二章：冠状动脉粥样硬化性心脏病","pai":"38","pid":"29","status":"0","type_id":"71","xishu":"0.00","yizuo":"0","zong":"103","zuo":"0"},{"ban_ben":"1934","biao_name":"Y_T_K_HC","id":"72","jianjie":"","name":"第十三章：高血压","pai":"37","pid":"29","status":"0","type_id":"72","xishu":"0.00","yizuo":"0","zong":"52","zuo":"0"},{"ban_ben":"1987","biao_name":"Y_T_K_HD","id":"73","jianjie":"","name":"第十四章：心肌疾病","pai":"36","pid":"29","status":"0","type_id":"73","xishu":"0.00","yizuo":"0","zong":"44","zuo":"0"},{"ban_ben":"2045","biao_name":"Y_T_K_HE","id":"74","jianjie":"","name":"第十五章：心脏瓣膜病","pai":"35","pid":"29","status":"0","type_id":"74","xishu":"0.00","yizuo":"0","zong":"61","zuo":"0"},{"ban_ben":"2113","biao_name":"Y_T_K_HF","id":"75","jianjie":"","name":"第十六章：心包疾病（急性心包炎与心脏压塞）","pai":"34","pid":"29","status":"0","type_id":"75","xishu":"0.00","yizuo":"0","zong":"38","zuo":"0"},{"ban_ben":"2146","biao_name":"Y_T_K_HG","id":"76","jianjie":"","name":"第十七章：感染性心内膜炎","pai":"33","pid":"29","status":"0","type_id":"76","xishu":"0.00","yizuo":"0","zong":"24","zuo":"0"},{"ban_ben":"2195","biao_name":"Y_T_K_HH","id":"77","jianjie":"","name":"第十八章：心脏骤停与心脏性猝死","pai":"32","pid":"29","status":"0","type_id":"77","xishu":"0.00","yizuo":"0","zong":"27","zuo":"0"},{"ban_ben":"2240","biao_name":"Y_T_K_HI","id":"78","jianjie":"","name":"第十九章：胃食管反流病与胃炎","pai":"31","pid":"29","status":"0","type_id":"78","xishu":"0.00","yizuo":"0","zong":"70","zuo":"0"},{"ban_ben":"2516","biao_name":"Y_T_K_HJ","id":"79","jianjie":"","name":"第二十章：消化性溃疡","pai":"30","pid":"29","status":"0","type_id":"79","xishu":"0.00","yizuo":"0","zong":"84","zuo":"0"},{"ban_ben":"367","biao_name":"Y_T_K_IA","id":"80","jianjie":"","name":"第二十一章：肠结核与结核性腹膜炎","pai":"26","pid":"29","status":"0","type_id":"80","xishu":"0.00","yizuo":"0","zong":"31","zuo":"0"},{"ban_ben":"613","biao_name":"Y_T_K_IB","id":"81","jianjie":"","name":"第二十二章：炎症性肠病与功能性胃肠病","pai":"25","pid":"29","status":"0","type_id":"81","xishu":"0.00","yizuo":"0","zong":"57","zuo":"0"},{"ban_ben":"817","biao_name":"Y_T_K_IC","id":"82","jianjie":"","name":"第二十三章：脂肪性肝病与肝硬化","pai":"24","pid":"29","status":"0","type_id":"82","xishu":"0.00","yizuo":"0","zong":"53","zuo":"0"},{"ban_ben":"1056","biao_name":"Y_T_K_ID","id":"83","jianjie":"","name":"第二十四章：原发性肝癌与肝性脑病","pai":"23","pid":"29","status":"0","type_id":"83","xishu":"0.00","yizuo":"0","zong":"50","zuo":"0"},{"ban_ben":"1175","biao_name":"Y_T_K_IE","id":"84","jianjie":"","name":"第二十五章：消化道大出血","pai":"22","pid":"29","status":"0","type_id":"84","xishu":"0.00","yizuo":"0","zong":"38","zuo":"0"},{"ban_ben":"3347","biao_name":"Y_T_K_IF","id":"85","jianjie":"","name":"第二十六章：尿液检查与肾小球疾病","pai":"21","pid":"29","status":"0","type_id":"85","xishu":"0.00","yizuo":"0","zong":"127","zuo":"0"},{"ban_ben":"2720","biao_name":"Y_T_K_IG","id":"86","jianjie":"","name":"第二十七章：尿路感染","pai":"20","pid":"29","status":"0","type_id":"86","xishu":"0.00","yizuo":"0","zong":"36","zuo":"0"},{"ban_ben":"2791","biao_name":"Y_T_K_IH","id":"87","jianjie":"","name":"第二十八章：肾功能不全","pai":"19","pid":"29","status":"0","type_id":"87","xishu":"0.00","yizuo":"0","zong":"75","zuo":"0"},{"ban_ben":"2948","biao_name":"Y_T_K_II","id":"88","jianjie":"","name":"第二十九章：贫血","pai":"18","pid":"29","status":"0","type_id":"88","xishu":"0.00","yizuo":"0","zong":"97","zuo":"0"},{"ban_ben":"2953","biao_name":"Y_T_K_IJ","id":"89","jianjie":"","name":"第三十章：白细胞减少和粒细胞缺乏症","pai":"17","pid":"29","status":"0","type_id":"89","xishu":"0.00","yizuo":"0","zong":"5","zuo":"0"},{"ban_ben":"3037","biao_name":"Y_T_K_JA","id":"90","jianjie":"","name":"第三十一章：骨髓增生异常综合征与白血病","pai":"16","pid":"29","status":"0","type_id":"90","xishu":"0.00","yizuo":"0","zong":"84","zuo":"0"},{"ban_ben":"3064","biao_name":"Y_T_K_JB","id":"91","jianjie":"","name":"第三十二章：淋巴瘤与多发性骨髓瘤","pai":"15","pid":"29","status":"0","type_id":"91","xishu":"0.00","yizuo":"0","zong":"26","zuo":"0"},{"ban_ben":"3119","biao_name":"Y_T_K_JC","id":"92","jianjie":"","name":"第三十三章：出血性疾病","pai":"14","pid":"29","status":"0","type_id":"92","xishu":"0.00","yizuo":"0","zong":"56","zuo":"0"},{"ban_ben":"3186","biao_name":"Y_T_K_JD","id":"93","jianjie":"","name":"第三十四章：输血","pai":"13","pid":"29","status":"0","type_id":"93","xishu":"0.00","yizuo":"0","zong":"67","zuo":"0"},{"ban_ben":"3225","biao_name":"Y_T_K_JE","id":"94","jianjie":"","name":"第三十五章：内分泌疾病总论与下丘脑-垂体疾病","pai":"12","pid":"29","status":"0","type_id":"94","xishu":"0.00","yizuo":"0","zong":"39","zuo":"0"},{"ban_ben":"3494","biao_name":"Y_T_K_JF","id":"95","jianjie":"","name":"第三十六章：甲状腺功能亢进症与甲状腺功能减退症","pai":"11","pid":"29","status":"0","type_id":"95","xishu":"0.00","yizuo":"0","zong":"92","zuo":"0"},{"ban_ben":"3533","biao_name":"Y_T_K_JG","id":"96","jianjie":"","name":"第三十七章：库欣综合征与原发性醛固酮增多症","pai":"10","pid":"29","status":"0","type_id":"96","xishu":"0.00","yizuo":"0","zong":"19","zuo":"0"},{"ban_ben":"3562","biao_name":"Y_T_K_JH","id":"97","jianjie":"","name":"第三十八章：原发性慢性肾上腺皮质功能减退症与嗜铬细胞瘤","pai":"9","pid":"29","status":"0","type_id":"97","xishu":"0.00","yizuo":"0","zong":"18","zuo":"0"},{"ban_ben":"3721","biao_name":"Y_T_K_JI","id":"98","jianjie":"","name":"第三十九章：糖尿病与低血糖症","pai":"8","pid":"29","status":"0","type_id":"98","xishu":"0.00","yizuo":"0","zong":"114","zuo":"0"},{"ban_ben":"3814","biao_name":"Y_T_K_JJ","id":"99","jianjie":"","name":"第四十章：风湿性疾病","pai":"7","pid":"29","status":"0","type_id":"99","xishu":"0.00","yizuo":"0","zong":"93","zuo":"0"},{"ban_ben":"3863","biao_name":"Y_T_K_BAA","id":"100","jianjie":"","name":"第四十一章：中毒与中暑","pai":"6","pid":"29","status":"0","type_id":"100","xishu":"0.00","yizuo":"0","zong":"49","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"28","jianjie":"总计三十八章节题库","name":"执业医 - 外科学","pai":"3","pid":"0","status":"1","type_id":"28","xishu":"1.00","yizuo":"2000","z_type":[{"ban_ben":"395","biao_name":"Y_T_K_BAB","id":"101","jianjie":"","name":"第一章：外科病人的体液和酸碱平衡失调","pai":"39","pid":"28","status":"0","type_id":"101","xishu":"0.00","yizuo":"0","zong":"63","zuo":"0"},{"ban_ben":"514","biao_name":"Y_T_K_BAC","id":"102","jianjie":"","name":"第二章：休克","pai":"38","pid":"28","status":"0","type_id":"102","xishu":"0.00","yizuo":"0","zong":"51","zuo":"0"},{"ban_ben":"549","biao_name":"Y_T_K_BAD","id":"103","jianjie":"","name":"第三章：围术期处理","pai":"37","pid":"28","status":"0","type_id":"103","xishu":"0.00","yizuo":"0","zong":"37","zuo":"0"},{"ban_ben":"657","biao_name":"Y_T_K_BAE","id":"104","jianjie":"","name":"第四章：外科病人的代谢与营养治疗","pai":"36","pid":"28","status":"0","type_id":"104","xishu":"0.00","yizuo":"0","zong":"34","zuo":"0"},{"ban_ben":"1014","biao_name":"Y_T_K_BAF","id":"105","jianjie":"","name":"第五章：外科感染","pai":"35","pid":"28","status":"0","type_id":"105","xishu":"0.00","yizuo":"0","zong":"85","zuo":"0"},{"ban_ben":"1263","biao_name":"Y_T_K_BAG","id":"106","jianjie":"","name":"第六章：创伤与烧伤","pai":"34","pid":"28","status":"0","type_id":"106","xishu":"0.00","yizuo":"0","zong":"58","zuo":"0"},{"ban_ben":"1276","biao_name":"Y_T_K_BAH","id":"107","jianjie":"","name":"第七章：颅内压增高与脑疝","pai":"33","pid":"28","status":"0","type_id":"107","xishu":"0.00","yizuo":"0","zong":"28","zuo":"0"},{"ban_ben":"1777","biao_name":"Y_T_K_BAI","id":"108","jianjie":"","name":"第八章：颅脑损伤与颅内肿瘤","pai":"32","pid":"28","status":"0","type_id":"108","xishu":"0.00","yizuo":"0","zong":"57","zuo":"0"},{"ban_ben":"2338","biao_name":"Y_T_K_BAJ","id":"109","jianjie":"","name":"第九章：甲状腺与甲状旁腺疾病","pai":"31","pid":"28","status":"0","type_id":"109","xishu":"0.00","yizuo":"0","zong":"95","zuo":"0"},{"ban_ben":"2551","biao_name":"Y_T_K_BBA","id":"110","jianjie":"","name":"第十章：乳房疾病","pai":"30","pid":"28","status":"0","type_id":"110","xishu":"0.00","yizuo":"0","zong":"63","zuo":"0"},{"ban_ben":"2639","biao_name":"Y_T_K_BBB","id":"111","jianjie":"","name":"第十一章：胸部损伤与脓胸","pai":"29","pid":"28","status":"0","type_id":"111","xishu":"0.00","yizuo":"0","zong":"51","zuo":"0"},{"ban_ben":"2771","biao_name":"Y_T_K_BBC","id":"112","jianjie":"","name":"第十二章：肺癌、食管癌与纵隔肿瘤","pai":"28","pid":"28","status":"0","type_id":"112","xishu":"0.00","yizuo":"0","zong":"60","zuo":"0"},{"ban_ben":"3299","biao_name":"Y_T_K_BBD","id":"113","jianjie":"","name":"第十三章：腹外疝","pai":"27","pid":"28","status":"0","type_id":"113","xishu":"0.00","yizuo":"0","zong":"67","zuo":"0"},{"ban_ben":"3345","biao_name":"Y_T_K_BBE","id":"114","jianjie":"","name":"第十四章：腹部损伤","pai":"26","pid":"28","status":"0","type_id":"114","xishu":"0.00","yizuo":"0","zong":"71","zuo":"0"},{"ban_ben":"3383","biao_name":"Y_T_K_BBF","id":"115","jianjie":"","name":"第十五章：急性化脓性腹膜炎","pai":"25","pid":"28","status":"0","type_id":"115","xishu":"0.00","yizuo":"0","zong":"28","zuo":"0"},{"ban_ben":"3502","biao_name":"Y_T_K_BBG","id":"116","jianjie":"","name":"第十六章：消化性溃疡与胃癌","pai":"24","pid":"28","status":"0","type_id":"116","xishu":"0.00","yizuo":"0","zong":"75","zuo":"0"},{"ban_ben":"3625","biao_name":"Y_T_K_BBH","id":"117","jianjie":"","name":"第十七章：肠梗阻与阑尾炎","pai":"23","pid":"28","status":"0","type_id":"117","xishu":"0.00","yizuo":"0","zong":"72","zuo":"0"},{"ban_ben":"4487","biao_name":"Y_T_K_BBI","id":"118","jianjie":"","name":"第十八章：结、直肠与肛管疾病","pai":"22","pid":"28","status":"0","type_id":"118","xishu":"0.00","yizuo":"0","zong":"105","zuo":"0"},{"ban_ben":"4531","biao_name":"Y_T_K_BBJ","id":"119","jianjie":"","name":"第十九章：肝脓肿与门静脉高压症","pai":"21","pid":"28","status":"0","type_id":"119","xishu":"0.00","yizuo":"0","zong":"43","zuo":"0"},{"ban_ben":"4611","biao_name":"Y_T_K_BCA","id":"120","jianjie":"","name":"第二十章：胆道疾病","pai":"20","pid":"28","status":"0","type_id":"120","xishu":"0.00","yizuo":"0","zong":"80","zuo":"0"},{"ban_ben":"2265","biao_name":"Y_T_K_BCB","id":"121","jianjie":"","name":"第二十一章：胰腺疾病","pai":"18","pid":"28","status":"0","type_id":"121","xishu":"0.00","yizuo":"0","zong":"101","zuo":"0"},{"ban_ben":"2309","biao_name":"Y_T_K_BCC","id":"122","jianjie":"","name":"第二十二章：周围血管疾病","pai":"17","pid":"28","status":"0","type_id":"122","xishu":"0.00","yizuo":"0","zong":"44","zuo":"0"},{"ban_ben":"2358","biao_name":"Y_T_K_BCD","id":"123","jianjie":"","name":"第二十三章：隐睾症与泌尿系统损伤","pai":"16","pid":"28","status":"0","type_id":"123","xishu":"0.00","yizuo":"0","zong":"28","zuo":"0"},{"ban_ben":"2423","biao_name":"Y_T_K_BCE","id":"124","jianjie":"","name":"第二十四章：前列腺炎、附睾炎与肾结核","pai":"15","pid":"28","status":"0","type_id":"124","xishu":"0.00","yizuo":"0","zong":"24","zuo":"0"},{"ban_ben":"3889","biao_name":"Y_T_K_BCF","id":"125","jianjie":"","name":"第二十五章：泌尿系统梗阻","pai":"14","pid":"28","status":"0","type_id":"125","xishu":"0.00","yizuo":"0","zong":"26","zuo":"0"},{"ban_ben":"3925","biao_name":"Y_T_K_BCG","id":"126","jianjie":"","name":"第二十六章：尿石症","pai":"13","pid":"28","status":"0","type_id":"126","xishu":"0.00","yizuo":"0","zong":"36","zuo":"0"},{"ban_ben":"3987","biao_name":"Y_T_K_BCH","id":"127","jianjie":"","name":"第二十七章：泌尿系统肿瘤","pai":"12","pid":"28","status":"0","type_id":"127","xishu":"0.00","yizuo":"0","zong":"62","zuo":"0"},{"ban_ben":"4000","biao_name":"Y_T_K_BCI","id":"128","jianjie":"","name":"第二十八章：精索静脉曲张与鞘膜积液","pai":"11","pid":"28","status":"0","type_id":"128","xishu":"0.00","yizuo":"0","zong":"13","zuo":"0"},{"ban_ben":"4529","biao_name":"Y_T_K_BCJ","id":"129","jianjie":"","name":"第二十九章：骨折概论","pai":"10","pid":"28","status":"0","type_id":"129","xishu":"0.00","yizuo":"0","zong":"73","zuo":"0"},{"ban_ben":"4102","biao_name":"Y_T_K_BDA","id":"130","jianjie":"","name":"第三十章：上肢骨折","pai":"9","pid":"28","status":"0","type_id":"130","xishu":"0.00","yizuo":"0","zong":"29","zuo":"0"},{"ban_ben":"4143","biao_name":"Y_T_K_BDB","id":"131","jianjie":"","name":"第三十一章：下肢骨折","pai":"8","pid":"28","status":"0","type_id":"131","xishu":"0.00","yizuo":"0","zong":"40","zuo":"0"},{"ban_ben":"4162","biao_name":"Y_T_K_BDC","id":"132","jianjie":"","name":"第三十二章：脊柱骨折与骨盆骨折","pai":"7","pid":"28","status":"0","type_id":"132","xishu":"0.00","yizuo":"0","zong":"21","zuo":"0"},{"ban_ben":"4196","biao_name":"Y_T_K_BDD","id":"133","jianjie":"","name":"第三十三章：关节脱位与损伤","pai":"6","pid":"28","status":"0","type_id":"133","xishu":"0.00","yizuo":"0","zong":"29","zuo":"0"},{"ban_ben":"4207","biao_name":"Y_T_K_BDE","id":"134","jianjie":"","name":"第三十四章：手外伤与断肢（指）再植","pai":"5","pid":"28","status":"0","type_id":"134","xishu":"0.00","yizuo":"0","zong":"16","zuo":"0"},{"ban_ben":"4218","biao_name":"Y_T_K_BDF","id":"135","jianjie":"","name":"第三十五章：周围神经损伤","pai":"4","pid":"28","status":"0","type_id":"135","xishu":"0.00","yizuo":"0","zong":"11","zuo":"0"},{"ban_ben":"4291","biao_name":"Y_T_K_BDG","id":"136","jianjie":"","name":"第三十六章：运动系统慢性疾病","pai":"3","pid":"28","status":"0","type_id":"136","xishu":"0.00","yizuo":"0","zong":"73","zuo":"0"},{"ban_ben":"4348","biao_name":"Y_T_K_BDH","id":"137","jianjie":"","name":"第三十七章：骨与关节感染","pai":"2","pid":"28","status":"0","type_id":"137","xishu":"0.00","yizuo":"0","zong":"57","zuo":"0"},{"ban_ben":"4390","biao_name":"Y_T_K_BDI","id":"138","jianjie":"","name":"第三十八章：骨肿瘤","pai":"1","pid":"28","status":"0","type_id":"138","xishu":"0.00","yizuo":"0","zong":"42","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"139","jianjie":"总计十三章节题库","name":"执业医 - 生物化学","pai":"0","pid":"0","status":"1","type_id":"139","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"4612","biao_name":"Y_T_K_BHF","id":"175","jianjie":"","name":"第一章：蛋白质的结构与功能","pai":"13","pid":"139","status":"0","type_id":"175","xishu":"0.00","yizuo":"0","zong":"29","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BHG","id":"176","jianjie":"","name":"第二章：核酸的结构与功能","pai":"12","pid":"139","status":"0","type_id":"176","xishu":"0.00","yizuo":"0","zong":"32","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BHH","id":"177","jianjie":"","name":"第三章：酶","pai":"11","pid":"139","status":"0","type_id":"177","xishu":"0.00","yizuo":"0","zong":"30","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BHI","id":"178","jianjie":"","name":"第四章：糖代谢","pai":"10","pid":"139","status":"0","type_id":"178","xishu":"0.00","yizuo":"0","zong":"45","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BHA","id":"170","jianjie":"","name":"第五章：脂类代谢","pai":"9","pid":"139","status":"0","type_id":"170","xishu":"0.00","yizuo":"0","zong":"0","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BGJ","id":"169","jianjie":"","name":"第六章：生物氧化","pai":"8","pid":"139","status":"0","type_id":"169","xishu":"0.00","yizuo":"0","zong":"14","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BGI","id":"168","jianjie":"","name":"第七章：氨基酸代谢","pai":"7","pid":"139","status":"0","type_id":"168","xishu":"0.00","yizuo":"0","zong":"30","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BGH","id":"167","jianjie":"","name":"第八章：核苷酸代谢","pai":"6","pid":"139","status":"0","type_id":"167","xishu":"0.00","yizuo":"0","zong":"12","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BGG","id":"166","jianjie":"","name":"第九章：基因信息的传递","pai":"5","pid":"139","status":"0","type_id":"166","xishu":"0.00","yizuo":"0","zong":"53","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BGF","id":"165","jianjie":"","name":"第十章：癌基因与抑癌基因","pai":"4","pid":"139","status":"0","type_id":"165","xishu":"0.00","yizuo":"0","zong":"4","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BGE","id":"164","jianjie":"","name":"第十一章：细胞信号转导","pai":"3","pid":"139","status":"0","type_id":"164","xishu":"0.00","yizuo":"0","zong":"9","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BGD","id":"163","jianjie":"","name":"第十二章：血液与肝的生物化学","pai":"2","pid":"139","status":"0","type_id":"163","xishu":"0.00","yizuo":"0","zong":"25","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BGC","id":"162","jianjie":"","name":"第十三章：维生素","pai":"0","pid":"139","status":"0","type_id":"162","xishu":"0.00","yizuo":"0","zong":"9","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"140","jianjie":"总计十一章节题库","name":"执业医 - 生理学","pai":"0","pid":"0","status":"1","type_id":"140","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_BHJ","id":"179","jianjie":"","name":"第一章：绪论","pai":"12","pid":"140","status":"0","type_id":"179","xishu":"0.00","yizuo":"0","zong":"1","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BIA","id":"180","jianjie":"","name":"第二章：细胞的基本功能","pai":"10","pid":"140","status":"0","type_id":"180","xishu":"0.00","yizuo":"0","zong":"29","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BIB","id":"181","jianjie":"","name":"第三章：血液","pai":"9","pid":"140","status":"0","type_id":"181","xishu":"0.00","yizuo":"0","zong":"23","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BID","id":"183","jianjie":"","name":"第四章：血液循环","pai":"8","pid":"140","status":"0","type_id":"183","xishu":"0.00","yizuo":"0","zong":"67","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BIE","id":"184","jianjie":"","name":"第五章：呼吸","pai":"7","pid":"140","status":"0","type_id":"184","xishu":"0.00","yizuo":"0","zong":"36","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BJA","id":"190","jianjie":"","name":"第六章：消化和呼吸","pai":"6","pid":"140","status":"0","type_id":"190","xishu":"0.00","yizuo":"0","zong":"43","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BJD","id":"193","jianjie":"","name":"第七章：能量代谢与体温","pai":"5","pid":"140","status":"0","type_id":"193","xishu":"0.00","yizuo":"0","zong":"22","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BJE","id":"194","jianjie":"","name":"第八章：尿的生成和排出","pai":"4","pid":"140","status":"0","type_id":"194","xishu":"0.00","yizuo":"0","zong":"30","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BJF","id":"195","jianjie":"","name":"第九章：神经系统的功能","pai":"3","pid":"140","status":"0","type_id":"195","xishu":"0.00","yizuo":"0","zong":"61","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BJG","id":"196","jianjie":"","name":"第十章：内分泌","pai":"2","pid":"140","status":"0","type_id":"196","xishu":"0.00","yizuo":"0","zong":"34","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BJH","id":"197","jianjie":"","name":"第十一章：生殖","pai":"1","pid":"140","status":"0","type_id":"197","xishu":"0.00","yizuo":"0","zong":"11","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"141","jianjie":"总计十三章节题库","name":"执业医 - 微生物学","pai":"0","pid":"0","status":"1","type_id":"141","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_BJI","id":"198","jianjie":"","name":"第一章：微生物的基本概念、细菌形态结构与细菌生理","pai":"14","pid":"141","status":"0","type_id":"198","xishu":"0.00","yizuo":"0","zong":"19","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_BJJ","id":"199","jianjie":"","name":"第二章：消毒灭菌、噬菌体与细菌的遗传变异","pai":"12","pid":"141","status":"0","type_id":"199","xishu":"0.00","yizuo":"0","zong":"4","zuo":"0"},{"ban_ben":"4739","biao_name":"Y_T_K_CAA","id":"200","jianjie":"","name":"第三章：细菌的感染与免疫","pai":"11","pid":"141","status":"0","type_id":"200","xishu":"0.00","yizuo":"0","zong":"8","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CAB","id":"201","jianjie":"","name":"第四章：病原体球菌、肠道杆菌、弧菌","pai":"10","pid":"141","status":"0","type_id":"201","xishu":"0.00","yizuo":"0","zong":"23","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CAC","id":"202","jianjie":"","name":"第五章：厌氧菌、分枝杆菌与嗜血杆菌","pai":"9","pid":"141","status":"0","type_id":"202","xishu":"0.00","yizuo":"0","zong":"7","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CAD","id":"203","jianjie":"","name":"第六章：动物源性细菌、其它细菌与放线菌","pai":"8","pid":"141","status":"0","type_id":"203","xishu":"0.00","yizuo":"0","zong":"5","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CAE","id":"204","jianjie":"","name":"第七章：支原体、立克次体、衣原体","pai":"7","pid":"141","status":"0","type_id":"204","xishu":"0.00","yizuo":"0","zong":"6","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CAF","id":"205","jianjie":"","name":"第八章：病毒的基本性状、病毒的感染与免疫","pai":"6","pid":"141","status":"0","type_id":"205","xishu":"0.00","yizuo":"0","zong":"7","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CAG","id":"206","jianjie":"","name":"第九章：病毒感染的检查方法与呼吸道病毒","pai":"5","pid":"141","status":"0","type_id":"206","xishu":"0.00","yizuo":"0","zong":"7","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CAH","id":"207","jianjie":"","name":"第十章：肠道病毒与肝炎病毒","pai":"4","pid":"141","status":"0","type_id":"207","xishu":"0.00","yizuo":"0","zong":"5","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CAI","id":"208","jianjie":"","name":"第十一章：虫媒病毒、出血热病毒与疱疹病毒","pai":"3","pid":"141","status":"0","type_id":"208","xishu":"0.00","yizuo":"0","zong":"7","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CAJ","id":"209","jianjie":"","name":"第十二章：逆转录病毒、狂犬病病毒、人乳头瘤病毒与阮粒","pai":"2","pid":"141","status":"0","type_id":"209","xishu":"0.00","yizuo":"0","zong":"4","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CBA","id":"210","jianjie":"","name":"第十三章：真菌","pai":"1","pid":"141","status":"0","type_id":"210","xishu":"0.00","yizuo":"0","zong":"5","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"142","jianjie":"总计十章节题库","name":"执业医 - 免疫学","pai":"0","pid":"0","status":"1","type_id":"142","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CBB","id":"211","jianjie":"","name":"第一章：免疫学绪论与抗原","pai":"9","pid":"142","status":"0","type_id":"211","xishu":"0.00","yizuo":"0","zong":"9","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CBC","id":"212","jianjie":"","name":"第二章：免疫器官与免疫细胞","pai":"8","pid":"142","status":"0","type_id":"212","xishu":"0.00","yizuo":"0","zong":"34","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CBD","id":"213","jianjie":"","name":"第三章：免疫球蛋白与补体系统","pai":"7","pid":"142","status":"0","type_id":"213","xishu":"0.00","yizuo":"0","zong":"16","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CBE","id":"214","jianjie":"","name":"第四章：细胞因子、白细胞分化抗原与黏附分子","pai":"6","pid":"142","status":"0","type_id":"214","xishu":"0.00","yizuo":"0","zong":"5","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CBF","id":"215","jianjie":"","name":"第五章：主要组织相容性复合体与免疫应答","pai":"5","pid":"142","status":"0","type_id":"215","xishu":"0.00","yizuo":"0","zong":"7","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CBG","id":"216","jianjie":"","name":"第六章：黏膜免疫系统与免疫耐受","pai":"4","pid":"142","status":"0","type_id":"216","xishu":"0.00","yizuo":"0","zong":"3","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CBH","id":"217","jianjie":"","name":"第七章：抗感染免疫与超敏反应","pai":"3","pid":"142","status":"0","type_id":"217","xishu":"0.00","yizuo":"0","zong":"12","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CBI","id":"218","jianjie":"","name":"第八章：自身免疫病与免疫缺陷病","pai":"2","pid":"142","status":"0","type_id":"218","xishu":"0.00","yizuo":"0","zong":"6","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CBJ","id":"219","jianjie":"","name":"第九章：肿瘤免疫与移植免疫","pai":"1","pid":"142","status":"0","type_id":"219","xishu":"0.00","yizuo":"0","zong":"12","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CCA","id":"220","jianjie":"","name":"第十章：免疫学检测技术与免疫学防治","pai":"0","pid":"142","status":"0","type_id":"220","xishu":"0.00","yizuo":"0","zong":"5","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"143","jianjie":"总计十四章节题库","name":"执业医 - 病理学","pai":"0","pid":"0","status":"1","type_id":"143","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CCB","id":"221","jianjie":"","name":"第一章：细胞组织的适应、损伤与修复","pai":"14","pid":"143","status":"0","type_id":"221","xishu":"0.00","yizuo":"0","zong":"50","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CCC","id":"222","jianjie":"","name":"第二章：局部血液循环障碍","pai":"13","pid":"143","status":"0","type_id":"222","xishu":"0.00","yizuo":"0","zong":"41","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CCD","id":"223","jianjie":"","name":"第三章：炎症","pai":"12","pid":"143","status":"0","type_id":"223","xishu":"0.00","yizuo":"0","zong":"36","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CCE","id":"224","jianjie":"","name":"第四章：肿瘤","pai":"11","pid":"143","status":"0","type_id":"224","xishu":"0.00","yizuo":"0","zong":"62","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CCF","id":"225","jianjie":"","name":"第五章：心血管系统疾病","pai":"10","pid":"143","status":"0","type_id":"225","xishu":"0.00","yizuo":"0","zong":"33","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CCG","id":"226","jianjie":"","name":"第六章：呼吸系统疾病","pai":"9","pid":"143","status":"0","type_id":"226","xishu":"0.00","yizuo":"0","zong":"26","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CCH","id":"227","jianjie":"","name":"第七章：消化系统疾病","pai":"8","pid":"143","status":"0","type_id":"227","xishu":"0.00","yizuo":"0","zong":"49","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CCI","id":"228","jianjie":"","name":"第八章：淋巴造血系统疾病","pai":"7","pid":"143","status":"0","type_id":"228","xishu":"0.00","yizuo":"0","zong":"2","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CCJ","id":"229","jianjie":"","name":"第九章：泌尿系统疾病","pai":"6","pid":"143","status":"0","type_id":"229","xishu":"0.00","yizuo":"0","zong":"22","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CDA","id":"230","jianjie":"","name":"第十章：生殖系统与乳腺疾病","pai":"5","pid":"143","status":"0","type_id":"230","xishu":"0.00","yizuo":"0","zong":"23","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CDB","id":"231","jianjie":"","name":"第十一章：内分泌系统疾病","pai":"4","pid":"143","status":"0","type_id":"231","xishu":"0.00","yizuo":"0","zong":"7","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CDC","id":"232","jianjie":"","name":"第十二章：流行性脑脊髓膜炎与流行性乙型脑炎","pai":"3","pid":"143","status":"0","type_id":"232","xishu":"0.00","yizuo":"0","zong":"10","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CDD","id":"233","jianjie":"","name":"第十三章：传染病与寄生虫病","pai":"2","pid":"143","status":"0","type_id":"233","xishu":"0.00","yizuo":"0","zong":"28","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CDE","id":"234","jianjie":"","name":"第十四章：艾滋病与性传播疾病","pai":"1","pid":"143","status":"0","type_id":"234","xishu":"0.00","yizuo":"0","zong":"10","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"144","jianjie":"总计四章节题库","name":"执业医 - 心理学","pai":"0","pid":"0","status":"1","type_id":"144","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CFD","id":"253","jianjie":"","name":"第一章：总论与医学心理学基础","pai":"4","pid":"144","status":"0","type_id":"253","xishu":"0.00","yizuo":"0","zong":"37","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CFE","id":"254","jianjie":"","name":"第二章：心理健康与心身疾病","pai":"3","pid":"144","status":"0","type_id":"254","xishu":"0.00","yizuo":"0","zong":"12","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CFF","id":"255","jianjie":"","name":"第三章：心理评估、心理治疗与心理咨询","pai":"2","pid":"144","status":"0","type_id":"255","xishu":"0.00","yizuo":"0","zong":"47","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CFG","id":"256","jianjie":"","name":"第四章：医患关系与患者的心理问题","pai":"1","pid":"144","status":"0","type_id":"256","xishu":"0.00","yizuo":"0","zong":"19","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"145","jianjie":"总计四章节题库","name":"执业医 - 伦理学","pai":"0","pid":"0","status":"1","type_id":"145","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CFH","id":"257","jianjie":"","name":"第一章：伦理学、医学伦理学的基本原则与规范","pai":"4","pid":"145","status":"0","type_id":"257","xishu":"0.00","yizuo":"0","zong":"37","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CFI","id":"258","jianjie":"","name":"第二章：医疗人际关系伦理与临床诊疗伦理","pai":"3","pid":"145","status":"0","type_id":"258","xishu":"0.00","yizuo":"0","zong":"27","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CFJ","id":"259","jianjie":"","name":"第三章：临终关怀、公共卫生伦理与健康伦理","pai":"2","pid":"145","status":"0","type_id":"259","xishu":"0.00","yizuo":"0","zong":"10","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CGA","id":"260","jianjie":"","name":"第四章：医学科研、医学新技术研究伦理与医学道德","pai":"1","pid":"145","status":"0","type_id":"260","xishu":"0.00","yizuo":"0","zong":"27","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"146","jianjie":"总计四章节题库","name":"执业医 - 统计学","pai":"0","pid":"0","status":"1","type_id":"146","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CGB","id":"261","jianjie":"总计四章节题库","name":"第一章：概论与数值变量数据","pai":"4","pid":"146","status":"0","type_id":"261","xishu":"0.00","yizuo":"0","zong":"30","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CGC","id":"262","jianjie":"","name":"第二章：分类变量资料","pai":"3","pid":"146","status":"0","type_id":"262","xishu":"0.00","yizuo":"0","zong":"13","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CGD","id":"263","jianjie":"","name":"第三章：直线相关和回归、统计图表","pai":"2","pid":"146","status":"0","type_id":"263","xishu":"0.00","yizuo":"0","zong":"10","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CGE","id":"264","jianjie":"","name":"第四章：秩和检验、Logistic回归分析和生存分析","pai":"1","pid":"146","status":"0","type_id":"264","xishu":"0.00","yizuo":"0","zong":"2","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"147","jianjie":"总计五章节题库","name":"执业医 - 预防医学","pai":"0","pid":"0","status":"1","type_id":"147","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CGF","id":"265","jianjie":"","name":"第一章：绪论","pai":"5","pid":"147","status":"0","type_id":"265","xishu":"0.00","yizuo":"0","zong":"6","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CGG","id":"266","jianjie":"","name":"第二章：流行病学原理和方法","pai":"4","pid":"147","status":"0","type_id":"266","xishu":"0.00","yizuo":"0","zong":"60","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CGH","id":"267","jianjie":"","name":"第三章：临床预防服务","pai":"3","pid":"147","status":"0","type_id":"267","xishu":"0.00","yizuo":"0","zong":"29","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CGI","id":"268","jianjie":"","name":"第四章：社区公共卫生","pai":"2","pid":"147","status":"0","type_id":"268","xishu":"0.00","yizuo":"0","zong":"51","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CGJ","id":"269","jianjie":"","name":"第五章：卫生服务体系与卫生管理","pai":"1","pid":"147","status":"0","type_id":"269","xishu":"0.00","yizuo":"0","zong":"21","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"148","jianjie":"总计十章节题库","name":"执业医 - 卫生法规","pai":"0","pid":"0","status":"1","type_id":"148","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CHA","id":"270","jianjie":"","name":"第二章：执业医师法与医疗机构管理条例","pai":"10","pid":"148","status":"0","type_id":"270","xishu":"0.00","yizuo":"0","zong":"38","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CHB","id":"271","jianjie":"","name":"第三章：医疗事故处理条例与母婴保健法及其实施办法","pai":"9","pid":"148","status":"0","type_id":"271","xishu":"0.00","yizuo":"0","zong":"21","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CHC","id":"272","jianjie":"","name":"第四章：传染病防治法与艾滋病防治条例","pai":"8","pid":"148","status":"0","type_id":"272","xishu":"0.00","yizuo":"0","zong":"34","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CHD","id":"273","jianjie":"","name":"第五章：突发公共卫生事件应急条例与药品管理法实施条例","pai":"7","pid":"148","status":"0","type_id":"273","xishu":"0.00","yizuo":"0","zong":"15","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CHE","id":"274","jianjie":"","name":"第六章：麻醉药品和精神药品管理条例与处方管理方法","pai":"6","pid":"148","status":"0","type_id":"274","xishu":"0.00","yizuo":"0","zong":"10","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CHF","id":"275","jianjie":"","name":"第七章：献血法与医疗机构临床用学管理办法","pai":"5","pid":"148","status":"0","type_id":"275","xishu":"0.00","yizuo":"0","zong":"19","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CHG","id":"276","jianjie":"","name":"第八章：侵权责任法与人体器官移植条例","pai":"4","pid":"148","status":"0","type_id":"276","xishu":"0.00","yizuo":"0","zong":"6","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CHH","id":"277","jianjie":"","name":"第九章：放射诊疗管理规定与抗菌药物临床应用管理办法","pai":"3","pid":"148","status":"0","type_id":"277","xishu":"0.00","yizuo":"0","zong":"8","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CHI","id":"278","jianjie":"","name":"第十章：精神卫生法与一秒流通和预防接种管理条例","pai":"2","pid":"148","status":"0","type_id":"278","xishu":"0.00","yizuo":"0","zong":"15","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"149","jianjie":"总计八章节题库","name":"执业医 - 传染病学","pai":"0","pid":"0","status":"1","type_id":"149","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CHJ","id":"279","jianjie":"","name":"第一章：传染病学总论","pai":"9","pid":"149","status":"0","type_id":"279","xishu":"0.00","yizuo":"0","zong":"17","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CIA","id":"280","jianjie":"","name":"第二章：病毒性肝炎与肾综合征出血热","pai":"8","pid":"149","status":"0","type_id":"280","xishu":"0.00","yizuo":"0","zong":"37","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CIB","id":"281","jianjie":"","name":"第三章：流行性乙型脑炎与艾滋病","pai":"7","pid":"149","status":"0","type_id":"281","xishu":"0.00","yizuo":"0","zong":"23","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CIC","id":"282","jianjie":"","name":"第四章：伤寒与霍乱","pai":"6","pid":"149","status":"0","type_id":"282","xishu":"0.00","yizuo":"0","zong":"30","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CID","id":"283","jianjie":"","name":"第五章：细菌性痢疾与流行性脑脊髓膜炎","pai":"5","pid":"149","status":"0","type_id":"283","xishu":"0.00","yizuo":"0","zong":"27","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CIE","id":"284","jianjie":"","name":"第六章：钩端螺旋体病与疟疾","pai":"4","pid":"149","status":"0","type_id":"284","xishu":"0.00","yizuo":"0","zong":"23","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CIF","id":"285","jianjie":"","name":"第七章：日本血吸虫病与囊尾蚴病","pai":"3","pid":"149","status":"0","type_id":"285","xishu":"0.00","yizuo":"0","zong":"12","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CIG","id":"286","jianjie":"","name":"第八章：性传播疾病","pai":"2","pid":"149","status":"0","type_id":"286","xishu":"0.00","yizuo":"0","zong":"24","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"150","jianjie":"总计八章节题库","name":"执业医 - 神经病学","pai":"0","pid":"0","status":"1","type_id":"150","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"4772","biao_name":"Y_T_K_CIH","id":"287","jianjie":"","name":"第一章：神经病学概论","pai":"9","pid":"150","status":"0","type_id":"287","xishu":"0.00","yizuo":"0","zong":"24","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CII","id":"288","jianjie":"","name":"第二章：偏头痛","pai":"8","pid":"150","status":"0","type_id":"288","xishu":"0.00","yizuo":"0","zong":"5","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CIJ","id":"289","jianjie":"","name":"第三章：脑血管疾病","pai":"7","pid":"150","status":"0","type_id":"289","xishu":"0.00","yizuo":"0","zong":"40","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CJA","id":"290","jianjie":"","name":"第五章：帕金森病与癫痫","pai":"5","pid":"150","status":"0","type_id":"290","xishu":"0.00","yizuo":"0","zong":"31","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CJB","id":"291","jianjie":"","name":"第六章：视神经脊髓炎、急性脊髓炎与脊髓压迫症","pai":"4","pid":"150","status":"0","type_id":"291","xishu":"0.00","yizuo":"0","zong":"8","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CJC","id":"292","jianjie":"","name":"第七章：周围神经疾病","pai":"3","pid":"150","status":"0","type_id":"292","xishu":"0.00","yizuo":"0","zong":"18","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CJD","id":"293","jianjie":"","name":"第八章：重症肌无力与周期性瘫痪","pai":"2","pid":"150","status":"0","type_id":"293","xishu":"0.00","yizuo":"0","zong":"16","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"151","jianjie":"总计五章节题库","name":"执业医 - 精神病学","pai":"0","pid":"0","status":"1","type_id":"151","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CJE","id":"294","jianjie":"","name":"第一章：概述与症状学","pai":"5","pid":"151","status":"0","type_id":"294","xishu":"0.00","yizuo":"0","zong":"45","zuo":"0"},{"ban_ben":"4748","biao_name":"Y_T_K_CJF","id":"295","jianjie":"","name":"第二章：器质性精神障碍与精神活性物质所致精神障碍","pai":"4","pid":"151","status":"0","type_id":"295","xishu":"0.00","yizuo":"0","zong":"26","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CJG","id":"296","jianjie":"","name":"第三章：精神分裂症与心境障碍","pai":"3","pid":"151","status":"0","type_id":"296","xishu":"0.00","yizuo":"0","zong":"30","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CJH","id":"297","jianjie":"","name":"第四章：神经症性障碍与分离性障碍","pai":"1","pid":"151","status":"0","type_id":"297","xishu":"0.00","yizuo":"0","zong":"18","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CJI","id":"298","jianjie":"","name":"第五章：应激相关障碍与心理生理障碍","pai":"0","pid":"151","status":"0","type_id":"298","xishu":"0.00","yizuo":"0","zong":"12","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"152","jianjie":"总计二十章节题库","name":"执业医 - 妇产科学","pai":"0","pid":"0","status":"1","type_id":"152","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CJJ","id":"299","jianjie":"总计二十章节题库","name":"第一章：女性生殖系统解剖与生理","pai":"19","pid":"152","status":"0","type_id":"299","xishu":"0.00","yizuo":"0","zong":"55","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAA","id":"300","jianjie":"","name":"第二章：妊娠生理与妊娠诊断","pai":"18","pid":"152","status":"0","type_id":"300","xishu":"0.00","yizuo":"0","zong":"42","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAB","id":"301","jianjie":"","name":"第三章：异常妊娠","pai":"17","pid":"152","status":"0","type_id":"301","xishu":"0.00","yizuo":"0","zong":"66","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAC","id":"302","jianjie":"","name":"第四章：妊娠特有疾病与妊娠合并内外科疾病","pai":"16","pid":"152","status":"0","type_id":"302","xishu":"0.00","yizuo":"0","zong":"53","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAD","id":"303","jianjie":"","name":"第五章：胎儿异常与多胎妊娠","pai":"15","pid":"152","status":"0","type_id":"303","xishu":"0.00","yizuo":"0","zong":"19","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAE","id":"304","jianjie":"","name":"第六章：前置胎盘、胎盘早剥与胎膜早破","pai":"14","pid":"152","status":"0","type_id":"304","xishu":"0.00","yizuo":"0","zong":"48","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAF","id":"305","jianjie":"","name":"第七章：产前检查与孕期保健","pai":"13","pid":"152","status":"0","type_id":"305","xishu":"0.00","yizuo":"0","zong":"36","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAG","id":"306","jianjie":"","name":"第八章：遗传咨询、产前筛查与产前诊断","pai":"12","pid":"152","status":"0","type_id":"306","xishu":"0.00","yizuo":"0","zong":"4","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAH","id":"307","jianjie":"","name":"第九章：正常分娩","pai":"11","pid":"152","status":"0","type_id":"307","xishu":"0.00","yizuo":"0","zong":"43","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAI","id":"308","jianjie":"","name":"第十章：异常分娩","pai":"10","pid":"152","status":"0","type_id":"308","xishu":"0.00","yizuo":"0","zong":"77","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DAJ","id":"309","jianjie":"","name":"第十一章：分娩期并发症","pai":"9","pid":"152","status":"0","type_id":"309","xishu":"0.00","yizuo":"0","zong":"38","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DBA","id":"310","jianjie":"","name":"第十二章：正常产褥与产褥期并发症","pai":"8","pid":"152","status":"0","type_id":"310","xishu":"0.00","yizuo":"0","zong":"0","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DBB","id":"311","jianjie":"","name":"第十三章：女性生殖系统炎症","pai":"7","pid":"152","status":"0","type_id":"311","xishu":"0.00","yizuo":"0","zong":"49","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DBC","id":"312","jianjie":"","name":"第十四章：子宫内膜异位症、子宫腺肌病与子宫脱垂","pai":"6","pid":"152","status":"0","type_id":"312","xishu":"0.00","yizuo":"0","zong":"44","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DBD","id":"313","jianjie":"","name":"第十五章：子宫颈癌、子宫肌瘤与子宫内膜癌","pai":"5","pid":"152","status":"0","type_id":"313","xishu":"0.00","yizuo":"0","zong":"99","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DBE","id":"314","jianjie":"","name":"第十六章：卵巢肿瘤","pai":"4","pid":"152","status":"0","type_id":"314","xishu":"0.00","yizuo":"0","zong":"56","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DBF","id":"315","jianjie":"","name":"第十七章：妊娠滋养细胞疾病","pai":"3","pid":"152","status":"0","type_id":"315","xishu":"0.00","yizuo":"0","zong":"43","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DBG","id":"316","jianjie":"","name":"第十八章：生殖内分泌疾病","pai":"2","pid":"152","status":"0","type_id":"316","xishu":"0.00","yizuo":"0","zong":"57","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DBH","id":"317","jianjie":"","name":"第十九章：不孕症与辅助生殖技术","pai":"1","pid":"152","status":"0","type_id":"317","xishu":"0.00","yizuo":"0","zong":"8","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DBI","id":"318","jianjie":"","name":"第二十章：计划生育与妇女保健","pai":"0","pid":"152","status":"0","type_id":"318","xishu":"0.00","yizuo":"0","zong":"75","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"153","jianjie":"总计十二章节题库","name":"执业医 - 儿科学","pai":"0","pid":"0","status":"1","type_id":"153","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_DBJ","id":"319","jianjie":"","name":"第一章：绪论、生长发育与儿童保健","pai":"14","pid":"153","status":"0","type_id":"319","xishu":"0.00","yizuo":"0","zong":"74","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCA","id":"320","jianjie":"","name":"第二章：营养与营养障碍疾病","pai":"13","pid":"153","status":"0","type_id":"320","xishu":"0.00","yizuo":"0","zong":"97","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCB","id":"321","jianjie":"","name":"第三章：新生儿与新生儿疾病","pai":"12","pid":"153","status":"0","type_id":"321","xishu":"0.00","yizuo":"0","zong":"86","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCC","id":"322","jianjie":"","name":"第四章：遗传性疾病","pai":"11","pid":"153","status":"0","type_id":"322","xishu":"0.00","yizuo":"0","zong":"50","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCD","id":"323","jianjie":"","name":"第五章：免疫性疾病","pai":"10","pid":"153","status":"0","type_id":"323","xishu":"0.00","yizuo":"0","zong":"20","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCE","id":"324","jianjie":"","name":"第六章：感染性疾病","pai":"9","pid":"153","status":"0","type_id":"324","xishu":"0.00","yizuo":"0","zong":"98","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCF","id":"325","jianjie":"","name":"第七章：消化系统疾病","pai":"8","pid":"153","status":"0","type_id":"325","xishu":"0.00","yizuo":"0","zong":"77","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCG","id":"326","jianjie":"","name":"第八章：呼吸系统疾病","pai":"7","pid":"153","status":"0","type_id":"326","xishu":"0.00","yizuo":"0","zong":"80","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCH","id":"327","jianjie":"","name":"第九章：心血管系统疾病","pai":"6","pid":"153","status":"0","type_id":"327","xishu":"0.00","yizuo":"0","zong":"73","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCI","id":"328","jianjie":"","name":"第十章：泌尿系统疾病","pai":"5","pid":"153","status":"0","type_id":"328","xishu":"0.00","yizuo":"0","zong":"66","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DCJ","id":"329","jianjie":"","name":"第十一章：血液系统疾病","pai":"4","pid":"153","status":"0","type_id":"329","xishu":"0.00","yizuo":"0","zong":"62","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_DDA","id":"330","jianjie":"","name":" 第十二章：神经系统与内分泌系统疾病","pai":"0","pid":"153","status":"0","type_id":"330","xishu":"0.00","yizuo":"0","zong":"82","zuo":"0"}],"zong":"0","zuo":"0"},{"ban_ben":"0","id":"235","jianjie":"总计十八章节题库","name":"执业医 - 药理学","pai":"0","pid":"0","status":"1","type_id":"235","xishu":"0.00","yizuo":"0","z_type":[{"ban_ben":"0","biao_name":"Y_T_K_CDG","id":"236","jianjie":"","name":"第一章：药物代谢动力学与药物效应动力学","pai":"19","pid":"235","status":"0","type_id":"236","xishu":"0.00","yizuo":"0","zong":"11","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CDH","id":"237","jianjie":"","name":"第二章：胆碱受体激动药、抗胆碱酯酶药与胆碱酯酶复活药","pai":"18","pid":"235","status":"0","type_id":"237","xishu":"0.00","yizuo":"0","zong":"4","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CDI","id":"238","jianjie":"","name":"第三章：胆碱受体阻断药、肾上腺受体激动药与阻断药","pai":"17","pid":"235","status":"0","type_id":"238","xishu":"0.00","yizuo":"0","zong":"14","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CDJ","id":"239","jianjie":"","name":"第四章：局麻醉药与镇静催眠药","pai":"16","pid":"235","status":"0","type_id":"239","xishu":"0.00","yizuo":"0","zong":"8","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CEA","id":"240","jianjie":"","name":"第五章：抗癫痫药与抗惊厥药","pai":"15","pid":"235","status":"0","type_id":"240","xishu":"0.00","yizuo":"0","zong":"7","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CEB","id":"241","jianjie":"","name":"第六章：抗帕金森病药与抗精神失常药","pai":"14","pid":"235","status":"0","type_id":"241","xishu":"0.00","yizuo":"0","zong":"14","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CEC","id":"242","jianjie":"","name":"第七章：镇痛药与解热镇痛抗炎药","pai":"13","pid":"235","status":"0","type_id":"242","xishu":"0.00","yizuo":"0","zong":"8","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CED","id":"243","jianjie":"","name":"第八章：钙通道阻滞药与抗心律失常药","pai":"12","pid":"235","status":"0","type_id":"243","xishu":"0.00","yizuo":"0","zong":"12","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CEE","id":"244","jianjie":"","name":"第九章：利尿药与抗血压药","pai":"11","pid":"235","status":"0","type_id":"244","xishu":"0.00","yizuo":"0","zong":"27","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CEF","id":"245","jianjie":"","name":"第十章：治疗心衰的药物、抗动脉粥样硬化药与抗心绞痛药","pai":"10","pid":"235","status":"0","type_id":"245","xishu":"0.00","yizuo":"0","zong":"13","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CEG","id":"246","jianjie":"","name":"第十一章：作用于血液及造血器官的药物与组胺受体阻断药","pai":"9","pid":"235","status":"0","type_id":"246","xishu":"0.00","yizuo":"0","zong":"10","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CEH","id":"247","jianjie":"","name":"第十二章：作用于呼吸系统与消化系统的药物","pai":"8","pid":"235","status":"0","type_id":"247","xishu":"0.00","yizuo":"0","zong":"7","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CEI","id":"248","jianjie":"","name":"第十三章：糖皮质激素类药、抗甲状腺药与降糖药","pai":"7","pid":"235","status":"0","type_id":"248","xishu":"0.00","yizuo":"0","zong":"11","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CEJ","id":"249","jianjie":"","name":"第十五章：β-内酰胺类、大环内酯类与林可霉素类抗生素","pai":"5","pid":"235","status":"0","type_id":"249","xishu":"0.00","yizuo":"0","zong":"13","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CFA","id":"250","jianjie":"","name":"第十六章：氨基糖苷类与四环素类抗生素","pai":"4","pid":"235","status":"0","type_id":"250","xishu":"0.00","yizuo":"0","zong":"10","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CFB","id":"251","jianjie":"","name":"第十七章：人工合成的抗菌药、抗病毒与抗真菌药","pai":"3","pid":"235","status":"0","type_id":"251","xishu":"0.00","yizuo":"0","zong":"10","zuo":"0"},{"ban_ben":"0","biao_name":"Y_T_K_CFC","id":"252","jianjie":"","name":"第十八章：抗结核药、抗疟药与抗肿瘤药","pai":"2","pid":"235","status":"0","type_id":"252","xishu":"0.00","yizuo":"0","zong":"15","zuo":"0"}],"zong":"0","zuo":"0"}]
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
         * id : 29
         * jianjie : 总计四十一章节题库
         * name : 执业医 - 内科学
         * pai : 5
         * pid : 0
         * status : 1
         * type_id : 29
         * xishu : 1.00
         * yizuo : 2000
         * z_type : [{"ban_ben":"4743","biao_name":"Y_T_K_GA","id":"60","jianjie":"","name":"第一章：慢性阻塞性肺疾病与支气管哮喘","pai":"50","pid":"29","status":"0","type_id":"60","xishu":"0.00","yizuo":"450","zong":"60","zuo":"0"},{"ban_ben":"599","biao_name":"Y_T_K_GB","id":"61","jianjie":"","name":"第二章：支气管扩张症","pai":"49","pid":"29","status":"0","type_id":"61","xishu":"0.00","yizuo":"0","zong":"21","zuo":"0"},{"ban_ben":"2590","biao_name":"Y_T_K_GC","id":"62","jianjie":"","name":"第三章：肺部感染性疾病（肺炎与肺脓肿）","pai":"48","pid":"29","status":"0","type_id":"62","xishu":"0.00","yizuo":"0","zong":"84","zuo":"0"},{"ban_ben":"2591","biao_name":"Y_T_K_GD","id":"63","jianjie":"","name":"第四章：肺结核","pai":"47","pid":"29","status":"0","type_id":"63","xishu":"0.00","yizuo":"0","zong":"32","zuo":"0"},{"ban_ben":"1039","biao_name":"Y_T_K_GE","id":"64","jianjie":"","name":"第五章：血栓栓塞症","pai":"46","pid":"29","status":"0","type_id":"64","xishu":"0.00","yizuo":"0","zong":"9","zuo":"0"},{"ban_ben":"1152","biao_name":"Y_T_K_GF","id":"65","jianjie":"","name":"第六章：肺动脉高压与肺源性心脏病","pai":"44","pid":"29","status":"0","type_id":"65","xishu":"0.00","yizuo":"0","zong":"39","zuo":"0"},{"ban_ben":"1368","biao_name":"Y_T_K_GG","id":"66","jianjie":"","name":"第七章：急性呼吸窘迫综合征","pai":"43","pid":"29","status":"0","type_id":"66","xishu":"0.00","yizuo":"0","zong":"38","zuo":"0"},{"ban_ben":"1429","biao_name":"Y_T_K_GH","id":"67","jianjie":"","name":"第八章：胸腔积液","pai":"42","pid":"29","status":"0","type_id":"67","xishu":"0.00","yizuo":"0","zong":"19","zuo":"0"},{"ban_ben":"1472","biao_name":"Y_T_K_GI","id":"68","jianjie":"","name":"第九章：呼吸衰竭与呼吸支持技术","pai":"41","pid":"29","status":"0","type_id":"68","xishu":"0.00","yizuo":"0","zong":"37","zuo":"0"},{"ban_ben":"1559","biao_name":"Y_T_K_GJ","id":"69","jianjie":"","name":"第十章：心力衰竭","pai":"40","pid":"29","status":"0","type_id":"69","xishu":"0.00","yizuo":"0","zong":"87","zuo":"0"},{"ban_ben":"1666","biao_name":"Y_T_K_HA","id":"70","jianjie":"","name":"第十一章：心律失常","pai":"39","pid":"29","status":"0","type_id":"70","xishu":"0.00","yizuo":"0","zong":"107","zuo":"0"},{"ban_ben":"1916","biao_name":"Y_T_K_HB","id":"71","jianjie":"","name":"第十二章：冠状动脉粥样硬化性心脏病","pai":"38","pid":"29","status":"0","type_id":"71","xishu":"0.00","yizuo":"0","zong":"103","zuo":"0"},{"ban_ben":"1934","biao_name":"Y_T_K_HC","id":"72","jianjie":"","name":"第十三章：高血压","pai":"37","pid":"29","status":"0","type_id":"72","xishu":"0.00","yizuo":"0","zong":"52","zuo":"0"},{"ban_ben":"1987","biao_name":"Y_T_K_HD","id":"73","jianjie":"","name":"第十四章：心肌疾病","pai":"36","pid":"29","status":"0","type_id":"73","xishu":"0.00","yizuo":"0","zong":"44","zuo":"0"},{"ban_ben":"2045","biao_name":"Y_T_K_HE","id":"74","jianjie":"","name":"第十五章：心脏瓣膜病","pai":"35","pid":"29","status":"0","type_id":"74","xishu":"0.00","yizuo":"0","zong":"61","zuo":"0"},{"ban_ben":"2113","biao_name":"Y_T_K_HF","id":"75","jianjie":"","name":"第十六章：心包疾病（急性心包炎与心脏压塞）","pai":"34","pid":"29","status":"0","type_id":"75","xishu":"0.00","yizuo":"0","zong":"38","zuo":"0"},{"ban_ben":"2146","biao_name":"Y_T_K_HG","id":"76","jianjie":"","name":"第十七章：感染性心内膜炎","pai":"33","pid":"29","status":"0","type_id":"76","xishu":"0.00","yizuo":"0","zong":"24","zuo":"0"},{"ban_ben":"2195","biao_name":"Y_T_K_HH","id":"77","jianjie":"","name":"第十八章：心脏骤停与心脏性猝死","pai":"32","pid":"29","status":"0","type_id":"77","xishu":"0.00","yizuo":"0","zong":"27","zuo":"0"},{"ban_ben":"2240","biao_name":"Y_T_K_HI","id":"78","jianjie":"","name":"第十九章：胃食管反流病与胃炎","pai":"31","pid":"29","status":"0","type_id":"78","xishu":"0.00","yizuo":"0","zong":"70","zuo":"0"},{"ban_ben":"2516","biao_name":"Y_T_K_HJ","id":"79","jianjie":"","name":"第二十章：消化性溃疡","pai":"30","pid":"29","status":"0","type_id":"79","xishu":"0.00","yizuo":"0","zong":"84","zuo":"0"},{"ban_ben":"367","biao_name":"Y_T_K_IA","id":"80","jianjie":"","name":"第二十一章：肠结核与结核性腹膜炎","pai":"26","pid":"29","status":"0","type_id":"80","xishu":"0.00","yizuo":"0","zong":"31","zuo":"0"},{"ban_ben":"613","biao_name":"Y_T_K_IB","id":"81","jianjie":"","name":"第二十二章：炎症性肠病与功能性胃肠病","pai":"25","pid":"29","status":"0","type_id":"81","xishu":"0.00","yizuo":"0","zong":"57","zuo":"0"},{"ban_ben":"817","biao_name":"Y_T_K_IC","id":"82","jianjie":"","name":"第二十三章：脂肪性肝病与肝硬化","pai":"24","pid":"29","status":"0","type_id":"82","xishu":"0.00","yizuo":"0","zong":"53","zuo":"0"},{"ban_ben":"1056","biao_name":"Y_T_K_ID","id":"83","jianjie":"","name":"第二十四章：原发性肝癌与肝性脑病","pai":"23","pid":"29","status":"0","type_id":"83","xishu":"0.00","yizuo":"0","zong":"50","zuo":"0"},{"ban_ben":"1175","biao_name":"Y_T_K_IE","id":"84","jianjie":"","name":"第二十五章：消化道大出血","pai":"22","pid":"29","status":"0","type_id":"84","xishu":"0.00","yizuo":"0","zong":"38","zuo":"0"},{"ban_ben":"3347","biao_name":"Y_T_K_IF","id":"85","jianjie":"","name":"第二十六章：尿液检查与肾小球疾病","pai":"21","pid":"29","status":"0","type_id":"85","xishu":"0.00","yizuo":"0","zong":"127","zuo":"0"},{"ban_ben":"2720","biao_name":"Y_T_K_IG","id":"86","jianjie":"","name":"第二十七章：尿路感染","pai":"20","pid":"29","status":"0","type_id":"86","xishu":"0.00","yizuo":"0","zong":"36","zuo":"0"},{"ban_ben":"2791","biao_name":"Y_T_K_IH","id":"87","jianjie":"","name":"第二十八章：肾功能不全","pai":"19","pid":"29","status":"0","type_id":"87","xishu":"0.00","yizuo":"0","zong":"75","zuo":"0"},{"ban_ben":"2948","biao_name":"Y_T_K_II","id":"88","jianjie":"","name":"第二十九章：贫血","pai":"18","pid":"29","status":"0","type_id":"88","xishu":"0.00","yizuo":"0","zong":"97","zuo":"0"},{"ban_ben":"2953","biao_name":"Y_T_K_IJ","id":"89","jianjie":"","name":"第三十章：白细胞减少和粒细胞缺乏症","pai":"17","pid":"29","status":"0","type_id":"89","xishu":"0.00","yizuo":"0","zong":"5","zuo":"0"},{"ban_ben":"3037","biao_name":"Y_T_K_JA","id":"90","jianjie":"","name":"第三十一章：骨髓增生异常综合征与白血病","pai":"16","pid":"29","status":"0","type_id":"90","xishu":"0.00","yizuo":"0","zong":"84","zuo":"0"},{"ban_ben":"3064","biao_name":"Y_T_K_JB","id":"91","jianjie":"","name":"第三十二章：淋巴瘤与多发性骨髓瘤","pai":"15","pid":"29","status":"0","type_id":"91","xishu":"0.00","yizuo":"0","zong":"26","zuo":"0"},{"ban_ben":"3119","biao_name":"Y_T_K_JC","id":"92","jianjie":"","name":"第三十三章：出血性疾病","pai":"14","pid":"29","status":"0","type_id":"92","xishu":"0.00","yizuo":"0","zong":"56","zuo":"0"},{"ban_ben":"3186","biao_name":"Y_T_K_JD","id":"93","jianjie":"","name":"第三十四章：输血","pai":"13","pid":"29","status":"0","type_id":"93","xishu":"0.00","yizuo":"0","zong":"67","zuo":"0"},{"ban_ben":"3225","biao_name":"Y_T_K_JE","id":"94","jianjie":"","name":"第三十五章：内分泌疾病总论与下丘脑-垂体疾病","pai":"12","pid":"29","status":"0","type_id":"94","xishu":"0.00","yizuo":"0","zong":"39","zuo":"0"},{"ban_ben":"3494","biao_name":"Y_T_K_JF","id":"95","jianjie":"","name":"第三十六章：甲状腺功能亢进症与甲状腺功能减退症","pai":"11","pid":"29","status":"0","type_id":"95","xishu":"0.00","yizuo":"0","zong":"92","zuo":"0"},{"ban_ben":"3533","biao_name":"Y_T_K_JG","id":"96","jianjie":"","name":"第三十七章：库欣综合征与原发性醛固酮增多症","pai":"10","pid":"29","status":"0","type_id":"96","xishu":"0.00","yizuo":"0","zong":"19","zuo":"0"},{"ban_ben":"3562","biao_name":"Y_T_K_JH","id":"97","jianjie":"","name":"第三十八章：原发性慢性肾上腺皮质功能减退症与嗜铬细胞瘤","pai":"9","pid":"29","status":"0","type_id":"97","xishu":"0.00","yizuo":"0","zong":"18","zuo":"0"},{"ban_ben":"3721","biao_name":"Y_T_K_JI","id":"98","jianjie":"","name":"第三十九章：糖尿病与低血糖症","pai":"8","pid":"29","status":"0","type_id":"98","xishu":"0.00","yizuo":"0","zong":"114","zuo":"0"},{"ban_ben":"3814","biao_name":"Y_T_K_JJ","id":"99","jianjie":"","name":"第四十章：风湿性疾病","pai":"7","pid":"29","status":"0","type_id":"99","xishu":"0.00","yizuo":"0","zong":"93","zuo":"0"},{"ban_ben":"3863","biao_name":"Y_T_K_BAA","id":"100","jianjie":"","name":"第四十一章：中毒与中暑","pai":"6","pid":"29","status":"0","type_id":"100","xishu":"0.00","yizuo":"0","zong":"49","zuo":"0"}]
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

            /**
             * ban_ben : 4743
             * biao_name : Y_T_K_GA
             * id : 60
             * jianjie :
             * name : 第一章：慢性阻塞性肺疾病与支气管哮喘
             * pai : 50
             * pid : 29
             * status : 0
             * type_id : 60
             * xishu : 0.00
             * yizuo : 450
             * zong : 60
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
