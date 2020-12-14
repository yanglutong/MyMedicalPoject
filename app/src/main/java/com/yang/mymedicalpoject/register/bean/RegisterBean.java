package com.yang.mymedicalpoject.register.bean;

public class RegisterBean {

    /**
     * token : {"access_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjMyNzQ0LCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMjYuOCIsInRpbWUiOjE2MDcwMDEwODd9.mm9KxOiTOdilsrCbhfVnv74Nq1b_Q8bnZpfOVLPmdsE","expires":"2020-12-03 21:11:27","refreshTokenExpires":"2020-12-26 21:11:27","refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjMyNzQ0LCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMjYuOCIsInRpbWUiOjE2MDg5ODgyODd9.x3al825jBo4Bc4re22EQ09SiHSFXnjb6R4GlT2MdiBU"}
     * user_info : {"id":"32744","pass":"202cb962ac59075b964b07152d234b70","u_name":"YYM_5jG985YOI","u_pic":"https://app.yiyanmeng.com:443/Public/user/","phnoe":"13533315243","sex":"1","yu_bao_ming":null,"xinxi":0}
     */

    private TokenBean token;
    private UserInfoBean user_info;

    public TokenBean getToken() {
        return token;
    }

    public void setToken(TokenBean token) {
        this.token = token;
    }

    public UserInfoBean getUser_info() {
        return user_info;
    }

    public void setUser_info(UserInfoBean user_info) {
        this.user_info = user_info;
    }

    public static class TokenBean {
        /**
         * access_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjMyNzQ0LCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMjYuOCIsInRpbWUiOjE2MDcwMDEwODd9.mm9KxOiTOdilsrCbhfVnv74Nq1b_Q8bnZpfOVLPmdsE
         * expires : 2020-12-03 21:11:27
         * refreshTokenExpires : 2020-12-26 21:11:27
         * refresh_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjMyNzQ0LCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMjYuOCIsInRpbWUiOjE2MDg5ODgyODd9.x3al825jBo4Bc4re22EQ09SiHSFXnjb6R4GlT2MdiBU
         */

        private String access_token;
        private String expires;
        private String refreshTokenExpires;
        private String refresh_token;

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public String getExpires() {
            return expires;
        }

        public void setExpires(String expires) {
            this.expires = expires;
        }

        public String getRefreshTokenExpires() {
            return refreshTokenExpires;
        }

        public void setRefreshTokenExpires(String refreshTokenExpires) {
            this.refreshTokenExpires = refreshTokenExpires;
        }

        public String getRefresh_token() {
            return refresh_token;
        }

        public void setRefresh_token(String refresh_token) {
            this.refresh_token = refresh_token;
        }
    }

    public static class UserInfoBean {
        /**
         * id : 32744
         * pass : 202cb962ac59075b964b07152d234b70
         * u_name : YYM_5jG985YOI
         * u_pic : https://app.yiyanmeng.com:443/Public/user/
         * phnoe : 13533315243
         * sex : 1
         * yu_bao_ming : null
         * xinxi : 0
         */

        private String id;
        private String pass;
        private String u_name;
        private String u_pic;
        private String phnoe;
        private String sex;
        private Object yu_bao_ming;
        private int xinxi;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getU_name() {
            return u_name;
        }

        public void setU_name(String u_name) {
            this.u_name = u_name;
        }

        public String getU_pic() {
            return u_pic;
        }

        public void setU_pic(String u_pic) {
            this.u_pic = u_pic;
        }

        public String getPhnoe() {
            return phnoe;
        }

        public void setPhnoe(String phnoe) {
            this.phnoe = phnoe;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public Object getYu_bao_ming() {
            return yu_bao_ming;
        }

        public void setYu_bao_ming(Object yu_bao_ming) {
            this.yu_bao_ming = yu_bao_ming;
        }

        public int getXinxi() {
            return xinxi;
        }

        public void setXinxi(int xinxi) {
            this.xinxi = xinxi;
        }
    }
}
