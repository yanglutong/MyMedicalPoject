package com.yang.mymedicalpoject.register.bean;

public class RegisterCodeBean {

    /**
     * type : ture
     * msg : 短信发送成功
     * code : 522129
     */

    private String type;
    private String msg;
    private int code;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
