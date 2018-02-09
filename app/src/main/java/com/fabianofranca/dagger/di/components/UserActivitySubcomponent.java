package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.di.SubcomponentBuilder;
import com.fabianofranca.dagger.di.modules.UserPresentationModule;
import com.fabianofranca.dagger.di.scopes.PerActivity;
import com.fabianofranca.dagger.presentation.user.UserActivity;
import com.fabianofranca.dagger.presentation.user.UserContract;

import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent(modules = UserPresentationModule.class)
@PerActivity
public interface UserActivitySubcomponent {

    void inject(UserActivity userActivity);

    @Subcomponent.Builder
    interface Builder extends SubcomponentBuilder<UserActivitySubcomponent> {
        @BindsInstance
        Builder view(UserContract.View view);
    }
}