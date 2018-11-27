package com.example.sampletestproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import androidx.appcompat.widget.Toolbar;

import androidx.navigation.Navigation;

import androidx.navigation.fragment.NavHostFragment;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavHostFragment navHost = NavHostFragment.create(R.navigation.main_nav_graph);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, navHost)
                .setPrimaryNavigationFragment(navHost)
                .commit();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this,R.id.main_nav_graph).navigateUp();
    }
}
