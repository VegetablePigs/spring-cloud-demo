package com.jyd.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyd.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: jyd
 * @Date: 2022/06/14 14:30
 * @Company: 广州风雨雷科技有限公司
 * @Version: 1.0
 * @Desc:
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> getUser(String username, String password);
}
