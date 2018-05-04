package com.sm.core.base.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.sm.core.base.warpper.ResultWarpper;
import com.sm.core.exception.SmExceptionService;
import com.sm.core.support.HttpKit;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * controller返回通用方法
 * Created by yj on 2018/4/14.
 */
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected ResultWarpper getSuccess(Object object){
        ResultWarpper resultWarpper = new ResultWarpper();
        resultWarpper.setCode(ResultWarpper.SUCCESS_CODE);
        resultWarpper.setMsg("请求成功");
        resultWarpper.setData(object);
        return resultWarpper;
    }

    protected ResultWarpper getSuccess(){
        return getSuccess(null);
    }

    protected ResultWarpper getError(Integer code, String errMsg){
        ResultWarpper resultWarpper = new ResultWarpper();
        resultWarpper.setCode(code);
        resultWarpper.setMsg(errMsg);
        return resultWarpper;
    }

    protected ResultWarpper getError(SmExceptionService exceptionEnum){
        ResultWarpper resultWarpper = new ResultWarpper();
        resultWarpper.setCode(exceptionEnum.getCode());
        resultWarpper.setMsg(exceptionEnum.getMessage());
        return resultWarpper;
    }

    protected Page getPage(int pageSize){
        int pageNo = 1;
        String reqPageNo = HttpKit.getRequest().getParameter("pageNo");
        String reqPageSize = HttpKit.getRequest().getParameter("pageSize");

        if (StringUtils.isNotBlank(reqPageNo)){
            pageNo = Integer.valueOf(reqPageNo);
        }
        if (StringUtils.isNotBlank(reqPageSize)){
            pageSize = Integer.valueOf(reqPageSize);
            if (pageSize > 20) pageSize = 20;
        }
        return new Page<>(pageNo,pageSize);
    }
}
