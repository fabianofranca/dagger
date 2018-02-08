package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.di.modules.CompanyServiceModule;
import com.fabianofranca.dagger.di.scopes.PerService;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class, modules = CompanyServiceModule.class)
@PerService
public interface CompanyServiceComponent {

    CompanyActivityComponent companyActivityComponent();
}