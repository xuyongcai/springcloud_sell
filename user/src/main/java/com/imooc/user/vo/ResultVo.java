package com.imooc.user.vo;

import lombok.Data;

@Data
public class ResultVo<T> {

    private Integer code;
    private String msg;
    private T data;
}
