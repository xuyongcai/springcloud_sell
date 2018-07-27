package com.imooc.order.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.dto.OrderDto;
import com.imooc.order.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class OrderForm2OrderDtoConverter {

    public static OrderDto convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDto orderDto = new OrderDto();
        orderDto.setBuyerName(orderForm.getName());
        orderDto.setBuyerAddress(orderForm.getAddress());
        orderDto.setBuyerPhone(orderForm.getPhone());
        orderDto.setBuyerOpenid(orderForm.getOpenId());

        List<OrderDetail> orderDetailList = new ArrayList<>();

        try{
            orderDetailList = gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e){
            log.error("【json转换】错误, string={}",orderForm.getItems());
        }

        orderDto.setOrderDetailList(orderDetailList);
        return orderDto;
    }
}
