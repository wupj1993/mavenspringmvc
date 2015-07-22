/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :58:49
 * ---作者:吴培基
 * ---QQ:757671834
 */

package com.wpj.common;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 关于spring security 的辅助
 * @author吴培基
 * @version1.0.0
 *
 */
public class SecurityTools {
    /**
     * 获取用户名字
     *
     * @return 用户的名字
     */
    public static String getUserName() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails.getUsername();
    }

    /**
     * 获取用户密码
     * @return 用户密码
     */
    public static String getUserPassword() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails.getPassword();
    }

    /**
     * 获取用户权限
     * @return 权限数组
     */
    public static Object[] getUserAuthorities(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails.getAuthorities().toArray();
    }
}
