package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.di.modules.CommonServiceModule;
import com.fabianofranca.dagger.di.scopes.PerActivity;

import dagger.Subcomponent;

@Subcomponent(modules = CommonServiceModule.class)
@PerActivity
public interface CompanyServiceSubcomponent {

    @Subcomponent.Builder
    interface Builder {
        CompanyServiceSubcomponent build();
    }
}