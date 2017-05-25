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

    public static int CURRENT_TASK_FRAGMENT_POSITION = 0;
    public static int DONE_TASK_FRAGMENT_POSITION = 1;

    private CurrentTaskFragment currentTaskFragment;
    private DoneTaskFragment doneTaskFragment;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
        currentTaskFragment = new CurrentTaskFragment();
        doneTaskFragment = new DoneTaskFragment();
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return currentTaskFragment;
            case 1:
                return doneTaskFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
