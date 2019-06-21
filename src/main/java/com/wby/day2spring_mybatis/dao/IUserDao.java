package com.wby.day2spring_mybatis.dao;

import com.wby.day2spring_mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author wangbangyun
 * @Date 2019/6/20
 * @Version 1.0
 */
@Mapper
public interface IUserDao {
      List<User> findAll();

      int insert(User user);
}
