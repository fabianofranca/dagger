package com.fabianofranca.dagger.presentation.user;

import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.services.UserService;

import javax.inject.Inject;

@PerActivity
public class UserPresenter implements UserContract.Presenter {

    private UserContract.View view;

    private UserService service;

    @Inject
    public UserPresenter(UserContract.View view, UserService service) {
        this.view = view;
        this.service = service;
    }
}