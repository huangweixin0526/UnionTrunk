package com.android.weixin.lotteryticket.operational;

import java.util.ArrayList;
import java.util.List;

import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
import com.android.weixin.lotteryticket.utils.NumberUtil;

/**
 * 矩阵
 * 
 * @author weixin
 * 
 */
public class MatrixOperation {

	/**
	 * 矩阵3*3
	 * 
	 * @return
	 */
	public List<RedBallNumInfo> initDataArray3_3(List<UnionLotteryNumbers> unionLotteryData) {
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
				matrixData_Items.add(this.initDataModel(unionLotteryData.get(0)));
				matrixData_Items.add(this.initDataModel(unionLotteryData.get(1)));
			}

			int[][] dataArray3_2 = convertToArray3_2(unionLotteryData.get(i));
			int[][] dataArray2_3 = convertToArray2_3(unionLotteryData.get(i + 1));
			int[][] dataResult = MatrixOperation(dataArray3_2, dataArray2_3);

			RedBallNumInfo dataModel = null;
			if (i + 2 < winningCount) {
				dataModel = initDataModel(unionLotteryData.get(i + 2));
			} else {
				dataModel = new RedBallNumInfo();
			}

			initDataModel(dataResult, dataModel);

			matrixData_Items.add(dataModel);
		}
		return matrixData_Items;
	}

	/**
	 * 2*2矩阵
	 * 
	 * @return
	 */
	public List<RedBallNumInfo> initDataArray2_2(List<UnionLotteryNumbers> unionLotteryData) {
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
				matrixData_Items2_2.add(this.initDataModel(unionLotteryData.get(0)));
				matrixData_Items2_2.add(this.initDataModel(unionLotteryData.get(1)));
			}

			int[][] dataArray3_2 = convertToArray3_2(unionLotteryData.get(i));
			int[][] dataArray2_3 = convertToArray2_3(unionLotteryData.get(i + 1));
			int[][] dataResult = MatrixOperation2_2(dataArray2_3, dataArray3_2);

			RedBallNumInfo dataModel = null;
			if (i + 2 < winningCount) {
				dataModel = initDataModel(unionLotteryData.get(i + 2));
			} else {
				dataModel = new RedBallNumInfo();
			}

			initDataModel(dataResult, dataModel);

			matrixData_Items2_2.add(dataModel);
		}
		return matrixData_Items2_2;
	}

	private int[][] convertToArray3_2(UnionLotteryNumbers unionLotteryNumber) {
		int[][] dataArray = new int[3][];
		dataArray[0] = new int[] { unionLotteryNumber.getRedNumOne(), unionLotteryNumber.getRedNumTwo() };
		dataArray[1] = new int[] { unionLotteryNumber.getRedNumThree(), unionLotteryNumber.getRedNumFour() };
		dataArray[2] = new int[] { unionLotteryNumber.getRedNumFive(), unionLotteryNumber.getRedNumSix() };
		return dataArray;
	}

	private int[][] convertToArray2_3(UnionLotteryNumbers unionLotteryNumber) {
		int[][] dataArray = new int[2][];
		dataArray[0] = new int[] { unionLotteryNumber.getRedNumOne(), unionLotteryNumber.getRedNumTwo(), unionLotteryNumber.getRedNumThree() };
		dataArray[1] = new int[] { unionLotteryNumber.getRedNumFour(), unionLotteryNumber.getRedNumFive(), unionLotteryNumber.getRedNumSix() };
		return dataArray;
	}

	// / <summary>
	// / array3_2 * dataArray2_3
	// / </summary>
	// / <param name="array3_2"></param>
	// / <param name="dataArray2_3"></param>
	// / <returns></returns>
	private int[][] MatrixOperation(int[][] array3_2, int[][] dataArray2_3) {
		int[][] resultArray = new int[][] { new int[3], new int[3], new int[3] };

		for (int row1 = 0, col1 = 0; row1 < array3_2.length; row1++) {
			for (int row2 = 0, co2 = 0; co2 < dataArray2_3[row2].length; co2++) {
				resultArray[row1][co2] = (dataArray2_3[row2][co2] * array3_2[row1][col1] + dataArray2_3[row2 + 1][co2] * array3_2[row1][col1 + 1]) % 33;
			}
		}

		return resultArray;
	}

	private int[][] MatrixOperation2_2(int[][] dataArray2_3, int[][] array3_2) {
		int[][] resultArray = new int[][] { new int[2], new int[2] };

		for (int row1 = 0, col1 = 0; row1 < dataArray2_3.length; row1++) {
			for (int row2 = 0, co2 = 0; co2 < array3_2[row2].length; co2++) {
				resultArray[row1][co2] = (array3_2[row2][co2] * dataArray2_3[row1][col1] + array3_2[row2 + 1][co2] * dataArray2_3[row1][col1 + 1] + array3_2[row2 + 2][co2]
						* dataArray2_3[row1][col1 + 2]) % 33;
			}
		}

		return resultArray;
	}

	private void initDataModel(int[][] dataResult, RedBallNumInfo dataModel) {
		for (int i = 0; i < dataResult.length; i++) {
			for (int j = 0; j < dataResult[i].length; j++) {
				NumberUtil.initRedNumberModel(dataResult[i][j], dataModel, true);
			}
		}

	}

	private RedBallNumInfo initDataModel(UnionLotteryNumbers unionLotteryNumber) {
		RedBallNumInfo redBallNumInfo = new RedBallNumInfo();
		redBallNumInfo.setLotteryDate(unionLotteryNumber.getLotteryDate());
		redBallNumInfo.setPeriodNum(unionLotteryNumber.getPeriodNum());
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumOne(), redBallNumInfo, false);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumTwo(), redBallNumInfo, false);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumThree(), redBallNumInfo, false);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumFour(), redBallNumInfo, false);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumFive(), redBallNumInfo, false);
		NumberUtil.initRedNumberModel(unionLotteryNumber.getRedNumSix(), redBallNumInfo, false);
		return redBallNumInfo;
	}

}
