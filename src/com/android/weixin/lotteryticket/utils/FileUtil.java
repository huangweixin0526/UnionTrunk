package com.android.weixin.lotteryticket.utils;

import java.io.File;

import android.os.Environment;

public class FileUtil {

	/**
	 * 判断是否有SDCARD
	 * 
	 * @return
	 */
	public static boolean isSDcardExist() {
		if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
			return true;
		} else {
			return false;
		}

	}

	public static File getStorageDirectory() {
		if (isSDcardExist()) {
			return getExternalStorageDirectory();
		} else {
			return getInternalStorageDirectory();
		}
	}

	/**
	 * SDCARD的根目录
	 * 
	 * @return
	 */
	public static File getExternalStorageDirectory() {
		return Environment.getExternalStorageDirectory();
	}

	/**
	 * 内部存储根目录
	 * 
	 * @return
	 */
	public static File getInternalStorageDirectory() {
		return Environment.getRootDirectory();
	}

	/**
	 * 判断文件是否存在
	 * 
	 * @param filePath
	 * @return
	 */
	public static boolean isFileExists(String filePath) {
		return new File(filePath).exists();
	}

	/**
	 * 创建文件目录
	 * 
	 * @param path
	 */
	public static boolean createFileDir(String path) {
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
			return true;
		}
		file = null;
		return false;
	}
}
