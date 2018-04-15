package com.sm.core.base.warpper;

/**
 * Created by yj on 2018/4/14.
 */
public class ResultWarpper<T> {
    public static final Integer SUCCESS_CODE = 0000;
    /**状态码**/
    private Integer  code;
    /**信息**/
    private String msg;
    /**数据**/
    private T data;

    public ResultWarpper(){}
    public ResultWarpper(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
