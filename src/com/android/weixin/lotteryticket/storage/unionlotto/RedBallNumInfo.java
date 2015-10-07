package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.Date;

import android.graphics.drawable.Drawable;

import com.android.weixin.lotteryticket.storage.DBaseDao;
import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;
import com.lidroid.xutils.db.annotation.Transient;

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

	private int redBallNum1Type;

	private int redBallNum2Type;

	private int redBallNum3Type;

	private int redBallNum4Type;

	private int redBallNum5Type;

	private int redBallNum6Type;

	private int redBallNum7Type;

	private int redBallNum8Type;

	private int redBallNum9Type;

	private int redBallNum10Type;

	private int redBallNum11Type;

	private int redBallNum12Type;

	private int redBallNum13Type;

	private int redBallNum14Type;

	private int redBallNum15Type;

	private int redBallNum16Type;

	private int redBallNum17Type;

	private int redBallNum18Type;

	private int redBallNum19Type;

	private int redBallNum20Type;

	private int redBallNum21Type;

	private int redBallNum22Type;

	private int redBallNum23Type;

	private int redBallNum24Type;

	private int redBallNum25Type;

	private int redBallNum26Type;

	private int redBallNum27Type;

	private int redBallNum28Type;

	private int redBallNum29Type;

	private int redBallNum30Type;

	private int redBallNum31Type;
	
	private int redBallNum32Type;
	
	private int redBallNum33Type;


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

	public int getRedBallNum1Type() {
		return redBallNum1Type;
	}

	public void setRedBallNum1Type(int redBallNum1Type) {
		this.redBallNum1Type = redBallNum1Type;
	}

	public int getRedBallNum2Type() {
		return redBallNum2Type;
	}

	public void setRedBallNum2Type(int redBallNum2Type) {
		this.redBallNum2Type = redBallNum2Type;
	}

	public int getRedBallNum3Type() {
		return redBallNum3Type;
	}

	public void setRedBallNum3Type(int redBallNum3Type) {
		this.redBallNum3Type = redBallNum3Type;
	}

	public int getRedBallNum4Type() {
		return redBallNum4Type;
	}

	public void setRedBallNum4Type(int redBallNum4Type) {
		this.redBallNum4Type = redBallNum4Type;
	}

	public int getRedBallNum5Type() {
		return redBallNum5Type;
	}

	public void setRedBallNum5Type(int redBallNum5Type) {
		this.redBallNum5Type = redBallNum5Type;
	}

	public int getRedBallNum6Type() {
		return redBallNum6Type;
	}

	public void setRedBallNum6Type(int redBallNum6Type) {
		this.redBallNum6Type = redBallNum6Type;
	}

	public int getRedBallNum7Type() {
		return redBallNum7Type;
	}

	public void setRedBallNum7Type(int redBallNum7Type) {
		this.redBallNum7Type = redBallNum7Type;
	}

	public int getRedBallNum8Type() {
		return redBallNum8Type;
	}

	public void setRedBallNum8Type(int redBallNum8Type) {
		this.redBallNum8Type = redBallNum8Type;
	}

	public int getRedBallNum9Type() {
		return redBallNum9Type;
	}

	public void setRedBallNum9Type(int redBallNum9Type) {
		this.redBallNum9Type = redBallNum9Type;
	}

	public int getRedBallNum10Type() {
		return redBallNum10Type;
	}

	public void setRedBallNum10Type(int redBallNum10Type) {
		this.redBallNum10Type = redBallNum10Type;
	}

	public int getRedBallNum11Type() {
		return redBallNum11Type;
	}

	public void setRedBallNum11Type(int redBallNum11Type) {
		this.redBallNum11Type = redBallNum11Type;
	}

	public int getRedBallNum12Type() {
		return redBallNum12Type;
	}

	public void setRedBallNum12Type(int redBallNum12Type) {
		this.redBallNum12Type = redBallNum12Type;
	}

	public int getRedBallNum13Type() {
		return redBallNum13Type;
	}

	public void setRedBallNum13Type(int redBallNum13Type) {
		this.redBallNum13Type = redBallNum13Type;
	}

	public int getRedBallNum14Type() {
		return redBallNum14Type;
	}

	public void setRedBallNum14Type(int redBallNum14Type) {
		this.redBallNum14Type = redBallNum14Type;
	}

	public int getRedBallNum15Type() {
		return redBallNum15Type;
	}

	public void setRedBallNum15Type(int redBallNum15Type) {
		this.redBallNum15Type = redBallNum15Type;
	}

	public int getRedBallNum16Type() {
		return redBallNum16Type;
	}

	public void setRedBallNum16Type(int redBallNum16Type) {
		this.redBallNum16Type = redBallNum16Type;
	}

	public int getRedBallNum17Type() {
		return redBallNum17Type;
	}

	public void setRedBallNum17Type(int redBallNum17Type) {
		this.redBallNum17Type = redBallNum17Type;
	}

	public int getRedBallNum18Type() {
		return redBallNum18Type;
	}

	public void setRedBallNum18Type(int redBallNum18Type) {
		this.redBallNum18Type = redBallNum18Type;
	}

	public int getRedBallNum19Type() {
		return redBallNum19Type;
	}

	public void setRedBallNum19Type(int redBallNum19Type) {
		this.redBallNum19Type = redBallNum19Type;
	}

	public int getRedBallNum20Type() {
		return redBallNum20Type;
	}

	public void setRedBallNum20Type(int redBallNum20Type) {
		this.redBallNum20Type = redBallNum20Type;
	}

	public int getRedBallNum21Type() {
		return redBallNum21Type;
	}

	public void setRedBallNum21Type(int redBallNum21Type) {
		this.redBallNum21Type = redBallNum21Type;
	}

	public int getRedBallNum22Type() {
		return redBallNum22Type;
	}

	public void setRedBallNum22Type(int redBallNum22Type) {
		this.redBallNum22Type = redBallNum22Type;
	}

	public int getRedBallNum23Type() {
		return redBallNum23Type;
	}

	public void setRedBallNum23Type(int redBallNum23Type) {
		this.redBallNum23Type = redBallNum23Type;
	}

	public int getRedBallNum24Type() {
		return redBallNum24Type;
	}

	public void setRedBallNum24Type(int redBallNum24Type) {
		this.redBallNum24Type = redBallNum24Type;
	}

	public int getRedBallNum25Type() {
		return redBallNum25Type;
	}

	public void setRedBallNum25Type(int redBallNum25Type) {
		this.redBallNum25Type = redBallNum25Type;
	}

	public int getRedBallNum26Type() {
		return redBallNum26Type;
	}

	public void setRedBallNum26Type(int redBallNum26Type) {
		this.redBallNum26Type = redBallNum26Type;
	}

	public int getRedBallNum27Type() {
		return redBallNum27Type;
	}

	public void setRedBallNum27Type(int redBallNum27Type) {
		this.redBallNum27Type = redBallNum27Type;
	}

	public int getRedBallNum28Type() {
		return redBallNum28Type;
	}

	public void setRedBallNum28Type(int redBallNum28Type) {
		this.redBallNum28Type = redBallNum28Type;
	}

	public int getRedBallNum29Type() {
		return redBallNum29Type;
	}

	public void setRedBallNum29Type(int redBallNum29Type) {
		this.redBallNum29Type = redBallNum29Type;
	}

	public int getRedBallNum30Type() {
		return redBallNum30Type;
	}

	public void setRedBallNum30Type(int redBallNum30Type) {
		this.redBallNum30Type = redBallNum30Type;
	}

	public int getRedBallNum31Type() {
		return redBallNum31Type;
	}

	public void setRedBallNum31Type(int redBallNum31Type) {
		this.redBallNum31Type = redBallNum31Type;
	}

	public int getRedBallNum32Type() {
		return redBallNum32Type;
	}

	public void setRedBallNum32Type(int redBallNum32Type) {
		this.redBallNum32Type = redBallNum32Type;
	}

	public int getRedBallNum33Type() {
		return redBallNum33Type;
	}

	public void setRedBallNum33Type(int redBallNum33Type) {
		this.redBallNum33Type = redBallNum33Type;
	}
}
