package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.about;

import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;

import java.util.List;

/**
 * Created by mauroandremazzola on 18/05/17.
 */

public interface AboutView {

    void onMapsUriLoaded(String uri, String exUri);

    void onWazeUriLoaded(String uri, String exUri);

}
