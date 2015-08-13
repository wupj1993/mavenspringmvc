/*
 * Copyright (c) 2015 / 8 / 13 9 :12 :34
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.common;

import java.io.UnsupportedEncodingException;

/**
 * -------------------------------------
 * Created by wupeji on 2015-08-13 21:12
 * ----------------------------------------
 * 操作文字
 **/

public class WordTools {
    /**
     * utf-8转成iso-88591
     * @return
     */
    public static String utf82Iso88591(String str){
        String ret = "";
        try {
            ret = new String(str.getBytes("UTF-8"),"ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ret;
    }
    /**
     * ISO-8859-1转化成utf-8
     * @param str
     * @return
     */
    public static String iso885912Utf8(String str){
        String ret = "";
        try {
            ret = new String(str.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ret;
    }
    /**
     * gbk转成iso-8859-1
     * @param str
     * @return
     */
    public static String gbk2Iso88591(String str){
        String ret = "";
        try {
            ret = new String(str.getBytes("GBK"),"ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * 转换字符串的编码
     * @param str  字符串
     * @param source 字符串本身编码
     * @param replacement 转化后的编码
     * @return
     */
    public static String convertEncode(String str,String source,String replacement){
        String ret = "";
        try {
            ret = new String(str.getBytes(source),replacement);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ret;
    }


    public static String GBKToAscii(String gbkStr) {

        char[] chars = gbkStr.toCharArray();
        // 把字符中转换为字符数组
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            // System.out.println(" "+chars[i]+" "+(int)chars[i]);
            sb.append("%" + (int) chars[i]);
        }

        return sb.toString();
    }
    /**
     * 此方法把ASCII转换为汉字
     *
     * @param asciiStr
     * @return
     */
    public static String asciiToGbk(String asciiStr) {// ASCII转换为字符串


        String[] chars = asciiStr.split("%");
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < chars.length; i++) {
            sb.append((char) Integer.parseInt(chars[i]));
        }
        return sb.toString();
    }
}
