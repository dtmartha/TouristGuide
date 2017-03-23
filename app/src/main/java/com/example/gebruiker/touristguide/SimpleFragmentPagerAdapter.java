package com.example.gebruiker.touristguide;

import android.app.Activity;
import android.os.Bundle;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{"Rondvaart", "Restaurant", "Concerten", "Musea"};
    private Context context;


    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;


    }

    @Override
    public int getCount() {

        return PAGE_COUNT;

    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RondvaartFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new ConcertenFragment();
        } else {
            return new MuseaFragment();

        }


    }


    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }


}
