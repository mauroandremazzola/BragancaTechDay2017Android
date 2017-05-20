package com.br.mauroandremazzola.bragancatechday2017.presentation.speaker;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.mauroandremazzola.bragancatechday2017.R;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;
import com.bumptech.glide.Glide;

import org.parceler.Parcels;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Alex on 18/05/2017.
 */
public class SpeakerActivity extends AppCompatActivity implements SpeakerView {

    //region CONSTANTS
    public static final String EXTRA_SPEAKER = "com.br.mauroandremazzola.bragancatechday2017.EXTRA_SPEAKER";
    //endregion

    //region FIELDS
    @BindView(R.id.activity_speaker_img_speaker)
    ImageView imgSpeaker;

    @BindView(R.id.activity_speaker_tvw_description)
    TextView tvwDescription;

    @BindView(R.id.activity_speaker_tvw_lecture)
    TextView tvwLecture;

    @BindView(R.id.activity_speaker_tvw_hour)
    TextView tvwHour;

    @BindView(R.id.activity_speaker_tvw_linkedin)
    TextView tvwLinkedin;

    private SpeakerPresenter presenter;
    //endregion

    //region LIFECYCLE
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_speaker);

        ButterKnife.bind(this);

        Speaker speaker = Parcels.unwrap(getIntent().getParcelableExtra(EXTRA_SPEAKER));
        setupToolbar(speaker.getName());

        presenter = new SpeakerPresenter(this);
        presenter.loadSpeaker(speaker);
    }
    //endregion

    //region METHODS
    //region OVERRIDES METHODS
    @Override
    public void onBackPressed() {
        supportFinishAfterTransition();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            supportFinishAfterTransition();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void loadSpeaker(Speaker speaker) {
        Glide.with(this)
                .load(speaker.getResIdImage())
                .into(imgSpeaker);

        tvwDescription.setText(speaker.getDescription());
        tvwLecture.setText(speaker.getLecture());
        tvwHour.setText(new SimpleDateFormat("HH:mm").format(speaker.getHour().getTime()) + "h");
    }

    @Override
    public void openLinkedin(String url) {
        Uri data = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, data);

        startActivity(intent);
    }
    //endregion

    //region PACKAGE METHODS
    @OnClick(R.id.activity_speaker_tvw_linkedin)
    void onLinkedinClick() {
        presenter.linkedinClick();
    }
    //endregion

    //region PRIVATE METHODS
    private void setupToolbar(String title) {
        final Toolbar toolbar = (Toolbar) findViewById(R.id.activity_speaker_toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.activity_speaker_collapsing_toolbar);

        collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbar.setExpandedTitleTextColor(ColorStateList.valueOf(Color.WHITE));

        collapsingToolbar.setTitle(title);
    }

    private void setupTransition() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Explode explodeEnter = new Explode();
            explodeEnter.setDuration(500);
            explodeEnter.addTarget(R.id.activity_speaker_appbar);
            explodeEnter.addTarget(android.R.id.statusBarBackground);
            explodeEnter.addTarget(android.R.id.navigationBarBackground);
            Explode explodeExit = new Explode();
            explodeExit.addTarget(R.id.activity_speaker_appbar);
            explodeExit.addTarget(android.R.id.statusBarBackground);
            explodeExit.addTarget(android.R.id.navigationBarBackground);
            explodeExit.setDuration(300);
            getWindow().setEnterTransition(explodeEnter);
            getWindow().setExitTransition(explodeExit);
        }
    }
    //endregion
    //endregion
}
