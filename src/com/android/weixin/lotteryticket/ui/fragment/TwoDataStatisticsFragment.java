package com.android.weixin.lotteryticket.ui.fragment;

import java.util.List;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryInfo;
import com.github.mikephil.charting.charts.PieChart;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TwoDataStatisticsFragment extends Fragment {

	@ViewInject(value = R.id.two_red_num_pc)
	private PieChart two_red_num_pc;

	private List<UnionLotteryInfo> mDataSource;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.two_data_statistics_layout, container, false);
		return view;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		ViewUtils.inject(this, view);
		initView();
	}

	public List<UnionLotteryInfo> getDataSource() {
		return mDataSource;
	}

	public void setDataSource(List<UnionLotteryInfo> dataSource) {
		this.mDataSource = dataSource;
	}

	private void initView() {
		two_red_num_pc.setUsePercentValues(true);
		two_red_num_pc.setDescription("");
		two_red_num_pc.setDragDecelerationFrictionCoef(0.95f);
		two_red_num_pc.setDrawHoleEnabled(true);
		two_red_num_pc.setHoleColorTransparent(true);
		two_red_num_pc.setTransparentCircleColor(Color.WHITE);
		two_red_num_pc.setHoleRadius(58f);
		two_red_num_pc.setTransparentCircleRadius(61f);
		two_red_num_pc.setDrawCenterText(false);
		two_red_num_pc.setRotationAngle(0);
		two_red_num_pc.setRotationEnabled(true);
	}
}
