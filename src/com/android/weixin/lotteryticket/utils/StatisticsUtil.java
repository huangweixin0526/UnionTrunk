package com.android.weixin.lotteryticket.utils;

import com.android.weixin.lotteryticket.storage.unionlotto.BlueBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;

public class StatisticsUtil {

	public static int getStatisticsRedNum(RedBallNumInfo redBallNumInfo, int numType) {
		int count = 0;
		if (redBallNumInfo != null && numType > 0) {
			if (redBallNumInfo.getRedBallNum1Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum2Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum3Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum4Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum5Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum6Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum7Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum8Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum9Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum10Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum11Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum12Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum13Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum14Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum15Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum16Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum17Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum18Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum19Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum20Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum21Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum22Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum23Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum24Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum25Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum26Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum27Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum28Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum29Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum30Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum31Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum32Type() == numType) {
				count++;
			}
			if (redBallNumInfo.getRedBallNum33Type() == numType) {
				count++;
			}
		}
		return count;
	}

	public static int getStatisticsBlueNum(BlueBallNumInfo blueBallNumInfo, int numType) {
		int count = 0;
		if (blueBallNumInfo != null && numType > 0) {
			if (blueBallNumInfo.getBlueBallNum1Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum2Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum3Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum4Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum5Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum6Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum7Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum8Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum9Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum10Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum11Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum12Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum13Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum14Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum15Type() == numType) {
				count++;
			}
			if (blueBallNumInfo.getBlueBallNum16Type() == numType) {
				count++;
			}
		}
		return count;
	}
}
