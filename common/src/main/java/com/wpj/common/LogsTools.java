/*
 * Copyright (c) 2015 / 7 / 22 11 :43 :1
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.common;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * -------------------------------------
 * Created by wupeji on 2015-07-22 23:43
 * ----------------------------------------
 **/
public final class LogsTools {
    private Log log;

    public LogsTools(Class clazz) {
        log= LogFactory.getLog(clazz);
    }

    public void setOpenOrNot(boolean openOrNot) {
        this.openOrNot = openOrNot;
    }

    public boolean isOpenOrNot() {
        return openOrNot;
    }

    /**
     * 是否开启日志，发布时 可进行关闭，默认开启
     *

     */
    private boolean openOrNot=true;


    public void debug(Object message) {
       if(openOrNot){
           log.debug( message);
       }
    }

    public void debug(Object message, Throwable t) {
        if(openOrNot){
            log.debug( message,t);
        }
    }


    public void error(Object message) {
        if(openOrNot){
            log.error(message);
        }
    }

    public void error(Object message, Throwable t) {
        if(openOrNot){
            log.error( message,t);
        }
    }

    public void fatal(Object message) {
        if(openOrNot){
            log.fatal(message);
        }
    }

    public void fatal(Object message, Throwable t) {
        if(openOrNot){
            log.fatal( message,t);
        }
    }

    public void info(Object message) {
        if(openOrNot){
            log.info(message);
        }
    }


    public void info(Object message, Throwable t) {
        if(openOrNot){
            log.info(message,t);
        }
    }

    public boolean isDebugEnabled() {
        return false;
    }

    public boolean isErrorEnabled() {
        return false;
    }


    public boolean isFatalEnabled() {
        return false;
    }


    public boolean isInfoEnabled() {
        return false;
    }

    public boolean isTraceEnabled() {
        return false;
    }


    public boolean isWarnEnabled() {
        return false;
    }

    public void trace(Object message) {
        if(openOrNot){
            log.trace(message);
        }

    }

    public void trace(Object message, Throwable t) {
        if(openOrNot){
            log.trace(message,t);
        }

    }


    public void warn(Object message) {
        if(openOrNot){
            log.warn(message);
        }
    }


    public void warn(Object message, Throwable t) {
        if(openOrNot){
            log.warn(message,t);
        }
    }
}
