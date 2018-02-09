package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.Application;
import com.fabianofranca.dagger.di.modules.ApplicationBinders;
import com.fabianofranca.dagger.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        ApplicationBinders.class,
        ApplicationModule.class
})
@Singleton
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        ApplicationComponent build();

        @BindsInstance
        Builder application(Application application);
    }

    void inject(Application application);
}