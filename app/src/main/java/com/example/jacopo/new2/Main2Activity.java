package com.example.jacopo.new2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.example.jacopo.new2.mFragment.HomeFragment;
import com.example.jacopo.new2.mFragment.ProfileFragment;
import com.example.jacopo.new2.mFragment.ChatFragment;
import com.example.jacopo.new2.mFragment.VideoFragment;
import com.example.jacopo.new2.mFragment.ViralFragment;


public class Main2Activity extends AppCompatActivity implements AHBottomNavigation.OnTabSelectedListener {

    AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);

        bottomNavigation = (AHBottomNavigation) findViewById(R.id.myBottomNavigation_ID);
        bottomNavigation.setOnTabSelectedListener(this);
        this.createNavItems();
}

    private void createNavItems() {
        //CREATE ITEMS
        AHBottomNavigationItem homeItem = new AHBottomNavigationItem(getString(R.string.home), R.drawable.ic_home);
        AHBottomNavigationItem viralItem = new AHBottomNavigationItem(getString(R.string.viral), R.drawable.ic_viral);
        AHBottomNavigationItem videoItem = new AHBottomNavigationItem(getString(R.string.add), R.drawable.ic_add);
        AHBottomNavigationItem searchItem = new AHBottomNavigationItem(getString(R.string.chat), R.drawable.ic_chat);
        AHBottomNavigationItem profileItem = new AHBottomNavigationItem(getString(R.string.profile), R.drawable.ic_profile);
        //ADD THEM to bar
        bottomNavigation.addItem(homeItem);
        bottomNavigation.addItem(viralItem);
        bottomNavigation.addItem(videoItem);
        bottomNavigation.addItem(searchItem);
        bottomNavigation.addItem(profileItem);
        //set properties
        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));
        bottomNavigation.setAccentColor(Color.parseColor("#00bcd4"));
        //set current item
        bottomNavigation.setCurrentItem(0);
        bottomNavigation.setBehaviorTranslationEnabled(true);

    }

    @Override
    public boolean onTabSelected(int position, boolean wasSelected) {
        //show fragment
        if (position == 0) {
            HomeFragment homeFragment=new HomeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,homeFragment).commit();
        } else if (position == 1) {
            ViralFragment viralFragment = new ViralFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id, viralFragment).commit();
        } else if (position == 2) {
            VideoFragment videoFragment = new VideoFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id, videoFragment).commit();
        } else if (position == 3) {
            ChatFragment chatFragment = new ChatFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id, chatFragment).commit();
        } else if (position == 4) {
            ProfileFragment profileFragment = new ProfileFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id, profileFragment).commit();
        }
        return true;
    }

}



