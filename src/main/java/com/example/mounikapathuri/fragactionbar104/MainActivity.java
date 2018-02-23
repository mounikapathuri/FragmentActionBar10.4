package com.example.mounikapathuri.fragactionbar104;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentTabHost fragmentTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentTabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(MainActivity.this,getSupportFragmentManager(),android.R.id.tabcontent);
        //adding tabs
        fragmentTabHost.addTab(fragmentTabHost.newTabSpec("Tab1").setIndicator("Audio",null),FragmentOne.class,null);
        fragmentTabHost.addTab(fragmentTabHost.newTabSpec("Tab2").setIndicator("Video",null),FragmentTwo.class,null);
    }
}
