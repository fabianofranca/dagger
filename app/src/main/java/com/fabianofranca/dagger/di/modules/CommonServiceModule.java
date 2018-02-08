package com.fabianofranca.dagger.di.modules;


import com.fabianofranca.dagger.di.scopes.PerService;
import com.fabianofranca.dagger.services.CompanyService;
import com.fabianofranca.dagger.services.Service;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class CommonServiceModule {

    @Binds
    @PerService
    abstract Service bindCommonService(CompanyService service);
}