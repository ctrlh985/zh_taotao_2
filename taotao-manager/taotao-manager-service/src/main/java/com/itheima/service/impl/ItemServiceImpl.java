package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;
import com.itheima.service.ItemService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lzhstart
 * @create 2020/12/22 20:20
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public TaoResult<Item> findByPage(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);

        Page<Item> pageData = (Page<Item>) itemMapper.selectByExample(null);
        TaoResult result = new TaoResult(pageData.getTotal(), pageData.getResult());
        return result;
    }
}
