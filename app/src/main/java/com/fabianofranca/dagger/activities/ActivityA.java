package com.fabianofranca.dagger.activities;

import com.fabianofranca.dagger.services.ServiceA;

import javax.inject.Inject;

public class ActivityA {

    @Inject
    ServiceA serviceA;
}
