package com.android.weixin.lotteryticket.operational;

import java.util.ArrayList;
import java.util.List;

import com.android.weixin.lotteryticket.permanent.CalculateTypeConfig;
import com.android.weixin.lotteryticket.storage.unionlotto.BlueBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
import com.android.weixin.lotteryticket.utils.NumberUtil;
import com.socks.library.KLog;

/**
 * 矩阵
 * 
 * @author weixin
 * 
 */
public class MatrixOperation {

	/**
	 * 紅球矩阵3*3
	 * 
	 * @return
	 */
	public List<RedBallNumInfo> initRedDataArray3_3(List<UnionLotteryNumbers> unionLotteryData) {
		List<RedBallNumInfo> matrixData_Items = new ArrayList<RedBallNumInfo>();
		if (unionLotteryData == null || unionLotteryData.size() == 0)
			return matrixData_Items;
		int winningCount = unionLotteryData.size();
		if (winningCount <= 1)
			return matrixData_Items;
		for (int i = 0; i < winningCount; i++) {
			if (i == winningCount - 1)
				break;

			if (i == 0) {
				matrixData_Items.add(this.initRedDataModel(unionLotteryData.get(0)));
				matrixData_Items.add(this.initRedDataModel(unionLotteryData.get(1)));
			}

			int[][] dataArray3_2 = convertToArray3_2(unionLotteryData.get(i), 1);
			int[][] dataArray2_3 = convertToArray2_3(unionLotteryData.get(i + 1), 1);
			int[][] dataResult = matrixOperation3_3(dataArray3_2, dataArray2_3, 33);

			RedBallNumInfo dataModel = null;
			if (i + 2 < winningCount) {
				dataModel = initRedDataModel(unionLotteryData.get(i + 2));
			} else {
				dataModel = new RedBallNumInfo();
			}

			KLog.i("--->", String.format("[%1$s,%2$s,%3$s] [%4$s,%5$s,%6$s] [%7$s,%8$s,%9$s]", dataResult[0][0], dataResult[0][1], dataResult[0][2],dataResult[1][0], dataResult[1][1], dataResult[1][2],dataResult[2][0], dataResult[2][1], dataResult[2][2]));
			initRedDataModel(dataResult, dataModel);
			KLog.v("--->", dataModel.toString());
			matrixData_Items.add(dataModel);
		}
		return matrixData_Items;
	}

	/**
	 * 紅球2*2矩阵
	 * 
	 * @return
	 */
	public List<RedBallNumInfo> initRedDataArray2_2(List<UnionLotteryNumbers> unionLotteryData) {
		List<RedBallNumInfo> matrixData_Items2_2 = new ArrayList<RedBallNumInfo>();
		if (unionLotteryData == null || unionLotteryData.size() == 0)
			return matrixData_Items2_2;
		int winningCount = unionLotteryData.size();
		if (winningCount <= 1)
			return matrixData_Items2_2;
		for (int i = 0; i < winningCount; i++) {
			if (i == winningCount - 1)
				break;

			if (i == 0) {
				matrixData_Items2_2.add(this.initRedDataModel(unionLotteryData.get(0)));
				matrixData_Items2_2.add(this.initRedDataModel(unionLotteryData.get(1)));
			}

			int[][] dataArray3_2 = convertToArray3_2(unionLotteryData.get(i), 1);
			int[][] dataArray2_3 = convertToArray2_3(unionLotteryData.get(i + 1), 1);
			int[][] dataResult = matrixOperation2_2(dataArray2_3, dataArray3_2, 33);

			RedBallNumInfo dataModel = null;
			if (i + 2 < winningCount) {
				dataModel = initRedDataModel(unionLotteryData.get(i + 2));
			} else {
				dataModel = new RedBallNumInfo();
			}

			KLog.i("--->", String.format("[%1$s,%2$s] [%3$s,%4$s]", dataResult[0][0],dataResult[0][1],dataResult[1][0],dataResult[1][1]));
			initRedDataModel(dataResult, dataModel);
			KLog.v("--->", dataModel.toString());
			matrixData_Items2_2.add(dataModel);
		}
		return matrixData_Items2_2;
	}

