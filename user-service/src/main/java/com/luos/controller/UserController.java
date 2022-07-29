package com.luos.controller;

import com.luos.configuration.PatternProperties;
import com.luos.entity.User;
import com.luos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author luosong@agree.com.cn
 * @since 2022/7/8
 **/
@RestController
@RequestMapping("/user")
//@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PatternProperties patternProperties;

    /*@Value("${pattern.dateformat}")
    private String dateformat;*/

    @GetMapping(value = "/now")
    private String now() {
        String dateformat = patternProperties.getDateformat();
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
    }

    @GetMapping(value = "/{id}")
    public User queryById(@PathVariable(value = "id") Long id,
                          @RequestHeader(value = "desc", required = false) String desc) {
        System.out.println(desc);
        return userService.queryById(id);
    }

}
