package com.example.administrator.viewpagerandfragment.viewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import com.example.administrator.viewpagerandfragment.R;
import com.umeng.analytics.MobclickAgent;

import java.util.ArrayList;

public class ViewPagerAndFragmentActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_and_fragment);

        ViewPager viewPager = findViewById(R.id.viewpager_in_activity);
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new FirstFragment());
        fragments.add(new SecondFragment());
        fragments.add(new ThirdFragment());

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
        viewPager.setOffscreenPageLimit(fragments.size());

    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}
