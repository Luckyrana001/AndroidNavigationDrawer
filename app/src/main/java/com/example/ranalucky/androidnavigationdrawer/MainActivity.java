package com.example.ranalucky.androidnavigationdrawer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
    public static FragmentManager fragmentManager;
    CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // initialising the object of the FragmentManager. Here I'm passing getSupportFragmentManager().
        // You can pass getFragmentManager() if you are coding for Android 3.0 or above.
        fragmentManager = getSupportFragmentManager();
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(coordinatorLayout, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View hView = navigationView.getHeaderView(0);
       /* tvLoggedInName = (TextView) hView.findViewById(R.id.loggedInUserName);

          ivAvatarImage = (NetworkImageView) hView.findViewById(R.id.avatarNetworkImageView);
      */
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Toast.makeText(getApplicationContext(),"home clicked",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_painc) {
            Toast.makeText(getApplicationContext(),"Train Stations",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_schedule) {
            Toast.makeText(getApplicationContext(),"Train Schedule",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_messages) {
            Toast.makeText(getApplicationContext(),"Messages clicked",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_profile) {
            Toast.makeText(getApplicationContext(),"Profile",Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_logout) {
            Toast.makeText(getApplicationContext(),"logout",Toast.LENGTH_LONG).show();

          /*  final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getResources().getString(R.string.logout_str))
                    .setCancelable(false)
                    .setPositiveButton(getResources().getString(R.string.yes_alert), new DialogInterface.OnClickListener() {
                        public void onClick(@SuppressWarnings("unused") final DialogInterface dialog, @SuppressWarnings("unused") final int id) {
                            if (ServiceTools.isServiceRunning(getApplicationContext(), HajjLocationService.class)) {
                                stopService(new Intent(getApplicationContext(), HajjLocationService.class));
                            }
                            if (ServiceTools.isServiceRunning(getApplicationContext(), HajjIntentService.class)) {
                                stopService(new Intent(getApplicationContext(), HajjIntentService.class));
                            }
                            if (ylwlmanager != null) {

                                if (ServiceTools.isServiceRunning(getApplicationContext(), UartService.class)) {
                                    stopService(new Intent(getApplicationContext(), UartService.class));
                                }


                            }
                            logOut();
                        }
                    })
                    .setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                        public void onClick(final DialogInterface dialog, @SuppressWarnings("unused") final int id) {
                            dialog.cancel();
                        }
                    });
            final AlertDialog alert = builder.create();
            alert.show();*/
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
