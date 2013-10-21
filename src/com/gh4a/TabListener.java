package com.gh4a;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class TabListener implements ActionBar.TabListener {
    
    private final int mTag;
    private ViewPager mPager;

    public TabListener(SherlockFragmentActivity activity, int tag, ViewPager pager) {
        mTag = tag;
        mPager = pager;
    }

    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        mPager.setCurrentItem(mTag);
        //mPager.setCurrentItem(mActivity.getSupportActionBar().getSelectedNavigationIndex());
    }

    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
    }

    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    }
}
