package com.wby.day2spring_mybatis.controller;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @Author wangbangyun
 * @Date 2019/6/21
 * @Version 1.0
 */
public class SingleBsohan {
    private  static  SingleBsohan singleBsohan;
    private  SingleBsohan(){};
    public static  SingleBsohan getSingleBsohan(){
        if (singleBsohan == null){
            singleBsohan=new SingleBsohan();
        }
        return singleBsohan;
    }
}