	public List<BlueBallNumInfo> initBlueDataArray3_3(List<UnionLotteryNumbers> unionLotteryData) {
		List<BlueBallNumInfo> matrixData_Items = new ArrayList<BlueBallNumInfo>();
		if (unionLotteryData == null || unionLotteryData.size() == 0)
			return matrixData_Items;
		int winningCount = unionLotteryData.size();
		if (winningCount <= 1)
			return matrixData_Items;

		for (int i = 0; i < winningCount; i++) {
			if (i == winningCount - 1)
				break;

			if (i == 0) {
				matrixData_Items.add(this.initBlueDataModel(unionLotteryData.get(0)));
				matrixData_Items.add(this.initBlueDataModel(unionLotteryData.get(1)));
			}

			int[][] dataArray3_2 = convertToArray3_2(unionLotteryData.get(i), unionLotteryData.get(i).getBlueNum());
			int[][] dataArray2_3 = convertToArray2_3(unionLotteryData.get(i + 1), unionLotteryData.get(i + 1).getBlueNum());
			int[][] dataResult = matrixOperation3_3(dataArray3_2, dataArray2_3, 16);

			BlueBallNumInfo dataModel = null;
			if (i + 2 < winningCount) {
				dataModel = initBlueDataModel(unionLotteryData.get(i + 2));
			} else {
				dataModel = new BlueBallNumInfo();
			}

			KLog.i("--->", String.format("[%1$s,%2$s,%3$s] [%4$s,%5$s,%6$s] [%7$s,%8$s,%9$s]", dataResult[0][0], dataResult[0][1], dataResult[0][2],dataResult[1][0], dataResult[1][1], dataResult[1][2],dataResult[2][0], dataResult[2][1], dataResult[2][2]));			
			initBlueDataModel(dataResult, dataModel);
			KLog.v("--->", dataModel.toString());
			matrixData_Items.add(dataModel);
		}

		return matrixData_Items;
	}

	private int[][] convertToArray3_2(UnionLotteryNumbers unionLotteryNumber, int baseNum) {
		int[][] dataArray = new int[3][];
		dataArray[0] = new int[] { unionLotteryNumber.getRedNumOne() * baseNum, unionLotteryNumber.getRedNumTwo() * baseNum };
		dataArray[1] = new int[] { unionLotteryNumber.getRedNumThree() * baseNum, unionLotteryNumber.getRedNumFour() * baseNum };
		dataArray[2] = new int[] { unionLotteryNumber.getRedNumFive() * baseNum, unionLotteryNumber.getRedNumSix() * baseNum };
		return dataArray;
	}

	private int[][] convertToArray2_3(UnionLotteryNumbers unionLotteryNumber, int baseNum) {
		int[][] dataArray = new int[2][];
		dataArray[0] = new int[] { unionLotteryNumber.getRedNumOne() * baseNum, unionLotteryNumber.getRedNumTwo() * baseNum,
				unionLotteryNumber.getRedNumThree() * baseNum };
		dataArray[1] = new int[] { unionLotteryNumber.getRedNumFour() * baseNum, unionLotteryNumber.getRedNumFive() * baseNum,
				unionLotteryNumber.getRedNumSix() * baseNum };
		return dataArray;
	}

