package com.fabianofranca.dagger.services;

import android.content.Context;

import com.fabianofranca.dagger.di.scopes.PerActivity;

import javax.inject.Inject;

@PerActivity
public class UserService implements Service {

    Context context;
    CommonService commonService;

    @Inject
    public UserService(Context context, CommonService commonService) {
        this.context = context;
        this.commonService = commonService;
    }
}