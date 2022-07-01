package com.jyd.common.service.rpcservice;

import com.jyd.common.entity.YdGoods;

/**
 * @Author: jyd
 * @Date: 2022/06/16 09:58
 * @Version: 1.0
 * @Desc:
 **/
public interface RpcGoodsService {
    /**
     * 获取商品
     * @param goodId
     * @return
     */
    YdGoods getGoods(Long goodId);
}
