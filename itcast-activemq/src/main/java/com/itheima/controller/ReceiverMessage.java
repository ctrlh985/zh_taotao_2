package com.itheima.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author lzhstart
 * @create 2020/12/28 14:19
 */
@Component
public class ReceiverMessage {

    @JmsListener(destination = "taotao")
    public void receiverMessage(String data) {
        System.out.println(data);
    }

    @JmsListener(destination = "NBA")
    public void get(String data) {
        System.out.println("hello"+data);
    }




}
