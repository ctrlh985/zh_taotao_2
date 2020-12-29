package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author lzhstart
 * @create 2020/12/29 14:31
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")
public class SSOServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(SSOServiceApp.class,args);
    }
}
