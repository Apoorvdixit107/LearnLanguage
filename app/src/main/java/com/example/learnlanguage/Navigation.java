package com.example.learnlanguage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Navigation extends AppCompatActivity {
    BottomNavigationView bmv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        bmv = findViewById(R.id.bmv);
bmv.setSelectedItemId(R.id.home);
bmv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.notes:
                startActivity(new Intent(getApplicationContext(),Notes.class));
                overridePendingTransition(0,0);
                return true;
            case R.id.home:
                return true;
             case R.id.profile:

                 startActivity(new Intent(getApplicationContext(),Profile.class));
                 overridePendingTransition(0,0);
                 return true;

        }
        return false;
    }
}

);
    }
}