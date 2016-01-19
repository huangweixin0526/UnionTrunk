package com.android.weixin.lotteryticket.ui.adapter;

import java.util.List;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.permanent.CalculateTypeConfig;
import com.android.weixin.lotteryticket.storage.unionlotto.BlueBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
import com.android.weixin.lotteryticket.utils.DateUtil;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TwoDataPreviewAdapter extends BaseAdapter {

	private Context mContext;
	private Drawable mMatrixWinningRedBlueBg;
	private Drawable mMatrixWinningRedRedBg;
	private Drawable mGrayBg;
	private Drawable mWhiteBg;
	private List<UnionLotteryInfo> mDataSource;

	public TwoDataPreviewAdapter(Context context, List<UnionLotteryInfo> dataSource) {
		this.mContext = context;
		this.mDataSource = dataSource;
		this.initVar();
	}

	private void initVar() {
		this.mMatrixWinningRedBlueBg = this.mContext.getResources().getDrawable(R.drawable.blue_ball_bg_shape);
		this.mMatrixWinningRedRedBg = this.mContext.getResources().getDrawable(R.drawable.red_ball_bg_shape);
		this.mGrayBg = new ColorDrawable(this.mContext.getResources().getColor(R.color.gray));
		this.mWhiteBg = new ColorDrawable(this.mContext.getResources().getColor(R.color.white));
	}

	@Override
	public int getCount() {
		if (mDataSource != null) {
			return mDataSource.size();
		}
		return 0;
	}

	@Override
	public UnionLotteryInfo getItem(int position) {
		if (mDataSource != null) {
			return mDataSource.get(position);
		}
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHoloder viewHoloder = null;
		if (convertView == null) {
			convertView = ((LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
					.inflate(R.layout.two_data_item_layout, parent, false);
			viewHoloder = new ViewHoloder(convertView);
			convertView.setTag(viewHoloder);
		} else {
			viewHoloder = (ViewHoloder) convertView.getTag();
		}
		setData(position, viewHoloder);
		return convertView;
	}

	private void setData(int position, ViewHoloder viewHoloder) {
		UnionLotteryInfo unionLotteryInfo = getItem(position);
		if (unionLotteryInfo != null) {
			viewHoloder.mUnionPeriodNum.setText(String.valueOf(unionLotteryInfo.getPeriodNum()));
			viewHoloder.mUnionLotteryDate.setText(DateUtil.getDateFormateTime(unionLotteryInfo.getLotteryDate()));
			if (position % 2 == 0) {
				viewHoloder.two_data_root_ll.setBackground(mGrayBg);
			} else {
				viewHoloder.two_data_root_ll.setBackground(mWhiteBg);
			}
			setPreviewData(position, unionLotteryInfo, viewHoloder);
			setRedBallViewData(position, unionLotteryInfo, viewHoloder);
			setBlueBallViewData(position, unionLotteryInfo, viewHoloder);
		}
	}

	private void setPreviewData(int position, UnionLotteryInfo unionLotteryInfo, ViewHoloder viewHoloder) {
		UnionLotteryNumbers unionLotteryNumbers = unionLotteryInfo.getUnionLotteryNumbers();
		if (unionLotteryNumbers != null) {
			viewHoloder.previewViewHoloder.two_red_num_one_tv
					.setText(String.valueOf(unionLotteryNumbers.getRedNumOne()));
			viewHoloder.previewViewHoloder.two_red_num_two_tv
					.setText(String.valueOf(unionLotteryNumbers.getRedNumTwo()));
			viewHoloder.previewViewHoloder.two_red_num_three_tv
					.setText(String.valueOf(unionLotteryNumbers.getRedNumThree()));
			viewHoloder.previewViewHoloder.two_red_num_four_tv
					.setText(String.valueOf(unionLotteryNumbers.getRedNumFour()));
			viewHoloder.previewViewHoloder.two_red_num_five_tv
					.setText(String.valueOf(unionLotteryNumbers.getRedNumFive()));
			viewHoloder.previewViewHoloder.two_red_num_six_tv
					.setText(String.valueOf(unionLotteryNumbers.getRedNumSix()));
			viewHoloder.previewViewHoloder.two_blue_num_tv.setText(String.valueOf(unionLotteryNumbers.getBlueNum()));
		}
	}

	private void setRedBallViewData(int position, UnionLotteryInfo unionLotteryInfo, ViewHoloder viewHoloder) {
		RedBallNumInfo redBallNumInfo = unionLotteryInfo.getRedBallNumInfo();
		if (redBallNumInfo != null) {

			if (redBallNumInfo.getRedBallNum1() > 0 && isDataShow(redBallNumInfo.getRedBallNum1Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum1.setText(String.valueOf(redBallNumInfo.getRedBallNum1()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum1
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum1Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum1.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum1.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum2() > 0 && isDataShow(redBallNumInfo.getRedBallNum2Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum2.setText(String.valueOf(redBallNumInfo.getRedBallNum2()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum2
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum2Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum2.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum2.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum3() > 0 && isDataShow(redBallNumInfo.getRedBallNum3Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum3.setText(String.valueOf(redBallNumInfo.getRedBallNum3()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum3
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum3Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum3.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum3.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum4() > 0 && isDataShow(redBallNumInfo.getRedBallNum4Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum4.setText(String.valueOf(redBallNumInfo.getRedBallNum4()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum4
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum4Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum4.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum4.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum5() > 0 && isDataShow(redBallNumInfo.getRedBallNum5Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum5.setText(String.valueOf(redBallNumInfo.getRedBallNum5()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum5
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum5Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum5.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum5.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum6() > 0 && isDataShow(redBallNumInfo.getRedBallNum6Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum6.setText(String.valueOf(redBallNumInfo.getRedBallNum6()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum6
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum6Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum6.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum6.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum7() > 0 && isDataShow(redBallNumInfo.getRedBallNum7Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum7.setText(String.valueOf(redBallNumInfo.getRedBallNum7()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum7
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum7Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum7.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum7.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum8() > 0 && isDataShow(redBallNumInfo.getRedBallNum8Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum8.setText(String.valueOf(redBallNumInfo.getRedBallNum8()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum8
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum8Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum8.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum8.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum9() > 0 && isDataShow(redBallNumInfo.getRedBallNum9Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum9.setText(String.valueOf(redBallNumInfo.getRedBallNum9()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum9
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum9Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum9.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum9.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum10() > 0 && isDataShow(redBallNumInfo.getRedBallNum10Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum10
						.setText(String.valueOf(redBallNumInfo.getRedBallNum10()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum10
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum10Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum10.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum10.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum11() > 0 && isDataShow(redBallNumInfo.getRedBallNum11Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum11
						.setText(String.valueOf(redBallNumInfo.getRedBallNum11()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum11
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum11Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum11.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum11.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum12() > 0 && isDataShow(redBallNumInfo.getRedBallNum12Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum12
						.setText(String.valueOf(redBallNumInfo.getRedBallNum12()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum12
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum12Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum12.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum12.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum13() > 0 && isDataShow(redBallNumInfo.getRedBallNum13Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum13
						.setText(String.valueOf(redBallNumInfo.getRedBallNum13()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum13
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum13Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum13.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum13.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum14() > 0 && isDataShow(redBallNumInfo.getRedBallNum14Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum14
						.setText(String.valueOf(redBallNumInfo.getRedBallNum14()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum14
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum14Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum14.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum14.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum15() > 0 && isDataShow(redBallNumInfo.getRedBallNum15Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum15
						.setText(String.valueOf(redBallNumInfo.getRedBallNum15()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum15
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum15Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum15.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum15.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum16() > 0 && isDataShow(redBallNumInfo.getRedBallNum16Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum16
						.setText(String.valueOf(redBallNumInfo.getRedBallNum16()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum16
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum16Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum16.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum16.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum17() > 0 && isDataShow(redBallNumInfo.getRedBallNum17Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum17
						.setText(String.valueOf(redBallNumInfo.getRedBallNum17()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum17
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum17Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum17.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum17.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum18() > 0 && isDataShow(redBallNumInfo.getRedBallNum18Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum18
						.setText(String.valueOf(redBallNumInfo.getRedBallNum18()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum18
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum18Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum18.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum18.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum19() > 0 && isDataShow(redBallNumInfo.getRedBallNum19Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum19
						.setText(String.valueOf(redBallNumInfo.getRedBallNum19()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum19
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum19Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum19.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum19.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum20() > 0 && isDataShow(redBallNumInfo.getRedBallNum20Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum20
						.setText(String.valueOf(redBallNumInfo.getRedBallNum20()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum20
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum20Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum20.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum20.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum21() > 0 && isDataShow(redBallNumInfo.getRedBallNum21Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum21
						.setText(String.valueOf(redBallNumInfo.getRedBallNum21()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum21
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum21Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum21.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum21.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum22() > 0 && isDataShow(redBallNumInfo.getRedBallNum22Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum22
						.setText(String.valueOf(redBallNumInfo.getRedBallNum22()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum22
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum22Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum22.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum22.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum23() > 0 && isDataShow(redBallNumInfo.getRedBallNum23Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum23
						.setText(String.valueOf(redBallNumInfo.getRedBallNum23()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum23
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum23Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum23.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum23.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum24() > 0 && isDataShow(redBallNumInfo.getRedBallNum24Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum24
						.setText(String.valueOf(redBallNumInfo.getRedBallNum24()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum24
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum24Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum24.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum24.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum25() > 0 && isDataShow(redBallNumInfo.getRedBallNum25Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum25
						.setText(String.valueOf(redBallNumInfo.getRedBallNum25()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum25
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum25Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum25.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum25.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum26() > 0 && isDataShow(redBallNumInfo.getRedBallNum26Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum26
						.setText(String.valueOf(redBallNumInfo.getRedBallNum26()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum26
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum26Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum26.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum26.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum27() > 0 && isDataShow(redBallNumInfo.getRedBallNum27Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum27
						.setText(String.valueOf(redBallNumInfo.getRedBallNum27()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum27
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum27Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum27.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum27.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum28() > 0 && isDataShow(redBallNumInfo.getRedBallNum28Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum28
						.setText(String.valueOf(redBallNumInfo.getRedBallNum28()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum28
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum28Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum28.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum28.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum29() > 0 && isDataShow(redBallNumInfo.getRedBallNum29Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum29
						.setText(String.valueOf(redBallNumInfo.getRedBallNum29()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum29
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum29Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum29.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum29.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum30() > 0 && isDataShow(redBallNumInfo.getRedBallNum30Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum30
						.setText(String.valueOf(redBallNumInfo.getRedBallNum30()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum30
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum30Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum30.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum30.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum31() > 0 && isDataShow(redBallNumInfo.getRedBallNum31Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum31
						.setText(String.valueOf(redBallNumInfo.getRedBallNum31()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum31
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum31Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum31.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum31.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum32() > 0 && isDataShow(redBallNumInfo.getRedBallNum32Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum32
						.setText(String.valueOf(redBallNumInfo.getRedBallNum32()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum32
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum32Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum32.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum32.setBackground(null);
			}

			if (redBallNumInfo.getRedBallNum33() > 0 && isDataShow(redBallNumInfo.getRedBallNum33Type())) {
				viewHoloder.unionRedViewHoloder.mUnionRedNum33
						.setText(String.valueOf(redBallNumInfo.getRedBallNum33()));
				viewHoloder.unionRedViewHoloder.mUnionRedNum33
						.setBackground(getNumberBg(redBallNumInfo.getRedBallNum33Type()));
			} else {
				viewHoloder.unionRedViewHoloder.mUnionRedNum33.setText("");
				viewHoloder.unionRedViewHoloder.mUnionRedNum33.setBackground(null);
			}
		}
	}

	private void setBlueBallViewData(int position, UnionLotteryInfo unionLotteryInfo, ViewHoloder viewHoloder) {
		BlueBallNumInfo blueBallNumInfo = unionLotteryInfo.getBlueBallNumInfo();
		if (blueBallNumInfo != null) {
			if (blueBallNumInfo.getBlueBallNum1() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum1Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData1
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum1()));
				viewHoloder.blueNumForecastHolder.blueNumData1
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum1Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData1.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData1.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum2() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum2Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData2
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum2()));
				viewHoloder.blueNumForecastHolder.blueNumData2
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum2Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData2.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData2.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum3() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum3Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData3
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum3()));
				viewHoloder.blueNumForecastHolder.blueNumData3
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum3Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData3.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData3.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum4() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum4Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData4
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum4()));
				viewHoloder.blueNumForecastHolder.blueNumData4
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum4Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData4.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData4.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum5() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum5Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData5
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum5()));
				viewHoloder.blueNumForecastHolder.blueNumData5
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum5Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData5.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData5.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum6() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum6Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData6
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum6()));
				viewHoloder.blueNumForecastHolder.blueNumData6
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum6Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData6.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData6.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum7() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum7Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData7
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum7()));
				viewHoloder.blueNumForecastHolder.blueNumData7
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum7Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData7.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData7.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum8() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum8Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData8
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum8()));
				viewHoloder.blueNumForecastHolder.blueNumData8
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum8Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData8.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData8.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum9() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum9Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData9
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum9()));
				viewHoloder.blueNumForecastHolder.blueNumData9
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum9Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData9.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData9.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum10() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum10Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData10
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum10()));
				viewHoloder.blueNumForecastHolder.blueNumData10
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum10Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData10.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData10.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum11() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum11Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData11
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum11()));
				viewHoloder.blueNumForecastHolder.blueNumData11
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum11Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData11.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData11.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum12() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum12Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData12
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum12()));
				viewHoloder.blueNumForecastHolder.blueNumData12
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum12Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData12.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData12.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum13() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum13Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData13
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum13()));
				viewHoloder.blueNumForecastHolder.blueNumData13
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum13Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData13.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData13.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum14() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum14Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData14
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum14()));
				viewHoloder.blueNumForecastHolder.blueNumData14
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum14Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData14.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData14.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum15() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum15Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData15
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum15()));
				viewHoloder.blueNumForecastHolder.blueNumData15
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum15Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData15.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData15.setBackground(null);
			}

			if (blueBallNumInfo.getBlueBallNum16() > 0 && isDataShow(blueBallNumInfo.getBlueBallNum16Type())) {
				viewHoloder.blueNumForecastHolder.blueNumData16
						.setText(String.valueOf(blueBallNumInfo.getBlueBallNum16()));
				viewHoloder.blueNumForecastHolder.blueNumData16
						.setBackground(getBlueNumberBg(blueBallNumInfo.getBlueBallNum16Type()));
			} else {
				viewHoloder.blueNumForecastHolder.blueNumData16.setText("");
				viewHoloder.blueNumForecastHolder.blueNumData16.setBackground(null);
			}
		}
	}

	private boolean isDataShow(int numType) {
		if (numType != CalculateTypeConfig.CALCULATE_TYPE_WINNING) {
			return true;
		}
		return false;
	}

	private Drawable getNumberBg(int calculateType) {
		if (calculateType == CalculateTypeConfig.CALCULATE_TYPE_MATRIX_WINNING) {
			return this.mMatrixWinningRedRedBg;
		}
		// if (calculateType == CalculateTypeConfig.CALCULATE_TYPE_WINNING) {
		// return this.mWinningBg;
		// }
		return null;
	}
	
	private Drawable getBlueNumberBg(int calculateType) {
		if (calculateType == CalculateTypeConfig.CALCULATE_TYPE_MATRIX_WINNING) {
			return this.mMatrixWinningRedBlueBg;
		}
		// if (calculateType == CalculateTypeConfig.CALCULATE_TYPE_WINNING) {
		// return this.mWinningBg;
		// }
		return null;
	}

	private class ViewHoloder {
		@ViewInject(R.id.two_data_root_ll)
		private View two_data_root_ll;
		@ViewInject(R.id.two_period_num_tv)
		private TextView mUnionPeriodNum;
		@ViewInject(R.id.two_lottery_date_tv)
		private TextView mUnionLotteryDate;

		private PreviewViewHoloder previewViewHoloder;

		private UnionRedViewHoloder unionRedViewHoloder;

		private BlueNumForecastHolder blueNumForecastHolder;

		private ViewHoloder(View view) {
			ViewUtils.inject(this, view);
			previewViewHoloder = new PreviewViewHoloder(view);
			unionRedViewHoloder = new UnionRedViewHoloder(view);
			blueNumForecastHolder = new BlueNumForecastHolder(view);
		}
	}

	private class PreviewViewHoloder {
		@ViewInject(R.id.two_red_num_one_tv)
		private TextView two_red_num_one_tv;
		@ViewInject(R.id.two_red_num_two_tv)
		private TextView two_red_num_two_tv;
		@ViewInject(R.id.two_red_num_three_tv)
		private TextView two_red_num_three_tv;
		@ViewInject(R.id.two_red_num_four_tv)
		private TextView two_red_num_four_tv;
		@ViewInject(R.id.two_red_num_five_tv)
		private TextView two_red_num_five_tv;
		@ViewInject(R.id.two_red_num_six_tv)
		private TextView two_red_num_six_tv;
		@ViewInject(R.id.two_blue_num_tv)
		private TextView two_blue_num_tv;

		private PreviewViewHoloder(View view) {
			ViewUtils.inject(this, view);
		}
	}

	private class UnionRedViewHoloder {
		@ViewInject(R.id.union_red_num_1_tv)
		private TextView mUnionRedNum1;
		@ViewInject(R.id.union_red_num_2_tv)
		private TextView mUnionRedNum2;
		@ViewInject(R.id.union_red_num_3_tv)
		private TextView mUnionRedNum3;
		@ViewInject(R.id.union_red_num_4_tv)
		private TextView mUnionRedNum4;
		@ViewInject(R.id.union_red_num_5_tv)
		private TextView mUnionRedNum5;
		@ViewInject(R.id.union_red_num_6_tv)
		private TextView mUnionRedNum6;
		@ViewInject(R.id.union_red_num_7_tv)
		private TextView mUnionRedNum7;
		@ViewInject(R.id.union_red_num_8_tv)
		private TextView mUnionRedNum8;
		@ViewInject(R.id.union_red_num_9_tv)
		private TextView mUnionRedNum9;
		@ViewInject(R.id.union_red_num_10_tv)
		private TextView mUnionRedNum10;
		@ViewInject(R.id.union_red_num_11_tv)
		private TextView mUnionRedNum11;
		@ViewInject(R.id.union_red_num_12_tv)
		private TextView mUnionRedNum12;
		@ViewInject(R.id.union_red_num_13_tv)
		private TextView mUnionRedNum13;
		@ViewInject(R.id.union_red_num_14_tv)
		private TextView mUnionRedNum14;
		@ViewInject(R.id.union_red_num_15_tv)
		private TextView mUnionRedNum15;
		@ViewInject(R.id.union_red_num_16_tv)
		private TextView mUnionRedNum16;
		@ViewInject(R.id.union_red_num_17_tv)
		private TextView mUnionRedNum17;
		@ViewInject(R.id.union_red_num_18_tv)
		private TextView mUnionRedNum18;
		@ViewInject(R.id.union_red_num_19_tv)
		private TextView mUnionRedNum19;
		@ViewInject(R.id.union_red_num_20_tv)
		private TextView mUnionRedNum20;
		@ViewInject(R.id.union_red_num_21_tv)
		private TextView mUnionRedNum21;
		@ViewInject(R.id.union_red_num_22_tv)
		private TextView mUnionRedNum22;
		@ViewInject(R.id.union_red_num_23_tv)
		private TextView mUnionRedNum23;
		@ViewInject(R.id.union_red_num_24_tv)
		private TextView mUnionRedNum24;
		@ViewInject(R.id.union_red_num_25_tv)
		private TextView mUnionRedNum25;
		@ViewInject(R.id.union_red_num_26_tv)
		private TextView mUnionRedNum26;
		@ViewInject(R.id.union_red_num_27_tv)
		private TextView mUnionRedNum27;
		@ViewInject(R.id.union_red_num_28_tv)
		private TextView mUnionRedNum28;
		@ViewInject(R.id.union_red_num_29_tv)
		private TextView mUnionRedNum29;
		@ViewInject(R.id.union_red_num_30_tv)
		private TextView mUnionRedNum30;
		@ViewInject(R.id.union_red_num_31_tv)
		private TextView mUnionRedNum31;
		@ViewInject(R.id.union_red_num_32_tv)
		private TextView mUnionRedNum32;
		@ViewInject(R.id.union_red_num_33_tv)
		private TextView mUnionRedNum33;

		private UnionRedViewHoloder(View view) {
			ViewUtils.inject(this, view);
		}
	}

	private class BlueNumForecastHolder {
		@ViewInject(R.id.blue_num_1_tv)
		private TextView blueNumData1;
		@ViewInject(R.id.blue_num_2_tv)
		private TextView blueNumData2;
		@ViewInject(R.id.blue_num_3_tv)
		private TextView blueNumData3;
		@ViewInject(R.id.blue_num_4_tv)
		private TextView blueNumData4;
		@ViewInject(R.id.blue_num_5_tv)
		private TextView blueNumData5;
		@ViewInject(R.id.blue_num_6_tv)
		private TextView blueNumData6;
		@ViewInject(R.id.blue_num_7_tv)
		private TextView blueNumData7;
		@ViewInject(R.id.blue_num_8_tv)
		private TextView blueNumData8;
		@ViewInject(R.id.blue_num_9_tv)
		private TextView blueNumData9;
		@ViewInject(R.id.blue_num_10_tv)
		private TextView blueNumData10;
		@ViewInject(R.id.blue_num_11_tv)
		private TextView blueNumData11;
		@ViewInject(R.id.blue_num_12_tv)
		private TextView blueNumData12;
		@ViewInject(R.id.blue_num_13_tv)
		private TextView blueNumData13;
		@ViewInject(R.id.blue_num_14_tv)
		private TextView blueNumData14;
		@ViewInject(R.id.blue_num_15_tv)
		private TextView blueNumData15;
		@ViewInject(R.id.blue_num_16_tv)
		private TextView blueNumData16;

		private BlueNumForecastHolder(View view) {
			ViewUtils.inject(this, view);
		}
	}
}
