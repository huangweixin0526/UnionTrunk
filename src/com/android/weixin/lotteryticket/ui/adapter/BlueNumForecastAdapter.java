package com.android.weixin.lotteryticket.ui.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.storage.unionlotto.BlueBallNumInfo;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class BlueNumForecastAdapter extends BaseAdapter {

	private Context mContext;
	private List<BlueBallNumInfo> mForecastDataSource;

	public BlueNumForecastAdapter(Context context,
			List<BlueBallNumInfo> forecastDataSource) {
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
	public BlueBallNumInfo getItem(int position) {
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
		BlueNumForecastHolder blueNumForecastHolder = null;
		if (convertView == null) {
			convertView = ((LayoutInflater) mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
					.inflate(R.layout.blue_num_forecast_item_layout, parent,
							false);
			blueNumForecastHolder = new BlueNumForecastHolder();
			ViewUtils.inject(blueNumForecastHolder, convertView);
			convertView.setTag(blueNumForecastHolder);
		} else {
			blueNumForecastHolder = (BlueNumForecastHolder) convertView
					.getTag();
		}
		return convertView;
	}

	private class BlueNumForecastHolder {
		@ViewInject(R.id.blue_num_1_tv)
		private TextView blueNumData1;
		@ViewInject(R.id.blue_num_2_tv)
		private TextView blueNumData2;
		@ViewInject(R.id.blue_num_3_tv)
		private TextView blueNumData3;
		@ViewInject(R.id.blue_num_4_tv)
		private TextView blueNumData4;
		@ViewInject(R.id.blue_num_5_tv)
		private TextView blueNumData5;
		@ViewInject(R.id.blue_num_6_tv)
		private TextView blueNumData6;
		@ViewInject(R.id.blue_num_7_tv)
		private TextView blueNumData7;
		@ViewInject(R.id.blue_num_8_tv)
		private TextView blueNumData8;
		@ViewInject(R.id.blue_num_9_tv)
		private TextView blueNumData9;
		@ViewInject(R.id.blue_num_10_tv)
		private TextView blueNumData10;
		@ViewInject(R.id.blue_num_11_tv)
		private TextView blueNumData11;
		@ViewInject(R.id.blue_num_12_tv)
		private TextView blueNumData12;
		@ViewInject(R.id.blue_num_13_tv)
		private TextView blueNumData13;
		@ViewInject(R.id.blue_num_14_tv)
		private TextView blueNumData14;
		@ViewInject(R.id.blue_num_15_tv)
		private TextView blueNumData15;
		@ViewInject(R.id.blue_num_16_tv)
		private TextView blueNumData16;
	}
}
