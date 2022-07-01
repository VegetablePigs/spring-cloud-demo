package com.jyd.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: jyd
 * @Date: 2022/06/15 16:09
 *
 * @Version: 1.0
 * @Desc:
 **/
@Data
public class YdOrder implements Serializable {
    private Long id;
    private Long userId;
    private Long goodsId;
    private Date createTime;
    private Date updateTime;
    private Integer status;
    private String orderDescribe;
    private String orderNumber;
}
