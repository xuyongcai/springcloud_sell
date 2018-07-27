package com.imooc.product.utils;

import com.imooc.product.vo.ResultVo;

public class ResultVoUtil {

    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setData(object);
        resultVo.setCoke(0);
        resultVo.setMsg("成功");
        return resultVo;
    }
}
