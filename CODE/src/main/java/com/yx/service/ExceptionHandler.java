package com.yx.service;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/*捕获全局异常类*/
@ControllerAdvice
public class ExceptionHandler {

    //捕获运行时异常;
    @org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public HashMap<Object, Object> ExceptionHandler(){

        HashMap<Object, Object> result = new HashMap<>();
        result.put("code","500");
        result.put("msg","后端报的错");

        return result;
    }
}
