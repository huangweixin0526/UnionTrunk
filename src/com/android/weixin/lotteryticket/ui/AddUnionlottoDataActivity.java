package com.android.weixin.lotteryticket.ui;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumberHelper;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
import com.android.weixin.lotteryticket.utils.DateUtil;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddUnionlottoDataActivity extends Activity {

	public static final int UNION_REQUEST_CODE = 121;
	public static final String DATA_ID = "DATA_ID";

	@ViewInject(R.id.add_date_et)
	private EditText mAddDateEt;

	@ViewInject(R.id.period_num_et)
	private EditText mPeriodNumEt;

	@ViewInject(R.id.red_num_one_et)
	private EditText mRedNumOneEt;

	@ViewInject(R.id.red_num_two_et)
	private EditText mRedNumTwoEt;

	@ViewInject(R.id.red_num_three_et)
	private EditText mRedNumThreeEt;

	@ViewInject(R.id.red_num_four_et)
	private EditText mRedNumFourEt;

	@ViewInject(R.id.red_num_five_et)
	private EditText mRedNumFiveEt;

	@ViewInject(R.id.red_num_six_et)
	private EditText mRedNumSixEt;

	@ViewInject(R.id.blue_num_et)
	private EditText mBlueNumEt;

	@ViewInject(R.id.click_confirm_btn)
	private Button mConfirmBtn;

	private int mDataId;
	private UnionLotteryNumbers mLotteryNumber;

	public static void openResult(Activity context) {
		openResult(context, -1);
	}

	public static void openResult(Activity context, int dataId) {
		Intent intent = new Intent(context, AddUnionlottoDataActivity.class);
		intent.putExtra(DATA_ID, dataId);
		context.startActivityForResult(intent, UNION_REQUEST_CODE);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.unionlotto_add_data_layout);
		ViewUtils.inject(this);
		mDataId = getIntent().getIntExtra(DATA_ID, -1);
		if (mDataId == -1) {
			mAddDateEt.setText(DateUtil.getCurrentDateStr());
		} else {
			mLotteryNumber = UnionLotteryNumberHelper.getInstance().getLotteryDataById(mDataId);
			initViewData();
		}
		setResult(Activity.RESULT_CANCELED);
	}

	private void initViewData() {
		if (mLotteryNumber != null) {
			mAddDateEt.setText(DateUtil.getConvertDateToStr(mLotteryNumber.getLotteryDate()));
			mPeriodNumEt.setText(mLotteryNumber.getPeriodNum());
			mRedNumOneEt.setText(mLotteryNumber.getRedNumOne());
			mRedNumTwoEt.setText(mLotteryNumber.getRedNumTwo());
			mRedNumThreeEt.setText(mLotteryNumber.getRedNumThree());
			mRedNumFourEt.setText(mLotteryNumber.getRedNumFour());
			mRedNumFiveEt.setText(mLotteryNumber.getRedNumFive());
			mRedNumSixEt.setText(mLotteryNumber.getRedNumSix());
			mBlueNumEt.setText(mLotteryNumber.getBlueNum());
		}
	}

	@OnClick(R.id.click_confirm_btn)
	public void onClickConfirmBtn(View view) {
		saveData();
	}

	private void saveData() {
		String addDate = mAddDateEt.getText().toString();
		if (TextUtils.isEmpty(addDate)) {
			Toast.makeText(this, getString(R.string.data_not_null), Toast.LENGTH_SHORT).show();
			return;
		}
		String periodNum = mPeriodNumEt.getText().toString();
		if (TextUtils.isEmpty(periodNum)) {
			Toast.makeText(this, getString(R.string.data_not_null), Toast.LENGTH_SHORT).show();
			return;
		}
		String redNumOne = mRedNumOneEt.getText().toString();
		if (TextUtils.isEmpty(redNumOne)) {
			Toast.makeText(this, getString(R.string.data_not_null), Toast.LENGTH_SHORT).show();
			return;
		}
		String redNumTwo = mRedNumTwoEt.getText().toString();
		if (TextUtils.isEmpty(redNumTwo)) {
			Toast.makeText(this, getString(R.string.data_not_null), Toast.LENGTH_SHORT).show();
			return;
		}
		String redNumThree = mRedNumThreeEt.getText().toString();
		if (TextUtils.isEmpty(redNumThree)) {
			Toast.makeText(this, getString(R.string.data_not_null), Toast.LENGTH_SHORT).show();
			return;
		}
		String redNumFour = mRedNumFourEt.getText().toString();
		if (TextUtils.isEmpty(redNumFour)) {
			Toast.makeText(this, getString(R.string.data_not_null), Toast.LENGTH_SHORT).show();
			return;
		}
		String redNumFive = mRedNumFiveEt.getText().toString();
		if (TextUtils.isEmpty(redNumFive)) {
			Toast.makeText(this, getString(R.string.data_not_null), Toast.LENGTH_SHORT).show();
			return;
		}
		String redNumSix = mRedNumSixEt.getText().toString();
		if (TextUtils.isEmpty(redNumSix)) {
			Toast.makeText(this, getString(R.string.data_not_null), Toast.LENGTH_SHORT).show();
			return;
		}
		String blueNum = mBlueNumEt.getText().toString();
		if (TextUtils.isEmpty(blueNum)) {
			Toast.makeText(this, getString(R.string.data_not_null), Toast.LENGTH_SHORT).show();
			return;
		}
		UnionLotteryNumbers lotteryNumber = null;
		if (mDataId == -1) {
			lotteryNumber = new UnionLotteryNumbers();
		} else {
			lotteryNumber = mLotteryNumber;
		}
		lotteryNumber.setLotteryDate(DateUtil.getConvertStrToDate(addDate));
		lotteryNumber.setPeriodNum(Integer.parseInt(periodNum));
		lotteryNumber.setRedNumOne(Integer.parseInt(redNumOne));
		lotteryNumber.setRedNumTwo(Integer.parseInt(redNumTwo));
		lotteryNumber.setRedNumThree(Integer.parseInt(redNumThree));
		lotteryNumber.setRedNumFour(Integer.parseInt(redNumFour));
		lotteryNumber.setRedNumFive(Integer.parseInt(redNumFive));
		lotteryNumber.setRedNumSix(Integer.parseInt(redNumSix));
		lotteryNumber.setBlueNum(Integer.parseInt(blueNum));

		UnionLotteryNumberHelper.getInstance().addLotteryData(lotteryNumber);

		clearViewData();
		Toast.makeText(this, getString(R.string.add_data_succeed), Toast.LENGTH_SHORT).show();
		setResult(Activity.RESULT_OK);
	}

	private void clearViewData() {
		mPeriodNumEt.setText("");
		mRedNumOneEt.setText("");
		mRedNumTwoEt.setText("");
		mRedNumThreeEt.setText("");
		mRedNumFourEt.setText("");
		mRedNumFiveEt.setText("");
		mRedNumSixEt.setText("");
		mBlueNumEt.setText("");
	}
}
