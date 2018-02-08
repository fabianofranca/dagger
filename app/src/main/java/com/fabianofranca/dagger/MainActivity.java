package com.fabianofranca.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fabianofranca.dagger.activities.ActivityA;
import com.fabianofranca.dagger.activities.ActivityB;
import com.fabianofranca.dagger.di.ActivitiesComponent;
import com.fabianofranca.dagger.di.DaggerActivitiesComponent;

public class MainActivity extends AppCompatActivity {

    private ActivitiesComponent component;
    private ActivityA activityA;
    private ActivityB activityB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerActivitiesComponent.builder().build();

        activityA = component.createActivityA();
        activityB = component.createActivityB();
    }
}