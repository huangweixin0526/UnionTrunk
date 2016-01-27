package com.android.weixin.lotteryticket.utils;

import com.android.weixin.lotteryticket.storage.unionlotto.BlueBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;

import android.util.SparseIntArray;

public class NumberUtil {

	public static void initRedNumberModel(int redNumber, RedBallNumInfo dataModel, int calculateType) {
		// KLog.v("--->","red ball number：" + redNumber + " calculate type：" +
		// calculateType);
		switch (redNumber) {
		case 0:
			dataModel.setRedBallNum33(33);
			dataModel.setRedBallNum33Type(getCalculateType(calculateType));
			break;
		case 1:
			dataModel.setRedBallNum1(1);
			dataModel.setRedBallNum1Type(getCalculateType(calculateType));
			break;
		case 2:
			dataModel.setRedBallNum2(2);
			dataModel.setRedBallNum2Type(getCalculateType(calculateType));
			break;
		case 3:
			dataModel.setRedBallNum3(3);
			dataModel.setRedBallNum3Type(getCalculateType(calculateType));
			break;
		case 4:
			dataModel.setRedBallNum4(4);
			dataModel.setRedBallNum4Type(getCalculateType(calculateType));
			break;
		case 5:
			dataModel.setRedBallNum5(5);
			dataModel.setRedBallNum5Type(getCalculateType(calculateType));
			break;
		case 6:
			dataModel.setRedBallNum6(6);
			dataModel.setRedBallNum6Type(getCalculateType(calculateType));
			break;
		case 7:
			dataModel.setRedBallNum7(7);
			dataModel.setRedBallNum7Type(getCalculateType(calculateType));
			break;
		case 8:
			dataModel.setRedBallNum8(8);
			dataModel.setRedBallNum8Type(getCalculateType(calculateType));
			break;
		case 9:
			dataModel.setRedBallNum9(9);
			dataModel.setRedBallNum9Type(getCalculateType(calculateType));
			break;
		case 10:
			dataModel.setRedBallNum10(10);
			dataModel.setRedBallNum10Type(getCalculateType(calculateType));
			break;
		case 11:
			dataModel.setRedBallNum11(11);
			dataModel.setRedBallNum11Type(getCalculateType(calculateType));
			break;
		case 12:
			dataModel.setRedBallNum12(12);
			dataModel.setRedBallNum12Type(getCalculateType(calculateType));
			break;
		case 13:
			dataModel.setRedBallNum13(13);
			dataModel.setRedBallNum13Type(getCalculateType(calculateType));
			break;
		case 14:
			dataModel.setRedBallNum14(14);
			dataModel.setRedBallNum14Type(getCalculateType(calculateType));
			break;
		case 15:
			dataModel.setRedBallNum15(15);
			dataModel.setRedBallNum15Type(getCalculateType(calculateType));
			break;
		case 16:
			dataModel.setRedBallNum16(16);
			dataModel.setRedBallNum16Type(getCalculateType(calculateType));
			break;
		case 17:
			dataModel.setRedBallNum17(17);
			dataModel.setRedBallNum17Type(getCalculateType(calculateType));
			break;
		case 18:
			dataModel.setRedBallNum18(18);
			dataModel.setRedBallNum18Type(getCalculateType(calculateType));
			break;
		case 19:
			dataModel.setRedBallNum19(19);
			dataModel.setRedBallNum19Type(getCalculateType(calculateType));
			break;
		case 20:
			dataModel.setRedBallNum20(20);
			dataModel.setRedBallNum20Type(getCalculateType(calculateType));
			break;
		case 21:
			dataModel.setRedBallNum21(21);
			dataModel.setRedBallNum21Type(getCalculateType(calculateType));
			break;
		case 22:
			dataModel.setRedBallNum22(22);
			dataModel.setRedBallNum22Type(getCalculateType(calculateType));
			break;
		case 23:
			dataModel.setRedBallNum23(23);
			dataModel.setRedBallNum23Type(getCalculateType(calculateType));
			break;
		case 24:
			dataModel.setRedBallNum24(24);
			dataModel.setRedBallNum24Type(getCalculateType(calculateType));
			break;
		case 25:
			dataModel.setRedBallNum25(25);
			dataModel.setRedBallNum25Type(getCalculateType(calculateType));
			break;
		case 26:
			dataModel.setRedBallNum26(26);
			dataModel.setRedBallNum26Type(getCalculateType(calculateType));
			break;
		case 27:
			dataModel.setRedBallNum27(27);
			dataModel.setRedBallNum27Type(getCalculateType(calculateType));
			break;
		case 28:
			dataModel.setRedBallNum28(28);
			dataModel.setRedBallNum28Type(getCalculateType(calculateType));
			break;
		case 29:
			dataModel.setRedBallNum29(29);
			dataModel.setRedBallNum29Type(getCalculateType(calculateType));
			break;
		case 30:
			dataModel.setRedBallNum30(30);
			dataModel.setRedBallNum30Type(getCalculateType(calculateType));
			break;
		case 31:
			dataModel.setRedBallNum31(31);
			dataModel.setRedBallNum31Type(getCalculateType(calculateType));
			break;
		case 32:
			dataModel.setRedBallNum32(32);
			dataModel.setRedBallNum32Type(getCalculateType(calculateType));
			break;
		case 33:
			dataModel.setRedBallNum33(33);
			dataModel.setRedBallNum33Type(getCalculateType(calculateType));
			break;
		}
	}

