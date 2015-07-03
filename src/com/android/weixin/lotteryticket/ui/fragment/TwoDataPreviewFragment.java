package com.android.weixin.lotteryticket.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.weixin.lotteryticket.R;
import com.lidroid.xutils.ViewUtils;

public class TwoDataPreviewFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.two_data_preview_layout, container,false);
		ViewUtils.inject(this, view);
		return view;
	}
}
