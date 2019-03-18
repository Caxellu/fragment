package com.example.admin.myprojects.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import com.example.admin.myprojects.ui.base.BaseFragment;

import java.util.List;

public class MyFragmentsPagesAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> fragments;
    public MyFragmentsPagesAdapter(FragmentManager fm) {
        super(fm);
    }
    public void setList (List<BaseFragment> fragments)
    {
        this.fragments = fragments;
    }
    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle (int position){
        return fragments.get(position).getName();
    }
}
