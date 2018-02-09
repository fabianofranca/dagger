package com.fabianofranca.dagger.di.modules;

import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.presentation.company.CompanyContract;
import com.fabianofranca.dagger.presentation.company.CompanyPresenter;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class CompanyPresentationModule {

    @Binds
    @PerActivity
    abstract CompanyContract.Presenter bindCompanyPresenter(CompanyPresenter presenter);
}
