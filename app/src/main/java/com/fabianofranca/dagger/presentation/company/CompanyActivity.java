package com.fabianofranca.dagger.presentation.company;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fabianofranca.dagger.Application;
import com.fabianofranca.dagger.R;
import com.fabianofranca.dagger.di.components.CompanyActivitySubcomponent;
import com.fabianofranca.dagger.di.scopes.PerActivity;

import javax.inject.Inject;

@PerActivity
public class CompanyActivity extends AppCompatActivity implements CompanyContract.View{

    @Inject
    CompanyContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);

        CompanyActivitySubcomponent.Builder builder = (CompanyActivitySubcomponent.Builder)
                Application.getApplication()
                .getCompanyServiceComponent()
                .subcomponentBuilders()
                .get(CompanyActivitySubcomponent.Builder.class)
                .get();

        builder.view(this).build().inject(this);
    }
}