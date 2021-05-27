package com.just.blog.service.impl;

import com.just.blog.mapper.UserMapper;
import com.just.blog.pojo.User;
import com.just.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author justnow
 * Created on 2021-05-27
 * Description
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(Integer id) {
        return userMapper.queryUserById(id);
    }
}
