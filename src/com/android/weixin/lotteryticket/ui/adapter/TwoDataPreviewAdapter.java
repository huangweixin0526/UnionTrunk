package com.android.weixin.lotteryticket.ui.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
import com.android.weixin.lotteryticket.utils.DateUtil;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

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
		PreviewDataHoloder dataHoloder = null;
		if (convertView == null) {
			convertView = ((LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.two_data_preview_item_lay, parent,
					false);
			dataHoloder = new PreviewDataHoloder();
			ViewUtils.inject(dataHoloder, convertView);
			convertView.setTag(dataHoloder);
		} else {
			dataHoloder = (PreviewDataHoloder) convertView.getTag();
		}
		setViewData(position, dataHoloder);
		return convertView;
	}

	private void setViewData(int position, PreviewDataHoloder dataHoloder) {
		UnionLotteryNumbers lotteryItem = getItem(position);
		if (lotteryItem != null) {
			dataHoloder.mPeriodNum.setText(String.valueOf(lotteryItem.getPeriodNum()));
			dataHoloder.mLotteryDate.setText(DateUtil.getConvertDateToStr(lotteryItem.getLotteryDate()));
			dataHoloder.mRedNumOne.setText(String.valueOf(lotteryItem.getRedNumOne()));
			dataHoloder.mRedNumTwo.setText(String.valueOf(lotteryItem.getRedNumTwo()));
			dataHoloder.mRedNumThree.setText(String.valueOf(lotteryItem.getRedNumThree()));
			dataHoloder.mRedNumFour.setText(String.valueOf(lotteryItem.getRedNumFour()));
			dataHoloder.mRedNumFive.setText(String.valueOf(lotteryItem.getRedNumFive()));
			dataHoloder.mRedNumSix.setText(String.valueOf(lotteryItem.getRedNumSix()));
			dataHoloder.mBlueNum.setText(String.valueOf(lotteryItem.getBlueNum()));
		}
	}

	private class PreviewDataHoloder {
		@ViewInject(R.id.two_period_num_tv)
		private TextView mPeriodNum;
		@ViewInject(R.id.two_lottery_date_tv)
		private TextView mLotteryDate;
		@ViewInject(R.id.two_red_num_one_tv)
		private TextView mRedNumOne;
		@ViewInject(R.id.two_red_num_two_tv)
		private TextView mRedNumTwo;
		@ViewInject(R.id.two_red_num_three_tv)
		private TextView mRedNumThree;
		@ViewInject(R.id.two_red_num_four_tv)
		private TextView mRedNumFour;
		@ViewInject(R.id.two_red_num_five_tv)
		private TextView mRedNumFive;
		@ViewInject(R.id.two_red_num_six_tv)
		private TextView mRedNumSix;
		@ViewInject(R.id.two_blue_num_tv)
		private TextView mBlueNum;
	}
}
