package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.activities.CompanyActivity;
import com.fabianofranca.dagger.di.SubcomponentBuilder;
import com.fabianofranca.dagger.di.scopes.PerActivity;

import dagger.Subcomponent;

@Subcomponent
@PerActivity
public interface CompanyActivitySubcomponent {

    CompanyActivity createCompanyActivity();

    @Subcomponent.Builder
    interface Builder extends SubcomponentBuilder<CompanyActivitySubcomponent> {
    }

}