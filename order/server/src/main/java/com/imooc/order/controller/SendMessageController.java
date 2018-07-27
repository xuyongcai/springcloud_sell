package com.imooc.order.controller;

import com.imooc.order.dto.OrderDto;
import com.imooc.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试springcloud stream的发送端，
 * 接收端在message目录下
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

    /**
     * stream发送OrderDto对象
     */
    @GetMapping("/sendMessage")
    public void process() {
        OrderDto dto = new OrderDto();
        dto.setOrderId("123456");
        streamClient.output().send(MessageBuilder.withPayload(dto).build());
    }
}
