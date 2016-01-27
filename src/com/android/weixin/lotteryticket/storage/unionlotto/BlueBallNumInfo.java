package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.Date;

import com.android.weixin.lotteryticket.storage.DBaseDao;
import com.android.weixin.lotteryticket.utils.NumberUtil;
import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

import android.util.SparseIntArray;

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

	private SparseIntArray blueBallNum1Type;
	private SparseIntArray blueBallNum2Type;
	private SparseIntArray blueBallNum3Type;
	private SparseIntArray blueBallNum4Type;
	private SparseIntArray blueBallNum5Type;
	private SparseIntArray blueBallNum6Type;
	private SparseIntArray blueBallNum7Type;
	private SparseIntArray blueBallNum8Type;
	private SparseIntArray blueBallNum9Type;
	private SparseIntArray blueBallNum10Type;
	private SparseIntArray blueBallNum11Type;
	private SparseIntArray blueBallNum12Type;
	private SparseIntArray blueBallNum13Type;
	private SparseIntArray blueBallNum14Type;
	private SparseIntArray blueBallNum15Type;
	private SparseIntArray blueBallNum16Type;

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

	public SparseIntArray getBlueBallNum1Type() {
		return blueBallNum1Type;
	}

	public boolean isBlueBallNum1Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum1Type, types);
	}

	public void setBlueBallNum1Type(int blueBallNum1Type) {
		if (this.blueBallNum1Type == null) {
			this.blueBallNum1Type = new SparseIntArray();
		}
		this.blueBallNum1Type.put(blueBallNum1Type, blueBallNum1Type);
	}

	public SparseIntArray getBlueBallNum2Type() {
		return blueBallNum2Type;
	}

	public boolean isBlueBallNum2Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum2Type, types);
	}

	public void setBlueBallNum2Type(int blueBallNum2Type) {
		if (this.blueBallNum2Type == null) {
			this.blueBallNum2Type = new SparseIntArray();
		}
		this.blueBallNum2Type.put(blueBallNum2Type, blueBallNum2Type);
	}

	public SparseIntArray getBlueBallNum3Type() {
		return blueBallNum3Type;
	}

	public boolean isBlueBallNum3Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum3Type, types);
	}

	public void setBlueBallNum3Type(int blueBallNum3Type) {
		if (this.blueBallNum3Type == null) {
			this.blueBallNum3Type = new SparseIntArray();
		}
		this.blueBallNum3Type.put(blueBallNum3Type, blueBallNum3Type);
	}

	public SparseIntArray getBlueBallNum4Type() {
		return blueBallNum4Type;
	}

	public boolean isBlueBallNum4Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum4Type, types);
	}

	public void setBlueBallNum4Type(int blueBallNum4Type) {
		if (this.blueBallNum4Type == null) {
			this.blueBallNum4Type = new SparseIntArray();
		}
		this.blueBallNum4Type.put(blueBallNum4Type, blueBallNum4Type);
	}

	public SparseIntArray getBlueBallNum5Type() {
		return blueBallNum5Type;
	}

	public boolean isBlueBallNum5Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum5Type, types);
	}

	public void setBlueBallNum5Type(int blueBallNum5Type) {
		if (this.blueBallNum5Type == null) {
			this.blueBallNum5Type = new SparseIntArray();
		}
		this.blueBallNum5Type.put(blueBallNum5Type, blueBallNum5Type);
	}

	public SparseIntArray getBlueBallNum6Type() {
		return blueBallNum6Type;
	}

	public boolean isBlueBallNum6Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum6Type, types);
	}

	public void setBlueBallNum6Type(int blueBallNum6Type) {
		if (this.blueBallNum6Type == null) {
			this.blueBallNum6Type = new SparseIntArray();
		}
		this.blueBallNum6Type.put(blueBallNum6Type, blueBallNum6Type);
	}

	public SparseIntArray getBlueBallNum7Type() {
		return blueBallNum7Type;
	}

	public boolean isBlueBallNum7Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum7Type, types);
	}

	public void setBlueBallNum7Type(int blueBallNum7Type) {
		if (this.blueBallNum7Type == null) {
			this.blueBallNum7Type = new SparseIntArray();
		}
		this.blueBallNum7Type.put(blueBallNum7Type, blueBallNum7Type);
	}

	public SparseIntArray getBlueBallNum8Type() {
		return blueBallNum8Type;
	}

	public boolean isBlueBallNum8Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum8Type, types);
	}

	public void setBlueBallNum8Type(int blueBallNum8Type) {
		if (this.blueBallNum8Type == null) {
			this.blueBallNum8Type = new SparseIntArray();
		}
		this.blueBallNum8Type.put(blueBallNum8Type, blueBallNum8Type);
	}

	public SparseIntArray getBlueBallNum9Type() {
		return blueBallNum9Type;
	}

	public boolean isBlueBallNum9Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum9Type, types);
	}

	public void setBlueBallNum9Type(int blueBallNum9Type) {
		if (this.blueBallNum9Type == null) {
			this.blueBallNum9Type = new SparseIntArray();
		}
		this.blueBallNum9Type.put(blueBallNum9Type, blueBallNum9Type);
	}

	public SparseIntArray getBlueBallNum10Type() {
		return blueBallNum10Type;
	}

	public boolean isBlueBallNum10Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum10Type, types);
	}

	public void setBlueBallNum10Type(int blueBallNum10Type) {
		if (this.blueBallNum10Type == null) {
			this.blueBallNum10Type = new SparseIntArray();
		}
		this.blueBallNum10Type.put(blueBallNum10Type, blueBallNum10Type);
	}

	public SparseIntArray getBlueBallNum11Type() {
		return blueBallNum11Type;
	}

	public boolean isBlueBallNum11Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum11Type, types);
	}

	public void setBlueBallNum11Type(int blueBallNum11Type) {
		if (this.blueBallNum11Type == null) {
			this.blueBallNum11Type = new SparseIntArray();
		}
		this.blueBallNum11Type.put(blueBallNum11Type, blueBallNum11Type);
	}

	public SparseIntArray getBlueBallNum12Type() {
		return blueBallNum12Type;
	}

	public boolean isBlueBallNum12Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum12Type, types);
	}

	public void setBlueBallNum12Type(int blueBallNum12Type) {
		if (this.blueBallNum12Type == null) {
			this.blueBallNum12Type = new SparseIntArray();
		}
		this.blueBallNum12Type.put(blueBallNum12Type, blueBallNum12Type);
	}

	public SparseIntArray getBlueBallNum13Type() {
		return blueBallNum13Type;
	}

	public boolean isBlueBallNum13Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum13Type, types);
	}

	public void setBlueBallNum13Type(int blueBallNum13Type) {
		if (this.blueBallNum13Type == null) {
			this.blueBallNum13Type = new SparseIntArray();
		}
		this.blueBallNum13Type.put(blueBallNum13Type, blueBallNum13Type);
	}

	public SparseIntArray getBlueBallNum14Type() {
		return blueBallNum14Type;
	}

	public boolean isBlueBallNum14Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum14Type, types);
	}

	public void setBlueBallNum14Type(int blueBallNum14Type) {
		if (this.blueBallNum14Type == null) {
			this.blueBallNum14Type = new SparseIntArray();
		}
		this.blueBallNum14Type.put(blueBallNum14Type, blueBallNum14Type);
	}

	public SparseIntArray getBlueBallNum15Type() {
		return blueBallNum15Type;
	}

	public boolean isBlueBallNum15Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum15Type, types);
	}

	public void setBlueBallNum15Type(int blueBallNum15Type) {
		if (this.blueBallNum15Type == null) {
			this.blueBallNum15Type = new SparseIntArray();
		}
		this.blueBallNum15Type.put(blueBallNum15Type, blueBallNum15Type);
	}

	public SparseIntArray getBlueBallNum16Type() {
		return blueBallNum16Type;
	}

	public boolean isBlueBallNum16Type(Integer... types) {
		return NumberUtil.isBallNumType(blueBallNum16Type, types);
	}

	public void setBlueBallNum16Type(int blueBallNum16Type) {
		if (this.blueBallNum16Type == null) {
			this.blueBallNum16Type = new SparseIntArray();
		}
		this.blueBallNum16Type.put(blueBallNum16Type, blueBallNum16Type);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(periodNum + " ");
		// sb.append(lotteryDate + " ");
		sb.append(calculateType + "   ");
		if (blueBallNum1 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum1, blueBallNum1Type));
		}
		if (blueBallNum2 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum2, blueBallNum2Type));
		}
		if (blueBallNum3 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum3, blueBallNum3Type));
		}
		if (blueBallNum4 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum4, blueBallNum4Type));
		}
		if (blueBallNum5 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum5, blueBallNum5Type));
		}
		if (blueBallNum6 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum6, blueBallNum6Type));
		}
		if (blueBallNum7 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum7, blueBallNum7Type));
		}
		if (blueBallNum8 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum8, blueBallNum8Type));
		}
		if (blueBallNum9 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum9, blueBallNum9Type));
		}
		if (blueBallNum10 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum10, blueBallNum10Type));
		}
		if (blueBallNum11 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum11, blueBallNum11Type));
		}
		if (blueBallNum12 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum12, blueBallNum12Type));
		}
		if (blueBallNum13 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum13, blueBallNum13Type));
		}
		if (blueBallNum14 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum14, blueBallNum14Type));
		}
		if (blueBallNum15 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum15, blueBallNum15Type));
		}
		if (blueBallNum16 > 0) {
			sb.append(String.format("%1$s(%2$s) ", blueBallNum16, blueBallNum16Type));
		}
		return sb.toString();
	}
}
