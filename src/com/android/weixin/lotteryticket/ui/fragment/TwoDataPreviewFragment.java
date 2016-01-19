package com.android.weixin.lotteryticket.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.operational.MatrixOperation;
import com.android.weixin.lotteryticket.storage.unionlotto.BlueBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumberHelper;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
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

	private MatrixOperation mMatrixOperation;

	private List<UnionLotteryInfo> mDataSource;
	private TwoDataPreviewAdapter mRedNumForecastAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initVar();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
			@Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.two_data_preview_layout, container, false);
		return view;
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		ViewUtils.inject(this, view);
		List<UnionLotteryNumbers> unionLotteryData = getLotteryData();
		List<RedBallNumInfo> matrixRedLists = mMatrixOperation.initRedDataArray3_3(unionLotteryData);
		List<BlueBallNumInfo> matrixBlueLists = mMatrixOperation.initBlueDataArray3_3(unionLotteryData);
		mDataSource = getUnionLotteryInfo(unionLotteryData, matrixRedLists, matrixBlueLists);
		mRedNumForecastAdapter = new TwoDataPreviewAdapter(getActivity(), mDataSource);		
		mUnionWinning.setAdapter(mRedNumForecastAdapter);
	}

	private void initVar() {
		mMatrixOperation = new MatrixOperation();
	}

	private List<UnionLotteryNumbers> getLotteryData() {
		List<UnionLotteryNumbers> dataSource = UnionLotteryNumberHelper.getInstance().getLotteryNumbers();
		return dataSource;
	}

	private List<UnionLotteryInfo> getUnionLotteryInfo(List<UnionLotteryNumbers> unionLotteryData,
			List<RedBallNumInfo> matrixRedLists, List<BlueBallNumInfo> matrixBlueLists) {
		List<UnionLotteryInfo> dataSource = new ArrayList<UnionLotteryInfo>();
		for (int i = 0; i < matrixRedLists.size(); i++) {
			UnionLotteryInfo item = new UnionLotteryInfo();
			if (i < unionLotteryData.size()) {
				item.setPeriodNum(unionLotteryData.get(i).getPeriodNum());
				item.setLotteryDate(unionLotteryData.get(i).getLotteryDate());
				item.setUnionLotteryNumbers(unionLotteryData.get(i));
			}
			item.setRedBallNumInfo(matrixRedLists.get(i));
			item.setBlueBallNumInfo(matrixBlueLists.get(i));
			dataSource.add(item);
		}
		return dataSource;
	}

	public void refreshData() {

	}
}
