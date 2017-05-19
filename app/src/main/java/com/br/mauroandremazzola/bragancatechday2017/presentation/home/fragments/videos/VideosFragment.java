package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.videos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.mauroandremazzola.bragancatechday2017.R;

import butterknife.ButterKnife;

/**
 * Created by Alex on 18/05/2017.
 */
public class VideosFragment extends Fragment {

    //region LIFECYCLE
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_videos, container, false);

        ButterKnife.bind(this, view);

        return view;
    }
    //endregion

}
