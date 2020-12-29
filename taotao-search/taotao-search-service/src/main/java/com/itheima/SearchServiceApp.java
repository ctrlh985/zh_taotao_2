package com.itheima;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author lzhstart
 * @create 2020/12/28 8:59
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")
public class SearchServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(SearchServiceApp.class,args);
    }
}
