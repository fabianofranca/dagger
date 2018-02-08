package com.fabianofranca.dagger.activities;

import com.fabianofranca.dagger.services.ServiceA;
import com.fabianofranca.dagger.services.ServiceB;

import javax.inject.Inject;

public class ActivityB implements Activity {

    private ServiceB serviceB;

    private ServiceA serviceA;

    @Inject
    public ActivityB(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }
}