package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：she
 * @Program : com.atguigu.gmall.user.service.impl
 * @date ：Created in 2020/12/26 1:53
 * @Description：TODO
 */
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
}
