package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.Date;

import com.android.weixin.lotteryticket.storage.DBaseDao;
import com.lidroid.xutils.db.annotation.Column;

public class RedBallNumInfo extends DBaseDao {

	public static final String COLUMN_LOTTERY_DATE = "lotteryDate";
	public static final String COLUMN_PERIOD_NUM = "periodNum";
	public static final String COLUMN_CALCULATE_TYPE = "calculate_type";
	public static final String COLUMN_RED_BALL_NUM_1 = "red_ball_num_1";
	public static final String COLUMN_RED_BALL_NUM_2 = "red_ball_num_2";
	public static final String COLUMN_RED_BALL_NUM_3 = "red_ball_num_3";
	public static final String COLUMN_RED_BALL_NUM_4 = "red_ball_num_4";
	public static final String COLUMN_RED_BALL_NUM_5 = "red_ball_num_5";
	public static final String COLUMN_RED_BALL_NUM_6 = "red_ball_num_6";
	public static final String COLUMN_RED_BALL_NUM_7 = "red_ball_num_7";
	public static final String COLUMN_RED_BALL_NUM_8 = "red_ball_num_8";
	public static final String COLUMN_RED_BALL_NUM_9 = "red_ball_num_9";
	public static final String COLUMN_RED_BALL_NUM_10 = "red_ball_num_10";
	public static final String COLUMN_RED_BALL_NUM_11 = "red_ball_num_11";
	public static final String COLUMN_RED_BALL_NUM_12 = "red_ball_num_12";
	public static final String COLUMN_RED_BALL_NUM_13 = "red_ball_num_13";
	public static final String COLUMN_RED_BALL_NUM_14 = "red_ball_num_14";
	public static final String COLUMN_RED_BALL_NUM_15 = "red_ball_num_15";
	public static final String COLUMN_RED_BALL_NUM_16 = "red_ball_num_16";
	public static final String COLUMN_RED_BALL_NUM_17 = "red_ball_num_17";
	public static final String COLUMN_RED_BALL_NUM_18 = "red_ball_num_18";
	public static final String COLUMN_RED_BALL_NUM_19 = "red_ball_num_19";
	public static final String COLUMN_RED_BALL_NUM_20 = "red_ball_num_20";
	public static final String COLUMN_RED_BALL_NUM_21 = "red_ball_num_21";
	public static final String COLUMN_RED_BALL_NUM_22 = "red_ball_num_22";
	public static final String COLUMN_RED_BALL_NUM_23 = "red_ball_num_23";
	public static final String COLUMN_RED_BALL_NUM_24 = "red_ball_num_24";
	public static final String COLUMN_RED_BALL_NUM_25 = "red_ball_num_25";
	public static final String COLUMN_RED_BALL_NUM_26 = "red_ball_num_26";
	public static final String COLUMN_RED_BALL_NUM_27 = "red_ball_num_27";
	public static final String COLUMN_RED_BALL_NUM_28 = "red_ball_num_28";
	public static final String COLUMN_RED_BALL_NUM_29 = "red_ball_num_29";
	public static final String COLUMN_RED_BALL_NUM_30 = "red_ball_num_30";
	public static final String COLUMN_RED_BALL_NUM_31 = "red_ball_num_31";
	public static final String COLUMN_RED_BALL_NUM_32 = "red_ball_num_32";
	public static final String COLUMN_RED_BALL_NUM_33 = "red_ball_num_33";

