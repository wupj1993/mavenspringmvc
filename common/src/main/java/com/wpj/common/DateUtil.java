/*
 * Copyright (c) 2015 / 8 / 13 2 :32 :7
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.common;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtil {
	private static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
	private static transient int gregoranCutoverYear = 1582;
	/**闰年每月天数**/
	private static final int[] DAYS_P_MONTH_LY = {31,29,31,30,31,30,31,31,30,31,30,31};
	/**非闰年每月天数**/
	private static final int[] DAYS_P_MONTH_CY = {31,28,31,30,31,30,31,31,30,31,30,31};
	/**代表数组里面的年、月、日*/
	private static final int Y = 0,M = 1,D = 2;




	/**
	 * 将字符串格式转换成日期类型，使用的是默认日期格式
	 * @param str
	 * @return
	 */
	public static Date str2Date(String str){
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_PATTERN);
		try {
			d = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	/**
	 * 将字符串格式转换成日期类型，使用的是自定义日期格式
	 * @param str
	 * @param pattern
	 * @return
	 */
	public static Date str2Date(String str,String pattern){
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			d = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	/**
	 * 将date转换成"yyyy-MM-dd HH:mm:ss"格式的字符串
	 * @param date
	 * @return
	 */
	public static String date2Str(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_PATTERN);
		return sdf.format(date);
	}
	/**
	 * 将date转换成format格式的字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String date2Str(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	/**
	 * 获取当前日期往前或者往后推interval天
	 * @param date
	 * @param isBefore(true:往前推  false:往后推)
	 * @param interval
	 * @return
	 */
	public static Date getYesterday(Date date,Boolean isBefore,int interval){
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		calendar.setTime(date);
		calendar.add(Calendar.DATE,isBefore ? -interval : +interval);
		return str2Date(date2Str(calendar.getTime()));
	}
	/**
	 * 计算两个日期相隔的天数
	 * 
	 * @param firstString
	 * @param secondString
	 * @return
	 */
	public static int daysBetweenTwoDate(String starTtime, String endTime) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date firstDate = null;
		Date secondDate = null;
		try {
			firstDate = df.parse(starTtime);
			secondDate = df.parse(endTime);
		} catch (Exception e) {
			// 日期型字符串格式错误
			e.printStackTrace();
		}
		int nDay = (int) ((secondDate.getTime() - firstDate.getTime()) / (24 * 60 * 60 * 1000));
		return nDay;
	}

	/**
	 * 判断两个Date是否在同一天
	 * @param date1
	 * @param date2
	 * @return 如果两个Date在同一天，则返回true，否则false
	 */
	public static boolean isTwoDatesInSameDay(Date date1, Date date2) {
		String str1 = date2Str(date1);
		String str2 = date2Str(date2);
		return str1.equals(str2);
	}
	/**
	 * 判断当前时间是否在指定日期内
	 * @param starttime
	 * @param endtime
	 * @param isMinute(是否带时分秒)
	 * @return
	 */
	public static boolean isNowBetweenDates(String startTime, String endTime,Boolean isMinute){
		Date sT = null;// 起始时间
		Date eT = null;// 终止时间
		if(isMinute){
			sT = DateUtil.str2Date(startTime+" 00:00:01", "yyyy-MM-dd HH:mm:ss");
			eT = DateUtil.str2Date(endTime+" 23:59:59", "yyyy-MM-dd HH:mm:ss");
		}else{
			sT = DateUtil.str2Date(startTime, "yyyy-MM-dd HH:mm:ss");
			eT = DateUtil.str2Date(endTime, "yyyy-MM-dd HH:mm:ss");
		}
		Calendar scalendar = Calendar.getInstance();
		scalendar.setTime(sT);// 起始时间
		Calendar ecalendar = Calendar.getInstance();
		ecalendar.setTime(eT);// 终止时间
		Calendar calendarnow = Calendar.getInstance();
		return calendarnow.after(scalendar) && calendarnow.before(ecalendar);
	}
	/**
	 * 判断今天是否是指定一天
	 * @param date
	 * @return
	 */
	public static Boolean isSomeDay(String date){
		String today = date2Str(new Date(),"yyyy-MM-dd");
		return date.equals(today);
	}
	/**
	 * 判断今天是否在指定日期之后
	 * @param date
	 * @return
	 */
	public static boolean isTodayAfter(String date){
		Date eT = DateUtil.str2Date(date, "yyyy-MM-dd HH:mm:ss");
		Calendar eC = Calendar.getInstance();
		eC.setTime(eT);
		Calendar now = Calendar.getInstance();
		return now.after(eC);
	}
	/**
	 * 判断今天是否在指定日期之前
	 * @param date
	 * @return
	 */
	public static boolean isTodayBefore(String date){
		Date sT = DateUtil.str2Date(date, "yyyy-MM-dd HH:mm:ss");
		Calendar sC = Calendar.getInstance();
		sC.setTime(sT);
		Calendar now = Calendar.getInstance();
		return now.before(sC);
	}

	/**
	 * 判断指定时间往后推interval小时是否比当前时间小
	 * 
	 * @param time
	 * @param interval
	 * @return
	 */
	public static boolean isOverTime(Date time, int interval) {
		Calendar c = Calendar.getInstance();
		if (time == null) {
			return true;
		}
		c.setTime(time);
		c.add(Calendar.MINUTE, +interval);
		Date ee = c.getTime();
		// orderTime + Consts.ORDER_CAMP_OVER_TIME小时 < now 说明超时了
		return ee.before(new Date());
	}
	
	/**
	 * 判断指定的年份是否为闰年
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year){
		return year >= gregoranCutoverYear ? ((year%4 == 0) && ((year%100!=0) || (year%400 == 0))) : (year%4 == 0);
	}
	/**
	 * 将代表日期的字符串分割成代表年月日的整形数组
	 * @param date
	 * @return
	 */
	public static int[] splitYMD(String date){
		date = date.replace("-", "");
		int[] ymd = {0,0,0};
		ymd[Y] = Integer.parseInt(date.substring(0,4));
		ymd[M] = Integer.parseInt(date.substring(4,6));
		ymd[D] = Integer.parseInt(date.substring(6,8));
		return ymd;
	}
	/**
	 * 将不足两位的月份或者日期补足为2位
	 * @param decimal
	 * @return
	 */
	public static String formatMonthDay(int decimal){
		DecimalFormat df = new DecimalFormat("00");
		return df.format(decimal);
	}
	/**
	 * 将不足4位的年份补足为4位
	 * @param decimal
	 * @return
	 */
	public static String formatYear(int decimal){
		DecimalFormat df = new DecimalFormat("00");
		return df.format(decimal);
	}
	/**
	 * 日期加1天
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	private static int[] addOneDay(int year,int month,int day){
		if(isLeapYear(year)){
			day++;
			if(day > DAYS_P_MONTH_LY[month-1]){
				month++;
				if(month>12){
					year++;
					month = 1;
				}
				day = 1;
			}
		} else {
			day++;
			if(day > DAYS_P_MONTH_CY[month-1]){
				month++;
				if(month>12){
					year++;
					month = 1;
				}
				day = 1;
			}
		}
		int[] ymd = {year,month,day};
		return ymd;
	}
	/**
	 * 返回指定时间范围内的每一天
	 * @param beginDate
	 * @param endDate
	 * @param pattern
	 */
	public static List<String> getEveryDay(String beginDate,String endDate){
		int days = daysBetweenTwoDate(beginDate, endDate);
		int[] ymd = splitYMD(beginDate);
		List<String> everyDays = new ArrayList<String>();
		everyDays.add(beginDate);
		for (int i = 0; i < days; i++) {
			ymd = addOneDay(ymd[Y], ymd[M], ymd[D]);
			everyDays.add(formatYear(ymd[Y])+"-"+formatMonthDay(ymd[M])+"-"+formatMonthDay(ymd[D]));
		}
		return everyDays;
	}
	
	

}