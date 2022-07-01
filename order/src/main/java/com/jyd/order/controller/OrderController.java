package com.jyd.order.controller;

import com.jyd.common.entity.YdOrder;
import com.jyd.common.model.BusinessCodeEnum;
import com.jyd.common.model.CallResult;
import com.jyd.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jyd
 * @Date: 2022/06/15 16:16
 * @Version: 1.0
 * @Desc:
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 生成订单
     * @return
     */
    @PostMapping("/getOrder")
    public CallResult getOrder(){
        orderService.getOrder();
        return CallResult.success();
    }
}
