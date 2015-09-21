package com.android.weixin.lotteryticket.ui.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.android.weixin.lotteryticket.utils.DateUtil;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class RedNumForecastAdapter extends BaseAdapter {

	private Context mContext;
	private List<RedBallNumInfo> mForecastDataSource;

	public RedNumForecastAdapter(Context context, List<RedBallNumInfo> forecastDataSource) {
		this.mContext = context;
		this.mForecastDataSource = forecastDataSource;
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
			convertView.setTag(convertView);
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
			}

			if (redBallNumInfo.getRedBallNum2() > 0) {
				viewHoloder.mUnionRedNum2.setText(String.valueOf(redBallNumInfo.getRedBallNum2()));
			}

			if (redBallNumInfo.getRedBallNum3() > 0) {
				viewHoloder.mUnionRedNum3.setText(String.valueOf(redBallNumInfo.getRedBallNum3()));
			}

			if (redBallNumInfo.getRedBallNum4() > 0) {
				viewHoloder.mUnionRedNum4.setText(String.valueOf(redBallNumInfo.getRedBallNum4()));
			}

			if (redBallNumInfo.getRedBallNum5() > 0) {
				viewHoloder.mUnionRedNum5.setText(String.valueOf(redBallNumInfo.getRedBallNum5()));
			}

			if (redBallNumInfo.getRedBallNum6() > 0) {
				viewHoloder.mUnionRedNum6.setText(String.valueOf(redBallNumInfo.getRedBallNum6()));
			}

			if (redBallNumInfo.getRedBallNum7() > 0) {
				viewHoloder.mUnionRedNum7.setText(String.valueOf(redBallNumInfo.getRedBallNum7()));
			}

			if (redBallNumInfo.getRedBallNum8() > 0) {
				viewHoloder.mUnionRedNum8.setText(String.valueOf(redBallNumInfo.getRedBallNum8()));
			}

			if (redBallNumInfo.getRedBallNum9() > 0) {
				viewHoloder.mUnionRedNum9.setText(String.valueOf(redBallNumInfo.getRedBallNum9()));
			}

			if (redBallNumInfo.getRedBallNum10() > 0) {
				viewHoloder.mUnionRedNum10.setText(String.valueOf(redBallNumInfo.getRedBallNum10()));
			}

			if (redBallNumInfo.getRedBallNum11() > 0) {
				viewHoloder.mUnionRedNum11.setText(String.valueOf(redBallNumInfo.getRedBallNum11()));
			}

			if (redBallNumInfo.getRedBallNum12() > 0) {
				viewHoloder.mUnionRedNum12.setText(String.valueOf(redBallNumInfo.getRedBallNum12()));
			}

			if (redBallNumInfo.getRedBallNum13() > 0) {
				viewHoloder.mUnionRedNum13.setText(String.valueOf(redBallNumInfo.getRedBallNum13()));
			}

			if (redBallNumInfo.getRedBallNum14() > 0) {
				viewHoloder.mUnionRedNum14.setText(String.valueOf(redBallNumInfo.getRedBallNum14()));
			}

			if (redBallNumInfo.getRedBallNum15() > 0) {
				viewHoloder.mUnionRedNum15.setText(String.valueOf(redBallNumInfo.getRedBallNum15()));
			}

			if (redBallNumInfo.getRedBallNum16() > 0) {
				viewHoloder.mUnionRedNum16.setText(String.valueOf(redBallNumInfo.getRedBallNum16()));
			}

			if (redBallNumInfo.getRedBallNum17() > 0) {
				viewHoloder.mUnionRedNum17.setText(String.valueOf(redBallNumInfo.getRedBallNum17()));
			}

			if (redBallNumInfo.getRedBallNum18() > 0) {
				viewHoloder.mUnionRedNum18.setText(String.valueOf(redBallNumInfo.getRedBallNum18()));
			}

			if (redBallNumInfo.getRedBallNum19() > 0) {
				viewHoloder.mUnionRedNum19.setText(String.valueOf(redBallNumInfo.getRedBallNum19()));
			}

			if (redBallNumInfo.getRedBallNum20() > 0) {
				viewHoloder.mUnionRedNum20.setText(String.valueOf(redBallNumInfo.getRedBallNum20()));
			}

			if (redBallNumInfo.getRedBallNum21() > 0) {
				viewHoloder.mUnionRedNum21.setText(String.valueOf(redBallNumInfo.getRedBallNum21()));
			}

			if (redBallNumInfo.getRedBallNum22() > 0) {
				viewHoloder.mUnionRedNum22.setText(String.valueOf(redBallNumInfo.getRedBallNum22()));
			}

			if (redBallNumInfo.getRedBallNum23() > 0) {
				viewHoloder.mUnionRedNum23.setText(String.valueOf(redBallNumInfo.getRedBallNum23()));
			}

			if (redBallNumInfo.getRedBallNum24() > 0) {
				viewHoloder.mUnionRedNum24.setText(String.valueOf(redBallNumInfo.getRedBallNum24()));
			}

			if (redBallNumInfo.getRedBallNum25() > 0) {
				viewHoloder.mUnionRedNum25.setText(String.valueOf(redBallNumInfo.getRedBallNum25()));
			}

			if (redBallNumInfo.getRedBallNum26() > 0) {
				viewHoloder.mUnionRedNum26.setText(String.valueOf(redBallNumInfo.getRedBallNum26()));
			}

			if (redBallNumInfo.getRedBallNum27() > 0) {
				viewHoloder.mUnionRedNum27.setText(String.valueOf(redBallNumInfo.getRedBallNum27()));
			}

			if (redBallNumInfo.getRedBallNum28() > 0) {
				viewHoloder.mUnionRedNum28.setText(String.valueOf(redBallNumInfo.getRedBallNum28()));
			}

			if (redBallNumInfo.getRedBallNum29() > 0) {
				viewHoloder.mUnionRedNum29.setText(String.valueOf(redBallNumInfo.getRedBallNum29()));
			}

			if (redBallNumInfo.getRedBallNum30() > 0) {
				viewHoloder.mUnionRedNum30.setText(String.valueOf(redBallNumInfo.getRedBallNum30()));
			}

			if (redBallNumInfo.getRedBallNum31() > 0) {
				viewHoloder.mUnionRedNum31.setText(String.valueOf(redBallNumInfo.getRedBallNum31()));
			}

			if (redBallNumInfo.getRedBallNum32() > 0) {
				viewHoloder.mUnionRedNum32.setText(String.valueOf(redBallNumInfo.getRedBallNum32()));
			}

			if (redBallNumInfo.getRedBallNum33() > 0) {
				viewHoloder.mUnionRedNum33.setText(String.valueOf(redBallNumInfo.getRedBallNum33()));
			}
		}
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
