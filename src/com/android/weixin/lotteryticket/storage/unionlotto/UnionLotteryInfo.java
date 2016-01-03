package com.android.weixin.lotteryticket.storage.unionlotto;

import java.util.Date;

public class UnionLotteryInfo {

	private int periodNum;

	private Date lotteryDate;

	private UnionLotteryNumbers unionLotteryNumbers;

	private RedBallNumInfo redBallNumInfo;

	private BlueBallNumInfo blueBallNumInfo;

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

	public UnionLotteryNumbers getUnionLotteryNumbers() {
		return unionLotteryNumbers;
	}

	public void setUnionLotteryNumbers(UnionLotteryNumbers unionLotteryNumbers) {
		this.unionLotteryNumbers = unionLotteryNumbers;
	}

	public RedBallNumInfo getRedBallNumInfo() {
		return redBallNumInfo;
	}

	public void setRedBallNumInfo(RedBallNumInfo redBallNumInfo) {
		this.redBallNumInfo = redBallNumInfo;
	}

	public BlueBallNumInfo getBlueBallNumInfo() {
		return blueBallNumInfo;
	}

	public void setBlueBallNumInfo(BlueBallNumInfo blueBallNumInfo) {
		this.blueBallNumInfo = blueBallNumInfo;
	}
}
