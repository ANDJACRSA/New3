package com.example.jacopo.new2;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.example.jacopo.new2.mFragment.HomeFragment;
import com.example.jacopo.new2.mFragment.ProfileFragment;
import com.example.jacopo.new2.mFragment.SearchFragment;
import com.example.jacopo.new2.mFragment.VideoFragment;
import com.example.jacopo.new2.mFragment.ViralFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class Main3Activity extends AppCompatActivity {

    BottomBar mBottomBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_home2) {
                    HomeFragment f=new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame﻿,f).commit();
                }
                else if (tabId == R.id.tab_viral2) {
                    ViralFragment f=new ViralFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame﻿,f).commit();
                }
                else if (tabId == R.id.tab_video2) {
                    VideoFragment f=new VideoFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame﻿,f).commit();
                }
                else if (tabId == R.id.tab_search2) {
                    SearchFragment f=new SearchFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame﻿,f).commit();
                }
                else if (tabId == R.id.tab_profile2) {
                    ProfileFragment f=new ProfileFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame﻿,f).commit();
                }
            }
        });
    }


}
