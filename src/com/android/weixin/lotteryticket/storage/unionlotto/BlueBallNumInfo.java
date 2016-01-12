package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.Date;

import com.android.weixin.lotteryticket.storage.DBaseDao;
import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

@Table(name = "union_blue_ball_num")
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
	@Column(column = "calculate_type")
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

	private int blueBallNum1Type;
	private int blueBallNum2Type;
	private int blueBallNum3Type;
	private int blueBallNum4Type;
	private int blueBallNum5Type;
	private int blueBallNum6Type;
	private int blueBallNum7Type;
	private int blueBallNum8Type;
	private int blueBallNum9Type;
	private int blueBallNum10Type;
	private int blueBallNum11Type;
	private int blueBallNum12Type;
	private int blueBallNum13Type;
	private int blueBallNum14Type;
	private int blueBallNum15Type;
	private int blueBallNum16Type;

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

	public int getBlueBallNum1Type() {
		return blueBallNum1Type;
	}

	public void setBlueBallNum1Type(int blueBallNum1Type) {
		this.blueBallNum1Type = blueBallNum1Type;
	}

	public int getBlueBallNum2Type() {
		return blueBallNum2Type;
	}

	public void setBlueBallNum2Type(int blueBallNum2Type) {
		this.blueBallNum2Type = blueBallNum2Type;
	}

	public int getBlueBallNum3Type() {
		return blueBallNum3Type;
	}

	public void setBlueBallNum3Type(int blueBallNum3Type) {
		this.blueBallNum3Type = blueBallNum3Type;
	}

	public int getBlueBallNum4Type() {
		return blueBallNum4Type;
	}

	public void setBlueBallNum4Type(int blueBallNum4Type) {
		this.blueBallNum4Type = blueBallNum4Type;
	}

	public int getBlueBallNum5Type() {
		return blueBallNum5Type;
	}

	public void setBlueBallNum5Type(int blueBallNum5Type) {
		this.blueBallNum5Type = blueBallNum5Type;
	}

	public int getBlueBallNum6Type() {
		return blueBallNum6Type;
	}

	public void setBlueBallNum6Type(int blueBallNum6Type) {
		this.blueBallNum6Type = blueBallNum6Type;
	}

	public int getBlueBallNum7Type() {
		return blueBallNum7Type;
	}

	public void setBlueBallNum7Type(int blueBallNum7Type) {
		this.blueBallNum7Type = blueBallNum7Type;
	}

	public int getBlueBallNum8Type() {
		return blueBallNum8Type;
	}

	public void setBlueBallNum8Type(int blueBallNum8Type) {
		this.blueBallNum8Type = blueBallNum8Type;
	}

	public int getBlueBallNum9Type() {
		return blueBallNum9Type;
	}

	public void setBlueBallNum9Type(int blueBallNum9Type) {
		this.blueBallNum9Type = blueBallNum9Type;
	}

	public int getBlueBallNum10Type() {
		return blueBallNum10Type;
	}

	public void setBlueBallNum10Type(int blueBallNum10Type) {
		this.blueBallNum10Type = blueBallNum10Type;
	}

	public int getBlueBallNum11Type() {
		return blueBallNum11Type;
	}

	public void setBlueBallNum11Type(int blueBallNum11Type) {
		this.blueBallNum11Type = blueBallNum11Type;
	}

	public int getBlueBallNum12Type() {
		return blueBallNum12Type;
	}

	public void setBlueBallNum12Type(int blueBallNum12Type) {
		this.blueBallNum12Type = blueBallNum12Type;
	}

	public int getBlueBallNum13Type() {
		return blueBallNum13Type;
	}

	public void setBlueBallNum13Type(int blueBallNum13Type) {
		this.blueBallNum13Type = blueBallNum13Type;
	}

	public int getBlueBallNum14Type() {
		return blueBallNum14Type;
	}

	public void setBlueBallNum14Type(int blueBallNum14Type) {
		this.blueBallNum14Type = blueBallNum14Type;
	}

	public int getBlueBallNum15Type() {
		return blueBallNum15Type;
	}

	public void setBlueBallNum15Type(int blueBallNum15Type) {
		this.blueBallNum15Type = blueBallNum15Type;
	}

	public int getBlueBallNum16Type() {
		return blueBallNum16Type;
	}

	public void setBlueBallNum16Type(int blueBallNum16Type) {
		this.blueBallNum16Type = blueBallNum16Type;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(periodNum + " ");
		// sb.append(lotteryDate + " ");
		sb.append(calculateType + "   ");
		if (blueBallNum1 > 0) {
			sb.append(blueBallNum1 + " ");
		}
		if (blueBallNum2 > 0) {
			sb.append(blueBallNum2 + " ");
		}
		if (blueBallNum3 > 0) {
			sb.append(blueBallNum3 + " ");
		}
		if (blueBallNum4 > 0) {
			sb.append(blueBallNum4 + " ");
		}
		if (blueBallNum5 > 0) {
			sb.append(blueBallNum5 + " ");
		}
		if (blueBallNum6 > 0) {
			sb.append(blueBallNum6 + " ");
		}
		if (blueBallNum7 > 0) {
			sb.append(blueBallNum7 + " ");
		}
		if (blueBallNum8 > 0) {
			sb.append(blueBallNum8 + " ");
		}
		if (blueBallNum9 > 0) {
			sb.append(blueBallNum9 + " ");
		}
		if (blueBallNum10 > 0) {
			sb.append(blueBallNum10 + " ");
		}
		if (blueBallNum11 > 0) {
			sb.append(blueBallNum11 + " ");
		}
		if (blueBallNum12 > 0) {
			sb.append(blueBallNum12 + " ");
		}
		if (blueBallNum13 > 0) {
			sb.append(blueBallNum13 + " ");
		}
		if (blueBallNum14 > 0) {
			sb.append(blueBallNum14 + " ");
		}
		if (blueBallNum15 > 0) {
			sb.append(blueBallNum15 + " ");
		}
		if (blueBallNum16 > 0) {
			sb.append(blueBallNum16 + " ");
		}
		return sb.toString();
	}
}
