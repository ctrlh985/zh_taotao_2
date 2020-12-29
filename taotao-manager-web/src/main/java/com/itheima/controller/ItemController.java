package com.itheima.controller;

import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;
import com.itheima.service.ItemService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzhstart
 * @create 2020/12/23 10:37
 *
 * 商品列表
 */
@RestController
public class ItemController {

//    http://localhost:9091/rest/item?page=1&rows=30

    @Reference
    private ItemService itemService;

    @RequestMapping("/rest/item") //get请求
    public TaoResult<Item> findByPage(int page, int rows) {
        TaoResult<Item> taoResult = itemService.findByPage(page, rows);
        return taoResult;
    }

    @RequestMapping("/rest/addItem")
    public void addItem(Item item,String desc){
        itemService.saveItem(item,desc);
        System.out.println("新增商品成功：" + item);
        System.out.println("新增商品描述：" + desc);
    }


    /**
     * 下架商品
     * @param id 前端传来的id
     */
    // http://manager.taotao.com/rest/item/instock
    @RequestMapping("/rest/item/instock")
    public void instockItem(@RequestParam(value = "ids") Long id) {
        itemService.instockItem(id);
        System.out.println("商品下架成功");
    }

    // http://manager.taotao.com/rest/item/reshelf
    @RequestMapping("/rest/item/reshelf")
    public void reshelf(@RequestParam(value = "ids") Long id) {
        itemService.reshelf(id);
        System.out.println("商品上架成功");
    }

    // http://manager.taotao.com/rest/item/delete
    @RequestMapping("/rest/item/delete")
    public void deleteItem(@RequestParam(value = "ids") Long id) {
        itemService.deleteById(id);
        System.out.println("删除成功" + id);
    }

    // http://manager.taotao.com/rest/page/item-edit?_=1609243924758
    @RequestMapping("/rest/page")
    public void updateItem(@RequestParam(value = "_") Long id) {
        // itemService
    }
}
