package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.di.modules.UserServiceModule;
import com.fabianofranca.dagger.di.scopes.PerActivity;

import dagger.Subcomponent;

@Subcomponent(modules = UserServiceModule.class)
@PerActivity
public interface UserServiceSubcomponent {

    @Subcomponent.Builder
    interface Builder {
        UserServiceSubcomponent build();
    }
}