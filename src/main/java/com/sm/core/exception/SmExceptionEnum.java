package com.sm.core.exception;

public enum SmExceptionEnum implements SmExceptionService {
    /**
     * 其他
     */
    WRITE_ERROR(500, "渲染界面错误"),

    /**
     * 文件上传
     */
    FILE_READING_ERROR(400, "FILE_READING_ERROR!"),
    FILE_NOT_FOUND(400, "FILE_NOT_FOUND!"),

    /**
     * 错误的请求
     */
    REQUEST_NULL(400, "请求有错误"),
    SERVER_ERROR(500, "服务器异常");

    SmExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;


    public Integer getCode() {
        return null;
    }

    public String getMessage() {
        return null;
    }
}
