package com.chenwenjie.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	//获取一个月的月初
	public static Date initMonth(Date date) {
		Calendar c = Calendar.getInstance();
		
		c.setTime(date);
		
		c.set(Calendar.DAY_OF_MONTH,1);
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		
		return c.getTime();
		
	}

	/**
	 * 返回一个日期在start--and之间
	 */
	public static Date randomDate(Date start, Date and) {
		// TODO Auto-generated method stub
		
		long t1 = start.getTime();
		
		long t2 = and.getTime();
		
		long t = (long) ((Math.random()*(t2-t1)+1)+t1);
		
		return new Date(t);
	}
	
	//根据出身日期计算年龄
	public static int getAgeByBirthday(Date date) {
		
		Calendar c = Calendar.getInstance();
		int s_year = c.get(Calendar.YEAR);
		int s_month = c.get(Calendar.MONTH);
		int s_day = c.get(Calendar.DAY_OF_MONTH);
		
		c.setTime(date);
		
		int b_year = c.get(Calendar.YEAR);
		int b_month = c.get(Calendar.MONTH);
		int b_day = c.get(Calendar.DAY_OF_MONTH);
		
		int age = s_year - b_year;
		
		if (s_month<b_month) {
			age--;
		}
		if (s_month == b_month && s_day < b_day) {
			age--;
		}
		return age;
	}
	
}
