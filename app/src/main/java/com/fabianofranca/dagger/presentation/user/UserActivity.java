package com.fabianofranca.dagger.presentation.user;

import android.os.Bundle;

import com.fabianofranca.dagger.R;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class UserActivity extends DaggerActivity implements UserContract.View {

    @Inject
    UserContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}