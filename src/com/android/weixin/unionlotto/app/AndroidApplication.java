package com.android.weixin.unionlotto.app;

import android.app.Application;

public class AndroidApplication extends Application {

	private static AndroidApplication mAppInstance;

	@Override
	public void onCreate() {
		super.onCreate();
		mAppInstance = this;
	}

	public static AndroidApplication getInstance() {
		return mAppInstance;
	}
}
