/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :50:23
 * ---作者:吴培基
 * ---QQ:757671834
 */

package com.wpj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by wpj on 2015/5/14.
 * 作者：吴培基
 */
@ResponseStatus(HttpStatus.FORBIDDEN)
public class RosourceForbinException extends RuntimeException {
    public RosourceForbinException(String message){
        super(message);
        System.out.println("发生了403错误了------------------");
    }
}
