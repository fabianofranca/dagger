package com.fabianofranca.dagger.services;

import android.content.Context;

import com.fabianofranca.dagger.di.scopes.PerActivity;

import javax.inject.Inject;

@PerActivity
public class CommonService implements Service {

    Context context;

    @Inject
    public CommonService(Context context) {
        this.context = context;
    }
}
