package com.yj.platform.base.exception;

/**
 * 基本异常信息定义
 *
 * @author 杨旭平
 * @date 2021/6/17 11:26
 */
public enum BaseExceptionMsg implements IExceptionMsg {

    EXECUTE_OK(0, "执行成功"),
    EXECUTE_FAILD(-1, "执行失败"),
    PARAM_INVALID(100, "业务参数传入错误"),
    CAS_FAIL(110, "乐观锁错误"),
    GET_REDIS_LOCK_FAIL(111, "未获取到redis锁"),

    ;


    private Integer code;
    private String message;

    BaseExceptionMsg(int code, String message) {
        this.code = code;
        this.message = message;
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
