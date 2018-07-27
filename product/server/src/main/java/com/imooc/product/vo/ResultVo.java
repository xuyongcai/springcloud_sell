package com.imooc.product.vo;

import lombok.Data;

@Data
public class ResultVo<T> {

    /**
     * 返回码
     */
    private Integer coke;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
