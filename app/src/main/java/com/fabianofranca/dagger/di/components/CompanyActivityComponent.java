package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.activities.CompanyActivity;
import com.fabianofranca.dagger.activities.UserActivity;
import com.fabianofranca.dagger.di.scopes.PerActivity;

import dagger.Subcomponent;

@Subcomponent
@PerActivity
public interface CompanyActivityComponent {

    CompanyActivity createCompanyActivity();
}