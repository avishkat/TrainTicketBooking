package com.example.booking;

import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListner);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                   Fragment selectedFragment = null;

                   switch(menuItem.getItemId()){
                       case R.id.nav_home:
                           selectedFragment = new HomeFragment();
                           break;
                       case R.id.nav_history:
                           selectedFragment = new HistoryFragment();
                           break;

                       case R.id.nav_profile:
                           selectedFragment = new ProfileFragment();
                           break;
                   }
                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                           selectedFragment).commit();
                   return true;
                }
            };

}
