package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.partners;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.br.mauroandremazzola.bragancatechday2017.R;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Partner;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mauroandremazzola on 19/05/17.
 */

class PartnersAdapter extends RecyclerView.Adapter<PartnersAdapter.PartnerViewHolder> {

    //region FIELDS
    private List<Partner> partners;
    private Listener listener;
    //endregion

    //region CONSTRUCT
    PartnersAdapter(List<Partner> partners) {
        this.partners = partners;
    }
    //endregion

    //region PROPERTIES
    void setListener(Listener listener) {
        this.listener = listener;
    }
    //endregion

    //region METHODS

    @Override
    public PartnerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home_partners_item,
                parent, false);
        return new PartnerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PartnerViewHolder holder, int position) {
        Partner partner = partners.get(position);
        holder.bindView(partner);
    }

    @Override
    public int getItemCount() {
        return partners.size();
    }

    //endregion

    //region INNER CLASS
    class PartnerViewHolder extends RecyclerView.ViewHolder {

        //region FIELDS

        @BindView(R.id.fragment_home_partners_item_background)
        ImageView imgBackground;

        @BindView(R.id.fragment_home_partners_item_logo)
        ImageView imgLogo;

        Partner partner;
        //endregion

        //region CONSTRUCT
        PartnerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
        //endregion

        //region METHODS
        //region PACKAGE METHODS

        void bindView(Partner partner) {
            this.partner = partner;

            Glide.with(itemView.getContext())
                    .load(partner.getResIdImage())
                    .into(imgBackground);

            Glide.with(itemView.getContext())
                    .load(partner.getResIdImage())
                    .into(imgLogo);
        }

        @OnClick(R.id.fragment_home_partners_item_logo)
        void onItemClick(){
            if (listener != null) {
                listener.onItemClick(partner);
            }
        }
        //endregion
        //endregion
    }
    //endregion

    interface Listener {

        void onItemClick(Partner partner);

    }
}
