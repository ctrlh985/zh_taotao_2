package com.itheima.service.impl;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lzhstart
 * @create 2020/12/29 14:23
 */
@Service
public class UsergServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String doLogin(User user) {
        User user1 = userMapper.selectOne(user);
        if (user1 != null){
            return "login_success" + user1.getId();
        }

        return null;
    }
}
