package com.jyd.admin.controller;

import com.jyd.common.entity.User;
import com.jyd.admin.service.UserService;
import com.jyd.common.model.BusinessCodeEnum;
import com.jyd.common.model.CallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: jyd
 * @Date: 2022/06/14 14:23
 * @Version: 1.0
 * @Desc:
 **/
@RestController
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @GetMapping("getUser")
    public CallResult getUser(String username, String password){
        List<User> userList = userService.getUser(username, password);
        return CallResult.success(200, BusinessCodeEnum.DEFAULT_SUCCESS.getMsg(),userList);
    }
}
