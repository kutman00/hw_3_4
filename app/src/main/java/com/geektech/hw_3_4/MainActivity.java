package com.geektech.hw_3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_second, new SecondFragment()).commit();
    }
}