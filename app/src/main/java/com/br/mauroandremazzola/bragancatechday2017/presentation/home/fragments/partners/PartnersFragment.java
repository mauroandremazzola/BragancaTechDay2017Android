package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.partners;

import android.content.Intent;
import android.net.Uri;
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
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Partner;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Alex on 18/05/2017.
 */
public class PartnersFragment extends Fragment implements PartnersView {

    //region FIELDS
    @BindView(R.id.fragment_home_partners_rcv_partners)
    RecyclerView rcvPartners;

    private PartnersPresenter presenter;
    //endregion

    //region LIFECYCLE
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_partners, container, false);

        ButterKnife.bind(this, view);

        setupView();

        presenter = new PartnersPresenter(this);
        presenter.getPartners();

        return view;
    }
    //endregion

    //region METHODS
    //region OVERRIDES METHODS
    @Override
    public void loadSPartners(List<Partner> partners) {
        PartnersAdapter partnersAdapter = new PartnersAdapter(partners);
        partnersAdapter.setListener(new PartnersAdapter.Listener() {
            @Override
            public void onItemClick(Partner partner) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(partner.getSite()));
                startActivity(intent);
            }
        });
        rcvPartners.setAdapter(partnersAdapter);
    }

    //endregion

    //region PRIVATE METHODS
    private void setupView() {
        rcvPartners.setLayoutManager(new LinearLayoutManager(getContext()));
        rcvPartners.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
    }

    //endregion
    //endregion

}
