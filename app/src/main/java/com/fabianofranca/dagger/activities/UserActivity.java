package com.fabianofranca.dagger.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fabianofranca.dagger.Application;
import com.fabianofranca.dagger.R;
import com.fabianofranca.dagger.services.UserService;

import javax.inject.Inject;

public class UserActivity extends AppCompatActivity {

    @Inject
    UserService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Application.getApplication()
                .getUserActivitySubcomponent()
                .inject(this);
    }
}