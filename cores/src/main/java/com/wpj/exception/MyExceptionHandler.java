/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :48:33
 * ---作者:吴培基
 * ---QQ:757671834
 */

package com.wpj.exception;

import com.wpj.controller.BaseController;
import com.wpj.work.entity.BaseResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by wpj on 2015/5/14.
 * 作者：吴培基
 */
@ControllerAdvice
public class MyExceptionHandler extends BaseController {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidRequestException.class)
    @ResponseBody
    public BaseResult handleInvalidRequestError(HttpServletRequest request,InvalidRequestException ex) {
        System.out.println("BAD_REQUEST");
        return buildFailedResultInfo(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

  @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public BaseResult handleResourceNotFoundError(HttpServletRequest request,ResourceNotFoundException ex) {
      System.out.println("------------------BAD_REQUEST----------");
      return buildFailedResultInfo(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public BaseResult handleUnexpectedServerError(HttpServletRequest request,RuntimeException ex) {
        return buildFailedResultInfo(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }
}
