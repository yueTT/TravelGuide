package com.example.android.travelguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by tom on 2017/1/6.
 */

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public CustomFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new XihuFragment();
        } else if (position == 1) {
            return new DayawanFragment();
        } else if (position == 2) {
            return new LuofuFragment();
        } else {
            return new WenquanFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.xihu_title);
        } else if (position == 1) {
            return context.getString(R.string.dayawan_title);
        } else if (position == 2) {
            return context.getString(R.string.luofu_title);
        } else {
            return context.getString(R.string.wenquan_title);
        }
    }
}
