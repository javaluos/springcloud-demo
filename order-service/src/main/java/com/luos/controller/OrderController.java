package com.luos.controller;

import com.luos.entity.Order;
import com.luos.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luosong@agree.com.cn
 * @since 2022/7/8
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/order/{id}")
    public Order queryById(@PathVariable(value = "id") Long id) {
        return orderService.queryById(id);
    }

}
