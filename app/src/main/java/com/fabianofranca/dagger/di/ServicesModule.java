package com.fabianofranca.dagger.di;

import com.fabianofranca.dagger.services.Service;
import com.fabianofranca.dagger.services.ServiceA;
import com.fabianofranca.dagger.services.ServiceB;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ServicesModule {

    @Binds
    @Singleton
    abstract Service bindServiceA(ServiceA service);

    @Binds
    @Singleton
    abstract Service bindServiceB(ServiceB service);
}