package com.yj.platform.base.exception.handler;

import com.yj.platform.base.exception.ApiException;
import com.yj.platform.base.exception.BaseExceptionMsg;
import com.yj.platform.base.exception.BusinessException;
import com.yj.platform.base.model.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import java.util.Objects;

/**
 * 异常处理器
 *
 * @author 杨旭平
 * @date 2021/6/17 15:22
 */
@Order(Integer.MIN_VALUE)
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    private static final String EXCEPTION_LOG = "服务具体异常:";

    /**
     * 远程调用异常处理
     */
    @ExceptionHandler(ApiException.class)
    public ApiResponse apiException(ApiException e) {
        LOGGER.error(EXCEPTION_LOG, e);
        return new ApiResponse(e.getCode(), e.getMessage());
    }

    /**
     * 业务逻辑异常的处理
     */
    @ExceptionHandler(BusinessException.class)
    public ApiResponse serviceException(BusinessException e) {
        LOGGER.error(EXCEPTION_LOG, e);
        return new ApiResponse(e.getCode(), e.getMessage());
    }


    /**
     * 参数异常处理
     */
    /*@ExceptionHandler(IllegalArgumentException.class)
    public JsonResult apiException(IllegalArgumentException e) {
        log.error(EXCEPTION_LOG, e);
        return new JsonResult(BaseExceptionMsg.EXECUTE_FAILD);
    }*/

    /**
     * 运行时异常处理
     */
    @ExceptionHandler(RuntimeException.class)
    public ApiResponse apiException(RuntimeException e) {
        LOGGER.error(EXCEPTION_LOG, e);
        return new ApiResponse(BaseExceptionMsg.EXECUTE_FAILD);
    }

    /**
     * 参数校验异常处理
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse apiException(MethodArgumentNotValidException e) {
        LOGGER.error(EXCEPTION_LOG, e);
        return new ApiResponse(BaseExceptionMsg.PARAM_INVALID.getCode(), Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
    }

}
