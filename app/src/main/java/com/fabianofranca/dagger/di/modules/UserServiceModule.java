package com.fabianofranca.dagger.di.modules;

import com.fabianofranca.dagger.di.scopes.PerService;
import com.fabianofranca.dagger.services.CompanyService;
import com.fabianofranca.dagger.services.Service;
import com.fabianofranca.dagger.services.UserService;

import dagger.Binds;
import dagger.Module;

@Module(includes = CommonServiceModule.class)
public abstract class UserServiceModule {

    @Binds
    @PerService
    abstract Service bindUserService(UserService service);
}