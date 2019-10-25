package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = findViewById(R.id.vf);

    }



    public void viewRegister(View view) {
        viewFlipper.setDisplayedChild(1);
    }

    public void viewLogin(View view) {
        viewFlipper.setDisplayedChild(2);
    }
}
