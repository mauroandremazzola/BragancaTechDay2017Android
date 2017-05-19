package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.speakers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.mauroandremazzola.bragancatechday2017.R;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Alex on 18/05/2017.
 */
public class SpeakersFragment extends Fragment implements SpeakersView {

    //region FIELDS
    @BindView(R.id.fragment_home_speakers_rcv_speakers)
    RecyclerView rcvSpeakers;

    private SpeakersPresenter presenter;
    //endregion

    //region LIFECYCLE
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_speakers, container, false);

        ButterKnife.bind(this, view);

        setupView();

        presenter = new SpeakersPresenter(this);
        presenter.getSpeakers();

        return view;
    }
    //endregion

    //region METHODS
    //region OVERRIDES METHODS
    @Override
    public void loadSpeakers(List<Speaker> speakers) {
        rcvSpeakers.setAdapter(new SpeakersAdapter(speakers));
    }

    @Override
    public void loadSpeakersFail() {

    }
    //endregion

    //region PRIVATE METHODS
    private void setupView() {
        rcvSpeakers.setLayoutManager(new LinearLayoutManager(getContext()));
        rcvSpeakers.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
    }
    //endregion
    //endregion
}
