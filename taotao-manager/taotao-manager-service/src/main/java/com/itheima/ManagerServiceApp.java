package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author lzhstart
 * @create 2020/12/23 9:17
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")
public class ManagerServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ManagerServiceApp.class,args);
    }
}
