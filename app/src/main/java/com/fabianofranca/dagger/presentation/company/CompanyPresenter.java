package com.fabianofranca.dagger.presentation.company;

import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.services.CompanyService;

import javax.inject.Inject;

@PerActivity
public class CompanyPresenter implements CompanyContract.Presenter{

    private CompanyContract.View view;

    private CompanyService service;

    @Inject
    public CompanyPresenter(CompanyContract.View view, CompanyService service) {
        this.view = view;
        this.service = service;
    }
}