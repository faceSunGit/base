package com.yj.platform.base.exception;


/**
 * 异常基类
 *
 * @author 杨旭平
 * @date 2021/6/17 15:15
 */
public class BaseException extends RuntimeException implements IExceptionMsg {

    private Integer code;

    private String message;

    BaseException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    BaseException(IExceptionMsg exception) {
        super(exception.getMessage());
        this.code = exception.getCode();
        this.message = exception.getMessage();
    }

    BaseException(Exception e) {
        super(e.getMessage());
        this.code = BaseExceptionMsg.EXECUTE_FAILD.getCode();
        this.message = e.getMessage();
    }

    BaseException(String errMessage) {
        super(errMessage);
        this.code = BaseExceptionMsg.EXECUTE_FAILD.getCode();
        this.message = errMessage;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
