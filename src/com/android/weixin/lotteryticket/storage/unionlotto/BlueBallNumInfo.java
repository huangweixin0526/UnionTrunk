package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.Date;

import com.android.weixin.lotteryticket.storage.DBaseDao;
import com.lidroid.xutils.db.annotation.Column;

public class BlueBallNumInfo extends DBaseDao {

	public static final String COLUMN_LOTTERY_DATE = "lotteryDate";
	public static final String COLUMN_PERIOD_NUM = "periodNum";
	public static final String COLUMN_CALCULATE_TYPE = "calculate_type";
	public static final String COLUMN_BLUE_BALL_NUM_1 = "blue_ball_num_1";
	public static final String COLUMN_BLUE_BALL_NUM_2 = "blue_ball_num_2";
	public static final String COLUMN_BLUE_BALL_NUM_3 = "blue_ball_num_3";
	public static final String COLUMN_BLUE_BALL_NUM_4 = "blue_ball_num_4";
	public static final String COLUMN_BLUE_BALL_NUM_5 = "blue_ball_num_5";
	public static final String COLUMN_BLUE_BALL_NUM_6 = "blue_ball_num_6";
	public static final String COLUMN_BLUE_BALL_NUM_7 = "blue_ball_num_7";
	public static final String COLUMN_BLUE_BALL_NUM_8 = "blue_ball_num_8";
	public static final String COLUMN_BLUE_BALL_NUM_9 = "blue_ball_num_9";
	public static final String COLUMN_BLUE_BALL_NUM_10 = "blue_ball_num_10";
	public static final String COLUMN_BLUE_BALL_NUM_11 = "blue_ball_num_11";
	public static final String COLUMN_BLUE_BALL_NUM_12 = "blue_ball_num_12";
	public static final String COLUMN_BLUE_BALL_NUM_13 = "blue_ball_num_13";
	public static final String COLUMN_BLUE_BALL_NUM_14 = "blue_ball_num_14";
	public static final String COLUMN_BLUE_BALL_NUM_15 = "blue_ball_num_15";
	public static final String COLUMN_BLUE_BALL_NUM_16 = "blue_ball_num_16";

	@Column(column = "period_num")
	private int periodNum;
	@Column(column = "lottery_date")
	private Date lotteryDate;
	@Column(column="calculate_type")
	private int calculateType;
	@Column(column = "blue_ball_num_1")
	private int blueBallNum1;
	@Column(column = "blue_ball_num_2")
	private int blueBallNum2;
	@Column(column = "blue_ball_num_3")
	private int blueBallNum3;
	@Column(column = "blue_ball_num_4")
	private int blueBallNum4;
	@Column(column = "blue_ball_num_5")
	private int blueBallNum5;
	@Column(column = "blue_ball_num_6")
	private int blueBallNum6;
	@Column(column = "blue_ball_num_7")
	private int blueBallNum7;
	@Column(column = "blue_ball_num_8")
	private int blueBallNum8;
	@Column(column = "blue_ball_num_9")
	private int blueBallNum9;
	@Column(column = "blue_ball_num_10")
	private int blueBallNum10;
	@Column(column = "blue_ball_num_11")
	private int blueBallNum11;
	@Column(column = "blue_ball_num_12")
	private int blueBallNum12;
	@Column(column = "blue_ball_num_13")
	private int blueBallNum13;
	@Column(column = "blue_ball_num_14")
	private int blueBallNum14;
	@Column(column = "blue_ball_num_15")
	private int blueBallNum15;
	@Column(column = "blue_ball_num_16")
	private int blueBallNum16;

	public int getPeriodNum() {
		return periodNum;
	}

	public void setPeriodNum(int periodNum) {
		this.periodNum = periodNum;
	}

	public Date getLotteryDate() {
		return lotteryDate;
	}

	public void setLotteryDate(Date lotteryDate) {
		this.lotteryDate = lotteryDate;
	}

	public int getCalculateType() {
		return calculateType;
	}

	public void setCalculateType(int calculateType) {
		this.calculateType = calculateType;
	}

	public int getBlueBallNum1() {
		return blueBallNum1;
	}

	public void setBlueBallNum1(int blueBallNum1) {
		this.blueBallNum1 = blueBallNum1;
	}

	public int getBlueBallNum2() {
		return blueBallNum2;
	}

	public void setBlueBallNum2(int blueBallNum2) {
		this.blueBallNum2 = blueBallNum2;
	}

	public int getBlueBallNum3() {
		return blueBallNum3;
	}

	public void setBlueBallNum3(int blueBallNum3) {
		this.blueBallNum3 = blueBallNum3;
	}

	public int getBlueBallNum4() {
		return blueBallNum4;
	}

	public void setBlueBallNum4(int blueBallNum4) {
		this.blueBallNum4 = blueBallNum4;
	}

	public int getBlueBallNum5() {
		return blueBallNum5;
	}

	public void setBlueBallNum5(int blueBallNum5) {
		this.blueBallNum5 = blueBallNum5;
	}

	public int getBlueBallNum6() {
		return blueBallNum6;
	}

	public void setBlueBallNum6(int blueBallNum6) {
		this.blueBallNum6 = blueBallNum6;
	}

	public int getBlueBallNum7() {
		return blueBallNum7;
	}

	public void setBlueBallNum7(int blueBallNum7) {
		this.blueBallNum7 = blueBallNum7;
	}

	public int getBlueBallNum8() {
		return blueBallNum8;
	}

	public void setBlueBallNum8(int blueBallNum8) {
		this.blueBallNum8 = blueBallNum8;
	}

	public int getBlueBallNum9() {
		return blueBallNum9;
	}

	public void setBlueBallNum9(int blueBallNum9) {
		this.blueBallNum9 = blueBallNum9;
	}

	public int getBlueBallNum10() {
		return blueBallNum10;
	}

	public void setBlueBallNum10(int blueBallNum10) {
		this.blueBallNum10 = blueBallNum10;
	}

	public int getBlueBallNum11() {
		return blueBallNum11;
	}

	public void setBlueBallNum11(int blueBallNum11) {
		this.blueBallNum11 = blueBallNum11;
	}

	public int getBlueBallNum12() {
		return blueBallNum12;
	}

	public void setBlueBallNum12(int blueBallNum12) {
		this.blueBallNum12 = blueBallNum12;
	}

	public int getBlueBallNum13() {
		return blueBallNum13;
	}

	public void setBlueBallNum13(int blueBallNum13) {
		this.blueBallNum13 = blueBallNum13;
	}

	public int getBlueBallNum14() {
		return blueBallNum14;
	}

	public void setBlueBallNum14(int blueBallNum14) {
		this.blueBallNum14 = blueBallNum14;
	}

	public int getBlueBallNum15() {
		return blueBallNum15;
	}

	public void setBlueBallNum15(int blueBallNum15) {
		this.blueBallNum15 = blueBallNum15;
	}

	public int getBlueBallNum16() {
		return blueBallNum16;
	}

	public void setBlueBallNum16(int blueBallNum16) {
		this.blueBallNum16 = blueBallNum16;
	}
}
