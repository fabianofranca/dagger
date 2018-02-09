package com.fabianofranca.dagger;

import com.fabianofranca.dagger.di.components.ApplicationComponent;
import com.fabianofranca.dagger.di.components.CompanyServiceComponent;
import com.fabianofranca.dagger.di.components.DaggerApplicationComponent;
import com.fabianofranca.dagger.di.components.DaggerCompanyServiceComponent;
import com.fabianofranca.dagger.di.components.DaggerUserServiceComponent;
import com.fabianofranca.dagger.di.components.UserServiceComponent;

public class Application extends android.app.Application {

    private static Application application;

    private ApplicationComponent applicationComponent;
    private UserServiceComponent userServiceComponent;
    private CompanyServiceComponent companyServiceComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;

        applicationComponent = DaggerApplicationComponent.builder()
                .context(this)
                .build();

        userServiceComponent = DaggerUserServiceComponent
                .builder()
                .applicationComponent(applicationComponent)
                .build();

        companyServiceComponent = DaggerCompanyServiceComponent
                .builder()
                .applicationComponent(applicationComponent)
                .build();
    }

    public static Application getApplication() {
        return application;
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public UserServiceComponent getUserServiceComponent() {
        return userServiceComponent;
    }

    public CompanyServiceComponent getCompanyServiceComponent() {
        return companyServiceComponent;
    }
}