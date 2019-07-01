package com.maomao.springbootssm.controller;

import com.maomao.springbootssm.model.User;
import com.maomao.springbootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:maomao
 * @Date:2019/7/1
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectUser")
    public User selectUser(int id){
        return userService.selectUser(id);
    }
}
