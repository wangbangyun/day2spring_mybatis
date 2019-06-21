package com.wby.day2spring_mybatis.entity;

/**
 * @Author wangbangyun
 * @Date 2019/6/20
 * @Version 1.0
 */
public class User {
    private String username;
    private  String sex;
    private String  address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
