package com.example.bsccsit8thsem;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class DashboardActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private  ViewPagerAdapter adapter;

    private String username;
    private int data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        username=getIntent().getStringExtra("Username");
        data=getIntent().getIntExtra("data", 0);
        Toast.makeText(DashboardActivity.this, username, Toast.LENGTH_SHORT).show();
        initToolbar();
        findViews();

        tabLayout.setupWithViewPager(viewPager);
    }

    private void initToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Dashboard");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        toolbar.setNavigationIcon(R.drawable.ic_user);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    private void findViews(){
        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewpager);
    }



}