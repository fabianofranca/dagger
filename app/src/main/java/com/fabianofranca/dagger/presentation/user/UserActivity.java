package com.fabianofranca.dagger.presentation.user;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fabianofranca.dagger.Application;
import com.fabianofranca.dagger.R;
import com.fabianofranca.dagger.di.components.UserActivitySubcomponent;

import javax.inject.Inject;

public class UserActivity extends AppCompatActivity implements UserContract.View {

    @Inject
    UserContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        UserActivitySubcomponent.Builder builder = (UserActivitySubcomponent.Builder)
                Application.getApplication()
                        .getUserServiceComponent()
                        .subcomponentBuilders()
                        .get(UserActivitySubcomponent.Builder.class)
                        .get();

        builder.view(this).build().inject(this);
    }
}