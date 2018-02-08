package com.fabianofranca.dagger.services;

import android.content.Context;

import com.fabianofranca.dagger.di.scopes.PerService;

import javax.inject.Inject;

@PerService
public class CompanyService implements Service {

    Context context;
    CommonService commonService;

    @Inject
    public CompanyService(Context context, CommonService commonService) {
        this.context = context;
        this.commonService = commonService;
    }
}