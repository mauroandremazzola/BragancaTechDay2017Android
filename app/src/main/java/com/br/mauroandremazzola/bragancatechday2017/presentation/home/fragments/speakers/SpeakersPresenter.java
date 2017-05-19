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

        speakers.add(new Speaker(1, "Ândriu Felipe Coelho", "https://www.linkedin.com/in/%C3%A2ndriu-felipe-coelho-2344b061/", R.drawable.andriu));
        speakers.add(new Speaker(2, "Djonatas Tenfen", "https://www.linkedin.com/in/djonatas/", R.drawable.djonatas));
        speakers.add(new Speaker(3, "Fernanda Saraiva", "https://www.linkedin.com/in/fesaraiva/", R.drawable.fernanda));
        speakers.add(new Speaker(4, "Henrique Rusca", "https://www.linkedin.com/in/henrique-rusca-queiroz-de-moraes-20369a58/", R.drawable.henrique));
        speakers.add(new Speaker(5, "Marcelo Antonio Maria Junior", "https://www.linkedin.com/in/marcelo-antonio-maria-junior/", R.drawable.marcelo));
        speakers.add(new Speaker(6, "Mauro André B. Mazzola", "https://www.linkedin.com/in/mauro-andr%C3%A9-barros-mazzola-b02996a4/", R.drawable.mauro));
        speakers.add(new Speaker(7, "Milton Carvalhaes Filho", "https://www.linkedin.com/in/miltoncfilho/", R.drawable.milton));
        speakers.add(new Speaker(8, "Rafael Assis", "https://www.linkedin.com/in/rafaelios/", R.drawable.rafael));
        speakers.add(new Speaker(10, "Thiago Zavaschi", "https://www.linkedin.com/in/zavaschi/", R.drawable.thiago));
        speakers.add(new Speaker(11, "Vitor A. Vale", "https://www.linkedin.com/in/vitoravale/", R.drawable.vitor));

        view.loadSpeakers(speakers);
    }
    //endregion
    //endregion
}
