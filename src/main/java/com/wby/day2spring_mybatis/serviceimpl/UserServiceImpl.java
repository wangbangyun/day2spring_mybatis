package com.wby.day2spring_mybatis.serviceimpl;

import com.wby.day2spring_mybatis.dao.IUserDao;
import com.wby.day2spring_mybatis.entity.User;
import com.wby.day2spring_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wangbangyun
 * @Date 2019/6/20
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }


}
