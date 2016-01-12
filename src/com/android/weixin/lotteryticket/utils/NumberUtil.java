package com.android.weixin.lotteryticket.utils;

import com.android.weixin.lotteryticket.permanent.CalculateTypeConfig;
import com.android.weixin.lotteryticket.storage.unionlotto.BlueBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.socks.library.KLog;

public class NumberUtil {

	public static void initRedNumberModel(int redNumber, RedBallNumInfo dataModel, int calculateType) {
		//KLog.v("--->","red ball number：" + redNumber + " calculate type：" + calculateType);
		switch (redNumber) {
		case 0:
			dataModel.setRedBallNum33(33);
			dataModel.setRedBallNum33Type(getCalculateType(dataModel.getRedBallNum33Type(), calculateType));
			break;
		case 1:
			dataModel.setRedBallNum1(1);
			dataModel.setRedBallNum1Type(getCalculateType(dataModel.getRedBallNum1Type(), calculateType));
			break;
		case 2:
			dataModel.setRedBallNum2(2);
			dataModel.setRedBallNum2Type(getCalculateType(dataModel.getRedBallNum2Type(), calculateType));
			break;
		case 3:
			dataModel.setRedBallNum3(3);
			dataModel.setRedBallNum3Type(getCalculateType(dataModel.getRedBallNum3Type(), calculateType));
			break;
		case 4:
			dataModel.setRedBallNum4(4);
			dataModel.setRedBallNum4Type(getCalculateType(dataModel.getRedBallNum4Type(), calculateType));
			break;
		case 5:
			dataModel.setRedBallNum5(5);
			dataModel.setRedBallNum5Type(getCalculateType(dataModel.getRedBallNum5Type(), calculateType));
			break;
		case 6:
			dataModel.setRedBallNum6(6);
			dataModel.setRedBallNum6Type(getCalculateType(dataModel.getRedBallNum6Type(), calculateType));
			break;
		case 7:
			dataModel.setRedBallNum7(7);
			dataModel.setRedBallNum7Type(getCalculateType(dataModel.getRedBallNum7Type(), calculateType));
			break;
		case 8:
			dataModel.setRedBallNum8(8);
			dataModel.setRedBallNum8Type(getCalculateType(dataModel.getRedBallNum8Type(), calculateType));
			break;
		case 9:
			dataModel.setRedBallNum9(9);
			dataModel.setRedBallNum9Type(getCalculateType(dataModel.getRedBallNum9Type(), calculateType));
			break;
		case 10:
			dataModel.setRedBallNum10(10);
			dataModel.setRedBallNum10Type(getCalculateType(dataModel.getRedBallNum10Type(), calculateType));
			break;
		case 11:
			dataModel.setRedBallNum11(11);
			dataModel.setRedBallNum11Type(getCalculateType(dataModel.getRedBallNum11Type(), calculateType));
			break;
		case 12:
			dataModel.setRedBallNum12(12);
			dataModel.setRedBallNum12Type(getCalculateType(dataModel.getRedBallNum12Type(), calculateType));
			break;
		case 13:
			dataModel.setRedBallNum13(13);
			dataModel.setRedBallNum13Type(getCalculateType(dataModel.getRedBallNum13Type(), calculateType));
			break;
		case 14:
			dataModel.setRedBallNum14(14);
			dataModel.setRedBallNum14Type(getCalculateType(dataModel.getRedBallNum14Type(), calculateType));
			break;
		case 15:
			dataModel.setRedBallNum15(15);
			dataModel.setRedBallNum15Type(getCalculateType(dataModel.getRedBallNum15Type(), calculateType));
			break;
		case 16:
			dataModel.setRedBallNum16(16);
			dataModel.setRedBallNum16Type(getCalculateType(dataModel.getRedBallNum16Type(), calculateType));
			break;
		case 17:
			dataModel.setRedBallNum17(17);
			dataModel.setRedBallNum17Type(getCalculateType(dataModel.getRedBallNum17Type(), calculateType));
			break;
		case 18:
			dataModel.setRedBallNum18(18);
			dataModel.setRedBallNum18Type(getCalculateType(dataModel.getRedBallNum18Type(), calculateType));
			break;
		case 19:
			dataModel.setRedBallNum19(19);
			dataModel.setRedBallNum19Type(getCalculateType(dataModel.getRedBallNum19Type(), calculateType));
			break;
		case 20:
			dataModel.setRedBallNum20(20);
			dataModel.setRedBallNum20Type(getCalculateType(dataModel.getRedBallNum20Type(), calculateType));
			break;
		case 21:
			dataModel.setRedBallNum21(21);
			dataModel.setRedBallNum21Type(getCalculateType(dataModel.getRedBallNum21Type(), calculateType));
			break;
		case 22:
			dataModel.setRedBallNum22(22);
			dataModel.setRedBallNum22Type(getCalculateType(dataModel.getRedBallNum22Type(), calculateType));
			break;
		case 23:
			dataModel.setRedBallNum23(23);
			dataModel.setRedBallNum23Type(getCalculateType(dataModel.getRedBallNum23Type(), calculateType));
			break;
		case 24:
			dataModel.setRedBallNum24(24);
			dataModel.setRedBallNum24Type(getCalculateType(dataModel.getRedBallNum24Type(), calculateType));
			break;
		case 25:
			dataModel.setRedBallNum25(25);
			dataModel.setRedBallNum25Type(getCalculateType(dataModel.getRedBallNum25Type(), calculateType));
			break;
		case 26:
			dataModel.setRedBallNum26(26);
			dataModel.setRedBallNum26Type(getCalculateType(dataModel.getRedBallNum26Type(), calculateType));
			break;
		case 27:
			dataModel.setRedBallNum27(27);
			dataModel.setRedBallNum27Type(getCalculateType(dataModel.getRedBallNum27Type(), calculateType));
			break;
		case 28:
			dataModel.setRedBallNum28(28);
			dataModel.setRedBallNum28Type(getCalculateType(dataModel.getRedBallNum28Type(), calculateType));
			break;
		case 29:
			dataModel.setRedBallNum29(29);
			dataModel.setRedBallNum29Type(getCalculateType(dataModel.getRedBallNum29Type(), calculateType));
			break;
		case 30:
			dataModel.setRedBallNum30(30);
			dataModel.setRedBallNum30Type(getCalculateType(dataModel.getRedBallNum30Type(), calculateType));
			break;
		case 31:
			dataModel.setRedBallNum31(31);
			dataModel.setRedBallNum31Type(getCalculateType(dataModel.getRedBallNum31Type(), calculateType));
			break;
		case 32:
			dataModel.setRedBallNum32(32);
			dataModel.setRedBallNum32Type(getCalculateType(dataModel.getRedBallNum32Type(), calculateType));
			break;
		case 33:
			dataModel.setRedBallNum33(33);
			dataModel.setRedBallNum33Type(getCalculateType(dataModel.getRedBallNum33Type(), calculateType));
			break;
		}
	}

