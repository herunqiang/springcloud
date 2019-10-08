package com.hrq.springcloud.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 何润强
 * @Date 2019/9/26 9:22
 * @Description  全局异常捕获处理类
 **/
@ControllerAdvice()
public class GlobalExceptionHandler  {
    @ExceptionHandler(CustException.class)
    public String exceptionHander(){

        return "common/error";
    }
}
