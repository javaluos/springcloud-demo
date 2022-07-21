package com.luos.service;

import com.luos.entity.User;
import com.luos.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luosong@agree.com.cn
 * @since 2022/7/8
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long userId) {
        return userMapper.findById(userId);
    }

}
