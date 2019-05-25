package com.example.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNextActivity(View view) {
        Intent intent = new Intent(view.getContext(), SelectRegionActivity.class);
        startActivity(intent);
    }
}
