package com.imooc.user.utils;

import com.imooc.user.enums.ResultEnum;
import com.imooc.user.vo.ResultVo;

public class ResultVoUtil {
    public static ResultVo success(Object object) {
        ResultVo ResultVo = new ResultVo();
        ResultVo.setCode(0);
        ResultVo.setMsg("成功");
        ResultVo.setData(object);
        return ResultVo;
    }

    public static ResultVo success() {
        ResultVo ResultVo = new ResultVo();
        ResultVo.setCode(0);
        ResultVo.setMsg("成功");
        return ResultVo;
    }
    public static ResultVo error(ResultEnum resultEnum) {
        ResultVo ResultVo = new ResultVo();
        ResultVo.setCode(resultEnum.getCode());
        ResultVo.setMsg(resultEnum.getMessage());
        return ResultVo;
    }
}
