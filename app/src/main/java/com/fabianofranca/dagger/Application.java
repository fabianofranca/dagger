package com.fabianofranca.dagger;

import com.fabianofranca.dagger.di.components.ApplicationComponent;
import com.fabianofranca.dagger.di.components.CompanyActivitySubcomponent;
import com.fabianofranca.dagger.di.components.CompanyServiceComponent;
import com.fabianofranca.dagger.di.components.DaggerApplicationComponent;
import com.fabianofranca.dagger.di.components.DaggerCompanyServiceComponent;
import com.fabianofranca.dagger.di.components.DaggerUserServiceComponent;
import com.fabianofranca.dagger.di.components.UserActivitySubcomponent;
import com.fabianofranca.dagger.di.components.UserServiceComponent;

public class Application extends android.app.Application {

    private static Application application;

    private ApplicationComponent applicationComponent;
    private UserActivitySubcomponent userActivitySubcomponent;
    private CompanyActivitySubcomponent companyActivitySubcomponent;

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;

        applicationComponent = DaggerApplicationComponent.builder()
                .context(this)
                .build();

        UserServiceComponent userServiceComponent = DaggerUserServiceComponent
                .builder()
                .applicationComponent(applicationComponent)
                .build();

        CompanyServiceComponent companyServiceComponent = DaggerCompanyServiceComponent
                .builder()
                .applicationComponent(applicationComponent)
                .build();

        userActivitySubcomponent = (UserActivitySubcomponent) userServiceComponent
                .subcomponentBuilders()
                .get(UserActivitySubcomponent.Builder.class)
                .get().build();

        companyActivitySubcomponent = (CompanyActivitySubcomponent) companyServiceComponent
                .subcomponentBuilders()
                .get(CompanyActivitySubcomponent.Builder.class)
                .get().build();
    }

    public static Application getApplication() {
        return application;
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public UserActivitySubcomponent getUserActivitySubcomponent() {
        return userActivitySubcomponent;
    }

    public CompanyActivitySubcomponent getCompanyActivitySubcomponent() {
        return companyActivitySubcomponent;
    }
}