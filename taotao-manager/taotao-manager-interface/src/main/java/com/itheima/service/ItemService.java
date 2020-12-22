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
}
