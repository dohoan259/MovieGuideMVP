package com.example.hoanbk.movieguide.di.component;

import com.example.hoanbk.movieguide.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by HoanBK on 3/13/2018.
 */
@Component
public interface ActivityComponent {

    void inject(MainActivity activity);
}
