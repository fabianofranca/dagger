package com.fabianofranca.dagger.di.modules;

import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.presentation.user.UserActivity;
import com.fabianofranca.dagger.presentation.user.UserContract;
import com.fabianofranca.dagger.presentation.user.UserPresenter;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class UserPresentationModule {

    @Binds
    @PerActivity
    abstract UserContract.View bindUserView(UserActivity userActivity);

    @Binds
    @PerActivity
    abstract UserContract.Presenter bindUserPresenter(UserPresenter presenter);
}