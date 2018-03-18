package com.example.hoanbk.movieguide.ui.base;

import android.support.annotation.IdRes;
import android.support.annotation.StringRes;

/**
 * Created by HoanBK on 3/13/2018.
 */

public interface IBasePresenter<V extends IBaseView> {

    void onAttach(V view);

    void onDetach();

    boolean isViewAttached();
}
