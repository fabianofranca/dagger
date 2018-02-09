package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.Application;
import com.fabianofranca.dagger.di.modules.ApplicationBinders;
import com.fabianofranca.dagger.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {
        AndroidInjectionModule.class,
        ApplicationBinders.class,
        ApplicationModule.class
})
@Singleton
public interface ApplicationComponent extends AndroidInjector<Application> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<Application> {}
}