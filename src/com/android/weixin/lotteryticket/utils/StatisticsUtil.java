package com.android.weixin.lotteryticket.utils;

import com.android.weixin.lotteryticket.storage.unionlotto.BlueBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;

public class StatisticsUtil {

	public static int getStatisticsRedNum(RedBallNumInfo redBallNumInfo, Integer... numTypes) {
		int count = 0;
		if (redBallNumInfo != null) {
			if (redBallNumInfo.isRedBallNum1Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum2Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum3Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum4Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum5Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum6Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum7Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum8Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum9Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum10Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum11Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum12Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum13Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum14Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum15Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum16Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum17Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum18Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum19Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum20Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum21Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum22Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum23Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum24Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum25Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum26Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum27Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum28Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum29Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum30Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum31Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum32Type(numTypes)) {
				count++;
			}
			if (redBallNumInfo.isRedBallNum33Type(numTypes)) {
				count++;
			}
		}
		return count;
	}

	public static int getStatisticsBlueNum(BlueBallNumInfo blueBallNumInfo, Integer... numTypes) {
		int count = 0;
		if (blueBallNumInfo != null) {
			if (blueBallNumInfo.isBlueBallNum1Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum2Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum3Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum4Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum5Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum6Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum7Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum8Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum9Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum10Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum11Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum12Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum13Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum14Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum15Type(numTypes)) {
				count++;
			}
			if (blueBallNumInfo.isBlueBallNum16Type(numTypes)) {
				count++;
			}
		}
		return count;
	}
}
