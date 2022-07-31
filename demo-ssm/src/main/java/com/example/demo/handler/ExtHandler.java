package com.example.demo.handler;

import com.example.demo.utils.JsonData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

//@RestControllerAdvice //返回Json数据
//@ControllerAdvice //返回页面
//public class ExtHandler {
//
//
//
//    @ExceptionHandler(value = Exception.class)
//    JsonData handlerException(Exception e, HttpServletRequest request){
//
//        return JsonData.buildError("服务端出问题了",-2);
//    }
//}
