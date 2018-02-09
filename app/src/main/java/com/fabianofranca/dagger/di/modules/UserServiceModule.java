package com.fabianofranca.dagger.di.modules;

import com.fabianofranca.dagger.di.components.UserActivitySubcomponent;
import com.fabianofranca.dagger.di.scopes.PerService;
import com.fabianofranca.dagger.services.Service;
import com.fabianofranca.dagger.services.UserService;

import dagger.Binds;
import dagger.Module;

@Module(includes = CommonServiceModule.class, subcomponents = UserActivitySubcomponent.class)
public abstract class UserServiceModule {

    @Binds
    @PerService
    abstract Service bindUserService(UserService service);
}