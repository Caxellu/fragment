package com.example.admin.myprojects;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.myprojects.ui.adapter.MyFragmentsPagesAdapter;
import com.example.admin.myprojects.ui.base.BaseFragment;
import com.example.admin.myprojects.ui.fragments.BlueFragment;
import com.example.admin.myprojects.ui.fragments.GreenFragment;
import com.example.admin.myprojects.ui.fragments.OrangeFragment;
import com.example.admin.myprojects.ui.fragments.PinkFragment;
import com.example.admin.myprojects.ui.fragments.RedFragment;
import com.example.admin.myprojects.ui.fragments.YellowFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager frameLayout;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.frame);
        tabLayout =findViewById(R.id.tabLayout);
        Fragment yellowfragments = new YellowFragment();
       Fragment bluefragments = new BlueFragment();
        Fragment pinkfragments = new PinkFragment();
        Fragment greenfragment =new GreenFragment();
        Fragment redfragment = new RedFragment();
        Fragment orangefragment = new OrangeFragment();
        ArrayList<BaseFragment> fragments = new ArrayList<>();
        fragments.add((BaseFragment) orangefragment);
        fragments.add((BaseFragment) pinkfragments);
        fragments.add((BaseFragment) yellowfragments);
        fragments.add((BaseFragment) bluefragments);
        fragments.add((BaseFragment) greenfragment);
        fragments.add((BaseFragment) redfragment);
        MyFragmentsPagesAdapter adapter = new MyFragmentsPagesAdapter(getSupportFragmentManager());
        adapter.setList(fragments);
        frameLayout.setAdapter(adapter);
        tabLayout.setupWithViewPager(frameLayout);
//        FragmentTransaction imagineFragmen = getSupportFragmentManager().beginTransaction();
//        imagineFragmen.replace (frameLayout.getId(),mainfragment);
    }
}
