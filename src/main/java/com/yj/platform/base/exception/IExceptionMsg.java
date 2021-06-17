package com.yj.platform.base.exception;

/**
 * 
 *
 * @author 杨旭平
 * @date 2021/6/17 11:26
 */
public interface IExceptionMsg {

    /**
     * 获取异常的状态码
     *
     * @return
     */
    Integer getCode();

    /**
     * 获取异常的提示信息
     *
     * @return
     */
    String getMessage();
}
