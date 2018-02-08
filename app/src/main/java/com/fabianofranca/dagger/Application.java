package com.fabianofranca.dagger;

import com.fabianofranca.dagger.di.components.ApplicationComponent;
import com.fabianofranca.dagger.di.components.CompanyServiceComponent;
import com.fabianofranca.dagger.di.components.DaggerApplicationComponent;
import com.fabianofranca.dagger.di.components.DaggerCompanyServiceComponent;
import com.fabianofranca.dagger.di.components.DaggerUserServiceComponent;
import com.fabianofranca.dagger.di.components.UserServiceComponent;
import com.fabianofranca.dagger.di.modules.ApplicationModule;

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
                .applicationModule(new ApplicationModule(this))
                .build();

        userServiceComponent = DaggerUserServiceComponent
                .builder()
                .applicationComponent(Application.getApplication().getApplicationComponent())
                .build();

        companyServiceComponent = DaggerCompanyServiceComponent
                .builder()
                .applicationComponent(Application.getApplication().getApplicationComponent())
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