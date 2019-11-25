package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class UserArea extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    View haderView;

    TextView userName, userEmail;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_user_area);



         drawerLayout = findViewById(R.id.drawer_layout);
         navigationView = findViewById(R.id.navigation_view);
         haderView = navigationView.getHeaderView(0);

         userName = haderView.findViewById(R.id.name);
         userEmail = haderView.findViewById(R.id.email);

        Bundle dataFromLogin = getIntent().getExtras();

        if (dataFromLogin != null) {
            userName.setText(dataFromLogin.getString("firstname") + " " + dataFromLogin.getString("lastname"));
            userEmail.setText(dataFromLogin.getString("email"));

        }



        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportFragmentManager().beginTransaction().add(R.id.frame_id, new Porfile_Fragment() ).commit();




         navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                 int menu_id = item.getItemId();

                 switch (menu_id)
                 {
                     case R.id.order:
                         getSupportFragmentManager().beginTransaction().replace(R.id.frame_id, new Order_Fragment() ).commit();
                         Log.d("###", "Hello from order");

                     break;

                     case  R.id.profile:

                         getSupportFragmentManager().beginTransaction().replace(R.id.frame_id, new Porfile_Fragment() ).commit();
                         Log.d("###", "Hello from profile");

                     break;

                     case R.id.logout:
                         Log.d("###", "Hello from logout");

                     break;

                     case R.id.my_order:
                         getSupportFragmentManager().beginTransaction().replace(R.id.frame_id, new My_Order_Fragment()).commit();
                         Log.d("###", "Hello from my order");

                         break;
                 }


                 item.setChecked(true);
                 drawerLayout.closeDrawers();
                 return true;

             }
         });



    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        if(toggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public TextView getUserName() {
        return userName;
    }

    public TextView getUserEmail() {
        return userEmail;
    }
}
