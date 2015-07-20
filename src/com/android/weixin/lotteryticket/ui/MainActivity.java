package com.android.weixin.lotteryticket.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.android.weixin.lotteryticket.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

public class MainActivity extends FragmentActivity {

	@ViewInject(R.id.union_lotto_btn)
	private Button mUnionBtn;
	@ViewInject(R.id.big_lotto_btn)
	private Button mBigBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		ViewUtils.inject(this);
	}

	@OnClick(R.id.union_lotto_btn)
	public void unionOnClick(View view) {
		UnionLottoActivity.open(this);
	}

	@OnClick(R.id.big_lotto_btn)
	public void bigOnClick(View view) {
		BigLottoActivity.open(this);
	}
}
