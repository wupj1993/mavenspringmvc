/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :48:33
 * ---作者:吴培基
 * ---QQ:757671834
 */

package com.wpj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wpj on 2015/5/14.
 * 作者：吴培基
 */
@ControllerAdvice
public class ExceptionHandler {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @org.springframework.web.bind.annotation.ExceptionHandler(InvalidRequestException.class)
    @ResponseBody
    public ErrorInfo handleInvalidRequestError(HttpServletRequest request,InvalidRequestException ex) {
        System.out.println("BAD_REQUEST");
        return new ErrorInfo(request.getRequestURI(),ex);
    }

  @org.springframework.web.bind.annotation.ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorInfo handleResourceNotFoundError(HttpServletRequest request,ResourceNotFoundException ex) {
      System.out.println("------------------BAD_REQUEST----------");

      return new ErrorInfo(request.getRequestURI(),ex);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorInfo handleUnexpectedServerError(HttpServletRequest request,RuntimeException ex) {
        return new ErrorInfo(request.getRequestURI(),ex);
    }
}
