package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.di.SubcomponentBuilder;
import com.fabianofranca.dagger.di.modules.CompanyPresentationModule;
import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.presentation.company.CompanyActivity;
import com.fabianofranca.dagger.presentation.company.CompanyContract;

import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent(modules = CompanyPresentationModule.class)
@PerActivity
public interface CompanyActivitySubcomponent {

    void inject(CompanyActivity companyActivity);

    @Subcomponent.Builder
    interface Builder extends SubcomponentBuilder<CompanyActivitySubcomponent> {
        @BindsInstance
        Builder view(CompanyContract.View view);
    }
}