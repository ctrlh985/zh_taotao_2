package com.itheima.controller;

import com.itheima.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzhstart
 * @create 2020/12/22 16:19
 */
@RestController
public class TestController {

//    @Autowired 只能注入自己项目的对象

    @Reference
    private TestService testService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        testService.sayHello();
        return "success~~~";
    }
}
