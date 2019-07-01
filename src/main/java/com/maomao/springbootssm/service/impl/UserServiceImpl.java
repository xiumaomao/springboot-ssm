package com.maomao.springbootssm.service.impl;

import com.maomao.springbootssm.mapper.UserMapper;
import com.maomao.springbootssm.model.User;
import com.maomao.springbootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:maomao
 * @Date:2019/7/1
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUser(int id) {
        return userMapper.selectUser(id);
    }
}