	@Column(column = "period_num")
	private int periodNum;
	@Column(column = "lottery_date")
	private Date lotteryDate;
	@Column(column="calculate_type")
	private int calculateType;
	@Column(column = "red_ball_num_1")
	private int redBallNum1;
	@Column(column = "red_ball_num_2")
	private int redBallNum2;
	@Column(column = "red_ball_num_3")
	private int redBallNum3;
	@Column(column = "red_ball_num_4")
	private int redBallNum4;
	@Column(column = "red_ball_num_5")
	private int redBallNum5;
	@Column(column = "red_ball_num_6")
	private int redBallNum6;
	@Column(column = "red_ball_num_7")
	private int redBallNum7;
	@Column(column = "red_ball_num_8")
	private int redBallNum8;
	@Column(column = "red_ball_num_9")
	private int redBallNum9;
	@Column(column = "red_ball_num_10")
	private int redBallNum10;
	@Column(column = "red_ball_num_11")
	private int redBallNum11;
	@Column(column = "red_ball_num_12")
	private int redBallNum12;
	@Column(column = "red_ball_num_13")
	private int redBallNum13;
	@Column(column = "red_ball_num_14")
	private int redBallNum14;
	@Column(column = "red_ball_num_15")
	private int redBallNum15;
	@Column(column = "red_ball_num_16")
	private int redBallNum16;
	@Column(column = "red_ball_num_17")
	private int redBallNum17;
	@Column(column = "red_ball_num_18")
	private int redBallNum18;
	@Column(column = "red_ball_num_19")
	private int redBallNum19;
	@Column(column = "red_ball_num_20")
	private int redBallNum20;
	@Column(column = "red_ball_num_21")
	private int redBallNum21;
	@Column(column = "red_ball_num_22")
	private int redBallNum22;
	@Column(column = "red_ball_num_23")
	private int redBallNum23;
	@Column(column = "red_ball_num_24")
	private int redBallNum24;
	@Column(column = "red_ball_num_25")
	private int redBallNum25;
	@Column(column = "red_ball_num_26")
	private int redBallNum26;
	@Column(column = "red_ball_num_27")
	private int redBallNum27;
	@Column(column = "red_ball_num_28")
	private int redBallNum28;
	@Column(column = "red_ball_num_29")
	private int redBallNum29;
	@Column(column = "red_ball_num_30")
	private int redBallNum30;
	@Column(column = "red_ball_num_31")
	private int redBallNum31;
	@Column(column = "red_ball_num_32")
	private int redBallNum32;
	@Column(column = "red_ball_num_33")
	private int redBallNum33;

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

	public int getRedBallNum1() {
		return redBallNum1;
	}

	public void setRedBallNum1(int redBallNum1) {
		this.redBallNum1 = redBallNum1;
	}

	public int getRedBallNum2() {
		return redBallNum2;
	}

	public void setRedBallNum2(int redBallNum2) {
		this.redBallNum2 = redBallNum2;
	}

	public int getRedBallNum3() {
		return redBallNum3;
	}

	public void setRedBallNum3(int redBallNum3) {
		this.redBallNum3 = redBallNum3;
	}

	public int getRedBallNum4() {
		return redBallNum4;
	}

	public void setRedBallNum4(int redBallNum4) {
		this.redBallNum4 = redBallNum4;
	}

	public int getRedBallNum5() {
		return redBallNum5;
	}

	public void setRedBallNum5(int redBallNum5) {
		this.redBallNum5 = redBallNum5;
	}

	public int getRedBallNum6() {
		return redBallNum6;
	}

	public void setRedBallNum6(int redBallNum6) {
		this.redBallNum6 = redBallNum6;
	}

	public int getRedBallNum7() {
		return redBallNum7;
	}

	public void setRedBallNum7(int redBallNum7) {
		this.redBallNum7 = redBallNum7;
	}

	public int getRedBallNum8() {
		return redBallNum8;
	}

	public void setRedBallNum8(int redBallNum8) {
		this.redBallNum8 = redBallNum8;
	}

	public int getRedBallNum9() {
		return redBallNum9;
	}

	public void setRedBallNum9(int redBallNum9) {
		this.redBallNum9 = redBallNum9;
	}

	public int getRedBallNum10() {
		return redBallNum10;
	}

	public void setRedBallNum10(int redBallNum10) {
		this.redBallNum10 = redBallNum10;
	}

	public int getRedBallNum11() {
		return redBallNum11;
	}

	public void setRedBallNum11(int redBallNum11) {
		this.redBallNum11 = redBallNum11;
	}

