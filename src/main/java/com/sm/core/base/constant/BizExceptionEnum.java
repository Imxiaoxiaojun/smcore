package com.sm.core.base.constant;

import com.sm.core.exception.SmExceptionService;

/**
 * Created by yj on 2018/4/14.
 */
public enum BizExceptionEnum implements SmExceptionService{
    /**
     * 校验异常
     */
    PARAM_ERROR(4003,"参数错误"),

    /**
     * 请求异常
     */
    SERVER_ERROR(9999, "服务器未知错误");
    private Integer code;

    private String message;

    BizExceptionEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
