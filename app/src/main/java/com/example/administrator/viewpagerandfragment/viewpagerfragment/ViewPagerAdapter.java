package com.example.administrator.viewpagerandfragment.viewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragmentArrayList;

    ViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragmentArrayList) {
        super(fm);
        this.fragmentArrayList = fragmentArrayList;
    }
    @Override
    public int getCount() {
        return fragmentArrayList == null ? 0:fragmentArrayList.size();
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

}
