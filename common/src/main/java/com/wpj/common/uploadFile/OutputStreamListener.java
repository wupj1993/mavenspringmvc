/*
 * Copyright (c) 2015 / 8 / 13 10 :35 :21
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.common.uploadFile;

public interface OutputStreamListener
{
    public void start();//开始
    public void bytesRead(int bytesRead);//开始读
    public void error(String message);//错误消息
    public void done();//成功
}
