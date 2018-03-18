package com.example.hoanbk.movieguide.ui.main.listing;

import com.example.hoanbk.movieguide.ui.base.IBasePresenter;
import com.example.hoanbk.movieguide.ui.base.IBaseView;

/**
 * Created by HoanBK on 3/14/2018.
 */

public interface MoviesListingContract {

    interface IMoviesListingView extends IBaseView{

        void openLoginActivity();
    }

    interface IMoviesListingPresenter<V extends IMoviesListingView> extends IBasePresenter<V> {




    }
}
