package com.yj.platform.base.exception;


/**
 * 远程接口调用出现的业务异常
 *
 * @author 杨旭平
 * @date 2021/6/17 15:13
 */
public class ApiException extends BaseException {

    public ApiException(Integer code, String errorMessage) {
        super(code, errorMessage);
    }

    public ApiException(IExceptionMsg exception) {
        super(exception);
    }

    public ApiException(Exception e) {
        super(e);
    }

    public ApiException(String errMessage) {
        super(errMessage);
    }
}
