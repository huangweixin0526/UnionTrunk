package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.Date;

import com.android.weixin.lotteryticket.storage.DBaseDao;
import com.android.weixin.lotteryticket.utils.NumberUtil;
import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

import android.util.SparseIntArray;

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

	private SparseIntArray redBallNum1Type;

	private SparseIntArray redBallNum2Type;

	private SparseIntArray redBallNum3Type;

	private SparseIntArray redBallNum4Type;

	private SparseIntArray redBallNum5Type;

	private SparseIntArray redBallNum6Type;

	private SparseIntArray redBallNum7Type;

	private SparseIntArray redBallNum8Type;

	private SparseIntArray redBallNum9Type;

	private SparseIntArray redBallNum10Type;

	private SparseIntArray redBallNum11Type;

	private SparseIntArray redBallNum12Type;

	private SparseIntArray redBallNum13Type;

	private SparseIntArray redBallNum14Type;

	private SparseIntArray redBallNum15Type;

	private SparseIntArray redBallNum16Type;

	private SparseIntArray redBallNum17Type;

	private SparseIntArray redBallNum18Type;

	private SparseIntArray redBallNum19Type;

	private SparseIntArray redBallNum20Type;

	private SparseIntArray redBallNum21Type;

	private SparseIntArray redBallNum22Type;

	private SparseIntArray redBallNum23Type;

	private SparseIntArray redBallNum24Type;

	private SparseIntArray redBallNum25Type;

	private SparseIntArray redBallNum26Type;

	private SparseIntArray redBallNum27Type;

	private SparseIntArray redBallNum28Type;

	private SparseIntArray redBallNum29Type;

	private SparseIntArray redBallNum30Type;

	private SparseIntArray redBallNum31Type;

	private SparseIntArray redBallNum32Type;

	private SparseIntArray redBallNum33Type;

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

	public SparseIntArray getRedBallNum1Type() {
		return redBallNum1Type;
	}

	public boolean isRedBallNum1Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum1Type, types);
	}

	public void setRedBallNum1Type(int redBallNum1Type) {
		if (this.redBallNum1Type == null) {
			this.redBallNum1Type = new SparseIntArray();
		}
		this.redBallNum1Type.put(redBallNum1Type, redBallNum1Type);
	}

	public SparseIntArray getRedBallNum2Type() {
		return redBallNum2Type;
	}

	public boolean isRedBallNum2Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum2Type, types);
	}

	public void setRedBallNum2Type(int redBallNum2Type) {
		if (this.redBallNum2Type == null) {
			this.redBallNum2Type = new SparseIntArray();
		}
		this.redBallNum2Type.put(redBallNum2Type, redBallNum2Type);
	}

	public SparseIntArray getRedBallNum3Type() {
		return redBallNum3Type;
	}

	public boolean isRedBallNum3Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum3Type, types);
	}

	public void setRedBallNum3Type(int redBallNum3Type) {
		if (this.redBallNum3Type == null) {
			this.redBallNum3Type = new SparseIntArray();
		}
		this.redBallNum3Type.put(redBallNum3Type, redBallNum3Type);
	}

	public SparseIntArray getRedBallNum4Type() {
		return redBallNum4Type;
	}

	public boolean isRedBallNum4Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum4Type, types);
	}

	public void setRedBallNum4Type(int redBallNum4Type) {
		if (this.redBallNum4Type == null) {
			this.redBallNum4Type = new SparseIntArray();
		}
		this.redBallNum4Type.put(redBallNum4Type, redBallNum4Type);
	}

	public SparseIntArray getRedBallNum5Type() {
		return redBallNum5Type;
	}

	public boolean isRedBallNum5Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum5Type, types);
	}

	public void setRedBallNum5Type(int redBallNum5Type) {
		if (this.redBallNum5Type == null) {
			this.redBallNum5Type = new SparseIntArray();
		}
		this.redBallNum5Type.put(redBallNum5Type, redBallNum5Type);
	}

	public SparseIntArray getRedBallNum6Type() {
		return redBallNum6Type;
	}

	public boolean isRedBallNum6Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum6Type, types);
	}

	public void setRedBallNum6Type(int redBallNum6Type) {
		if (this.redBallNum6Type == null) {
			this.redBallNum6Type = new SparseIntArray();
		}
		this.redBallNum6Type.put(redBallNum6Type, redBallNum6Type);
	}

	public SparseIntArray getRedBallNum7Type() {
		return redBallNum7Type;
	}

	public boolean isRedBallNum7Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum7Type, types);
	}

	public void setRedBallNum7Type(int redBallNum7Type) {
		if (this.redBallNum7Type == null) {
			this.redBallNum7Type = new SparseIntArray();
		}
		this.redBallNum7Type.put(redBallNum7Type, redBallNum7Type);
	}

	public SparseIntArray getRedBallNum8Type() {
		return redBallNum8Type;
	}

	public boolean isRedBallNum8Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum8Type, types);
	}

	public void setRedBallNum8Type(int redBallNum8Type) {
		if (this.redBallNum8Type == null) {
			this.redBallNum8Type = new SparseIntArray();
		}
		this.redBallNum8Type.put(redBallNum8Type, redBallNum8Type);
	}

	public SparseIntArray getRedBallNum9Type() {
		return redBallNum9Type;
	}

	public boolean isRedBallNum9Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum9Type, types);
	}

	public void setRedBallNum9Type(int redBallNum9Type) {
		if (this.redBallNum9Type == null) {
			this.redBallNum9Type = new SparseIntArray();
		}
		this.redBallNum9Type.put(redBallNum9Type, redBallNum9Type);
	}

	public SparseIntArray getRedBallNum10Type() {
		return redBallNum10Type;
	}

	public boolean isRedBallNum10Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum10Type, types);
	}

	public void setRedBallNum10Type(int redBallNum10Type) {
		if (this.redBallNum10Type == null) {
			this.redBallNum10Type = new SparseIntArray();
		}
		this.redBallNum10Type.put(redBallNum10Type, redBallNum10Type);
	}

	public SparseIntArray getRedBallNum11Type() {
		return redBallNum11Type;
	}

	public boolean isRedBallNum11Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum11Type, types);
	}

	public void setRedBallNum11Type(int redBallNum11Type) {
		if (this.redBallNum11Type == null) {
			this.redBallNum11Type = new SparseIntArray();
		}
		this.redBallNum11Type.put(redBallNum11Type, redBallNum11Type);
	}

	public SparseIntArray getRedBallNum12Type() {
		return redBallNum12Type;
	}

	public boolean isRedBallNum12Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum12Type, types);
	}

	public void setRedBallNum12Type(int redBallNum12Type) {
		if (this.redBallNum12Type == null) {
			this.redBallNum12Type = new SparseIntArray();
		}
		this.redBallNum12Type.put(redBallNum12Type, redBallNum12Type);
	}

	public SparseIntArray getRedBallNum13Type() {
		return redBallNum13Type;
	}

	public boolean isRedBallNum13Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum13Type, types);
	}

	public void setRedBallNum13Type(int redBallNum13Type) {
		if (this.redBallNum13Type == null) {
			this.redBallNum13Type = new SparseIntArray();
		}
		this.redBallNum13Type.put(redBallNum13Type, redBallNum13Type);
	}

	public SparseIntArray getRedBallNum14Type() {
		return redBallNum14Type;
	}

	public boolean isRedBallNum14Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum14Type, types);
	}

	public void setRedBallNum14Type(int redBallNum14Type) {
		if (this.redBallNum14Type == null) {
			this.redBallNum14Type = new SparseIntArray();
		}
		this.redBallNum14Type.put(redBallNum14Type, redBallNum14Type);
	}

	public SparseIntArray getRedBallNum15Type() {
		return redBallNum15Type;
	}

	public boolean isRedBallNum15Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum15Type, types);
	}

	public void setRedBallNum15Type(int redBallNum15Type) {
		if (this.redBallNum15Type == null) {
			this.redBallNum15Type = new SparseIntArray();
		}
		this.redBallNum15Type.put(redBallNum15Type, redBallNum15Type);
	}

	public SparseIntArray getRedBallNum16Type() {
		return redBallNum16Type;
	}

	public boolean isRedBallNum16Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum16Type, types);
	}

	public void setRedBallNum16Type(int redBallNum16Type) {
		if (this.redBallNum16Type == null) {
			this.redBallNum16Type = new SparseIntArray();
		}
		this.redBallNum16Type.put(redBallNum16Type, redBallNum16Type);
	}

	public SparseIntArray getRedBallNum17Type() {
		return redBallNum17Type;
	}

	public boolean isRedBallNum17Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum17Type, types);
	}

	public void setRedBallNum17Type(int redBallNum17Type) {
		if (this.redBallNum17Type == null) {
			this.redBallNum17Type = new SparseIntArray();
		}
		this.redBallNum17Type.put(redBallNum17Type, redBallNum17Type);
	}

	public SparseIntArray getRedBallNum18Type() {
		return redBallNum18Type;
	}

	public boolean isRedBallNum18Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum18Type, types);
	}

	public void setRedBallNum18Type(int redBallNum18Type) {
		if (this.redBallNum18Type == null) {
			this.redBallNum18Type = new SparseIntArray();
		}
		this.redBallNum18Type.put(redBallNum18Type, redBallNum18Type);
	}

	public SparseIntArray getRedBallNum19Type() {
		return redBallNum19Type;
	}

	public boolean isRedBallNum19Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum19Type, types);
	}

	public void setRedBallNum19Type(int redBallNum19Type) {
		if (this.redBallNum19Type == null) {
			this.redBallNum19Type = new SparseIntArray();
		}
		this.redBallNum19Type.put(redBallNum19Type, redBallNum19Type);
	}

	public SparseIntArray getRedBallNum20Type() {
		return redBallNum20Type;
	}

	public boolean isRedBallNum20Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum20Type, types);
	}

	public void setRedBallNum20Type(int redBallNum20Type) {
		if (this.redBallNum20Type == null) {
			this.redBallNum20Type = new SparseIntArray();
		}
		this.redBallNum20Type.put(redBallNum20Type, redBallNum20Type);
	}

	public SparseIntArray getRedBallNum21Type() {
		return redBallNum21Type;
	}

	public boolean isRedBallNum21Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum21Type, types);
	}

	public void setRedBallNum21Type(int redBallNum21Type) {
		if (this.redBallNum21Type == null) {
			this.redBallNum21Type = new SparseIntArray();
		}
		this.redBallNum21Type.put(redBallNum21Type, redBallNum21Type);
	}

	public SparseIntArray getRedBallNum22Type() {
		return redBallNum22Type;
	}

	public boolean isRedBallNum22Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum22Type, types);
	}

	public void setRedBallNum22Type(int redBallNum22Type) {
		if (this.redBallNum22Type == null) {
			this.redBallNum22Type = new SparseIntArray();
		}
		this.redBallNum22Type.put(redBallNum22Type, redBallNum22Type);
	}

	public SparseIntArray getRedBallNum23Type() {
		return redBallNum23Type;
	}

	public boolean isRedBallNum23Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum23Type, types);
	}

	public void setRedBallNum23Type(int redBallNum23Type) {
		if (this.redBallNum23Type == null) {
			this.redBallNum23Type = new SparseIntArray();
		}
		this.redBallNum23Type.put(redBallNum23Type, redBallNum23Type);
	}

	public SparseIntArray getRedBallNum24Type() {
		return redBallNum24Type;
	}

	public boolean isRedBallNum24Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum24Type, types);
	}

	public void setRedBallNum24Type(int redBallNum24Type) {
		if (this.redBallNum24Type == null) {
			this.redBallNum24Type = new SparseIntArray();
		}
		this.redBallNum24Type.put(redBallNum24Type, redBallNum24Type);
	}

	public SparseIntArray getRedBallNum25Type() {
		return redBallNum25Type;
	}

	public boolean isRedBallNum25Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum25Type, types);
	}

	public void setRedBallNum25Type(int redBallNum25Type) {
		if (this.redBallNum25Type == null) {
			this.redBallNum25Type = new SparseIntArray();
		}
		this.redBallNum25Type.put(redBallNum25Type, redBallNum25Type);
	}

	public SparseIntArray getRedBallNum26Type() {
		return redBallNum26Type;
	}

	public boolean isRedBallNum26Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum26Type, types);
	}

	public void setRedBallNum26Type(int redBallNum26Type) {
		if (this.redBallNum26Type == null) {
			this.redBallNum26Type = new SparseIntArray();
		}
		this.redBallNum26Type.put(redBallNum26Type, redBallNum26Type);
	}

	public SparseIntArray getRedBallNum27Type() {
		return redBallNum27Type;
	}

	public boolean isRedBallNum27Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum27Type, types);
	}

	public void setRedBallNum27Type(int redBallNum27Type) {
		if (this.redBallNum27Type == null) {
			this.redBallNum27Type = new SparseIntArray();
		}
		this.redBallNum27Type.put(redBallNum27Type, redBallNum27Type);
	}

	public SparseIntArray getRedBallNum28Type() {
		return redBallNum28Type;
	}

	public boolean isRedBallNum28Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum28Type, types);
	}

	public void setRedBallNum28Type(int redBallNum28Type) {
		if (this.redBallNum28Type == null) {
			this.redBallNum28Type = new SparseIntArray();
		}
		this.redBallNum28Type.put(redBallNum28Type, redBallNum28Type);
	}

	public SparseIntArray getRedBallNum29Type() {
		return redBallNum29Type;
	}

	public boolean isRedBallNum29Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum29Type, types);
	}

	public void setRedBallNum29Type(int redBallNum29Type) {
		if (this.redBallNum29Type == null) {
			this.redBallNum29Type = new SparseIntArray();
		}
		this.redBallNum29Type.put(redBallNum29Type, redBallNum29Type);
	}

	public SparseIntArray getRedBallNum30Type() {
		return redBallNum30Type;
	}

	public boolean isRedBallNum30Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum30Type, types);
	}

	public void setRedBallNum30Type(int redBallNum30Type) {
		if (this.redBallNum30Type == null) {
			this.redBallNum30Type = new SparseIntArray();
		}
		this.redBallNum30Type.put(redBallNum30Type, redBallNum30Type);
	}

	public SparseIntArray getRedBallNum31Type() {
		return redBallNum31Type;
	}

	public boolean isRedBallNum31Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum31Type, types);
	}

	public void setRedBallNum31Type(int redBallNum31Type) {
		if (this.redBallNum31Type == null) {
			this.redBallNum31Type = new SparseIntArray();
		}
		this.redBallNum31Type.put(redBallNum31Type, redBallNum31Type);
	}

	public SparseIntArray getRedBallNum32Type() {
		return redBallNum32Type;
	}

	public boolean isRedBallNum32Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum32Type, types);
	}

	public void setRedBallNum32Type(int redBallNum32Type) {
		if (this.redBallNum32Type == null) {
			this.redBallNum32Type = new SparseIntArray();
		}
		this.redBallNum32Type.put(redBallNum32Type, redBallNum32Type);
	}

	public SparseIntArray getRedBallNum33Type() {
		return redBallNum33Type;
	}

	public boolean isRedBallNum33Type(Integer... types) {
		return NumberUtil.isAndBallNumType(redBallNum33Type, types);
	}

	public void setRedBallNum33Type(int redBallNum33Type) {
		if (this.redBallNum33Type == null) {
			this.redBallNum33Type = new SparseIntArray();
		}
		this.redBallNum33Type.put(redBallNum33Type, redBallNum33Type);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(periodNum + " ");
		// sb.append(lotteryDate + " ");
		sb.append(calculateType + "   ");
		if (redBallNum1 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum1, redBallNum1Type));
		}
		if (redBallNum2 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum2, redBallNum2Type));
		}
		if (redBallNum3 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum3, redBallNum3Type));
		}
		if (redBallNum4 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum4, redBallNum4Type));
		}
		if (redBallNum5 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum5, redBallNum5Type));
		}
		if (redBallNum6 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum6, redBallNum6Type));
		}
		if (redBallNum7 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum7, redBallNum7Type));
		}
		if (redBallNum8 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum8, redBallNum8Type));
		}
		if (redBallNum9 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum9, redBallNum9Type));
		}
		if (redBallNum10 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum10, redBallNum10Type));
		}
		if (redBallNum11 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum11, redBallNum11Type));
		}
		if (redBallNum12 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum12, redBallNum12Type));
		}
		if (redBallNum13 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum13, redBallNum13Type));
		}
		if (redBallNum14 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum14, redBallNum14Type));
		}
		if (redBallNum15 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum15, redBallNum15Type));
		}
		if (redBallNum16 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum16, redBallNum16Type));
		}
		if (redBallNum17 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum17, redBallNum17Type));
		}
		if (redBallNum18 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum18, redBallNum18Type));
		}
		if (redBallNum19 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum19, redBallNum19Type));
		}
		if (redBallNum20 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum20, redBallNum20Type));
		}
		if (redBallNum21 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum21, redBallNum21Type));
		}
		if (redBallNum22 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum22, redBallNum22Type));
		}
		if (redBallNum23 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum23, redBallNum23Type));
		}
		if (redBallNum24 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum24, redBallNum24Type));
		}
		if (redBallNum25 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum25, redBallNum25Type));
		}
		if (redBallNum26 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum26, redBallNum26Type));
		}
		if (redBallNum27 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum27, redBallNum27Type));
		}
		if (redBallNum28 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum28, redBallNum28Type));
		}
		if (redBallNum29 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum29, redBallNum29Type));
		}
		if (redBallNum30 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum30, redBallNum30Type));
		}
		if (redBallNum31 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum31, redBallNum31Type));
		}
		if (redBallNum32 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum32, redBallNum32Type));
		}
		if (redBallNum33 > 0) {
			sb.append(String.format("%1$s(%2$s) ", redBallNum33, redBallNum33Type));
		}
		return sb.toString();
	}
}
