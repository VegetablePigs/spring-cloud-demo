package com.jyd.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyd.common.entity.User;

import java.util.List;

/**
 * @Author: jyd
 * @Date: 2022/06/14 14:27
 * @Version: 1.0
 * @Desc:
 **/
public interface UserService{
    /**
     *
     * @param username
     * @param password
     * @return
     */
    List<User> getUser(String username, String password);

    /**
     *
     * @param userId
     * @return
     */
    User getUserById(Integer userId);
}
