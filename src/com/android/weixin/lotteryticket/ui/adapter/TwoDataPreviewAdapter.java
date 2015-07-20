package com.android.weixin.lotteryticket.ui.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;

public class TwoDataPreviewAdapter extends BaseAdapter {

	private Context mContext;
	private List<UnionLotteryNumbers> mDataSource;

	public TwoDataPreviewAdapter(Context context, List<UnionLotteryNumbers> dataSource) {
		mContext = context;
		mDataSource = dataSource;
	}

	@Override
	public int getCount() {
		if (mDataSource != null) {
			return mDataSource.size();
		}
		return 0;
	}

	@Override
	public UnionLotteryNumbers getItem(int position) {
		if (mDataSource != null) {
			return mDataSource.get(position);
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
