package com.wby.day2spring_mybatis.service;


import com.wby.day2spring_mybatis.entity.User;

import java.util.List;

/**
 * 哈哈哈哈哈哈哈岁的法国
 * @Author wangbangyun
 * @Date 2019/6/20
 * @Version 1.0
 */
public interface UserService {
      List<User> findAll();

      int  insert(User user);
}
