package com.fabianofranca.dagger.di;

import com.fabianofranca.dagger.activities.ActivityA;
import com.fabianofranca.dagger.activities.ActivityB;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = ServicesModule.class)
@Singleton
public interface ActivitiesComponent {

    ActivityB createActivityB();
    ActivityA createActivityA();
}