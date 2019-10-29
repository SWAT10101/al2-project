package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void signup(View view) {
        Intent toRegister = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(toRegister);
        this.finish(); // <-- To close this activity
    }




}
