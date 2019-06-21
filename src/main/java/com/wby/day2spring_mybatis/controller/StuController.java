package com.wby.day2spring_mybatis.controller;

import com.wby.day2spring_mybatis.entity.User;
import com.wby.day2spring_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author wangbangyun
 * @Date 2019/6/20
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class StuController {
    @Autowired
    private UserService userService;
    @RequestMapping("/find")
    public List<User> findAll(){
        System.out.println("出来了");
        return  userService.findAll();
    }
    @RequestMapping("/into")
    public  String  insert(){
        User user =new User();
        user.setUsername("你妹的");
        user.setSex("女");
        user.setAddress("深圳");
         userService.insert(user);
        return "succ";
    }
}
