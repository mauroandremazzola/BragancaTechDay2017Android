package com.br.mauroandremazzola.bragancatechday2017.presentation.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.about.AboutFragment;
import com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.partners.PartnersFragment;
import com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.speakers.SpeakersFragment;
import com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.videos.VideosFragment;

/**
 * Created by Alex on 18/05/2017.
 */
public class HomeAdapter extends FragmentPagerAdapter {

    //region CONSTANTS
    static final int NUMBER_FRAGMENTS = 4;
    //endregion

    //region FIELDS
    private String[] titles;
    //endregion

    //region CONSTRUCT
    public HomeAdapter(FragmentManager fm) {
        super(fm);
        this.titles = new String[]{"sobre", "palestrantes", "parceiros", "vídeos"};
    }
    //endregion

    //region METHODS
    //region OVERRIDES METHODS
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutFragment();
            case 1:
                return new SpeakersFragment();
            case 2:
                return new PartnersFragment();
            default:
                return new VideosFragment();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_FRAGMENTS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
    //endregion
}
