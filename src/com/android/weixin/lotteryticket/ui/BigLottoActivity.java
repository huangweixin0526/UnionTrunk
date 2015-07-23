package com.android.weixin.lotteryticket.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.android.weixin.lotteryticket.R;
import com.android.weixin.lotteryticket.ui.UnionLottoActivity.UnionlottoAdapter;
import com.android.weixin.lotteryticket.ui.fragment.BlueNumForecastFragment;
import com.android.weixin.lotteryticket.ui.fragment.RedNumForecastFragment;
import com.android.weixin.lotteryticket.ui.fragment.TwoDataPreviewFragment;
import com.android.weixin.lotteryticket.widgets.indicator.TabPageIndicator;

public class BigLottoActivity extends FragmentActivity {

	private static final String[] CONTENT = new String[] { "Recent", "Artists", "Albums", "Songs", "Playlists", "Genres" };

	public static void open(Context context) {
		Intent intent = new Intent(context, BigLottoActivity.class);
		context.startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.big_lotto_layout);
		FragmentPagerAdapter adapter = new UnionlottoAdapter(getSupportFragmentManager());

		ViewPager pager = (ViewPager) findViewById(R.id.big_lotto_pager);
		pager.setAdapter(adapter);

		TabPageIndicator indicator = (TabPageIndicator) findViewById(R.id.big_lotto_indicator);
		indicator.setViewPager(pager);
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
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
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
			case 1:
				return new RedNumForecastFragment();
			case 2:
				return new BlueNumForecastFragment();
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
