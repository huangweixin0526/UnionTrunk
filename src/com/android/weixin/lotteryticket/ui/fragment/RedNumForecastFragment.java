package com.android.weixin.lotteryticket.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.android.weixin.lotteryticket.ui.adapter.RedNumForecastAdapter;
import com.android.weixin.lotteryticket.widgets.HVListView;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class RedNumForecastFragment extends Fragment {

	@ViewInject(R.id.red_num_forecast_lv)
	private HVListView mRedNumForecast;

	private List<RedBallNumInfo> mDataSource;
	private RedNumForecastAdapter mRedNumForecastAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.red_num_forecast_layout, container, false);
		return view;
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		ViewUtils.inject(this, view);
		mDataSource = new ArrayList<RedBallNumInfo>();
		mRedNumForecastAdapter = new RedNumForecastAdapter(getActivity(), mDataSource);
		mRedNumForecast.setAdapter(mRedNumForecastAdapter);
	}
}
