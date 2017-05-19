package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.speakers;

import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;

import java.util.List;

/**
 * Created by Alex on 18/05/2017.
 */
public interface SpeakersView {

    void loadSpeakers(List<Speaker> speakers);

    void loadSpeakersFail();
}
