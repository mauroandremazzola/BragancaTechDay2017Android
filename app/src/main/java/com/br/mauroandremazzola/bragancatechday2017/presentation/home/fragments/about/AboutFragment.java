package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.about;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.mauroandremazzola.bragancatechday2017.R;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by Alex on 18/05/2017.
 */
public class AboutFragment extends Fragment implements AboutView {

    //region FIELDS
    AboutPresenter presenter;
    //endregion

    //region LIFECYCLE
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_about, container, false);

        ButterKnife.bind(this, view);

        presenter = new AboutPresenter(this);

        return view;
    }
    //endregion

    //region METHODS

    //region OVERRIDES
    @Override
    public void onMapsUriLoaded(String uri, String exUri) {
        openApplication(uri, exUri);
    }

    @Override
    public void onWazeUriLoaded(String uri, String exUri) {
        openApplication(uri, exUri);
    }
    //endregion

    //region PUBLICS
    @OnClick(R.id.fragment_home_about_img_waze)
    void onClikWaze() {
        presenter.getWazeUri();
    }

    @OnClick(R.id.fragment_home_about_img_maps)
    void onClikMaps() {
        presenter.getMapsUri();
    }

    //endregion

    //region PRIVATE
    private void openApplication(String uri, String exUri) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(exUri));
            startActivity(intent);
        }
    }
    //endregion
    //endregion


}
