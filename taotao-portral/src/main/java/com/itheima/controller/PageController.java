package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lzhstart
 * @create 2020/12/24 14:20
 */
@Controller
@RequestMapping("page")
public class PageController {

    // /**
    //  * 跳转到首页
    //  * @return
    //  */
    // @RequestMapping("/index")
    // public String toIndex() {
    //     return "index";
    // }

    @RequestMapping("/{path}.html")
    public String page(@PathVariable(name = "path") String path ){
        System.out.println("========"+ path);
        return path;
    }

}
