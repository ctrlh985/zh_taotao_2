package com.itheima.service.impl;

import com.itheima.mapper.ItemDescMapper;
import com.itheima.pojo.ItemDesc;
import com.itheima.service.ItemDescService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Override
    public ItemDesc queryById(Long itemId) {
        ItemDesc itemDesc = new ItemDesc();
        itemDesc.setItemId(itemId);
        return itemDescMapper.selectOne(itemDesc);
    }
}
