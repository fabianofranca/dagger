package com.fabianofranca.dagger.di.modules;

import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.presentation.company.CompanyActivity;
import com.fabianofranca.dagger.presentation.user.UserActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ApplicationBinders {

    @ContributesAndroidInjector(modules = UserPresentationModule.class)
    @PerActivity
    abstract UserActivity userActivity();

    @ContributesAndroidInjector(modules = CompanyPresentationModule.class)
    @PerActivity
    abstract CompanyActivity companyActivity();
}