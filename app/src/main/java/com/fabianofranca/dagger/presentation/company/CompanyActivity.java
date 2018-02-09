package com.fabianofranca.dagger.presentation.company;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fabianofranca.dagger.R;
import com.fabianofranca.dagger.di.scopes.PerActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

@PerActivity
public class CompanyActivity extends AppCompatActivity implements CompanyContract.View{

    @Inject
    CompanyContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
    }
}