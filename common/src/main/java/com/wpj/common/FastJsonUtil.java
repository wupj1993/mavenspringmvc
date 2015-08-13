/*
 * Copyright (c) 2015 / 8 / 13 2 :38 :24
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.common;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * 基于阿里巴巴的开源项目FastJson的Json工具类
 * 有关类库的一些说明：
 * SerializeWriter：相当于StringBuffer
 * JSONArray：相当于List<Object>
 * JSONObject：相当于Map<String, Object>
 * @author zhoukun@sinovatech.com
 * @since 2013-05-13
 */
public class FastJsonUtil {
	/**
	 * 将对象转换成Json字符串,支持JavaBea、集合和Map类型
	 * @param <T>
	 * @param obj
	 * @return
	 */
	public static <T> String object2Json(T obj){
		return JSON.toJSONString(obj);
	}
	/**
	 * 将JSON字符串转换成对象
	 * @param <T>
	 * @param text
	 * @param clazz
	 * @return
	 */
	public static <T> T json2Object(String text, Class<T> clazz){
		return JSON.parseObject(text, clazz);
	}
	/**
	 * 把JSON文本转换为JSONObject或者JSONArray 
	 * @param str
	 * @return
	 */
	public static Object str2JSONObject(String str){
		return JSON.parse(str);
	}
	/**
	 * 把JSON文本转换成JSONObject
	 * @param str
	 * @return
	 */
	public static JSONObject parseObject(String str){
		return JSON.parseObject(str);
	}
	/**
	 * 把JSON文本转换成JSONArray
	 * @param str
	 * @return
	 */
	public static JSONArray str2JSONArray(String str){
		return JSON.parseArray(str);
	}
	/**
	 * 把JSON文本parse成JavaBean集合 
	 * @param <T>
\	 * @param clazz
	 * @return
	 */
	public static <T> List<T> str2List(String str, Class<T> clazz){
		return JSON.parseArray(str, clazz);
	}
	/**
	 * 将JavaBean序列化为带格式的JSON文本 
	 * @param prettyFormat
	 * @return
	 */
	public static <T> String toJSONString(T obj, boolean prettyFormat){
		return JSON.toJSONString(obj,prettyFormat);
	}
	/**
	 * 将JavaBean转换为JSONObject或者JSONArray。
	 * @param <T>
	 * @param obj
	 * @return
	 */
	public static <T> Object toJSON(T obj){
		return JSON.toJSON(obj);
	}
	public static void main(String[] args) {
		boolean result = true;
		System.out.println(object2Json(result));
	}
}
