package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzhstart
 * @create 2020/12/28 14:10
 */
@RestController
public class SendMessage {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/send")
    public String sendQueueMsg() {

        jmsMessagingTemplate.convertAndSend("taotao","该下课了");
        return "queue success~~~";
    }

    @RequestMapping("/topic")
    public String sendTopicMsg() {
        jmsMessagingTemplate.convertAndSend("NBA","nba");
        return "success";
    }
}
