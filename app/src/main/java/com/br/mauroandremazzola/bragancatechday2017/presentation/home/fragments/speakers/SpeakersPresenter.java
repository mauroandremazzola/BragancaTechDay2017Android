package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.speakers;

import com.br.mauroandremazzola.bragancatechday2017.R;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 18/05/2017.
 */
public class SpeakersPresenter {

    //region FIELDS
    private SpeakersView view;
    //endregion

    //region CONSTRUCT
    public SpeakersPresenter(SpeakersView view) {
        this.view = view;
    }
    //endregion

    //region METHODS
    //region PUBLIC METHODS
    public void getSpeakers() {
        List<Speaker> speakers = new ArrayList<>();

        speakers.add(new Speaker(1, "Ândriu Felipe Coelho", "", R.drawable.andriu));
        speakers.add(new Speaker(2, "Djonatas Tenfen", "", R.drawable.djonatas));
        speakers.add(new Speaker(3, "Fernanda Saraiva", "", R.drawable.fernanda));
        speakers.add(new Speaker(4, "Henrique Rusca", "", R.drawable.henrique));
        speakers.add(new Speaker(5, "Marcelo Antonio Maria Junior", "", R.drawable.marcelo));
        speakers.add(new Speaker(6, "Mauro André B. Mazzola", "", R.drawable.mauro));
        speakers.add(new Speaker(7, "Milton Carvalhaes Filho", "", R.drawable.milton));
        speakers.add(new Speaker(8, "Rafael Assis", "", R.drawable.rafael));
        speakers.add(new Speaker(10, "Thiago Zavaschi", "", R.drawable.thiago));
        speakers.add(new Speaker(11, "Vitor A. Vale", "", R.drawable.vitor));

        view.loadSpeakers(speakers);
    }
    //endregion
    //endregion
}
