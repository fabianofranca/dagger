package com.fabianofranca.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fabianofranca.dagger.activities.ActivityB;
import com.fabianofranca.dagger.di.ActivitiesComponent;
import com.fabianofranca.dagger.di.DaggerActivitiesComponent;

public class MainActivity extends AppCompatActivity {

    private ActivitiesComponent component;
    private ActivityB activityB1;
    private ActivityB activityB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerActivitiesComponent.builder().build();

        activityB1 = component.createActivityB();
        activityB2 = component.createActivityB();
    }
}