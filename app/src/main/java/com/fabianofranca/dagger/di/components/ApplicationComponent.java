package com.fabianofranca.dagger.di.components;

import android.content.Context;

import com.fabianofranca.dagger.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = ApplicationModule.class)
@Singleton
public interface ApplicationComponent {

    Context context();
    ApplicationComponent applicationComponent();

    @Component.Builder
    interface Builder {
        ApplicationComponent build();
        Builder applicationModule(ApplicationModule applicationModule);
    }
}