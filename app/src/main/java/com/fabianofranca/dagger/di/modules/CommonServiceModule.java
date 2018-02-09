package com.fabianofranca.dagger.di.modules;


import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.services.CompanyService;
import com.fabianofranca.dagger.services.Service;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class CommonServiceModule {

    @Binds
    @PerActivity
    abstract Service bindCommonService(CompanyService service);
}