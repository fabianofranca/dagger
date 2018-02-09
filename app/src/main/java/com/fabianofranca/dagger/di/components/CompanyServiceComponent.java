package com.fabianofranca.dagger.di.components;

import com.fabianofranca.dagger.di.SubcomponentBuilder;
import com.fabianofranca.dagger.di.modules.CompanyServiceBinders;
import com.fabianofranca.dagger.di.scopes.PerService;

import java.util.Map;

import javax.inject.Provider;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class, modules = CompanyServiceBinders.class)
@PerService
public interface CompanyServiceComponent {

    Map<Class<?>, Provider<SubcomponentBuilder>> subcomponentBuilders();

}