	public static void initBlueNumberModel(int blueNumber, BlueBallNumInfo dataModel, int calculateType) {
		//KLog.v("--->","blue ball number：" + blueNumber + " calculate type：" + calculateType);
		switch (blueNumber) {
		case 0:
			dataModel.setBlueBallNum16(16);
			dataModel.setBlueBallNum16Type(getCalculateType(dataModel.getBlueBallNum16Type(), calculateType));
			break;
		case 1:
			dataModel.setBlueBallNum1(1);
			dataModel.setBlueBallNum1Type(getCalculateType(dataModel.getBlueBallNum1Type(), calculateType));
			break;
		case 2:
			dataModel.setBlueBallNum2(2);
			dataModel.setBlueBallNum2Type(getCalculateType(dataModel.getBlueBallNum2Type(), calculateType));
			break;
		case 3:
			dataModel.setBlueBallNum3(3);
			dataModel.setBlueBallNum3Type(getCalculateType(dataModel.getBlueBallNum3Type(), calculateType));
			break;
		case 4:
			dataModel.setBlueBallNum4(4);
			dataModel.setBlueBallNum4Type(getCalculateType(dataModel.getBlueBallNum4Type(), calculateType));
			break;
		case 5:
			dataModel.setBlueBallNum5(5);
			dataModel.setBlueBallNum5Type(getCalculateType(dataModel.getBlueBallNum5Type(), calculateType));
			break;
		case 6:
			dataModel.setBlueBallNum6(6);
			dataModel.setBlueBallNum6Type(getCalculateType(dataModel.getBlueBallNum6Type(), calculateType));
			break;
		case 7:
			dataModel.setBlueBallNum7(7);
			dataModel.setBlueBallNum7Type(getCalculateType(dataModel.getBlueBallNum7Type(), calculateType));
			break;
		case 8:
			dataModel.setBlueBallNum8(8);
			dataModel.setBlueBallNum8Type(getCalculateType(dataModel.getBlueBallNum8Type(), calculateType));
			break;
		case 9:
			dataModel.setBlueBallNum9(9);
			dataModel.setBlueBallNum9Type(getCalculateType(dataModel.getBlueBallNum9Type(), calculateType));
			break;
		case 10:
			dataModel.setBlueBallNum10(10);
			dataModel.setBlueBallNum10Type(getCalculateType(dataModel.getBlueBallNum10Type(), calculateType));
			break;
		case 11:
			dataModel.setBlueBallNum11(11);
			dataModel.setBlueBallNum11Type(getCalculateType(dataModel.getBlueBallNum11Type(), calculateType));
			break;
		case 12:
			dataModel.setBlueBallNum12(12);
			dataModel.setBlueBallNum12Type(getCalculateType(dataModel.getBlueBallNum12Type(), calculateType));
			break;
		case 13:
			dataModel.setBlueBallNum13(13);
			dataModel.setBlueBallNum13Type(getCalculateType(dataModel.getBlueBallNum13Type(), calculateType));
			break;
		case 14:
			dataModel.setBlueBallNum14(14);
			dataModel.setBlueBallNum14Type(getCalculateType(dataModel.getBlueBallNum14Type(), calculateType));
			break;
		case 15:
			dataModel.setBlueBallNum15(15);
			dataModel.setBlueBallNum15Type(getCalculateType(dataModel.getBlueBallNum15Type(), calculateType));
			break;
		case 16:
			dataModel.setBlueBallNum16(16);
			dataModel.setBlueBallNum16Type(getCalculateType(dataModel.getBlueBallNum16Type(), calculateType));
			break;
		}
	}

	private static int getCalculateType(int calculateType1, int calculateType2) {
		if (calculateType1 == CalculateTypeConfig.CALCULATE_TYPE_WINNING) {
			return CalculateTypeConfig.CALCULATE_TYPE_MATRIX_WINNING;
		}
		if (calculateType1 == CalculateTypeConfig.CALCULATE_TYPE_NONE) {
			return calculateType2;
		}
		return CalculateTypeConfig.CALCULATE_TYPE_NONE;
	}
}
