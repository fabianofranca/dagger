package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.di.modules.UserPresentationModule;
import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.presentation.user.UserActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = UserPresentationModule.class)
@PerActivity
public interface UserActivitySubcomponent extends AndroidInjector<UserActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UserActivity> {}
}