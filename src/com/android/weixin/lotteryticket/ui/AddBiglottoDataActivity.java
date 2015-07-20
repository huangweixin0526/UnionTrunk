package com.android.weixin.lotteryticket.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.android.weixin.lotteryticket.R;

public class AddBiglottoDataActivity extends Activity {

	public static void open(Context context) {
		Intent intent = new Intent(context, AddBiglottoDataActivity.class);
		context.startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.biglotto_add_data_layout);
	}
}
