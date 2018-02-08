package com.fabianofranca.dagger.di.modules;

import com.fabianofranca.dagger.di.scopes.PerService;
import com.fabianofranca.dagger.services.Service;
import com.fabianofranca.dagger.services.CompanyService;

import dagger.Binds;
import dagger.Module;

@Module(includes = CommonServiceModule.class)
public abstract class CompanyServiceModule {

    @Binds
    @PerService
    abstract Service bindCompanyService(CompanyService service);
}