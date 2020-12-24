package com.itheima.service;

import com.itheima.pojo.ItemCat;

import java.util.List;

/**
 * @author lzhstart
 * @create 2020/12/23 13:46
 */
public interface ItemCatService {
    List<ItemCat> queryItemCatByParentId(Long parentId);
}
