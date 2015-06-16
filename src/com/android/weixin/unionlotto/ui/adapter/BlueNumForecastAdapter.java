package com.android.weixin.unionlotto.ui.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.weixin.unionlotto.storage.BlueBallNumInfo;

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
		return null;
	}

}
