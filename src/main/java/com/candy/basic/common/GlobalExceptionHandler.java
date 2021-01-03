package com.candy.basic.common;

import com.candy.basic.enums.CbMsgEnum;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname GlobalExceptionHandler
 * @Description
 * @Author liqb
 * @Date 2021/1/3 14:44
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CbMessage doError(HttpServletRequest servletRequest, HttpServletResponse httpServletResponse, Exception ex) {
        if(ex instanceof BusinessException){
            return CbMessage.error(((BusinessException) ex).getCbMsgEnum(), "fail");
        }else if(ex instanceof NoHandlerFoundException){
            return CbMessage.error(CbMsgEnum.NO_HANDLER_FOUND, "fail");
        }else if(ex instanceof ServletRequestBindingException){
            return CbMessage.error(CbMsgEnum.BIND_EXCEPTION_ERROR, "fail");
        } else {
            return CbMessage.error(CbMsgEnum.UNKNOWN_ERROR, "fail");
        }
    }

}
