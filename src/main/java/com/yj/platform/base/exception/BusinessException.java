package com.yj.platform.base.exception;

/**
 * 业务逻辑异常的封装
 *
 * @author 杨旭平
 * @date 2021/6/17 15:18
 */
public class BusinessException extends BaseException {

    public BusinessException(Integer code, String errorMessage) {
        super(code, errorMessage);
    }

    public BusinessException(IExceptionMsg exception) {
        super(exception);
    }

    public BusinessException(Exception e) {
        super(e);
    }

    public BusinessException(String errorMessage) {
        super(errorMessage);
    }


}
