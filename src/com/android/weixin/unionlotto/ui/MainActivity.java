package com.android.weixin.unionlotto.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.android.weixin.unionlotto.R;
import com.android.weixin.unionlotto.ui.fragment.BlueNumForecastFragment;
import com.android.weixin.unionlotto.ui.fragment.DataPreviewFragment;
import com.android.weixin.unionlotto.ui.fragment.RedNumForecastFragment;
import com.android.weixin.unionlotto.widgets.indicator.TabPageIndicator;

public class MainActivity extends FragmentActivity {

	private static final String[] CONTENT = new String[] { "Recent", "Artists",
			"Albums", "Songs", "Playlists", "Genres" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		FragmentPagerAdapter adapter = new UnionlottoAdapter(
				getSupportFragmentManager());

		ViewPager pager = (ViewPager) findViewById(R.id.pager);
		pager.setAdapter(adapter);

		TabPageIndicator indicator = (TabPageIndicator) findViewById(R.id.indicator);
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
			AddLottoDataActivity.open(this);
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
				return new DataPreviewFragment();
			case 1:
				return new RedNumForecastFragment();
			case 2:
				return new BlueNumForecastFragment();
			default:
				return new DataPreviewFragment();
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
