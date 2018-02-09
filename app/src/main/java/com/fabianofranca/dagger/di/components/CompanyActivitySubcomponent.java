package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.di.modules.CompanyPresentationModule;
import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.presentation.company.CompanyActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = CompanyPresentationModule.class)
@PerActivity
public interface CompanyActivitySubcomponent extends AndroidInjector<CompanyActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CompanyActivity> {}
}