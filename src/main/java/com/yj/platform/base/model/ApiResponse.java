package com.yj.platform.base.model;

import com.yj.platform.base.exception.BaseExceptionMsg;
import com.yj.platform.base.exception.IExceptionMsg;

import java.io.Serializable;

/**
 * @author 杨旭平
 * @date 2021/6/17 11:22
 */
public class ApiResponse<T> implements Serializable {

    /**
     * 数据
     */
    private T data;

    /**
     * 描述
     */
    private String message;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 接口是否成功执行
     */
    private boolean success;


    /**
     * 构造函数
     */
    public ApiResponse() {
        this.data = null;
        this.message = BaseExceptionMsg.EXECUTE_OK.getMessage();
        this.code = BaseExceptionMsg.EXECUTE_OK.getCode();
        this.success = this.code == 0;
    }

    public ApiResponse(T data) {
        this.data = data;
        this.message = BaseExceptionMsg.EXECUTE_OK.getMessage();
        this.code = BaseExceptionMsg.EXECUTE_OK.getCode();
        this.success = this.code == 0;
    }

    public ApiResponse(IExceptionMsg msg) {
        this.data = null;
        this.message = msg.getMessage();
        this.code = msg.getCode();
        this.success = this.code == 0;
    }

    public ApiResponse(Integer code, String message) {
        this.data = null;
        this.message = message;
        this.code = code;
        this.success = this.code == 0;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
