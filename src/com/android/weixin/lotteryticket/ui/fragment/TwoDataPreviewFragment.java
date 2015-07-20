package com.android.weixin.lotteryticket.ui.fragment;

import java.util.List;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
import com.android.weixin.lotteryticket.ui.adapter.TwoDataPreviewAdapter;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class TwoDataPreviewFragment extends Fragment{
	
	@ViewInject(R.id.union_winning_data_preivew_lv)
	private ListView mUnionWinning;
	
	private List<UnionLotteryNumbers> mUnionLotteryData;
	private TwoDataPreviewAdapter mTwoDataPreviewAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.two_data_preview_layout, container,false);
		ViewUtils.inject(this, view);
		
		mTwoDataPreviewAdapter = new TwoDataPreviewAdapter(getActivity(),mUnionLotteryData);
		mUnionWinning.setAdapter(mTwoDataPreviewAdapter);
		return view;
	}
}
