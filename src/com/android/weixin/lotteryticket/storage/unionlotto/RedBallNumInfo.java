package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.Date;

import android.graphics.drawable.Drawable;

import com.android.weixin.lotteryticket.storage.DBaseDao;
import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

@Table(name = "union_red_ball_num")
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
	@Column(column = "calculate_type")
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

	private Drawable bgRedBallNum1;

	private Drawable bgRedBallNum2;

	private Drawable bgRedBallNum3;

	private Drawable bgRedBallNum4;

	private Drawable bgRedBallNum5;

	private Drawable bgRedBallNum6;

	private Drawable bgRedBallNum7;

	private Drawable bgRedBallNum8;

	private Drawable bgRedBallNum9;

	private Drawable bgRedBallNum10;

	private Drawable bgRedBallNum11;

	private Drawable bgRedBallNum12;

	private Drawable bgRedBallNum13;

	private Drawable bgRedBallNum14;

	private Drawable bgRedBallNum15;

	private Drawable bgRedBallNum16;

	private Drawable bgRedBallNum17;

	private Drawable bgRedBallNum18;

	private Drawable bgRedBallNum19;

	private Drawable bgRedBallNum20;

	private Drawable bgRedBallNum21;

	private Drawable bgRedBallNum22;

	private Drawable bgRedBallNum23;

	private Drawable bgRedBallNum24;

	private Drawable bgRedBallNum25;

	private Drawable bgRedBallNum26;

	private Drawable bgRedBallNum27;

	private Drawable bgRedBallNum28;

	private Drawable bgRedBallNum29;

	private Drawable bgRedBallNum30;

	private Drawable bgRedBallNum31;

	private Drawable bgRedBallNum32;

	private Drawable bgRedBallNum33;

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

	public Drawable getBgRedBallNum1() {
		return bgRedBallNum1;
	}

	public void setBgRedBallNum1(Drawable bgRedBallNum1) {
		this.bgRedBallNum1 = bgRedBallNum1;
	}

	public Drawable getBgRedBallNum2() {
		return bgRedBallNum2;
	}

	public void setBgRedBallNum2(Drawable bgRedBallNum2) {
		this.bgRedBallNum2 = bgRedBallNum2;
	}

	public Drawable getBgRedBallNum3() {
		return bgRedBallNum3;
	}

	public void setBgRedBallNum3(Drawable bgRedBallNum3) {
		this.bgRedBallNum3 = bgRedBallNum3;
	}

	public Drawable getBgRedBallNum4() {
		return bgRedBallNum4;
	}

	public void setBgRedBallNum4(Drawable bgRedBallNum4) {
		this.bgRedBallNum4 = bgRedBallNum4;
	}

	public Drawable getBgRedBallNum5() {
		return bgRedBallNum5;
	}

	public void setBgRedBallNum5(Drawable bgRedBallNum5) {
		this.bgRedBallNum5 = bgRedBallNum5;
	}

	public Drawable getBgRedBallNum6() {
		return bgRedBallNum6;
	}

	public void setBgRedBallNum6(Drawable bgRedBallNum6) {
		this.bgRedBallNum6 = bgRedBallNum6;
	}

	public Drawable getBgRedBallNum7() {
		return bgRedBallNum7;
	}

	public void setBgRedBallNum7(Drawable bgRedBallNum7) {
		this.bgRedBallNum7 = bgRedBallNum7;
	}

	public Drawable getBgRedBallNum8() {
		return bgRedBallNum8;
	}

	public void setBgRedBallNum8(Drawable bgRedBallNum8) {
		this.bgRedBallNum8 = bgRedBallNum8;
	}

	public Drawable getBgRedBallNum9() {
		return bgRedBallNum9;
	}

	public void setBgRedBallNum9(Drawable bgRedBallNum9) {
		this.bgRedBallNum9 = bgRedBallNum9;
	}

	public Drawable getBgRedBallNum10() {
		return bgRedBallNum10;
	}

	public void setBgRedBallNum10(Drawable bgRedBallNum10) {
		this.bgRedBallNum10 = bgRedBallNum10;
	}

	public Drawable getBgRedBallNum11() {
		return bgRedBallNum11;
	}

	public void setBgRedBallNum11(Drawable bgRedBallNum11) {
		this.bgRedBallNum11 = bgRedBallNum11;
	}

	public Drawable getBgRedBallNum12() {
		return bgRedBallNum12;
	}

	public void setBgRedBallNum12(Drawable bgRedBallNum12) {
		this.bgRedBallNum12 = bgRedBallNum12;
	}

	public Drawable getBgRedBallNum13() {
		return bgRedBallNum13;
	}

	public void setBgRedBallNum13(Drawable bgRedBallNum13) {
		this.bgRedBallNum13 = bgRedBallNum13;
	}

	public Drawable getBgRedBallNum14() {
		return bgRedBallNum14;
	}

	public void setBgRedBallNum14(Drawable bgRedBallNum14) {
		this.bgRedBallNum14 = bgRedBallNum14;
	}

	public Drawable getBgRedBallNum15() {
		return bgRedBallNum15;
	}

	public void setBgRedBallNum15(Drawable bgRedBallNum15) {
		this.bgRedBallNum15 = bgRedBallNum15;
	}

	public Drawable getBgRedBallNum16() {
		return bgRedBallNum16;
	}

	public void setBgRedBallNum16(Drawable bgRedBallNum16) {
		this.bgRedBallNum16 = bgRedBallNum16;
	}

	public Drawable getBgRedBallNum17() {
		return bgRedBallNum17;
	}

	public void setBgRedBallNum17(Drawable bgRedBallNum17) {
		this.bgRedBallNum17 = bgRedBallNum17;
	}

	public Drawable getBgRedBallNum18() {
		return bgRedBallNum18;
	}

	public void setBgRedBallNum18(Drawable bgRedBallNum18) {
		this.bgRedBallNum18 = bgRedBallNum18;
	}

	public Drawable getBgRedBallNum19() {
		return bgRedBallNum19;
	}

	public void setBgRedBallNum19(Drawable bgRedBallNum19) {
		this.bgRedBallNum19 = bgRedBallNum19;
	}

	public Drawable getBgRedBallNum20() {
		return bgRedBallNum20;
	}

	public void setBgRedBallNum20(Drawable bgRedBallNum20) {
		this.bgRedBallNum20 = bgRedBallNum20;
	}

	public Drawable getBgRedBallNum21() {
		return bgRedBallNum21;
	}

	public void setBgRedBallNum21(Drawable bgRedBallNum21) {
		this.bgRedBallNum21 = bgRedBallNum21;
	}

	public Drawable getBgRedBallNum22() {
		return bgRedBallNum22;
	}

	public void setBgRedBallNum22(Drawable bgRedBallNum22) {
		this.bgRedBallNum22 = bgRedBallNum22;
	}

	public Drawable getBgRedBallNum23() {
		return bgRedBallNum23;
	}

	public void setBgRedBallNum23(Drawable bgRedBallNum23) {
		this.bgRedBallNum23 = bgRedBallNum23;
	}

	public Drawable getBgRedBallNum24() {
		return bgRedBallNum24;
	}

	public void setBgRedBallNum24(Drawable bgRedBallNum24) {
		this.bgRedBallNum24 = bgRedBallNum24;
	}

	public Drawable getBgRedBallNum25() {
		return bgRedBallNum25;
	}

	public void setBgRedBallNum25(Drawable bgRedBallNum25) {
		this.bgRedBallNum25 = bgRedBallNum25;
	}

	public Drawable getBgRedBallNum26() {
		return bgRedBallNum26;
	}

	public void setBgRedBallNum26(Drawable bgRedBallNum26) {
		this.bgRedBallNum26 = bgRedBallNum26;
	}

	public Drawable getBgRedBallNum27() {
		return bgRedBallNum27;
	}

	public void setBgRedBallNum27(Drawable bgRedBallNum27) {
		this.bgRedBallNum27 = bgRedBallNum27;
	}

	public Drawable getBgRedBallNum28() {
		return bgRedBallNum28;
	}

	public void setBgRedBallNum28(Drawable bgRedBallNum28) {
		this.bgRedBallNum28 = bgRedBallNum28;
	}

	public Drawable getBgRedBallNum29() {
		return bgRedBallNum29;
	}

	public void setBgRedBallNum29(Drawable bgRedBallNum29) {
		this.bgRedBallNum29 = bgRedBallNum29;
	}

	public Drawable getBgRedBallNum30() {
		return bgRedBallNum30;
	}

	public void setBgRedBallNum30(Drawable bgRedBallNum30) {
		this.bgRedBallNum30 = bgRedBallNum30;
	}

	public Drawable getBgRedBallNum31() {
		return bgRedBallNum31;
	}

	public void setBgRedBallNum31(Drawable bgRedBallNum31) {
		this.bgRedBallNum31 = bgRedBallNum31;
	}

	public Drawable getBgRedBallNum32() {
		return bgRedBallNum32;
	}

	public void setBgRedBallNum32(Drawable bgRedBallNum32) {
		this.bgRedBallNum32 = bgRedBallNum32;
	}

	public Drawable getBgRedBallNum33() {
		return bgRedBallNum33;
	}

	public void setBgRedBallNum33(Drawable bgRedBallNum33) {
		this.bgRedBallNum33 = bgRedBallNum33;
	}
}
