package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.di.modules.UserServiceModule;
import com.fabianofranca.dagger.di.scopes.PerService;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class, modules = UserServiceModule.class)
@PerService
public interface UserServiceComponent {

    UserActivityComponent userActivityComponent();
}