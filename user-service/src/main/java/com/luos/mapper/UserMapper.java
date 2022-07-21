package com.luos.mapper;

import com.luos.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author luosong@agree.com.cn
 * @since 2022/7/8
 **/
@Mapper
public interface UserMapper {

    User findById(Long userId);

}
