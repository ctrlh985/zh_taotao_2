package com.itheima.service.impl;

import com.itheima.mapper.ItemDescMapper;
import com.itheima.pojo.ItemDesc;
import com.itheima.service.ItemDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lzhstart
 * @create 2020/12/24 9:24
 */
@Service
public class ItemDescServiceImpl implements ItemDescService {

    @Autowired
    private ItemDescMapper itemDescMapper;

    @Override
    public void saveItemDesc(ItemDesc itemDesc) {
        itemDescMapper.insert(itemDesc);
    }
}
