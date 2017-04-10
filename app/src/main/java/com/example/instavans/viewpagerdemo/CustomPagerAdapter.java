package com.example.instavans.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.view.View;

/**
 * Created by Instavans-CH on 4/4/2017.
 */

public class CustomPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = CustomPagerAdapter.class.getSimpleName();
    private Fragment f,f1;

    public CustomPagerAdapter(FragmentManager fm, Fragment fragment,Fragment fragmenttwo) {
        super(fm);
        f= fragment;
        f1 = fragmenttwo;

        Log.d(TAG, f.toString());
        Log.d(TAG, f1.toString());

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return f;

            case 1:
                return f1;

            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0:
                return "page1";

            case 1:
                return "page2";

            default:
                return null;
        }

    }
}
