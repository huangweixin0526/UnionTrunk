package com.android.weixin.unionlotto.storage;

import java.util.ArrayList;
import java.util.List;

import com.android.weixin.unionlotto.app.AndroidApplication;
import com.android.weixin.unionlotto.permanent.APPConfig;
import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.DbUtils.DbUpgradeListener;
import com.lidroid.xutils.db.sqlite.Selector;
import com.lidroid.xutils.exception.DbException;

public class LotteryNumberHelper {

	private static LotteryNumberHelper mInstance;
	private DbUtils mDbUtils;

	public synchronized static LotteryNumberHelper getInstance() {
		if (mInstance == null) {
			mInstance = new LotteryNumberHelper();
		}
		return mInstance;
	}

	private LotteryNumberHelper() {
		mDbUtils = DbUtils.create(AndroidApplication.getInstance().getApplicationContext(), APPConfig.DATABASES_PATH, APPConfig.LOTTERY_DATA_DB_NAME,
				APPConfig.LOTTERY_DATA_DB_VERSION, mDbUpgradeListener);
		mDbUtils.configDebug(APPConfig.IS_DEBUG);
	}

	private DbUpgradeListener mDbUpgradeListener = new DbUpgradeListener() {

		@Override
		public void onUpgrade(DbUtils db, int oldVersion, int newVersion) {

		}
	};

	public void addLotteryData(LotteryNumbers lotteryNumbers) {
		try {
			mDbUtils.saveOrUpdate(lotteryNumbers);
		} catch (DbException e) {
			e.printStackTrace();
		}
	}

	public LotteryNumbers getLotteryDataById(int dataId) {
		try {
			return mDbUtils.findById(LotteryNumbers.class, dataId);
		} catch (DbException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<LotteryNumbers> getLotteryNumbers() {
		List<LotteryNumbers> list = new ArrayList<LotteryNumbers>();
		try {
			list = mDbUtils.findAll(Selector.from(LotteryNumbers.class));
		} catch (DbException e) {
			e.printStackTrace();
		}
		return list;
	}
}
