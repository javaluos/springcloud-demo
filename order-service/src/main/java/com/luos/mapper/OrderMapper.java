package com.luos.mapper;

import com.luos.entity.Order;

/**
 * @author luosong@agree.com.cn
 * @since 2022/7/8
 **/
public interface OrderMapper {
    Order findById(Long id);

}
