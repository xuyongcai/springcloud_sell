package com.imooc.order.message;

import com.imooc.order.dto.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * 测试springcloud stream的接收端，
 * 发送端在controller目录下
 */
@Component
@Slf4j
@EnableBinding(StreamClient.class)
public class StreamReceiver {

    /**
     * Stream接收OrderDto对象，消息
     * @param message
     * @return
     */
    @StreamListener(StreamClient.INPUT)
    @SendTo(StreamClient.INPUT2)
    public String process(OrderDto message) {
        log.info("StreamReceiver1:{}", message);
        return "received";
    }

    @StreamListener(StreamClient.INPUT2)
    public void process2(String message) {
        log.info("StreamReceiver2:{}", message);
    }
}
