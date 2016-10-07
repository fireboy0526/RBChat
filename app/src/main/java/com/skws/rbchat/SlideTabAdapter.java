package com.skws.rbchat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Eric on 10/3/2016.
 */

public class SlideTabAdapter extends FragmentStatePagerAdapter {
    private int mNumOfTabs;

    public SlideTabAdapter (FragmentManager fm, int NumOfTabs) {
        super(fm);

        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            Register_Tab1_RBRegister tab1 = new Register_Tab1_RBRegister();
            return tab1;
        } else {
            Register_Tab2_OtherRegister tab2 = new Register_Tab2_OtherRegister();
            return tab2;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
