package com.android.weixin.unionlotto.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.weixin.unionlotto.R;
import com.lidroid.xutils.ViewUtils;

public class DataPreviewFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.data_preview_layout, container,false);
		ViewUtils.inject(this, view);
		return view;
	}
}
