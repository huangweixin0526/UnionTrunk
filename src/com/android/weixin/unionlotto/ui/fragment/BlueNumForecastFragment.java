package com.android.weixin.unionlotto.ui.fragment;

import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.weixin.unionlotto.R;
import com.android.weixin.unionlotto.storage.BlueBallNumInfo;
import com.android.weixin.unionlotto.ui.adapter.BlueNumForecastAdapter;

public class BlueNumForecastFragment extends Fragment {
	
	private List<BlueBallNumInfo> mForecastDataSource;
	private BlueNumForecastAdapter mBlueNumForecastAdapter;
	private ListView mBlueNumForecast;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBlueNumForecastAdapter = new BlueNumForecastAdapter(getActivity(), mForecastDataSource);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.blue_num_forecast_layout,
				container, false);
		mBlueNumForecast = (ListView) view.findViewById(R.id.blue_num_forecast_lv);
		mBlueNumForecast.setAdapter(mBlueNumForecastAdapter);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}
}
