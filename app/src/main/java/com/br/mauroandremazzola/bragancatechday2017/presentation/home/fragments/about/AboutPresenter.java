package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.about;

/**
 * Created by mauroandremazzola on 19/05/17.
 */

public class AboutPresenter {

    //region FIELDS
    private AboutView view;
    //endregion

    //region CONSTRUCT
    public AboutPresenter(AboutView view) {
        this.view = view;
    }
    //endregion

    //region METHODS
    //region PUBLIC METHODS
    public void getMapsUri() {
        String uri = "comgooglemaps://?q=Fatec+Bragan%C3%A7a+Paulista&center=-22.920449,-46.544016&zoom=18";
        String exUri = "https://www.google.com.br/maps/place/Fatec+Bragan%C3%A7a+Paulista/" +
                "@--22.920449,-46.544016/data=!4m6!3m5!1s0x94ceca5d854e851b:0x1dbcd45ef26bb640!4b1!" +
                "8m2!3d-22.9204567!4d-46.5441127";
        view.onMapsUriLoaded(uri, exUri);
    }

    public void getWazeUri() {
        String uri = "waze://?q=FATEC%20Braganca%20Paulista,ll=-22.9203&lon=-46.54406z=18,navigate=no";
        String exUri = "market://details?id=com.waze";

        view.onWazeUriLoaded(uri, exUri);
    }
    //endregion
    //endregion
}
