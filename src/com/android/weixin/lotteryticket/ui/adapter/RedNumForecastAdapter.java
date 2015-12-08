package com.android.weixin.lotteryticket.ui.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.permanent.CalculateTypeConfig;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
import com.android.weixin.lotteryticket.utils.DateUtil;
import com.android.weixin.lotteryticket.widgets.HVListView;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class RedNumForecastAdapter extends BaseAdapter {

	private Context mContext;
	private Drawable mWinningBg;
	private Drawable mMatrixWinningBg;
	private List<RedBallNumInfo> mForecastDataSource;
	private List<UnionLotteryNumbers> mUnionLotteryData;

	public RedNumForecastAdapter(Context context, List<RedBallNumInfo> forecastDataSource, List<UnionLotteryNumbers> unionLotteryData) {
		this.mContext = context;
		this.mForecastDataSource = forecastDataSource;
		this.mUnionLotteryData = unionLotteryData;
		this.initVar();
	}

	private void initVar() {
		this.mWinningBg = this.mContext.getResources().getDrawable(R.drawable.red_ball_bg_shape);
		this.mMatrixWinningBg = this.mContext.getResources().getDrawable(R.drawable.red_ball_bg_shape);
	}

	@Override
	public int getCount() {
		if (mForecastDataSource != null) {
			return mForecastDataSource.size();
		}
		return 0;
	}

	@Override
	public RedBallNumInfo getItem(int position) {
		if (mForecastDataSource != null) {
			return mForecastDataSource.get(position);
		}
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHoloder viewHoloder = null;
		if (convertView == null) {
			convertView = ((LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.red_num_forecast_item_layout, parent,
					false);
			viewHoloder = new ViewHoloder();
			ViewUtils.inject(viewHoloder, convertView);
			convertView.setTag(viewHoloder);
		} else {
			viewHoloder = (ViewHoloder) convertView.getTag();
		}
		setRedBallViewData(position, viewHoloder);
		
		return convertView;
	}

	private void setRedBallViewData(int position, ViewHoloder viewHoloder) {
		RedBallNumInfo redBallNumInfo = getItem(position);
		if (redBallNumInfo != null) {
			viewHoloder.mUnionPeriodNum.setText(String.valueOf(redBallNumInfo.getPeriodNum()));
			viewHoloder.mUnionLotteryDate.setText(DateUtil.getDateFormateTime(redBallNumInfo.getLotteryDate()));
			if (redBallNumInfo.getRedBallNum1() > 0) {
				viewHoloder.mUnionRedNum1.setText(String.valueOf(redBallNumInfo.getRedBallNum1()));
				viewHoloder.mUnionRedNum1.setBackground(getNumberBg(redBallNumInfo.getRedBallNum1Type()));
			}else{
				viewHoloder.mUnionRedNum1.setText("");
				viewHoloder.mUnionRedNum1.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum2() > 0) {
				viewHoloder.mUnionRedNum2.setText(String.valueOf(redBallNumInfo.getRedBallNum2()));
				viewHoloder.mUnionRedNum2.setBackground(getNumberBg(redBallNumInfo.getRedBallNum2Type()));
			}else{
				viewHoloder.mUnionRedNum2.setText("");
				viewHoloder.mUnionRedNum2.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum3() > 0) {
				viewHoloder.mUnionRedNum3.setText(String.valueOf(redBallNumInfo.getRedBallNum3()));
				viewHoloder.mUnionRedNum3.setBackground(getNumberBg(redBallNumInfo.getRedBallNum3Type()));
			}else{
				viewHoloder.mUnionRedNum3.setText("");
				viewHoloder.mUnionRedNum3.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum4() > 0) {
				viewHoloder.mUnionRedNum4.setText(String.valueOf(redBallNumInfo.getRedBallNum4()));
				viewHoloder.mUnionRedNum4.setBackground(getNumberBg(redBallNumInfo.getRedBallNum4Type()));
			}else{
				viewHoloder.mUnionRedNum4.setText("");
				viewHoloder.mUnionRedNum4.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum5() > 0) {
				viewHoloder.mUnionRedNum5.setText(String.valueOf(redBallNumInfo.getRedBallNum5()));
				viewHoloder.mUnionRedNum5.setBackground(getNumberBg(redBallNumInfo.getRedBallNum5Type()));
			}else{
				viewHoloder.mUnionRedNum5.setText("");
				viewHoloder.mUnionRedNum5.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum6() > 0) {
				viewHoloder.mUnionRedNum6.setText(String.valueOf(redBallNumInfo.getRedBallNum6()));
				viewHoloder.mUnionRedNum6.setBackground(getNumberBg(redBallNumInfo.getRedBallNum6Type()));
			}else{
				viewHoloder.mUnionRedNum6.setText("");
				viewHoloder.mUnionRedNum6.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum7() > 0) {
				viewHoloder.mUnionRedNum7.setText(String.valueOf(redBallNumInfo.getRedBallNum7()));
				viewHoloder.mUnionRedNum7.setBackground(getNumberBg(redBallNumInfo.getRedBallNum7Type()));
			}else{
				viewHoloder.mUnionRedNum7.setText("");
				viewHoloder.mUnionRedNum7.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum8() > 0) {
				viewHoloder.mUnionRedNum8.setText(String.valueOf(redBallNumInfo.getRedBallNum8()));
				viewHoloder.mUnionRedNum8.setBackground(getNumberBg(redBallNumInfo.getRedBallNum8Type()));
			}else{
				viewHoloder.mUnionRedNum8.setText("");
				viewHoloder.mUnionRedNum8.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum9() > 0) {
				viewHoloder.mUnionRedNum9.setText(String.valueOf(redBallNumInfo.getRedBallNum9()));
				viewHoloder.mUnionRedNum9.setBackground(getNumberBg(redBallNumInfo.getRedBallNum9Type()));
			}else{
				viewHoloder.mUnionRedNum9.setText("");
				viewHoloder.mUnionRedNum9.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum10() > 0) {
				viewHoloder.mUnionRedNum10.setText(String.valueOf(redBallNumInfo.getRedBallNum10()));
				viewHoloder.mUnionRedNum10.setBackground(getNumberBg(redBallNumInfo.getRedBallNum10Type()));
			}else{
				viewHoloder.mUnionRedNum10.setText("");
				viewHoloder.mUnionRedNum10.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum11() > 0) {
				viewHoloder.mUnionRedNum11.setText(String.valueOf(redBallNumInfo.getRedBallNum11()));
				viewHoloder.mUnionRedNum11.setBackground(getNumberBg(redBallNumInfo.getRedBallNum11Type()));
			}else{
				viewHoloder.mUnionRedNum11.setText("");
				viewHoloder.mUnionRedNum11.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum12() > 0) {
				viewHoloder.mUnionRedNum12.setText(String.valueOf(redBallNumInfo.getRedBallNum12()));
				viewHoloder.mUnionRedNum12.setBackground(getNumberBg(redBallNumInfo.getRedBallNum12Type()));
			}else{
				viewHoloder.mUnionRedNum12.setText("");
				viewHoloder.mUnionRedNum12.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum13() > 0) {
				viewHoloder.mUnionRedNum13.setText(String.valueOf(redBallNumInfo.getRedBallNum13()));
				viewHoloder.mUnionRedNum13.setBackground(getNumberBg(redBallNumInfo.getRedBallNum13Type()));
			}else{
				viewHoloder.mUnionRedNum13.setText("");
				viewHoloder.mUnionRedNum13.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum14() > 0) {
				viewHoloder.mUnionRedNum14.setText(String.valueOf(redBallNumInfo.getRedBallNum14()));
				viewHoloder.mUnionRedNum14.setBackground(getNumberBg(redBallNumInfo.getRedBallNum14Type()));
			}else{
				viewHoloder.mUnionRedNum14.setText("");
				viewHoloder.mUnionRedNum14.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum15() > 0) {
				viewHoloder.mUnionRedNum15.setText(String.valueOf(redBallNumInfo.getRedBallNum15()));
				viewHoloder.mUnionRedNum15.setBackground(getNumberBg(redBallNumInfo.getRedBallNum15Type()));
			}else{
				viewHoloder.mUnionRedNum15.setText("");
				viewHoloder.mUnionRedNum15.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum16() > 0) {
				viewHoloder.mUnionRedNum16.setText(String.valueOf(redBallNumInfo.getRedBallNum16()));
				viewHoloder.mUnionRedNum16.setBackground(getNumberBg(redBallNumInfo.getRedBallNum16Type()));
			}else{
				viewHoloder.mUnionRedNum16.setText("");
				viewHoloder.mUnionRedNum16.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum17() > 0) {
				viewHoloder.mUnionRedNum17.setText(String.valueOf(redBallNumInfo.getRedBallNum17()));
				viewHoloder.mUnionRedNum17.setBackground(getNumberBg(redBallNumInfo.getRedBallNum17Type()));
			}else{
				viewHoloder.mUnionRedNum17.setText("");
				viewHoloder.mUnionRedNum17.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum18() > 0) {
				viewHoloder.mUnionRedNum18.setText(String.valueOf(redBallNumInfo.getRedBallNum18()));
				viewHoloder.mUnionRedNum18.setBackground(getNumberBg(redBallNumInfo.getRedBallNum18Type()));
			}else{
				viewHoloder.mUnionRedNum18.setText("");
				viewHoloder.mUnionRedNum18.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum19() > 0) {
				viewHoloder.mUnionRedNum19.setText(String.valueOf(redBallNumInfo.getRedBallNum19()));
				viewHoloder.mUnionRedNum19.setBackground(getNumberBg(redBallNumInfo.getRedBallNum19Type()));
			}else{
				viewHoloder.mUnionRedNum19.setText("");
				viewHoloder.mUnionRedNum19.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum20() > 0) {
				viewHoloder.mUnionRedNum20.setText(String.valueOf(redBallNumInfo.getRedBallNum20()));
				viewHoloder.mUnionRedNum20.setBackground(getNumberBg(redBallNumInfo.getRedBallNum20Type()));
			}else{
				viewHoloder.mUnionRedNum20.setText("");
				viewHoloder.mUnionRedNum20.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum21() > 0) {
				viewHoloder.mUnionRedNum21.setText(String.valueOf(redBallNumInfo.getRedBallNum21()));
				viewHoloder.mUnionRedNum21.setBackground(getNumberBg(redBallNumInfo.getRedBallNum21Type()));
			}else{
				viewHoloder.mUnionRedNum21.setText("");
				viewHoloder.mUnionRedNum21.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum22() > 0) {
				viewHoloder.mUnionRedNum22.setText(String.valueOf(redBallNumInfo.getRedBallNum22()));
				viewHoloder.mUnionRedNum22.setBackground(getNumberBg(redBallNumInfo.getRedBallNum22Type()));
			}else{
				viewHoloder.mUnionRedNum22.setText("");
				viewHoloder.mUnionRedNum22.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum23() > 0) {
				viewHoloder.mUnionRedNum23.setText(String.valueOf(redBallNumInfo.getRedBallNum23()));
				viewHoloder.mUnionRedNum23.setBackground(getNumberBg(redBallNumInfo.getRedBallNum23Type()));
			}else{
				viewHoloder.mUnionRedNum23.setText("");
				viewHoloder.mUnionRedNum23.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum24() > 0) {
				viewHoloder.mUnionRedNum24.setText(String.valueOf(redBallNumInfo.getRedBallNum24()));
				viewHoloder.mUnionRedNum24.setBackground(getNumberBg(redBallNumInfo.getRedBallNum24Type()));
			}else{
				viewHoloder.mUnionRedNum24.setText("");
				viewHoloder.mUnionRedNum24.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum25() > 0) {
				viewHoloder.mUnionRedNum25.setText(String.valueOf(redBallNumInfo.getRedBallNum25()));
				viewHoloder.mUnionRedNum25.setBackground(getNumberBg(redBallNumInfo.getRedBallNum25Type()));
			}else{
				viewHoloder.mUnionRedNum25.setText("");
				viewHoloder.mUnionRedNum25.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum26() > 0) {
				viewHoloder.mUnionRedNum26.setText(String.valueOf(redBallNumInfo.getRedBallNum26()));
				viewHoloder.mUnionRedNum26.setBackground(getNumberBg(redBallNumInfo.getRedBallNum26Type()));
			}else{
				viewHoloder.mUnionRedNum26.setText("");
				viewHoloder.mUnionRedNum26.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum27() > 0) {
				viewHoloder.mUnionRedNum27.setText(String.valueOf(redBallNumInfo.getRedBallNum27()));
				viewHoloder.mUnionRedNum27.setBackground(getNumberBg(redBallNumInfo.getRedBallNum27Type()));
			}else{
				viewHoloder.mUnionRedNum27.setText("");
				viewHoloder.mUnionRedNum27.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum28() > 0) {
				viewHoloder.mUnionRedNum28.setText(String.valueOf(redBallNumInfo.getRedBallNum28()));
				viewHoloder.mUnionRedNum28.setBackground(getNumberBg(redBallNumInfo.getRedBallNum28Type()));
			}else{
				viewHoloder.mUnionRedNum28.setText("");
				viewHoloder.mUnionRedNum28.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum29() > 0) {
				viewHoloder.mUnionRedNum29.setText(String.valueOf(redBallNumInfo.getRedBallNum29()));
				viewHoloder.mUnionRedNum29.setBackground(getNumberBg(redBallNumInfo.getRedBallNum29Type()));
			}else{
				viewHoloder.mUnionRedNum29.setText("");
				viewHoloder.mUnionRedNum29.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum30() > 0) {
				viewHoloder.mUnionRedNum30.setText(String.valueOf(redBallNumInfo.getRedBallNum30()));
				viewHoloder.mUnionRedNum30.setBackground(getNumberBg(redBallNumInfo.getRedBallNum30Type()));
			}else{
				viewHoloder.mUnionRedNum30.setText("");
				viewHoloder.mUnionRedNum30.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum31() > 0) {
				viewHoloder.mUnionRedNum31.setText(String.valueOf(redBallNumInfo.getRedBallNum31()));
				viewHoloder.mUnionRedNum31.setBackground(getNumberBg(redBallNumInfo.getRedBallNum31Type()));
			}else{
				viewHoloder.mUnionRedNum31.setText("");
				viewHoloder.mUnionRedNum31.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum32() > 0) {
				viewHoloder.mUnionRedNum32.setText(String.valueOf(redBallNumInfo.getRedBallNum32()));
				viewHoloder.mUnionRedNum32.setBackground(getNumberBg(redBallNumInfo.getRedBallNum32Type()));
			}else{
				viewHoloder.mUnionRedNum32.setText("");
				viewHoloder.mUnionRedNum32.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum33() > 0) {
				viewHoloder.mUnionRedNum33.setText(String.valueOf(redBallNumInfo.getRedBallNum33()));
				viewHoloder.mUnionRedNum33.setBackground(getNumberBg(redBallNumInfo.getRedBallNum33Type()));
			}else{
				viewHoloder.mUnionRedNum33.setText("");
				viewHoloder.mUnionRedNum33.setBackground(null);
			}
		}
	}

	private Drawable getNumberBg(int calculateType) {
		if (calculateType == CalculateTypeConfig.CALCULATE_TYPE_MATRIX_WINNING) {
			return this.mMatrixWinningBg;
		}
		if (calculateType == CalculateTypeConfig.CALCULATE_TYPE_WINNING) {
			return this.mWinningBg;
		}
		return null;
	}

	private class ViewHoloder {

		@ViewInject(R.id.union_forecast_period_num_tv)
		private TextView mUnionPeriodNum;
		@ViewInject(R.id.union_forecast_lottery_date_tv)
		private TextView mUnionLotteryDate;
		@ViewInject(R.id.union_red_num_1_tv)
		private TextView mUnionRedNum1;
		@ViewInject(R.id.union_red_num_2_tv)
		private TextView mUnionRedNum2;
		@ViewInject(R.id.union_red_num_3_tv)
		private TextView mUnionRedNum3;
		@ViewInject(R.id.union_red_num_4_tv)
		private TextView mUnionRedNum4;
		@ViewInject(R.id.union_red_num_5_tv)
		private TextView mUnionRedNum5;
		@ViewInject(R.id.union_red_num_6_tv)
		private TextView mUnionRedNum6;
		@ViewInject(R.id.union_red_num_7_tv)
		private TextView mUnionRedNum7;
		@ViewInject(R.id.union_red_num_8_tv)
		private TextView mUnionRedNum8;
		@ViewInject(R.id.union_red_num_9_tv)
		private TextView mUnionRedNum9;
		@ViewInject(R.id.union_red_num_10_tv)
		private TextView mUnionRedNum10;
		@ViewInject(R.id.union_red_num_11_tv)
		private TextView mUnionRedNum11;
		@ViewInject(R.id.union_red_num_12_tv)
		private TextView mUnionRedNum12;
		@ViewInject(R.id.union_red_num_13_tv)
		private TextView mUnionRedNum13;
		@ViewInject(R.id.union_red_num_14_tv)
		private TextView mUnionRedNum14;
		@ViewInject(R.id.union_red_num_15_tv)
		private TextView mUnionRedNum15;
		@ViewInject(R.id.union_red_num_16_tv)
		private TextView mUnionRedNum16;
		@ViewInject(R.id.union_red_num_17_tv)
		private TextView mUnionRedNum17;
		@ViewInject(R.id.union_red_num_18_tv)
		private TextView mUnionRedNum18;
		@ViewInject(R.id.union_red_num_19_tv)
		private TextView mUnionRedNum19;
		@ViewInject(R.id.union_red_num_20_tv)
		private TextView mUnionRedNum20;
		@ViewInject(R.id.union_red_num_21_tv)
		private TextView mUnionRedNum21;
		@ViewInject(R.id.union_red_num_22_tv)
		private TextView mUnionRedNum22;
		@ViewInject(R.id.union_red_num_23_tv)
		private TextView mUnionRedNum23;
		@ViewInject(R.id.union_red_num_24_tv)
		private TextView mUnionRedNum24;
		@ViewInject(R.id.union_red_num_25_tv)
		private TextView mUnionRedNum25;
		@ViewInject(R.id.union_red_num_26_tv)
		private TextView mUnionRedNum26;
		@ViewInject(R.id.union_red_num_27_tv)
		private TextView mUnionRedNum27;
		@ViewInject(R.id.union_red_num_28_tv)
		private TextView mUnionRedNum28;
		@ViewInject(R.id.union_red_num_29_tv)
		private TextView mUnionRedNum29;
		@ViewInject(R.id.union_red_num_30_tv)
		private TextView mUnionRedNum30;
		@ViewInject(R.id.union_red_num_31_tv)
		private TextView mUnionRedNum31;
		@ViewInject(R.id.union_red_num_32_tv)
		private TextView mUnionRedNum32;
		@ViewInject(R.id.union_red_num_33_tv)
		private TextView mUnionRedNum33;
	}

}
