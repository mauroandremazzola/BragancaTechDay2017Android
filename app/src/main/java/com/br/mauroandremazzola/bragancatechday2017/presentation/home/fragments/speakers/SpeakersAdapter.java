package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.speakers;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.br.mauroandremazzola.bragancatechday2017.R;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Alex on 18/05/2017.
 */
public class SpeakersAdapter extends RecyclerView.Adapter<SpeakersAdapter.SpeakerViewHolder> {

    //region FIELDS
    private List<Speaker> speakers;
    private SpeakerListener listener;
    //endregion

    //region CONSTRUCT
    public SpeakersAdapter() {
    }
    //endregion

    //region PROPERTIES
    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public void setListener(SpeakerListener listener) {
        this.listener = listener;
    }
    //endregion

    //region METHODS
    //region OVERRIDES METHODS
    @Override
    public SpeakerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home_speakers_item, parent, false);
        return new SpeakerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SpeakerViewHolder holder, int position) {
        Speaker speaker = speakers.get(position);
        holder.bindView(speaker);
    }

    @Override
    public int getItemCount() {
        return speakers.size();
    }
    //endregion
    //endregion

    //region INNER CLASS
    class SpeakerViewHolder extends RecyclerView.ViewHolder {

        //region FIELDS
        @BindView(R.id.fragment_home_speakers_item_img_speaker)
        CircleImageView imgSpeaker;

        @BindView(R.id.fragment_home_speakers_item_tvw_speaker)
        TextView tvwSpeaker;

        @BindView(R.id.fragment_home_speakers_item_imb_go)
        ImageButton imbGo;
        //endregion

        //region CONSTRUCT
        public SpeakerViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
        //endregion

        //region METHODS
        //region PACKAGE METHODS
        @OnClick(R.id.fragment_home_speakers_item_rel_root)
        void onGoClick() {
            if (listener != null) {
                Speaker speaker = speakers.get(getAdapterPosition());
                listener.onSpeakerClick(speaker);
            }
        }

        void bindView(Speaker speaker) {
            Glide.with(itemView.getContext())
                    .load(speaker.getResIdImage())
                    .into(imgSpeaker);

            tvwSpeaker.setText(speaker.getName());
        }
        //endregion
        //endregion
    }
    //endregion

    //region INTERFACES
    interface SpeakerListener {
        void onSpeakerClick(Speaker speaker);
    }
    //endregion
}