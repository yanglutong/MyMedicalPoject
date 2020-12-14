package com.yang.mymedicalpoject.login.bean;

public class LoginBean {

    /**
     * token : {"access_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIzMjc2MCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4yNi44IiwidGltZSI6MTY2NjkzNjE0M30.l0qFcGUryWWJH1sdnEmfsq3XAbRWKZ_QZ__yca3sVLM","expires":"2022-10-28 13:49:03","refreshTokenExpires":"2021-09-23 13:49:03","refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIzMjc2MCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4yNi44IiwidGltZSI6MTYzMjM3NjE0M30.x9fJ8EaIboxwF-Fc6wUDuuQBCY-Zoq_jRcraVKiQiW4"}
     * user_info : {"id":"32760","is_ws":"0","pass":"44a778db47f438058de8c77abbc2f813","phnoe":"18331877311","reg_type":"3","sex":"1","status":"1","u_name":"YYM_5jGwQPju2","u_pic":"https://app.yiyanmeng.com:443/Public/user/","xinxi":"0"}
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
         * access_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIzMjc2MCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4yNi44IiwidGltZSI6MTY2NjkzNjE0M30.l0qFcGUryWWJH1sdnEmfsq3XAbRWKZ_QZ__yca3sVLM
         * expires : 2022-10-28 13:49:03
         * refreshTokenExpires : 2021-09-23 13:49:03
         * refresh_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIzMjc2MCIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4yNi44IiwidGltZSI6MTYzMjM3NjE0M30.x9fJ8EaIboxwF-Fc6wUDuuQBCY-Zoq_jRcraVKiQiW4
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
         * id : 32760
         * is_ws : 0
         * pass : 44a778db47f438058de8c77abbc2f813
         * phnoe : 18331877311
         * reg_type : 3
         * sex : 1
         * status : 1
         * u_name : YYM_5jGwQPju2
         * u_pic : https://app.yiyanmeng.com:443/Public/user/
         * xinxi : 0
         */

        private String id;
        private String is_ws;
        private String pass;
        private String phnoe;
        private String reg_type;
        private String sex;
        private String status;
        private String u_name;
        private String u_pic;
        private String xinxi;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIs_ws() {
            return is_ws;
        }

        public void setIs_ws(String is_ws) {
            this.is_ws = is_ws;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getPhnoe() {
            return phnoe;
        }

        public void setPhnoe(String phnoe) {
            this.phnoe = phnoe;
        }

        public String getReg_type() {
            return reg_type;
        }

        public void setReg_type(String reg_type) {
            this.reg_type = reg_type;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
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

        public String getXinxi() {
            return xinxi;
        }

        public void setXinxi(String xinxi) {
            this.xinxi = xinxi;
        }
    }
}
