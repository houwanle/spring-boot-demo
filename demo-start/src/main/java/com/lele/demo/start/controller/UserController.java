package com.lele.demo.start.controller;

import com.lele.demo.model.entity.User;
import com.lele.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lele
 * @date: 2021/8/25 7:18
 * @description:
 */
@RestController
public class UserController extends BaseController {

    private static final String TAG = "UserController";

    @Resource
    private UserService userService;

    @RequestMapping(value = "user/test", produces = CHAR_SET, method = RequestMethod.GET)
    public String test() {
        return "Hello World!";
    }

    @RequestMapping(value = "user/queryAll", produces = CHAR_SET, method = RequestMethod.GET)
    public List<User> queryAll() {
        List<User> users = userService.queryAllUser();
//        BaseLogMethod.logInfo(TAG, "查询用户信息列表成功");
        return users;
    }
}
