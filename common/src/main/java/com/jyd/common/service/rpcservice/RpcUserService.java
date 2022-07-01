package com.jyd.common.service.rpcservice;

import com.alibaba.dubbo.config.annotation.Service;
import com.jyd.common.entity.User;

/**
 * @Author: jyd
 * @Date: 2022/06/15 14:33
 * @Version: 1.0
 * @Desc:
 **/

public interface RpcUserService {

    User getUser(Integer userId);
}
