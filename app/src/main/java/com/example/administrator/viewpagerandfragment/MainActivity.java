package com.example.administrator.viewpagerandfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.viewpagerandfragment.viewpagerfragment.ViewPagerAndFragmentActivity;
import com.umeng.analytics.MobclickAgent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button viewPagerFragment = findViewById(R.id.btn_viewpager_fragment);
        viewPagerFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_viewpager_fragment:
                Intent intent = new Intent(this, ViewPagerAndFragmentActivity.class);
                startActivity(intent);
                break;
        }

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
