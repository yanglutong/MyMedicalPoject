package com.yang.mymedicalpoject.fragment.forumfragment.luntanfragment.bean;

import java.io.Serializable;
import java.util.List;

public class FuromChildBean implements Serializable{

    private List<TopBean> top;
    private List<ArticleBean> article;

    public List<TopBean> getTop() {
        return top;
    }

    public void setTop(List<TopBean> top) {
        this.top = top;
    }

    public List<ArticleBean> getArticle() {
        return article;
    }

    public void setArticle(List<ArticleBean> article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "FuromChildBean{" +
                "top=" + top +
                ", article=" + article +
                '}';
    }

    public static class TopBean implements Serializable{
        /**
         * commenId : 426
         * title : 医学考研西综知识点—每日小记
         * images : ["https://app.yiyanmeng.com:443/Public/shop_ping/32216/2020-11-05/5fa388792422b.jpg"]
         * content : 前言：每个医学生无论考研还是应对日常考试，知识点作为最基础的一部分，是需要必须掌握的一处。
         * <p>
         * 在接下来的日子里，小花老师会从西综的第一章节每天带领着掌握一些知识点，无论用于考研的同学，还是用于日常学习巩固应对期末考的同学，一定要细心跟着节奏进行呢~
         * <p>
         * 本知识点包含了内科、外科、生理、生化、病理、人文部分。如有更好的条件，请把每天发布的知识点用小笔头记下来，好记性不如烂笔头；专门准备一个小笔记本，我们一起来归纳！！！
         * <p>
         * 注意：每天都会在此帖下方进行更新，如果遇到相关技术的问题请咨询教务微信（yiyanmengapp）。小花老师整理的知识点一定要学会哦~！
         * addtime : 2020-11-05 13:07:05
         * zanNum : 67
         * updatetime : 2020-12-04 09:16:33
         * ping_num : 29
         * authImg : https://app.yiyanmeng.com:443/Public/user/2020-11-05/32216/16045464920.png
         * authName : 医研梦－知识点
         * authId : 32216
         * sc_name : 四川大学
         * type_name : 学长
         * is_zan : 0
         */

        private String commenId;
        private String title;
        private String content;
        private String addtime;
        private String zanNum;
        private String updatetime;
        private String ping_num;
        private String authImg;
        private String authName;
        private String authId;
        private String sc_name;
        private String type_name;
        private int is_zan;
        private List<String> images;

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

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getZanNum() {
            return zanNum;
        }

        public void setZanNum(String zanNum) {
            this.zanNum = zanNum;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getPing_num() {
            return ping_num;
        }

        public void setPing_num(String ping_num) {
            this.ping_num = ping_num;
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

        public String getSc_name() {
            return sc_name;
        }

        public void setSc_name(String sc_name) {
            this.sc_name = sc_name;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }

        public int getIs_zan() {
            return is_zan;
        }

        public void setIs_zan(int is_zan) {
            this.is_zan = is_zan;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "TopBean{" +
                    "commenId='" + commenId + '\'' +
                    ", title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    ", addtime='" + addtime + '\'' +
                    ", zanNum='" + zanNum + '\'' +
                    ", updatetime='" + updatetime + '\'' +
                    ", ping_num='" + ping_num + '\'' +
                    ", authImg='" + authImg + '\'' +
                    ", authName='" + authName + '\'' +
                    ", authId='" + authId + '\'' +
                    ", sc_name='" + sc_name + '\'' +
                    ", type_name='" + type_name + '\'' +
                    ", is_zan=" + is_zan +
                    ", images=" + images +
                    '}';
        }
    }

    public static class ArticleBean implements Serializable {
        /**
         * commenId : 648
         * title : #考研政治# #2021考研# #肖秀荣押题# 
         * images : ["https://app.yiyanmeng.com:443/Public/shop_ping/32334/2020-11-13/5fae4a9511943.jpg"]
         * content :
         * 来了，肖秀荣冲刺8套卷分析题浓缩考点背诵
         * addtime : 2020-11-13 16:57:57
         * ping_num : 3
         * zanNum : 5
         * updatetime : 2020-12-04 17:09:27
         * authImg : https://app.yiyanmeng.com:443/Public/user/2020-11-06/32334/16046636260.jpg
         * authName : orchid
         * authId : 32334
         * sc_name : 大连医科大学
         * type_name : 学生
         * is_zan : 0
         */

        private String commenId;
        private String title;
        private String content;
        private String addtime;
        private String ping_num;
        private String zanNum;
        private String updatetime;
        private String authImg;
        private String authName;
        private String authId;
        private String sc_name;
        private String type_name;
        private int is_zan;
        private List<String> images;

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

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getPing_num() {
            return ping_num;
        }

        public void setPing_num(String ping_num) {
            this.ping_num = ping_num;
        }

        public String getZanNum() {
            return zanNum;
        }

        public void setZanNum(String zanNum) {
            this.zanNum = zanNum;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
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

        public String getSc_name() {
            return sc_name;
        }

        public void setSc_name(String sc_name) {
            this.sc_name = sc_name;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }

        public int getIs_zan() {
            return is_zan;
        }

        public void setIs_zan(int is_zan) {
            this.is_zan = is_zan;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "ArticleBean{" +
                    "commenId='" + commenId + '\'' +
                    ", title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    ", addtime='" + addtime + '\'' +
                    ", ping_num='" + ping_num + '\'' +
                    ", zanNum='" + zanNum + '\'' +
                    ", updatetime='" + updatetime + '\'' +
                    ", authImg='" + authImg + '\'' +
                    ", authName='" + authName + '\'' +
                    ", authId='" + authId + '\'' +
                    ", sc_name='" + sc_name + '\'' +
                    ", type_name='" + type_name + '\'' +
                    ", is_zan=" + is_zan +
                    ", images=" + images +
                    '}';
        }
    }

}
