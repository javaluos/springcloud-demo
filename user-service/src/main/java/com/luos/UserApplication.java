package com.luos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author luosong@agree.com.cn
 * @since 2022/7/7
 **/
@SpringBootApplication
@MapperScan("com.luos.mapper")
public class UserApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }


}
