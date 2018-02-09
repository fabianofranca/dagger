package com.fabianofranca.dagger.presentation.company;

import android.os.Bundle;

import com.fabianofranca.dagger.R;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class CompanyActivity extends DaggerActivity implements CompanyContract.View{

    @Inject
    CompanyContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
    }
}