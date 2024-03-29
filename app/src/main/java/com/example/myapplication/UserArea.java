package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

    String region, state, block, building, street, floor, flat;
    int phone;


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
            phone = dataFromLogin.getInt("phone");
            region = dataFromLogin.getString("region");
            state = dataFromLogin.getString("state");
            block = dataFromLogin.getString("block");
            building = dataFromLogin.getString("building");
            street = dataFromLogin.getString("street");
            floor = dataFromLogin.getString("floor");
            flat = dataFromLogin.getString("flat");

        }



        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_id, new Order_Fragment() ).commit();




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
                         Intent gotologin = new Intent(UserArea.this, LoginActivity.class);
                         startActivity(gotologin);
                         UserArea.this.finish();
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


    @Override
    public void onBackPressed() {
        Toast.makeText(UserArea.this, "Logout from side menu :)", Toast.LENGTH_LONG).show();
    }



    public TextView getUserName() {
        return userName;
    }

    public TextView getUserEmail() {
        return userEmail;
    }

    public String getRegion() {
        return region;
    }

    public String getState() {
        return state;
    }

    public String getBlock() {
        return block;
    }

    public String getBuilding() {
        return building;
    }

    public String getStreet() {
        return street;
    }

    public String getFloor() {
        return floor;
    }

    public String getFlat() {
        return flat;
    }

    public int getPhone() {
        return phone;
    }
}
