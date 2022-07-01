package com.jyd.order.service.impl;


import com.jyd.common.entity.User;
import com.jyd.common.entity.YdGoods;
import com.jyd.common.entity.YdOrder;
import com.jyd.common.service.rpcservice.RpcGoodsService;
import com.jyd.common.service.rpcservice.RpcUserService;
import com.jyd.order.mapper.OrderMapper;
import com.jyd.order.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author: jyd
 * @Date: 2022/06/15 16:20
 * @Version: 1.0
 * @Desc:
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Reference(version = "1.0.0",
            interfaceClass = RpcUserService.class,
            cluster = "failfast",
            loadbalance = "roundrobin")
    private RpcUserService rpcUserService;

    @Reference(version = "1.0.0",
            interfaceClass = RpcGoodsService.class,
            cluster = "failfast",
            loadbalance = "roundrobin")
    private RpcGoodsService rpcGoodsService;

    @Override
    public void getOrder() {
        User user = rpcUserService.getUser(1);
        YdGoods goods = rpcGoodsService.getGoods(22L);
        YdOrder order = new YdOrder();
        order.setUserId(user.getId());
        order.setGoodsId(goods.getId());
        order.setOrderDescribe(goods.getDescription());
        order.setOrderNumber(String.valueOf(System.currentTimeMillis()));
        order.setStatus(1);
        orderMapper.insert(order);
    }
}
