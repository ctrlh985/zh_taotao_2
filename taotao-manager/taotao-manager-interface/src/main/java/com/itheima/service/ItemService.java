package com.itheima.service;


import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;

/**
 * @author lzhstart
 * @create 2020/12/22 19:56
 */
public interface ItemService {

    /**
     * 分页查询
     * @param page 当前页
     * @param rows 一页显示多少行数据
     */
    TaoResult<Item> findByPage(Integer page, Integer rows);

    /**
     * 新增商品
     * @param item 商品对象
     * @param desc 商品描述
     */
    void saveItem(Item item,String desc);


    /**
     * 下架
     * @param id
     */
    void instockItem(Long id);

    Item queryById(Long itemId);

    void reshelf(Long id);

    void deleteById(Long id);
}
