package com.example.hoanbk.movieguide.ui.base;

import com.example.hoanbk.movieguide.di.scheduler.ISchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by HoanBK on 3/13/2018.
 */

public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    private static final String TAG = "BasePresenter";

    private final ISchedulerProvider mSchedulerProvider;
    private final CompositeDisposable mDisposable;

    private V mView;

    public BasePresenter(ISchedulerProvider schedulerProvider, CompositeDisposable disposable) {
        mSchedulerProvider = schedulerProvider;
        mDisposable = disposable;
    }

    @Override
    public void onAttach(V view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mDisposable.dispose();
        mView = null;
    }

    @Override
    public boolean isViewAttached() {
        return mView != null;
    }

    public ISchedulerProvider getSchedulerProvider() {
        return mSchedulerProvider;
    }

    public CompositeDisposable getDisposable() {
        return mDisposable;
    }
}
