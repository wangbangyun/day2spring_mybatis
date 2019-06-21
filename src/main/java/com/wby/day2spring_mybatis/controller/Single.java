package com.wby.day2spring_mybatis.controller;

/**
 * @Author wangbangyun
 * @Date 2019/6/21
 * @Version 1.0
 */
public class Single {
    private  Single(){};
    private  static Single single=new Single();
    public  Single getSingle(){
        return single;
    }
}

