package com.android.weixin.lotteryticket.app;

import com.android.weixin.lotteryticket.permanent.APPConfig;
import com.socks.library.KLog;

import android.app.Application;

public class AndroidApplication extends Application {

	private static AndroidApplication mAppInstance;

	@Override
	public void onCreate() {
		super.onCreate();
		mAppInstance = this;
		KLog.init(APPConfig.IS_DEBUG);
	}

	public static AndroidApplication getInstance() {
		return mAppInstance;
	}
}
