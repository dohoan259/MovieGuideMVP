package com.example.hoanbk.movieguide.ui.base;

import android.support.annotation.IdRes;
import android.support.annotation.StringRes;

/**
 * Created by HoanBK on 3/13/2018.
 */

public interface IBaseView {

    void showLoading();

    void hideLoading();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(@StringRes int resId);

    void showMessage(String message);

    boolean isNetworkConnected();
}
