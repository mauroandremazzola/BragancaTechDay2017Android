package com.br.mauroandremazzola.bragancatechday2017.presentation.speaker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.br.mauroandremazzola.bragancatechday2017.R;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;

import org.parceler.Parcels;

import butterknife.ButterKnife;

/**
 * Created by Alex on 18/05/2017.
 */
public class SpeakerActivity extends AppCompatActivity implements SpeakerView {

    //region CONSTANTS
    public static final String EXTRA_SPEAKER = "com.br.mauroandremazzola.bragancatechday2017.EXTRA_SPEAKER";
    //endregion

    //region FIELDS
    private SpeakerPresenter presenter;
    //endregion

    //region LIFECYCLE
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_speaker);

        ButterKnife.bind(this);

        presenter = new SpeakerPresenter(this);

        init();
    }
    //endregion

    //region METHODS
    //region OVERRIDES METHODS
    @Override
    public void loadSpeaker(Speaker speaker) {

    }
    //endregion

    //region PRIVATE METHODS
    private void init() {
        Speaker speaker = Parcels.unwrap(getIntent().getParcelableExtra(EXTRA_SPEAKER));
        presenter.loadSpeaker(speaker);
    }
    //endregion
    //endregion
}
