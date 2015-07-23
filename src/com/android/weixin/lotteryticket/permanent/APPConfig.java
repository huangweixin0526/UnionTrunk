package com.android.weixin.lotteryticket.permanent;

import java.io.File;

import com.android.weixin.lotteryticket.utils.FileUtil;

public class APPConfig {

	public static final boolean IS_DEBUG = true;

	public static final String APP_ROOT_DIR_NAME = "unionlotto";
	public static final String DATABASES_PATH = FileUtil.getStorageDirectory().getPath() + File.separatorChar + APP_ROOT_DIR_NAME + File.separatorChar;

	public static final String LOTTERY_DATA_DB_NAME = "LotteryData.db";
	public static final int LOTTERY_DATA_DB_VERSION = 1;

}
