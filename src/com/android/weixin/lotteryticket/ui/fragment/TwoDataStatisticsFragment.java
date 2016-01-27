package com.android.weixin.lotteryticket.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.permanent.CalculateTypeConfig;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryInfo;
import com.android.weixin.lotteryticket.utils.StatisticsUtil;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.Legend.LegendPosition;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.PercentFormatter;
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

	@ViewInject(value = R.id.two_blue_num_pc)
	private PieChart two_blue_num_pc;

	protected String[] mParties = new String[] { "Party 0", "Party 1", "Party 2", "Party 3", "Party 4", "Party 5", "Party 6", "Party 7", "Party 8" };
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
		initRedPieView();
		initBluePieView();
	}

	private void initRedPieView() {
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
		two_red_num_pc.animateY(1500, Easing.EasingOption.EaseInOutQuad);

		setRedDataPie();
		Legend l = two_red_num_pc.getLegend();
		l.setPosition(LegendPosition.RIGHT_OF_CHART);
		l.setXEntrySpace(7f);
		l.setYEntrySpace(5f);
	}

	private void initBluePieView() {
		two_blue_num_pc.setUsePercentValues(true);
		two_blue_num_pc.setDescription("");
		two_blue_num_pc.setDragDecelerationFrictionCoef(0.95f);
		two_blue_num_pc.setDrawHoleEnabled(true);
		two_blue_num_pc.setHoleColorTransparent(true);
		two_blue_num_pc.setTransparentCircleColor(Color.WHITE);
		two_blue_num_pc.setHoleRadius(58f);
		two_blue_num_pc.setTransparentCircleRadius(61f);
		two_blue_num_pc.setDrawCenterText(false);
		two_blue_num_pc.setRotationAngle(0);
		two_blue_num_pc.setRotationEnabled(true);
		two_blue_num_pc.animateY(1500, Easing.EasingOption.EaseInOutQuad);

		setBlueDataPie();
		Legend l = two_blue_num_pc.getLegend();
		l.setPosition(LegendPosition.RIGHT_OF_CHART);
		l.setXEntrySpace(7f);
		l.setYEntrySpace(5f);
	}

	public List<UnionLotteryInfo> getDataSource() {
		return mDataSource;
	}

	public void setDataSource(List<UnionLotteryInfo> dataSource) {
		this.mDataSource = dataSource;
	}

	private void setRedDataPie() {
		if (mDataSource != null && mDataSource.size() > 3) {
			int count0 = 0;
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int count4 = 0;
			int count5 = 0;
			int count6 = 0;
			for (int i = 2; i < mDataSource.size() - 1; i++) {
				int count = StatisticsUtil.getStatisticsRedNum(mDataSource.get(i).getRedBallNumInfo(), CalculateTypeConfig.CALCULATE_TYPE_WINNING,
						CalculateTypeConfig.CALCULATE_TYPE_MATRIX);
				switch (count) {
				case 1:
					count1++;
					break;
				case 2:
					count2++;
					break;
				case 3:
					count3++;
					break;
				case 4:
					count4++;
					break;
				case 5:
					count5++;
					break;
				case 6:
					count6++;
					break;
				default:
					count0++;
					break;
				}
			}
			int dataCount = mDataSource.size() - 3;
			ArrayList<Entry> yVals1 = new ArrayList<Entry>();
			yVals1.add(new Entry((float) count0 / dataCount, 0));
			yVals1.add(new Entry((float) count1 / dataCount, 1));
			yVals1.add(new Entry((float) count2 / dataCount, 2));
			yVals1.add(new Entry((float) count3 / dataCount, 3));
			yVals1.add(new Entry((float) count4 / dataCount, 4));
			yVals1.add(new Entry((float) count5 / dataCount, 5));
			yVals1.add(new Entry((float) count6 / dataCount, 6));

			ArrayList<String> xVals = new ArrayList<String>();
			xVals.add(mParties[0]);
			xVals.add(mParties[1]);
			xVals.add(mParties[2]);
			xVals.add(mParties[3]);
			xVals.add(mParties[4]);
			xVals.add(mParties[5]);
			xVals.add(mParties[6]);

			PieDataSet dataSet = new PieDataSet(yVals1, "Red Num Results");
			dataSet.setSliceSpace(3f);
			dataSet.setSelectionShift(5f);

			ArrayList<Integer> colors = new ArrayList<Integer>();

			for (int c : ColorTemplate.VORDIPLOM_COLORS)
				colors.add(c);

			for (int c : ColorTemplate.JOYFUL_COLORS)
				colors.add(c);

			for (int c : ColorTemplate.COLORFUL_COLORS)
				colors.add(c);

			for (int c : ColorTemplate.LIBERTY_COLORS)
				colors.add(c);

			for (int c : ColorTemplate.PASTEL_COLORS)
				colors.add(c);

			colors.add(ColorTemplate.getHoloBlue());

			dataSet.setColors(colors);

			PieData data = new PieData(xVals, dataSet);
			data.setValueFormatter(new PercentFormatter());
			data.setValueTextSize(11f);
			data.setValueTextColor(Color.WHITE);
			two_red_num_pc.setData(data);

			two_red_num_pc.highlightValues(null);

			two_red_num_pc.invalidate();
		}
	}

	private void setBlueDataPie() {
		if (mDataSource != null && mDataSource.size() > 3) {
			int count0 = 0;
			int count1 = 0;
			for (int i = 2; i < mDataSource.size() - 1; i++) {
				int count = StatisticsUtil.getStatisticsBlueNum(mDataSource.get(i).getBlueBallNumInfo(), CalculateTypeConfig.CALCULATE_TYPE_WINNING,
						CalculateTypeConfig.CALCULATE_TYPE_MATRIX);
				switch (count) {
				case 1:
					count1++;
					break;
				default:
					count0++;
					break;
				}
			}
			int dataCount = mDataSource.size() - 3;
			ArrayList<Entry> yVals1 = new ArrayList<Entry>();
			yVals1.add(new Entry((float) count0 / dataCount, 0));
			yVals1.add(new Entry((float) count1 / dataCount, 1));

			ArrayList<String> xVals = new ArrayList<String>();
			xVals.add(mParties[0]);
			xVals.add(mParties[1]);

			PieDataSet dataSet = new PieDataSet(yVals1, "Blue Num Results");
			dataSet.setSliceSpace(3f);
			dataSet.setSelectionShift(5f);

			ArrayList<Integer> colors = new ArrayList<Integer>();

			for (int c : ColorTemplate.VORDIPLOM_COLORS)
				colors.add(c);

			for (int c : ColorTemplate.JOYFUL_COLORS)
				colors.add(c);

			for (int c : ColorTemplate.COLORFUL_COLORS)
				colors.add(c);

			for (int c : ColorTemplate.LIBERTY_COLORS)
				colors.add(c);

			for (int c : ColorTemplate.PASTEL_COLORS)
				colors.add(c);

			colors.add(ColorTemplate.getHoloBlue());

			dataSet.setColors(colors);

			PieData data = new PieData(xVals, dataSet);
			data.setValueFormatter(new PercentFormatter());
			data.setValueTextSize(11f);
			data.setValueTextColor(Color.WHITE);
			two_blue_num_pc.setData(data);

			two_blue_num_pc.highlightValues(null);

			two_blue_num_pc.invalidate();
		}
	}
}
