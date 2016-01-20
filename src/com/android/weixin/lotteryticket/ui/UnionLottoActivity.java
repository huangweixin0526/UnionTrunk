package com.android.weixin.lotteryticket.ui;

import java.util.ArrayList;
import java.util.List;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.operational.MatrixOperation;
import com.android.weixin.lotteryticket.storage.unionlotto.BlueBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.RedBallNumInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryInfo;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumberHelper;
import com.android.weixin.lotteryticket.storage.unionlotto.UnionLotteryNumbers;
import com.android.weixin.lotteryticket.ui.fragment.TwoDataPreviewFragment;
import com.android.weixin.lotteryticket.ui.fragment.TwoDataStatisticsFragment;
import com.android.weixin.lotteryticket.widgets.CustomViewPager;
import com.android.weixin.lotteryticket.widgets.indicator.TabPageIndicator;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.socks.library.KLog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.MenuItem;

public class UnionLottoActivity extends FragmentActivity implements OnPageChangeListener {

	private static final String[] CONTENT = new String[] { "Recent", "Artists" };

	public static void open(Context context) {
		Intent intent = new Intent(context, UnionLottoActivity.class);
		context.startActivity(intent);
	}

	@ViewInject(R.id.union_lotto_pager)
	private CustomViewPager mPager;
	@ViewInject(R.id.union_lotto_indicator)
	private TabPageIndicator mIndicator;

	private FragmentPagerAdapter mFragmentAdapter;
	private List<UnionLotteryInfo> mDataSource;
	private MatrixOperation mMatrixOperation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.union_lotto_layout);
		ViewUtils.inject(this);
		initVar();
		initData();
		mFragmentAdapter = new UnionlottoAdapter(getSupportFragmentManager());
		mPager.setAdapter(mFragmentAdapter);
		mIndicator.setViewPager(mPager);
		mPager.setOnPageChangeListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.union_lotto_menu_lay, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_add_data:
			AddUnionlottoDataActivity.openResult(this);
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onActivityResult(int arg0, int arg1, Intent arg2) {
		super.onActivityResult(arg0, arg1, arg2);
		if (arg0 == AddUnionlottoDataActivity.UNION_REQUEST_CODE && arg1 == Activity.RESULT_OK) {
			((TwoDataPreviewFragment) mFragmentAdapter.instantiateItem(mPager, 0)).refreshData();
		}
	}

	private void initVar() {
		mMatrixOperation = new MatrixOperation();
	}

	private void initData() {
		List<UnionLotteryNumbers> unionLotteryData = getLotteryData();
		List<RedBallNumInfo> matrixRedLists = mMatrixOperation.initRedDataArray3_3(unionLotteryData);
		List<BlueBallNumInfo> matrixBlueLists = mMatrixOperation.initBlueDataArray3_3(unionLotteryData);
		mDataSource = getUnionLotteryInfo(unionLotteryData, matrixRedLists, matrixBlueLists);
	}

	private List<UnionLotteryNumbers> getLotteryData() {
		List<UnionLotteryNumbers> dataSource = UnionLotteryNumberHelper.getInstance().getLotteryNumbers();
		return dataSource;
	}

	private List<UnionLotteryInfo> getUnionLotteryInfo(List<UnionLotteryNumbers> unionLotteryData, List<RedBallNumInfo> matrixRedLists,
			List<BlueBallNumInfo> matrixBlueLists) {
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

	@Override
	public void onPageScrollStateChanged(int arg0) {

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {

	}

	@Override
	public void onPageSelected(int arg0) {
		KLog.v("--->", "page selected index：" + arg0);
	}

	class UnionlottoAdapter extends FragmentPagerAdapter {
		public UnionlottoAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			switch (position) {
			case 0:
				TwoDataPreviewFragment twoDataPreviewFragment = new TwoDataPreviewFragment();
				twoDataPreviewFragment.setDataSource(mDataSource);
				return twoDataPreviewFragment;
			case 1:
				TwoDataStatisticsFragment twoDataStatisticsFragment = new TwoDataStatisticsFragment();
				twoDataStatisticsFragment.setDataSource(mDataSource);
				return twoDataStatisticsFragment;
			default:
				return new TwoDataPreviewFragment();
			}
		}

		@Override
		public CharSequence getPageTitle(int position) {
			return CONTENT[position % CONTENT.length].toUpperCase();
		}

		@Override
		public int getCount() {
			return CONTENT.length;
		}
	}
}
