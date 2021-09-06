package com.lele.demo.service;

import com.lele.demo.model.entity.User;

import java.util.List;

/**
 * @author: lele
 * @date: 2021/8/26 7:03
 * @description:
 */
public interface UserService {

    /**
     * 查询用户信息列表
     * @return
     */
    List<User> queryAllUser();
}
