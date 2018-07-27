package com.imooc.order;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 测试rabbitmq组件用的，发送类
 */
public class MqReceiverTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue","new"+new Date());
    }

    @Test
    public void sendOrder(){
        amqpTemplate.convertAndSend("myOrder","computer","new"+new Date());
    }

}
