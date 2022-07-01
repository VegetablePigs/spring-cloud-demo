package com.jyd.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: jyd
 * @Date: 2022/06/14 13:07
 * @Version: 1.0
 * @Desc:
 **/
@SpringBootApplication
@MapperScan("com.jyd.admin.mapper")
public class AdminApplication {

 public static void main(String[] args) {
  SpringApplication.run(AdminApplication.class,args);
 }
}
