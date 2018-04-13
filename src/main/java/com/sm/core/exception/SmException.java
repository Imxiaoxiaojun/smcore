package com.sm.core.exception;

/**
 * @ClassName SmException
 * @Description 通用异常
 * @Author zhuyajun
 * @Date 2018/4/13 下午1:16
 * @Version 1.0
 **/
public class SmException extends RuntimeException{
    private Integer code;

    private String message;

    public SmException(SmExceptionEnum smExceptionEnum) {
        this.code = smExceptionEnum.getCode();
        this.message = smExceptionEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
