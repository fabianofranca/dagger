package com.fabianofranca.dagger.di.modules;

import android.app.Activity;

import com.fabianofranca.dagger.di.components.CompanyActivitySubcomponent;
import com.fabianofranca.dagger.di.components.UserActivitySubcomponent;
import com.fabianofranca.dagger.presentation.company.CompanyActivity;
import com.fabianofranca.dagger.presentation.user.UserActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        UserActivitySubcomponent.class,
        CompanyActivitySubcomponent.class
})
public abstract class ApplicationBinders {

    @Binds
    @IntoMap
    @ActivityKey(UserActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindUserActivityInjectorFactory(
            UserActivitySubcomponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(CompanyActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindCompanyActivityInjectorFactory(
            CompanyActivitySubcomponent.Builder builder);
}