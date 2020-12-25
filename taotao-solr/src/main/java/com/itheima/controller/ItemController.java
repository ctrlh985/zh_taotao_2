package com.itheima.controller;

import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzhstart
 * @create 2020/12/25 10:14
 */
@RestController
public class ItemController {

    @Autowired
    ItemService itemService;
    @RequestMapping("/addIndex")
    public String addIndex(){
        itemService.addIndex();
        return "success~~~";
    }
}
