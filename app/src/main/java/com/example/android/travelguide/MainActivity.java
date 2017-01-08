package com.example.android.travelguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //table的下划线
        getSupportActionBar().setElevation(0);

        ViewPager viewpager = (ViewPager) findViewById(R.id.pager);

        customFragmentPagerAdapter pageradapter = new customFragmentPagerAdapter(getSupportFragmentManager(), this);

        viewpager.setAdapter(pageradapter);

        TabLayout tab = (TabLayout) findViewById(R.id.tab);

        tab.setupWithViewPager(viewpager);

    }
}
