package com.jyd.goods.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: jyd
 * @Date: 2022/06/15 10:53
 * @Version: 1.0
 * @Desc:
 **/
@Data
public class YdGoods {
   private Long id;
   private String name;
   private String imgUrl;
   private String description;
   private BigDecimal price;
   private Integer status;
   private Integer type;
   private String brand;
   private Date createTime;
   private Date updateTime;
}
