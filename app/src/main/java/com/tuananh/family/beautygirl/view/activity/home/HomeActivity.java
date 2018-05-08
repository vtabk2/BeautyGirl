package com.tuananh.family.beautygirl.view.activity.home;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.tuananh.family.beautygirl.R;
import com.tuananh.family.beautygirl.databinding.ActivityHomeBinding;
import com.tuananh.family.beautygirl.view.adapter.HomeAdapter;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        initViews();
    }

    private void initViews() {
        HomeAdapter homeAdapter = new HomeAdapter(this, getSupportFragmentManager());
        mBinding.viewPager.setAdapter(homeAdapter);
        mBinding.tabLayout.setupWithViewPager(mBinding.viewPager);
        mBinding.viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {

            }
        });
    }
}
