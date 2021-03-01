package com.zyy.day301.exception;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.logging.Logger;

//全局异常处理类 所有报错都会来到这里
@ControllerAdvice
public class MyExceptionHandler {
    org.slf4j.Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);
    @ExceptionHandler(value=Exception.class)
    public String exceptionHandler(Exception e){
        System.out.println("错误！！！！"+e);
        logger.info(e+"");
        return e.getMessage();
    }
}
