package com.fabianofranca.dagger.activities;

import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.services.CompanyService;

import javax.inject.Inject;

@PerActivity
public class CompanyActivity implements Activity {

    @Inject
    CompanyService companyService;

    @Inject
    public CompanyActivity() {
    }
}