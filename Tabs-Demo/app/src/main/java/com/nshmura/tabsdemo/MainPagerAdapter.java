package com.nshmura.tabsdemo;

import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nshmura on 15/06/06.
 */
public class MainPagerAdapter extends PagerAdapter {

    private String[] mCategories;

    public MainPagerAdapter(String[] categories) {
        mCategories = categories;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textView = new TextView(container.getContext());
        textView.setText(mCategories[position]);
        textView.setGravity(Gravity.CENTER);
        container.addView(textView);
        return textView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mCategories[position];
    }

    @Override
    public int getCount() {
        return mCategories.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
