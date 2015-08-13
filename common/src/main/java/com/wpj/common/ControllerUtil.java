/*
 * Copyright (c) 2015 / 8 / 13 2 :22 :32
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.common;

import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class ControllerUtil {

	// 防止SQL和跨站脚本
	private static String[] injection = new String[] { "select", "exec",
			"like", "count", "where", "insert", "update", "delete", "and",
			"or", "join", "union", "truncate", "drop", "script", "alert" };

	/**
	 * 防止SQL和跨站脚本
	 * 
	 * @param value
	 * @return
	 */
	public static String proccessInjection(String value) {
		String ret = value;
		if (value != null) {
			value = value.toLowerCase();

			for (int j = 0; j < injection.length; j++) {
				if (value.indexOf(injection[j]) >= 0) {
					return "";
				}
			}

			for (int i = 0; i < value.length(); i++) {
				String x = value.substring(i, i + 1);
				if ("(){ } < > *  | ' \\ \"".indexOf(x) >= 0) {
					ret = "";
					break;
				}
			}
		}
		return ret;
	}

	/**
	 * 获取服务器IP
	 * 
	 * @return
	 */
	public static String getServerIp() {
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return "127.0.0.1";
	}

	private static String[] URL = { "/resources/**" };

	/**
	 * 请求URL匹配
	 * 
	 * @param path
	 * @return 匹配成功返回true,失败返回false
	 */
	public static boolean matcherURL(String path) {
		boolean flag = false;
		PathMatcher matcher = new AntPathMatcher();

		for (String value : URL) {
			flag = matcher.match(value, path);
			if (flag)
				break;
		}
		return flag;
	}

	/**
	 * 获取当前请求的所有参数
	 * 
	 * @param request
	 * @return
	 */
	public static String getRequestParams(HttpServletRequest request) {
		StringBuilder builder = new StringBuilder();
		Enumeration<String> params = request.getParameterNames();
		while (params.hasMoreElements()) {
			String name = params.nextElement();
			String value = request.getParameter(name);
			builder.append(name).append("=").append(value).append(";");
		}
		return builder.toString();
	}

}
