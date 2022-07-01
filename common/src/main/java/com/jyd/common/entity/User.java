package com.jyd.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: jyd
 * @Date: 2022/06/14 13:48
 * @Version: 1.0
 * @Desc:
 **/
@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String age;
    private String address;
    private String phone;
    private Integer status;
    private Date createTime;
    private Date updateTime;
    private Integer deleted;
}