	// / <summary>
	// / array3_2 * dataArray2_3
	// / </summary>
	// / <param name="array3_2"></param>
	// / <param name="dataArray2_3"></param>
	// / <returns></returns>
	private int[][] matrixOperation3_3(int[][] array3_2, int[][] dataArray2_3, int baseNum) {
		int[][] resultArray = new int[][] { new int[3], new int[3], new int[3] };

		for (int row1 = 0, col1 = 0; row1 < array3_2.length; row1++) {
			for (int row2 = 0, co2 = 0; co2 < dataArray2_3[row2].length; co2++) {
				resultArray[row1][co2] = (dataArray2_3[row2][co2] * array3_2[row1][col1] + dataArray2_3[row2 + 1][co2] * array3_2[row1][col1 + 1]) % baseNum;
			}
		}

		return resultArray;
	}

	private int[][] matrixOperation2_2(int[][] dataArray2_3, int[][] array3_2, int baseNum) {
		int[][] resultArray = new int[][] { new int[2], new int[2] };

		for (int row1 = 0, col1 = 0; row1 < dataArray2_3.length; row1++) {
			for (int row2 = 0, co2 = 0; co2 < array3_2[row2].length; co2++) {
				resultArray[row1][co2] = (array3_2[row2][co2] * dataArray2_3[row1][col1] + array3_2[row2 + 1][co2] * dataArray2_3[row1][col1 + 1]
						+ array3_2[row2 + 2][co2] * dataArray2_3[row1][col1 + 2]) % baseNum;
			}
		}

		return resultArray;
	}

	private void initRedDataModel(int[][] dataResult, RedBallNumInfo dataModel) {
		for (int i = 0; i < dataResult.length; i++) {
			for (int j = 0; j < dataResult[i].length; j++) {
				NumberUtil.initRedNumberModel(dataResult[i][j], dataModel, CalculateTypeConfig.CALCULATE_TYPE_MATRIX);
			}
		}
	}

	/**
	 * 初始化中奖数据
	 * 
	 * @param unionLotteryNumber
	 * @return
	 */
	private RedBallNumInfo initRedDataModel(UnionLotteryNumbers unionLotteryNumber) {
		RedBallNumInfo redBallNumInfo = new RedBallNumInfo();
		redBallNumInfo.setLotteryDate(unionLotteryNumber.getLotteryDate());
		redBallNumInfo.setPeriodNum(unionLotteryNumber.getPeriodNum());
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumOne(), redBallNumInfo, CalculateTypeConfig.CALCULATE_TYPE_WINNING);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumTwo(), redBallNumInfo, CalculateTypeConfig.CALCULATE_TYPE_WINNING);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumThree(), redBallNumInfo, CalculateTypeConfig.CALCULATE_TYPE_WINNING);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumFour(), redBallNumInfo, CalculateTypeConfig.CALCULATE_TYPE_WINNING);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumFive(), redBallNumInfo, CalculateTypeConfig.CALCULATE_TYPE_WINNING);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumSix(), redBallNumInfo, CalculateTypeConfig.CALCULATE_TYPE_WINNING);
		return redBallNumInfo;
	}

	private void initBlueDataModel(int[][] dataResult, BlueBallNumInfo dataModel) {
		for (int i = 0; i < dataResult.length; i++) {
			for (int j = 0; j < dataResult[i].length; j++) {
				NumberUtil.initBlueNumberModel(dataResult[i][j], dataModel, CalculateTypeConfig.CALCULATE_TYPE_MATRIX);
			}
		}
	}

	/**
	 * 初始化中奖数据
	 * 
	 * @param unionLotteryNumber
	 * @return
	 */
	private BlueBallNumInfo initBlueDataModel(UnionLotteryNumbers unionLotteryNumber) {
		BlueBallNumInfo blueBallNumInfo = new BlueBallNumInfo();
		blueBallNumInfo.setLotteryDate(unionLotteryNumber.getLotteryDate());
		blueBallNumInfo.setPeriodNum(unionLotteryNumber.getPeriodNum());
		NumberUtil.initBlueNumberModel(unionLotteryNumber.getBlueNum(), blueBallNumInfo, CalculateTypeConfig.CALCULATE_TYPE_WINNING);
		return blueBallNumInfo;
	}
}
