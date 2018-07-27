package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 测试rabbitmq组件用的，接收类
 */
@Component
@Slf4j
public class MqReceiver {

    //@RabbitListener(queues = "myQueue")
    //自动创建队列@RabbitListener(queuesToDeclare = @Queue("myQueue"))
    //自动创建队列，Exchange和Queue绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String message){
        log.info("myQueue = {}", message);
    }

    /**
     * 将消息队列进行分组接收，只接收电脑组的消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("myOrder"),
            value = @Queue("computerOrder"),
            key = "computer"
    ))
    public void processComputer(String message){
        log.info(" computer MqReceiver：{}",message);
    }

}
