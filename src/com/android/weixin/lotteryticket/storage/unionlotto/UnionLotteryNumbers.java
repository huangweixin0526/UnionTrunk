package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.Date;

import com.android.weixin.lotteryticket.storage.DBaseDao;
import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

@Table(name = "union_lottery_numbers")
public class UnionLotteryNumbers extends DBaseDao {

	public static final String COLUMN_LOTTERY_DATE = "lotteryDate";
	public static final String COLUMN_PERIOD_NUM = "periodNum";
	public static final String COLUMN_RED_NUM_ONE = "red_num_one";
	public static final String COLUMN_RED_NUM_TOW = "red_num_two";
	public static final String COLUMN_RED_NUM_THREE = "red_num_three";
	public static final String COLUMN_RED_NUM_FOUR = "red_num_four";
	public static final String COLUMN_RED_NUM_FIVE = "red_num_five";
	public static final String COLUMN_RED_NUM_SIX = "red_num_six";
	public static final String COLUMN_BLUE_NUM = "blue_num";

	@Column(column = "period_num")
	private int periodNum;
	@Column(column = "red_num_one")
	private int redNumOne;
	@Column(column = "red_num_two")
	private int redNumTwo;
	@Column(column = "red_num_three")
	private int redNumThree;
	@Column(column = "red_num_four")
	private int redNumFour;
	@Column(column = "red_num_five")
	private int redNumFive;
	@Column(column = "red_num_six")
	private int redNumSix;
	@Column(column = "blue_num")
	private int blueNum;
	@Column(column = "lottery_date")
	private Date lotteryDate;

	public int getPeriodNum() {
		return periodNum;
	}

	public void setPeriodNum(int periodNum) {
		this.periodNum = periodNum;
	}

	public int getRedNumOne() {
		return redNumOne;
	}

	public void setRedNumOne(int redNumOne) {
		this.redNumOne = redNumOne;
	}

	public int getRedNumTwo() {
		return redNumTwo;
	}

	public void setRedNumTwo(int redNumTwo) {
		this.redNumTwo = redNumTwo;
	}

	public int getRedNumThree() {
		return redNumThree;
	}

	public void setRedNumThree(int redNumThree) {
		this.redNumThree = redNumThree;
	}

	public int getRedNumFour() {
		return redNumFour;
	}

	public void setRedNumFour(int redNumFour) {
		this.redNumFour = redNumFour;
	}

	public int getRedNumFive() {
		return redNumFive;
	}

	public void setRedNumFive(int redNumFive) {
		this.redNumFive = redNumFive;
	}

	public int getRedNumSix() {
		return redNumSix;
	}

	public void setRedNumSix(int redNumSix) {
		this.redNumSix = redNumSix;
	}

	public int getBlueNum() {
		return blueNum;
	}

	public void setBlueNum(int blueNum) {
		this.blueNum = blueNum;
	}

	public Date getLotteryDate() {
		return lotteryDate;
	}

	public void setLotteryDate(Date lotteryDate) {
		this.lotteryDate = lotteryDate;
	}
}
