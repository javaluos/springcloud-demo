package com.luos.service;

import com.luos.entity.Order;
import com.luos.feign.client.UserClient;
import com.luos.feign.entity.User;
import com.luos.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
 * @author luosong@agree.com.cn
 * @since 2022/7/8
 **/
@Service
public class OrderService {

    private final OrderMapper orderMapper;

    private final UserClient userClient;

    public OrderService(OrderMapper orderMapper, UserClient userClient) {
        this.orderMapper = orderMapper;
        this.userClient = userClient;
    }

    public Order queryById(Long id) {
        Order order = orderMapper.findById(id);
        User user = userClient.findById(order.getUserId());
        order.setUser(user);
        return order;
    }

    /*public Order queryById(Long id) {
        Order order = orderMapper.findById(id);
        String url = "http://userservice/user/" + order.getUserId();
        User user = restTemplate.getForObject(url, User.class);
        order.setUser(user);
        return order;
    }*/

}
