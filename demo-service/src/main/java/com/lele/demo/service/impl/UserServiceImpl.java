package com.lele.demo.service.impl;

import com.lele.demo.base.common.BaseImsConstant;
import com.lele.demo.dao.UserMapper;
import com.lele.demo.model.entity.User;
import com.lele.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lele
 * @date: 2021/8/26 7:04
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
        String tableName = BaseImsConstant.TAB_USER;
        return userMapper.queryUserList(tableName);
    }
}
