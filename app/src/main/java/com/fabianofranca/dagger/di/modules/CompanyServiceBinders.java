package com.fabianofranca.dagger.di.modules;

import com.fabianofranca.dagger.di.SubcomponentBuilder;
import com.fabianofranca.dagger.di.components.CompanyActivitySubcomponent;
import com.fabianofranca.dagger.di.components.UserActivitySubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = CompanyActivitySubcomponent.class)
public abstract class CompanyServiceBinders {

    @Binds
    @IntoMap
    @ClassKey(CompanyActivitySubcomponent.Builder.class)
    abstract SubcomponentBuilder companyActivity(CompanyActivitySubcomponent.Builder builder);
}