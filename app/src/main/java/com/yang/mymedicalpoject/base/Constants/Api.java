package com.yang.mymedicalpoject.base.Constants;

public interface Api {
    //获取验证码
     String CODE="index.php/paywx/massage";
    //获取注册返回数据接口
     String REGISTER_DATA="index.php//login/login_zhuce";
    //登录接口
     String LOGIN_DATA="index.php/login/login";
    //主页面接口
     String HOME_REQUEST="index.php/Shiti/ti_type_list";
    //商城全部
     String SC_QUANBU="index.php/shop/get_shop_and_vedio_list";//商城全部
    //商城图书
     String SC_TUSHU="index.php/shop/get_shop_list";
    //商城课程
     String SC_KECHENG="index.php/kecheng/ke_index_list";
    //tab学校
     String SCHOOL_TAB="index.php/forumsc/type_select";
    //每个学校的item
    String SCHOOL_ITEM="index.php/forumsc/article_select";
    //官方论坛 item数据
    String FORUM_GF="index.php/forum/official_index";
    //商城详情
    String SHOPPING="index.php/Shop/shop_xiang_qing";

    //首页历年考试题 tab医研
    String HOME_YIYAN="index.php/shiti/ti_linian";

    //答题
    String HOME_DATI="index.php/shiti/get_ti_bufen_list";
}
