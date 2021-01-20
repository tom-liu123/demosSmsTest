package com.example.demo.entity;

/**
 * @author LiuCongYang
 * @Version 1.0.0
 * create at @date  2020/12/21 11:21
 * copyright Beijing Murong Information Technology Co.,Ltd.
 */

public class Sms {
    String phoneNm;//手机号
    String code;//验证码
    int min;//有效时间

    public String getPhoneNm() {
        return phoneNm;
    }

    public void setPhoneNm(String phoneNm) {
        this.phoneNm = phoneNm;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
