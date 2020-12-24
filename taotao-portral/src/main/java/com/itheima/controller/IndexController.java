package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lzhstart
 * @create 2020/12/24 14:20
 */
@Controller
public class IndexController {

    /**
     * 跳转到首页
     * @return
     */
    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }
}