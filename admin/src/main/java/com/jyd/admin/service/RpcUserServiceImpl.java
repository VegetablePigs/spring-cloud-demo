package com.jyd.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jyd.admin.mapper.UserMapper;
import com.jyd.common.entity.User;
import com.jyd.common.service.rpcservice.RpcUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: jyd
 * @Date: 2022/06/15 14:39
 * @Version: 1.0
 * @Desc:
 **/
@Service(version = "1.0.0",
        interfaceClass = RpcUserService.class,
        cluster = "failfast",
        loadbalance = "roundrobin")
public class RpcUserServiceImpl implements RpcUserService {

    @Autowired
    private UserMapper usermapper;

    @Override
    public User getUser(Integer userId) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getId,userId);
        return usermapper.selectOne(queryWrapper);
    }

}
