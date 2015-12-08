package com.android.weixin.lotteryticket.ui.fragment;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.operational.MatrixOperation;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumberHelper;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
import com.android.weixin.lotteryticket.ui.adapter.RedNumForecastAdapter;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class RedNumForecastFragment extends Fragment {

	@ViewInject(R.id.red_num_forecast_lv)
	private ListView mRedNumForecast;

	private Drawable mRedBallNumBg;
	private MatrixOperation mMatrixOperation;
	private List<RedBallNumInfo> mDataSource;
	private List<UnionLotteryNumbers> mUnionLotteryData;
	private RedNumForecastAdapter mRedNumForecastAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initVar();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.red_num_forecast_layout, container, false);
		return view;
	}

	private void initVar() {
		mRedBallNumBg = getResources().getDrawable(R.drawable.red_ball_bg_shape);
		mMatrixOperation = new MatrixOperation();
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		ViewUtils.inject(this, view);
		mUnionLotteryData = getLotteryData();
		mDataSource = mMatrixOperation.initDataArray3_3(mUnionLotteryData);
		mRedNumForecastAdapter = new RedNumForecastAdapter(getActivity(), mDataSource, mUnionLotteryData);
		// 设置列头
		// mRedNumForecast.mListHead = (LinearLayout)
		// view.findViewById(R.id.head);
		mRedNumForecast.setAdapter(mRedNumForecastAdapter);
	}

	private List<UnionLotteryNumbers> getLotteryData() {
		List<UnionLotteryNumbers> dataSource = UnionLotteryNumberHelper.getInstance().getLotteryNumbers();
		return dataSource;
	}
}
