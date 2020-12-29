package com.itheima.listener;

import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Item;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


/**
 * @author lzhstart
 * @create 2020/12/29 8:42
 */
@Component
public class MessageListener {

    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private SolrClient solrClient;

    @JmsListener(destination = "item")
    public void receiveSaveItemMsg(String id) {

        System.out.println("收到消息" + id);

        Item item = itemMapper.selectByPrimaryKey(Long.parseLong(id));
        System.out.println(item);

        SolrInputDocument document = new SolrInputDocument();
        // 商品id
        document.setField("id", item.getId().toString());
        // 商品标题
        document.setField("item_title", item.getTitle());
        // 商品价格
        document.setField("item_price", item.getPrice());
        // 商品图片
        document.setField("item_image", item.getImage());
        // 商品类目id
        document.setField("item_cid", item.getCid());
        // 商品状态
        document.setField("item_status", item.getStatus());

        try {
            // 保存到索引库中
            solrClient.add(document);
            solrClient.commit();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * 下架商品，删除索引库
     *
     * @param id
     */
    @JmsListener(destination = "instockItem")
    public void instockItemMsg(String id) {
        System.out.println("下架商品" + id);
        try {
            solrClient.deleteById(id);
            solrClient.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 上架商品，更新索引库
     * @param id
     */
    @JmsListener(destination = "reshelfItem")
    public void reshelf(String id) {
        System.out.println("上架商品" + id);
        Item item = itemMapper.selectByPrimaryKey(Long.parseLong(id));
        System.out.println(item);

        SolrInputDocument document = new SolrInputDocument();
        // 商品id
        document.setField("id", item.getId().toString());
        // 商品标题
        document.setField("item_title", item.getTitle());
        // 商品价格
        document.setField("item_price", item.getPrice());
        // 商品图片
        document.setField("item_image", item.getImage());
        // 商品类目id
        document.setField("item_cid", item.getCid());
        // 商品状态
        document.setField("item_status", item.getStatus());

        try {
            // 保存到索引库中
            solrClient.add(document);
            solrClient.commit();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * 下架商品，删除索引库
     *
     * @param id
     */
    @JmsListener(destination = "deleteItem")
    public void deleteItemMsg(String id) {
        System.out.println("删除商品" + id);
        try {
            solrClient.deleteById(id);
            solrClient.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
