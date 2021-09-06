package com.lele.demo.dao;

import com.lele.demo.model.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: lele
 * @date: 2021/8/26 6:59
 * @description:
 */
@Repository
public interface UserMapper {

    /**
     * 查询用户列表
     * @param tableName 数据库表名
     * @return 用户列表
     */
    List<User> queryUserList(@Param("table") String tableName);
}
