/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :50:23
 * ---作者:吴培基
 * ---QQ:757671834
 */

package com.wpj.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Server on 2015/5/21.
 */
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        System.out.println("异常抓到了：---->"+e.getMessage());
        return null;
    }
}
