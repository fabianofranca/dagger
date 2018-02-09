package com.fabianofranca.dagger.presentation.user;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fabianofranca.dagger.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class UserActivity extends AppCompatActivity implements UserContract.View {

    @Inject
    UserContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}