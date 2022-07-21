package com.luos.controller;

import com.luos.entity.User;
import com.luos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luosong@agree.com.cn
 * @since 2022/7/8
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{id}")
    public User queryById(@PathVariable(value = "id") Long id) {
        return userService.queryById(id);
    }

}
