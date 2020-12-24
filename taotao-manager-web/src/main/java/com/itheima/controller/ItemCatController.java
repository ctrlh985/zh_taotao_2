package com.itheima.controller;

import com.itheima.pojo.ItemCat;
import com.itheima.service.ItemCatService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lzhstart
 * @create 2020/12/23 14:02
 */
@RestController
public class ItemCatController {

    @Reference
    private ItemCatService itemCatService;

    @RequestMapping("/rest/item/cat")
    public List<ItemCat> queryItemCatByParentId(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        List<ItemCat> itemCatList = itemCatService.queryItemCatByParentId(parentId);
        return itemCatList;
    }
}
