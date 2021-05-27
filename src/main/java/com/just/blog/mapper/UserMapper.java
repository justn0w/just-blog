package com.just.blog.mapper;

import com.just.blog.pojo.User;

/**
 * @author justnow
 * Created on 2021-05-27
 * Description
 */

public interface UserMapper {
    User queryUserById(Integer id);
}
