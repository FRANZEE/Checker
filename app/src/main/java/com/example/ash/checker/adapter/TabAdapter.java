package com.example.ash.checker.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import com.example.ash.checker.fragment.CurrentTaskFragment;
import com.example.ash.checker.fragment.DoneTaskFragment;

/**
 * Created by ash on 15.05.17.
 */

public class TabAdapter extends FragmentStatePagerAdapter  {

    private int numberOfTabs;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return new CurrentTaskFragment();
            case 1:
                return new DoneTaskFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
