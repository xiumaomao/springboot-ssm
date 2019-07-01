package com.maomao.springbootssm.mapper;

import com.maomao.springbootssm.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author:maomao
 * @Date:2019/7/1
 */
@Mapper
public interface UserMapper {
    public User selectUser(int id);
}
