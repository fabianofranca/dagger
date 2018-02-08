package com.fabianofranca.dagger.di.components;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Component
@Singleton
public interface ApplicationComponent {

    Context context();

    @Component.Builder
    interface Builder {
        ApplicationComponent build();

        @BindsInstance
        Builder context(Context context);
    }
}