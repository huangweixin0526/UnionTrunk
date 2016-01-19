package com.android.weixin.lotteryticket.ui;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.ui.fragment.TwoDataPreviewFragment;
import com.android.weixin.lotteryticket.widgets.CustomViewPager;
import com.android.weixin.lotteryticket.widgets.indicator.TabPageIndicator;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.Menu;
import android.view.MenuItem;

public class UnionLottoActivity extends FragmentActivity {

	private static final String[] CONTENT = new String[] { "Recent", "Artists", "Albums", "Songs", "Playlists", "Genres" };

	public static void open(Context context) {
		Intent intent = new Intent(context, UnionLottoActivity.class);
		context.startActivity(intent);
	}

	@ViewInject(R.id.union_lotto_pager)
	private CustomViewPager mPager;
	@ViewInject(R.id.union_lotto_indicator)
	private TabPageIndicator mIndicator;

	private FragmentPagerAdapter mFragmentAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.union_lotto_layout);
		ViewUtils.inject(this);

		mFragmentAdapter = new UnionlottoAdapter(getSupportFragmentManager());
		mPager.setAdapter(mFragmentAdapter);
		mIndicator.setViewPager(mPager);
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
			((TwoDataPreviewFragment)mFragmentAdapter.instantiateItem(mPager, 0)).refreshData();
		}
	}

	class UnionlottoAdapter extends FragmentPagerAdapter {
		public UnionlottoAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			switch (position) {
			case 0:
				return new TwoDataPreviewFragment();			
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
