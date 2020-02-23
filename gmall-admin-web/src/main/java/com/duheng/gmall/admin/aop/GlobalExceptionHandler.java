package com.duheng.gmall.admin.aop;

import com.duheng.gmall.to.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一处理所有异常，给前端返回500的json
 *
 * 当我们编写环绕通知的时候，目标方法出现的异常一定要再次跑出去
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public Object handlerException02(Exception exception){
        log.error("系统出现异常感知，信息：{}",exception.getMessage());
        return new CommonResult().validateFailed("系统异常，请联系后台管理员");
    }


}
