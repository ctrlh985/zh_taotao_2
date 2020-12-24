package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ItemDescMapper;
import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Item;
import com.itheima.pojo.ItemDesc;
import com.itheima.pojo.TaoResult;
import com.itheima.service.ItemDescService;
import com.itheima.service.ItemService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author lzhstart
 * @create 2020/12/22 20:20
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private ItemDescService itemDescService;
    @Override
    public TaoResult<Item> findByPage(Integer page, Integer rows) {
        //设置页面，第一个参数表示从该页开始显示，第二个参数一页显示多少条数据
        PageHelper.startPage(page,rows);
        //查询
        Page<Item> pageData = (Page<Item>) itemMapper.selectByExample(null);
        TaoResult result = new TaoResult(pageData.getTotal(), pageData.getResult());
        return result;
    }

    @Override
    public void saveItem(Item item,String desc) {
        item.setStatus(1);//1 正常 2 上架 3 下架
        item.setCreated(new Date());//商品创建时间
        item.setUpdated(new Date());//商品更新时间
        itemMapper.insert(item);

        ItemDesc itemDesc = new ItemDesc();
        itemDesc.setCreated(new Date());
        itemDesc.setUpdated(new Date());
        itemDesc.setItemDesc(desc);
        itemDesc.setItemId(item.getId());
        itemDescService.saveItemDesc(itemDesc);
    }
}
