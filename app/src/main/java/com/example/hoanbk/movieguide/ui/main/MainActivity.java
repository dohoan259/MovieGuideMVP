package com.example.hoanbk.movieguide.ui.main;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

import com.example.hoanbk.movieguide.R;
import com.example.hoanbk.movieguide.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    public static final String DETAILS_FRAGMENT = "DetailsFragment";
    private boolean mTwoPaneMode;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.drawer_view)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.navigation_view)
    NavigationView mNavigationView;
    @BindView(R.id.tv_app_version)
    TextView mAppVersionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getActivityComponent().inject(this);

        setUnbinder(ButterKnife.bind(this));

        setUp();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        return true;
    }

    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentByTag("");
        if (fragment == null) {
            super.onBackPressed();
        } else {
            onFragmentDetached("");
        }

    }

    @Override
    protected void setUp() {
        setSupportToolbar();

        if (findViewById(R.id.movie_details_container) != null) {
            mTwoPaneMode = true;

            // add movie detail fragment to this layout
        } else {
            mTwoPaneMode = false;
        }

        setupNavMenu();
    }

    private void setSupportToolbar() {
        setSupportActionBar(mToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.movie_guide);
            getSupportActionBar().setDisplayShowTitleEnabled(true);
        }
    }

    private void setupNavMenu() {

    }

    @Override
    public void onFragmentDetached(String tag) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentByTag(tag);
        if (fragment != null) {
            fm.beginTransaction()
                    .disallowAddToBackStack()
                    .remove(fragment)
                    .commitNow();
        }
    }
}
