package com.luos.service;

import com.luos.entity.Order;
import com.luos.entity.User;
import com.luos.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author luosong@agree.com.cn
 * @since 2022/7/8
 **/
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    public Order queryById(Long id) {
        Order order = orderMapper.findById(id);
        String url = "http://userservice/user/" + order.getUserId();
        User user = restTemplate.getForObject(url, User.class);
        order.setUser(user);
        return order;
    }

}
