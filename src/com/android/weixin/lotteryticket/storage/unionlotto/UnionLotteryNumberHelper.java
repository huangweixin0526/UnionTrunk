package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.ArrayList;
import java.util.List;

import com.android.weixin.lotteryticket.app.AndroidApplication;
import com.android.weixin.lotteryticket.permanent.APPConfig;
import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.DbUtils.DbUpgradeListener;
import com.lidroid.xutils.db.sqlite.Selector;
import com.lidroid.xutils.exception.DbException;

public class UnionLotteryNumberHelper {

	private static UnionLotteryNumberHelper mInstance;
	private DbUtils mDbUtils;

	public synchronized static UnionLotteryNumberHelper getInstance() {
		if (mInstance == null) {
			mInstance = new UnionLotteryNumberHelper();
		}
		return mInstance;
	}

	private UnionLotteryNumberHelper() {
		mDbUtils = DbUtils.create(AndroidApplication.getInstance().getApplicationContext(), APPConfig.DATABASES_PATH, APPConfig.LOTTERY_DATA_DB_NAME,
				APPConfig.LOTTERY_DATA_DB_VERSION, mDbUpgradeListener);
		mDbUtils.configDebug(APPConfig.IS_DEBUG);
	}

	private DbUpgradeListener mDbUpgradeListener = new DbUpgradeListener() {

		@Override
		public void onUpgrade(DbUtils db, int oldVersion, int newVersion) {

		}
	};

	public void addLotteryData(UnionLotteryNumbers lotteryNumbers) {
		try {
			mDbUtils.saveOrUpdate(lotteryNumbers);
		} catch (DbException e) {
			e.printStackTrace();
		}
	}

	public UnionLotteryNumbers getLotteryDataById(int dataId) {
		try {
			return mDbUtils.findById(UnionLotteryNumbers.class, dataId);
		} catch (DbException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<UnionLotteryNumbers> getLotteryNumbers() {
		List<UnionLotteryNumbers> list = new ArrayList<UnionLotteryNumbers>();
		try {
			list = mDbUtils.findAll(Selector.from(UnionLotteryNumbers.class));
		} catch (DbException e) {
			e.printStackTrace();
		}
		return list;
	}
}
