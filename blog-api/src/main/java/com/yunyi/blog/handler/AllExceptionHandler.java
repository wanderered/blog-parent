package com.yunyi.blog.handler;

import com.yunyi.blog.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//对加了@controller 注解的方法进行拦截处理 implement Aop
@ControllerAdvice
public class AllExceptionHandler {
    //进行异常处理，处理exception。class的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody // return json data
    public Result doException(Exception ex){
        ex.printStackTrace();
        return Result.fail(-999,"System fail");
    }

}
