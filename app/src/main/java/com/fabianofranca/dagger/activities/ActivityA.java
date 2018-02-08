package com.fabianofranca.dagger.activities;

import com.fabianofranca.dagger.services.ServiceA;

import javax.inject.Inject;

public class ActivityA implements Activity {

    @Inject
    ServiceA serviceA;

    @Inject
    public ActivityA() {
    }
}