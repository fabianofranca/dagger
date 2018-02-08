package com.fabianofranca.dagger.services;

import android.content.Context;

import com.fabianofranca.dagger.di.scopes.PerService;

import javax.inject.Inject;

@PerService
public class CommonService implements Service {

    Context context;

    @Inject
    public CommonService(Context context) {
        this.context = context;
    }
}
