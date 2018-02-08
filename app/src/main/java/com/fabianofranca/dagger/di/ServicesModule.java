package com.fabianofranca.dagger.di;

import com.fabianofranca.dagger.services.Service;
import com.fabianofranca.dagger.services.ServiceA;
import com.fabianofranca.dagger.services.ServiceB;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class ServicesModule {

    @Provides
    static ServiceA provideServiceA() {
        return new ServiceA();
    }

    @Provides
    static Service provideServiceB(ServiceB service) {
        return service;
    }
}