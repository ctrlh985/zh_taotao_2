package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lzhstart
 * @create 2020/12/23 10:21
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String page(String page) {
//        System.out.println(page);
        return page;
    }
}
