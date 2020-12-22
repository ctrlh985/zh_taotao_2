package com.itheima.service.impl;

import com.itheima.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author lzhstart
 * @create 2020/12/22 15:52
 */
//这个注解是dubbo的注解
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void sayHello() {
        System.out.println("TestServiceImpl的sayHello方法被调用了....");
    }
}
