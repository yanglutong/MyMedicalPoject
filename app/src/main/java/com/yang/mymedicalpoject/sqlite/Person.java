package com.yang.mymedicalpoject.sqlite;

public class Person {
   private String region;
   private Long phone;
   private String address1;
   private String detail;
   private boolean isCheck;

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    private int a;
    public Person(String region, Long phone, String address1, String detail,int a) {
        this.region = region;
        this.phone = phone;
        this.address1 = address1;
        this.detail = detail;
        this.a=a;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
