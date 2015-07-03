package com.android.weixin.lotteryticket.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
}
