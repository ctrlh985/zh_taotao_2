package com.itheima.service;

import com.itheima.pojo.ItemDesc;

/**
 * @author lzhstart
 * @create 2020/12/24 9:23
 */
public interface ItemDescService {
    void saveItemDesc(ItemDesc itemDesc);

    ItemDesc queryById(Long itemId);
}
