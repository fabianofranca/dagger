package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.activities.UserActivity;
import com.fabianofranca.dagger.di.SubcomponentBuilder;
import com.fabianofranca.dagger.di.scopes.PerActivity;

import dagger.Subcomponent;

@Subcomponent
@PerActivity
public interface UserActivitySubcomponent {

    UserActivity createUserActivity();

    @Subcomponent.Builder
    interface Builder extends SubcomponentBuilder<UserActivitySubcomponent> {
    }
}