package com.jyd.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jyd.admin.mapper.UserMapper;
import com.jyd.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: jyd
 * @Date: 2022/06/14 14:28
 * @Version: 1.0
 * @Desc:
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper usermapper;

    @Override
    public List<User> getUser(String username, String password) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,username)
                .eq(User::getPassword,password);
        return usermapper.selectList(queryWrapper);
    }

    @Override
    public User getUserById(Integer userId) {
        return null;
    }
}
