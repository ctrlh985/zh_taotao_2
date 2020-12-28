package com.itheima.service;

import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;

/**
 * @author lzhstart
 * @create 2020/12/28 8:44
 */
public interface SearchService {
    /**
     *
     * @param query
     * @param page
     * @param rows
     * @return
     */

    TaoResult<Item> search(String query, Integer page, Integer rows);
}
