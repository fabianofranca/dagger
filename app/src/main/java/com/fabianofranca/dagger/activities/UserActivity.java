package com.fabianofranca.dagger.activities;

import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.services.UserService;

import javax.inject.Inject;

@PerActivity
public class UserActivity implements Activity {

    private UserService userService;

    @Inject
    public UserActivity(UserService userService) {
        this.userService = userService;
    }
}