/*
 * Copyright (c) 2015 / 8 / 13 10 :15 :22
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.common;

import java.security.MessageDigest;

/**
 * -------------------------------------
 * Created by wupeji on 2015-08-13 22:15
 * ----------------------------------------
 * 加密解密工具类
 **/
public class EncryptionTools {
    private final static String[] hexDigits = {
            "0", "1", "2", "3",
            "4", "5", "6", "7",
            "8", "9", "a", "b",
            "c", "d", "e", "f" };

    /**
     * MD5加密
     * @param originString
     * @return
     */
    private static String encodeByMD5(String originString) {
        if (originString != null) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] results = md.digest(originString.getBytes());
                String resultString = byteArrayToHexString(results);
                return resultString.toUpperCase();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }
    /**
     * change a byte to hex string
     *
     * @param b
     * @return
     */
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
}
