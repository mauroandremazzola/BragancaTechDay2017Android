package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.partners;

import com.br.mauroandremazzola.bragancatechday2017.R;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Partner;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauroandremazzola on 19/05/17.
 */

public class PartnersPresenter {

    //region FIELDS
    private PartnersView view;
    //endregion

    //region CONSTRUCT
    public PartnersPresenter(PartnersView view) {
        this.view = view;
    }
    //endregion

    //region METHODS
    //region PUBLIC METHODS
    public void getPartners() {
        List<Partner> partners = new ArrayList<>();

        partners.add(new Partner(1, "Its4", "http://www.its4.com", R.drawable.logo_its4));
        partners.add(new Partner(3, "FATEC", "https://www.vestibularfatec.com.br/home", R.drawable.logo_fatec));
        partners.add(new Partner(2, "Casa do Código", "https://www.casadocodigo.com.br", R.drawable.logo_casa_do_codigo));
        partners.add(new Partner(4, "Jet Brains", "https://www.jetbrains.com", R.drawable.logo_jet_brains));
        partners.add(new Partner(5, "tmax", "http://www.tmax.com.br/", R.drawable.logo_tmax));
        partners.add(new Partner(6, "Maquina de Resultados", "http://www.maquinaderesultados.com.br/",
                R.drawable.logo_maquinaderesultados));

        view.loadSPartners(partners);
    }
    //endregion
    //endregion

}
