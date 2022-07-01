package com.jyd.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyd.common.entity.YdOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: jyd
 * @Date: 2022/06/15 16:17
 * @Version: 1.0
 * @Desc:
 **/
@Mapper
public interface OrderMapper extends BaseMapper<YdOrder> {
}
