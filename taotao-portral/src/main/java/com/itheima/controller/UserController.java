package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lzhstart
 * @create 2020/12/29 14:14
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;


    // Request URL: http://www.taotao.com/service/user/doLogin?r=0.8002384884524969
    @RequestMapping(value = "/service/user/doLogin", method = RequestMethod.POST)
    public Map<String, Object> doLogin(User user, HttpServletRequest request, HttpServletResponse response) {
        // 调用服务进行用户登录，需要返回ticket，目的是放到cookie中给用户
        String ticket = this.userService.doLogin(user);

        System.out.println("ticket===" + ticket);

        // 判断ticket是否为空，如果不为空表示用户登录成功
        if (StringUtils.isNotBlank(ticket)) {
            // 如果登录成功ticket需要放到cookie中
            // CookieUtils.setCookie(request, response, this.TT_TICKET, ticket, 60 * 60 * 24, true);

            // 封装返回数据
            Map<String, Object> map = new HashMap<>();
            map.put("status", "200");

            return map;

        }
        return null;
    }
}
