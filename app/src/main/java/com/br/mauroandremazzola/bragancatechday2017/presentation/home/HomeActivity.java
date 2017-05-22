package com.br.mauroandremazzola.bragancatechday2017.presentation.home;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.br.mauroandremazzola.bragancatechday2017.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    //region FIELDS
    @BindView(R.id.activity_home_tabs)
    TabLayout tabs;

    @BindView(R.id.activity_home_viewpager)
    ViewPager vpgMenu;
    //endregion

    //region LIFECYCLE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        setupToolbar();
        setupViewPager();
    }

    //endregion

    //region METHODS
    //region PRIVATE METHODS
    private void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_home_toolbar);
        setSupportActionBar(toolbar);
    }

    private void setupViewPager() {
        vpgMenu.setAdapter(new HomeAdapter(getSupportFragmentManager()));
        tabs.setupWithViewPager(vpgMenu);
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            int colorIconUnselected = ContextCompat.getColor(getApplicationContext(), R.color.colorAccent);

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                setTint(tab.getIcon(), Color.WHITE);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                setTint(tab.getIcon(), colorIconUnselected);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        int colorIcon = ContextCompat.getColor(this, R.color.colorAccent);

        tabs.getTabAt(0).setIcon(getIcon(R.drawable.ic_home_about, Color.WHITE));
        tabs.getTabAt(1).setIcon(getIcon(R.drawable.ic_home_speaker, colorIcon));
        tabs.getTabAt(2).setIcon(getIcon(R.drawable.ic_home_partner, colorIcon));
        tabs.getTabAt(3).setIcon(getIcon(R.drawable.ic_home_video, colorIcon));
    }

    private Drawable getIcon(int resId, int color) {
        Drawable drawable = ContextCompat.getDrawable(this, resId);
        setTint(drawable, color);
        return drawable;
    }

    private void setTint(Drawable drawable, int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            drawable.setTint(color);
        } else {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
    }
    //endregion
    //endregion
}
