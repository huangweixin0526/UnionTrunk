package com.android.weixin.lotteryticket.ui.fragment;

import java.util.List;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryInfo;
import com.android.weixin.lotteryticket.ui.adapter.TwoDataPreviewAdapter;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class TwoDataPreviewFragment extends Fragment {

	@ViewInject(R.id.two_data_preview_forecast_lv)
	private ListView mUnionWinning;

	private List<UnionLotteryInfo> mDataSource;
	private TwoDataPreviewAdapter mRedNumForecastAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.two_data_preview_layout, container, false);
		return view;
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		ViewUtils.inject(this, view);
		mRedNumForecastAdapter = new TwoDataPreviewAdapter(getActivity(), getDataSource());
		mUnionWinning.setAdapter(mRedNumForecastAdapter);
	}

	public List<UnionLotteryInfo> getDataSource() {
		return mDataSource;
	}

	public void setDataSource(List<UnionLotteryInfo> dataSource) {
		this.mDataSource = dataSource;
	}

	public void refreshData() {

	}
}
