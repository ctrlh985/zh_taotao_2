package com.itheima.controller;

import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;
import com.itheima.service.ItemService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzhstart
 * @create 2020/12/23 10:37
 */
@RestController
public class ItemController {

//    http://localhost:9091/rest/item?page=1&rows=30

    @Reference
    private ItemService itemService;

    @RequestMapping("/rest/item")
    public TaoResult<Item> findByPage(int page, int rows) {
        TaoResult<Item> taoResult = itemService.findByPage(page, rows);
        return taoResult;
    }



}
