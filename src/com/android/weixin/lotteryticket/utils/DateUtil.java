package com.android.weixin.lotteryticket.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	// 默认日期时间格式
	public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	// 默认日期格式
	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

	public static String getCurrentDateStr() {
		SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		Date date = new Date(System.currentTimeMillis());
		return dateFormat.format(date);
	}

	public static Date getConvertStrToDate(String dateStr) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		try {
			Date date = dateFormat.parse(dateStr);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getConvertDateToStr(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		return dateFormat.format(date);
	}

	public static String getFormateTime(String time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int nowYear = calendar.get(Calendar.YEAR);
		int nowMonth = calendar.get(Calendar.MONTH);
		int nowDay = calendar.get(Calendar.DAY_OF_MONTH);
		SimpleDateFormat tempsdf = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT);
		Date date = null;
		String finaltime = "";
		try {
			date = tempsdf.parse(time);
			calendar.setTime(date);
			if (nowYear == calendar.get(Calendar.YEAR)) {
				SimpleDateFormat sdf = null;
				if (nowMonth == calendar.get(Calendar.MONTH) && nowDay == calendar.get(Calendar.DAY_OF_MONTH)) {
					sdf = new SimpleDateFormat("HH:mm");
				} else {
					sdf = new SimpleDateFormat("MM-dd HH:mm");
				}
				finaltime = sdf.format(date);
			} else {
				SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm");
				finaltime = sdf.format(date);
				return finaltime;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return finaltime;
	}

	public static String getDateFormateTime(Date date) {
		if(date == null)
			return "";
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int nowYear = calendar.get(Calendar.YEAR);

		String finaltime = "";
		calendar.setTime(date);
		if (nowYear == calendar.get(Calendar.YEAR)) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
			finaltime = sdf.format(date);
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
			finaltime = sdf.format(date);
			return finaltime;
		}

		return finaltime;
	}
}
