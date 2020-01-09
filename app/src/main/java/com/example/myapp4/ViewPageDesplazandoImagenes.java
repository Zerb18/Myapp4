package com.example.myapp4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPageDesplazandoImagenes extends FragmentPagerAdapter {
    public ViewPageDesplazandoImagenes(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new BlankFragmentperro();
            case 1:
                return new BlankFragmentgato();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
