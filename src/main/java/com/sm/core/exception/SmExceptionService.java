package com.sm.core.exception;

public interface SmExceptionService {
    /**
     * 获取异常编码
     */
    Integer getCode();

    /**
     * 获取异常信息
     */
    String getMessage();
}
