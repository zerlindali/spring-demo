package com.example.springdemo.config.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 拦截异常，并做相应处理
 *
 * 应用场景：异常产生时，发送预警消息
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public void handException() {
        System.out.println("进入异常处理");
    }
}
