package com.imooc.order.utils;

import com.imooc.order.vo.ResultVo;

public class ResultVoUtil {

    public static ResultVo seccess(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(object);
        return resultVo;
    }
}
