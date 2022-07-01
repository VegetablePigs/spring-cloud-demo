package com.jyd.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jyd.common.entity.YdGoods;
import com.jyd.common.service.rpcservice.RpcGoodsService;
import com.jyd.goods.mapper.GoodsMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: jyd
 * @Date: 2022/06/16 10:00
 * @Version: 1.0
 * @Desc:
 **/
@Service(
        version = "1.0.0",
        interfaceClass = RpcGoodsService.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class RpcGoodsServiceImpl implements RpcGoodsService{

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public YdGoods getGoods(Long goodId) {
        LambdaQueryWrapper<YdGoods> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(YdGoods::getId,goodId);

        return goodsMapper.selectOne(queryWrapper);
    }
}
