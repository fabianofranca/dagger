package com.fabianofranca.dagger.di.modules;

import android.content.Context;

import com.fabianofranca.dagger.Application;
import com.fabianofranca.dagger.di.components.UserServiceSubcomponent;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module(subcomponents = UserServiceSubcomponent.class)
public abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract Context bindContext(Application application);
}