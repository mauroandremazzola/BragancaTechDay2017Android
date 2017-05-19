package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.mauroandremazzola.bragancatechday2017.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Alex on 18/05/2017.
 */
public class SpeakersFragment extends Fragment {

    //region FIELDS
    @BindView(R.id.fragment_home_speakers_rcv_speakers)
    RecyclerView rcvSpeakers;
    //endregion

    //region LIFECYCLE
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_speakers, container, false);

        ButterKnife.bind(this, view);

        return view;
    }
    //endregion
}
