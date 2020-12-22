package com.itheima.service.impl;

import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;
import com.itheima.service.ItemService;

/**
 * @author lzhstart
 * @create 2020/12/22 20:20
 */
public class ItemServiceImpl implements ItemService {

    private ItemMapper itemMapper;
    @Override
    public TaoResult<Item> findByPage(Integer page, Integer rows) {
        return null;
    }
}
