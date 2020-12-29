package com.itheima.mapper;

import com.itheima.pojo.Item;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author lzhstart
 * @create 2020/12/25 10:04
 */
@Repository
public interface ItemMapper extends Mapper<Item> {

}
