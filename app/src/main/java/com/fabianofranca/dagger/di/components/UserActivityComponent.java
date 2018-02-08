package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.activities.UserActivity;
import com.fabianofranca.dagger.di.scopes.PerActivity;

import dagger.Subcomponent;

@Subcomponent
@PerActivity
public interface UserActivityComponent {

    UserActivity createUserActivity();
}