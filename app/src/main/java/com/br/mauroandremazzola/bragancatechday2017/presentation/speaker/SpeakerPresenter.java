package com.br.mauroandremazzola.bragancatechday2017.presentation.speaker;

import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;

/**
 * Created by Alex on 18/05/2017.
 */
public class SpeakerPresenter {

    //region FIELDS
    private Speaker speaker;
    private SpeakerView view;
    //endregion

    //region CONSTRUCT
    public SpeakerPresenter(SpeakerView view) {
        this.view = view;
    }
    //endregion

    //region METHODS
    //region PUBLIC METHODS
    public void loadSpeaker(Speaker speaker) {
        this.speaker = speaker;

        view.loadSpeaker(speaker);
    }
    //endregion
    //endregion
}