	public static void initBlueNumberModel(int blueNumber, BlueBallNumInfo dataModel, int calculateType) {
		// KLog.v("--->","blue ball number：" + blueNumber + " calculate type：" +
		// calculateType);
		switch (blueNumber) {
		case 0:
			dataModel.setBlueBallNum16(16);
			dataModel.setBlueBallNum16Type(getCalculateType(calculateType));
			break;
		case 1:
			dataModel.setBlueBallNum1(1);
			dataModel.setBlueBallNum1Type(getCalculateType(calculateType));
			break;
		case 2:
			dataModel.setBlueBallNum2(2);
			dataModel.setBlueBallNum2Type(getCalculateType(calculateType));
			break;
		case 3:
			dataModel.setBlueBallNum3(3);
			dataModel.setBlueBallNum3Type(getCalculateType(calculateType));
			break;
		case 4:
			dataModel.setBlueBallNum4(4);
			dataModel.setBlueBallNum4Type(getCalculateType(calculateType));
			break;
		case 5:
			dataModel.setBlueBallNum5(5);
			dataModel.setBlueBallNum5Type(getCalculateType(calculateType));
			break;
		case 6:
			dataModel.setBlueBallNum6(6);
			dataModel.setBlueBallNum6Type(getCalculateType(calculateType));
			break;
		case 7:
			dataModel.setBlueBallNum7(7);
			dataModel.setBlueBallNum7Type(getCalculateType(calculateType));
			break;
		case 8:
			dataModel.setBlueBallNum8(8);
			dataModel.setBlueBallNum8Type(getCalculateType(calculateType));
			break;
		case 9:
			dataModel.setBlueBallNum9(9);
			dataModel.setBlueBallNum9Type(getCalculateType(calculateType));
			break;
		case 10:
			dataModel.setBlueBallNum10(10);
			dataModel.setBlueBallNum10Type(getCalculateType(calculateType));
			break;
		case 11:
			dataModel.setBlueBallNum11(11);
			dataModel.setBlueBallNum11Type(getCalculateType(calculateType));
			break;
		case 12:
			dataModel.setBlueBallNum12(12);
			dataModel.setBlueBallNum12Type(getCalculateType(calculateType));
			break;
		case 13:
			dataModel.setBlueBallNum13(13);
			dataModel.setBlueBallNum13Type(getCalculateType(calculateType));
			break;
		case 14:
			dataModel.setBlueBallNum14(14);
			dataModel.setBlueBallNum14Type(getCalculateType(calculateType));
			break;
		case 15:
			dataModel.setBlueBallNum15(15);
			dataModel.setBlueBallNum15Type(getCalculateType(calculateType));
			break;
		case 16:
			dataModel.setBlueBallNum16(16);
			dataModel.setBlueBallNum16Type(getCalculateType(calculateType));
			break;
		}
	}

	private static int getCalculateType(int calculateType) {
		return calculateType;
	}

	public static boolean isBallNumType(SparseIntArray ballNumType, Integer... types) {
		if (ballNumType != null && types != null && types.length > 0) {
			boolean isMatch = true;
			for (Integer integer : types) {
				if (ballNumType.get(integer, 0) == 0) {
					isMatch = false;
					break;
				}
			}
			return isMatch;
		}
		return false;
	}
}
