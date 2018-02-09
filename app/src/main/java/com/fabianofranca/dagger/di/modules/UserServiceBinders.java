package com.fabianofranca.dagger.di.modules;

import com.fabianofranca.dagger.di.SubcomponentBuilder;
import com.fabianofranca.dagger.di.components.UserActivitySubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = UserActivitySubcomponent.class)
public abstract class UserServiceBinders {

    @Binds
    @IntoMap
    @ClassKey(UserActivitySubcomponent.Builder.class)
    abstract SubcomponentBuilder userActivity(UserActivitySubcomponent.Builder builder);
}