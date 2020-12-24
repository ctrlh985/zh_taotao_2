package com.itheima.service.impl;

import com.itheima.mapper.ItemCatMapper;
import com.itheima.pojo.ItemCat;
import com.itheima.service.ItemCatService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author lzhstart
 * @create 2020/12/23 13:51
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<ItemCat> queryItemCatByParentId(Long parentId) {
        ItemCat cat = new ItemCat();
        cat.setParentId(parentId);
        return itemCatMapper.select(cat);
    }
}
