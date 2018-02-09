package com.fabianofranca.dagger;

import android.app.Activity;

import com.fabianofranca.dagger.di.components.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class Application extends android.app.Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    private static Application application;

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;

        DaggerApplicationComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }

    public static Application getApplication() {
        return application;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}