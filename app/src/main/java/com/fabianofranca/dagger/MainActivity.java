package com.fabianofranca.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fabianofranca.dagger.activities.CompanyActivity;
import com.fabianofranca.dagger.activities.UserActivity;

public class MainActivity extends AppCompatActivity {

    private CompanyActivity companyActivity;
    private UserActivity userActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        companyActivity = Application.getApplication()
                .getCompanyServiceComponent()
                .companyActivityComponent()
                .createCompanyActivity();

        userActivity = Application.getApplication()
                .getUserServiceComponent()
                .userActivityComponent()
                .createUserActivity();
    }
}