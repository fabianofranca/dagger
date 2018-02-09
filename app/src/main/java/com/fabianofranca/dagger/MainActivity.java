package com.fabianofranca.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.fabianofranca.dagger.activities.CompanyActivity;
import com.fabianofranca.dagger.activities.UserActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button userButton = findViewById(R.id.button_user);
        Button companyButton = findViewById(R.id.button_company);

        userButton.setOnClickListener( (view) -> {

            Intent intent = new Intent(this, UserActivity.class);

            startActivity(intent);
        });

        companyButton.setOnClickListener( (view) -> {

            Intent intent = new Intent(this, CompanyActivity.class);

            startActivity(intent);
        });

    }
}