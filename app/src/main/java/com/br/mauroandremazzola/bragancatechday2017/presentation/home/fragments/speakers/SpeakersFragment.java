package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.speakers;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.br.mauroandremazzola.bragancatechday2017.R;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;
import com.br.mauroandremazzola.bragancatechday2017.presentation.speaker.SpeakerActivity;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Alex on 18/05/2017.
 */
public class SpeakersFragment extends Fragment implements SpeakersView {

    //region FIELDS
    @BindView(R.id.fragment_home_speakers_rcv_speakers)
    RecyclerView rcvSpeakers;

    private SpeakersAdapter adapter;
    private SpeakersPresenter presenter;
    //endregion

    //region LIFECYCLE
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_speakers, container, false);

        ButterKnife.bind(this, view);

        setupView();
        setupTransition();
        setupAdapter();

        presenter = new SpeakersPresenter(this);
        presenter.getSpeakers();

        return view;
    }
    //endregion

    //region METHODS
    //region OVERRIDES METHODS
    @Override
    public void loadSpeakers(List<Speaker> speakers) {
        adapter.setSpeakers(speakers);
        rcvSpeakers.setAdapter(adapter);
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

    private void setupTransition() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Explode explodeEnter = new Explode();
            explodeEnter.setDuration(300);
            explodeEnter.addTarget(R.id.activity_speaker_appbar);
            explodeEnter.addTarget(android.R.id.statusBarBackground);
            explodeEnter.addTarget(android.R.id.navigationBarBackground);
            Explode explodeExit = new Explode();
            explodeExit.addTarget(R.id.activity_speaker_appbar);
            explodeExit.addTarget(android.R.id.statusBarBackground);
            explodeExit.addTarget(android.R.id.navigationBarBackground);
            explodeExit.setDuration(300);
            getActivity().getWindow().setEnterTransition(explodeEnter);
            getActivity().getWindow().setExitTransition(explodeExit);
        }
    }

    private void setupAdapter() {
        adapter = new SpeakersAdapter();
        adapter.setListener(new SpeakersAdapter.SpeakerListener() {
            @Override
            public void onSpeakerClick(CircleImageView imgSpeaker, TextView tvwSpeaker, Speaker speaker) {
                Intent intent = new Intent(getActivity(), SpeakerActivity.class);
                intent.putExtra(SpeakerActivity.EXTRA_SPEAKER, Parcels.wrap(speaker));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), imgSpeaker, getString(R.string.transition_speaker_image));
                    startActivity(intent, options.toBundle());
                } else {
                    startActivity(intent);
                }
            }
        });
    }
    //endregion
    //endregion
}