	public int getRedBallNum12() {
		return redBallNum12;
	}

	public void setRedBallNum12(int redBallNum12) {
		this.redBallNum12 = redBallNum12;
	}

	public int getRedBallNum13() {
		return redBallNum13;
	}

	public void setRedBallNum13(int redBallNum13) {
		this.redBallNum13 = redBallNum13;
	}

	public int getRedBallNum14() {
		return redBallNum14;
	}

	public void setRedBallNum14(int redBallNum14) {
		this.redBallNum14 = redBallNum14;
	}

	public int getRedBallNum15() {
		return redBallNum15;
	}

	public void setRedBallNum15(int redBallNum15) {
		this.redBallNum15 = redBallNum15;
	}

	public int getRedBallNum16() {
		return redBallNum16;
	}

	public void setRedBallNum16(int redBallNum16) {
		this.redBallNum16 = redBallNum16;
	}

	public int getRedBallNum17() {
		return redBallNum17;
	}

	public void setRedBallNum17(int redBallNum17) {
		this.redBallNum17 = redBallNum17;
	}

	public int getRedBallNum18() {
		return redBallNum18;
	}

	public void setRedBallNum18(int redBallNum18) {
		this.redBallNum18 = redBallNum18;
	}

	public int getRedBallNum19() {
		return redBallNum19;
	}

	public void setRedBallNum19(int redBallNum19) {
		this.redBallNum19 = redBallNum19;
	}

	public int getRedBallNum20() {
		return redBallNum20;
	}

	public void setRedBallNum20(int redBallNum20) {
		this.redBallNum20 = redBallNum20;
	}

	public int getRedBallNum21() {
		return redBallNum21;
	}

	public void setRedBallNum21(int redBallNum21) {
		this.redBallNum21 = redBallNum21;
	}

	public int getRedBallNum22() {
		return redBallNum22;
	}

	public void setRedBallNum22(int redBallNum22) {
		this.redBallNum22 = redBallNum22;
	}

	public int getRedBallNum23() {
		return redBallNum23;
	}

	public void setRedBallNum23(int redBallNum23) {
		this.redBallNum23 = redBallNum23;
	}

	public int getRedBallNum24() {
		return redBallNum24;
	}

	public void setRedBallNum24(int redBallNum24) {
		this.redBallNum24 = redBallNum24;
	}

	public int getRedBallNum25() {
		return redBallNum25;
	}

	public void setRedBallNum25(int redBallNum25) {
		this.redBallNum25 = redBallNum25;
	}

	public int getRedBallNum26() {
		return redBallNum26;
	}

	public void setRedBallNum26(int redBallNum26) {
		this.redBallNum26 = redBallNum26;
	}

	public int getRedBallNum27() {
		return redBallNum27;
	}

	public void setRedBallNum27(int redBallNum27) {
		this.redBallNum27 = redBallNum27;
	}

	public int getRedBallNum28() {
		return redBallNum28;
	}

	public void setRedBallNum28(int redBallNum28) {
		this.redBallNum28 = redBallNum28;
	}

	public int getRedBallNum29() {
		return redBallNum29;
	}

	public void setRedBallNum29(int redBallNum29) {
		this.redBallNum29 = redBallNum29;
	}

	public int getRedBallNum30() {
		return redBallNum30;
	}

	public void setRedBallNum30(int redBallNum30) {
		this.redBallNum30 = redBallNum30;
	}

	public int getRedBallNum31() {
		return redBallNum31;
	}

	public void setRedBallNum31(int redBallNum31) {
		this.redBallNum31 = redBallNum31;
	}

	public int getRedBallNum32() {
		return redBallNum32;
	}

	public void setRedBallNum32(int redBallNum32) {
		this.redBallNum32 = redBallNum32;
	}

	public int getRedBallNum33() {
		return redBallNum33;
	}

	public void setRedBallNum33(int redBallNum33) {
		this.redBallNum33 = redBallNum33;
	}
}
