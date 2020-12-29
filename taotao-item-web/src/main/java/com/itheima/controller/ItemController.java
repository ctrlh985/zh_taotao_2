package com.itheima.controller;

import com.itheima.pojo.Item;
import com.itheima.pojo.ItemDesc;
import com.itheima.service.ItemDescService;
import com.itheima.service.ItemService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lzhstart
 * @create 2020/12/29 10:45
 */
@Controller
@RequestMapping("item")
public class ItemController {
    @Reference
    private ItemService itemService;

    @Reference
    private ItemDescService itemDescService;

    // http://item.taotao.com/item/${item.id }.html
    @RequestMapping(value = "{itemId}.html", method = RequestMethod.GET)
    public String toItem(@PathVariable("itemId") Long itemId, Model model) {

        // 根据商品id从服务中查询商品数据
        Item item = this.itemService.queryById(itemId);

        // 根据商品id从服务中查询商品描述数据
        ItemDesc itemDesc = this.itemDescService.queryById(itemId);

        // 保存商品数据到模型中
        model.addAttribute("item", item);

        // 保存商品描述数据到模型中
        model.addAttribute("itemDesc", itemDesc);

        return "item";
    }
}
