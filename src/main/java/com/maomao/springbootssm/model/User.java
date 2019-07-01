package com.maomao.springbootssm.model;

import lombok.Data;

/**
 * @Author:maomao
 * @Date:2019/7/1
 */
@Data
public class User {
    private int id;
    private String username;
    private String birthday;
    private String sex;
    private String address;
}
