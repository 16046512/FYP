package com.example.a16046512.lifespeechkidzo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    //sidebar start
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    //sidebar end

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sidebar start
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);
        //sidebar end
    }
    //sidebar start

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_home){
            Toast.makeText(getBaseContext(), "home clicked", Toast.LENGTH_LONG).show();


        }else if(id == R.id.nav_Login) {

            Toast.makeText(getBaseContext(), "nav clicked", Toast.LENGTH_LONG).show();
        }else if (id == R.id.nav_CreateAccount){

            Toast.makeText(getBaseContext(), "create acc clicked", Toast.LENGTH_LONG).show();
        }else if (id == R.id.nav_contact){

            Toast.makeText(getBaseContext(), "contact clicked", Toast.LENGTH_LONG).show();

        }else if(id == R.id.nav_about){

            Toast.makeText(getBaseContext(), "about clicked", Toast.LENGTH_LONG).show();
        }
        return false;
    }

    //sidebar end
}

