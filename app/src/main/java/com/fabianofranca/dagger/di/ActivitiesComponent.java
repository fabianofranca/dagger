package com.fabianofranca.dagger.di;

import com.fabianofranca.dagger.activities.ActivityA;
import com.fabianofranca.dagger.activities.ActivityB;

import dagger.Component;

@Component(modules = ServicesModule.class)
public interface ActivitiesComponent {

    ActivityB createActivityB();
    ActivityA createActivityA();
}