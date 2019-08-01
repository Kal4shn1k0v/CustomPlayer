package com.kalashnikov.customplayer;



import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.start, new PlayerLarge()).commit();
            navigationView.setCheckedItem(R.id.all_music);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.all_music:
                getSupportFragmentManager().beginTransaction().replace(R.id.start,new PlayerLarge()).commit();

                break;
            case R.id.artists:
                getSupportFragmentManager().beginTransaction().replace(R.id.start,new PlayerLarge()).commit();

                break;
            case R.id.albums:
                getSupportFragmentManager().beginTransaction().replace(R.id.start,new PlayerLarge()).commit();

                break;
            case R.id.playlist:
                getSupportFragmentManager().beginTransaction().replace(R.id.start,new PlayerLarge()).commit();

                break;
            case R.id.setting:
                getSupportFragmentManager().beginTransaction().replace(R.id.start,new PlayerLarge()).commit();

                break;
        }
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

        @Override
    public void onBackPressed(){
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}
