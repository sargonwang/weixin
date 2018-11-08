package com.lzp.springbootexceptionvalidate.config;

import com.lzp.springbootexceptionvalidate.util.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@ControllerAdvice
public class GlobalExceptionHandler {
     private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

     @ExceptionHandler(value = Exception.class)
     @ResponseBody
     public Response<String> bindExceptionErrorHandler(Exception ex) throws Exception {
          logger.error("bindExceptionErrorHandler info:{}",ex.getMessage());
          Response<String> r = new Response<>();
          StringBuilder sb = new StringBuilder();
          FieldError fieldError = ((BindException) ex).getFieldError();
          sb.append(fieldError.getDefaultMessage());
          r.setMsg(sb.toString());
          r.setCode(400);
          return r;
     }




}
