package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

@SuppressLint("Registered")
public class RegisterActivity extends AppCompatActivity {

    TextInputLayout first_name_field, last_name_field, email_field, password_field,
                    re_password_field, phone_field, region_field, state_field, block_field, street_field, building_field, floor_field, flat_field;

    EditText first_name_edit, last_name_edit, email_edit, password_edit, re_password_edit,
             phone_edit, state_edit, block_edit, street_edit, buidling_edit, floor_edit, flat_edit;

    AutoCompleteTextView region_auto_complete_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_register);

        first_name_field = findViewById(R.id.first_name_field);
        first_name_edit = findViewById(R.id.first_name_edit);

        last_name_field = findViewById(R.id.last_name_field);
        last_name_edit = findViewById(R.id.last_name_edit);

        email_field = findViewById(R.id.email_field);
        email_edit = findViewById(R.id.email_edit);

        password_field = findViewById(R.id.password_field);
        password_edit = findViewById(R.id.password_edit);

        re_password_field = findViewById(R.id.re_password_field);
        re_password_edit = findViewById(R.id.re_password_edit);

        phone_field = findViewById(R.id.phone_field);
        phone_edit =findViewById(R.id.phone_edit);

        region_field = findViewById(R.id.region_field);
        region_auto_complete_text_view = findViewById(R.id.region_auto_complete_text_view);

        state_field = findViewById(R.id.state_field);
        state_edit = findViewById(R.id.state_edit);

        block_field = findViewById(R.id.block_field);
        block_edit = findViewById(R.id.block_edit);

        street_field = findViewById(R.id.street_field);
        street_edit = findViewById(R.id.street_edit);

        building_field = findViewById(R.id.building_field);
        buidling_edit = findViewById(R.id.buidling_edit);

        floor_field = findViewById(R.id.floor_field);
        floor_edit = findViewById(R.id.floor_edit);

        flat_field = findViewById(R.id.flat_field);
        flat_edit = findViewById(R.id.flat_edit);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        region_auto_complete_text_view.setAdapter(adapter);
        region_auto_complete_text_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String selection = (String)parent.getItemAtPosition(position);

                Toast.makeText(RegisterActivity.this, position+1 + " -- " + selection, Toast.LENGTH_LONG).show();
            }
        });

    }

    private static final String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain"
    };


    public void signin(View view) {
        Intent toLogin = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(toLogin);
        this.finish(); // <-- To close this activity
    }

    @Override
    public void onBackPressed() {
        // Do nothing
    }


    public void register(View view) {

       if(Validate())
       {
           Log.d("####", "OKAAAAAY");
       }
       else
       {
           Log.d("####", "NNNOOTT OKAAAAAY");
       }

    }


    private boolean Validate() {
        boolean check = true;
        if (checkEmptyEditText(first_name_edit, first_name_field, "First Name Require")) check = false;
        if (checkEmptyEditText(last_name_edit, last_name_field, "Last Name Require")) check = false;
        if (checkEmptyEditText(email_edit, email_field, "Email Require") || validEmail(email_edit, email_field)) check = false;
        if (checkEmptyEditText(password_edit, password_field, "Password Require") || passwordLength(password_edit, password_field)) check = false;
        if (checkEmptyEditText(re_password_edit, re_password_field, "Re Password Require") || passwordMatch(password_edit, re_password_edit, re_password_field)) check = false;
        if (checkEmptyEditText(phone_edit, phone_field, "Phone Number Require")) check = false;
        if (checkEmptyEditText(region_auto_complete_text_view, region_field, "Region Require")) check = false;
        if (checkEmptyEditText(state_edit, state_field, "State Require")) check = false;
        if (checkEmptyEditText(block_edit, block_field, "Block Require")) check = false;
        if (checkEmptyEditText(street_edit, street_field, "Street Require")) check = false;
        if (checkEmptyEditText(buidling_edit, building_field, "Building Require")) check = false;
        if (checkEmptyEditText(floor_edit, floor_field, "Floor Require")) check = false;
        if (checkEmptyEditText(flat_edit, flat_field, "Flat Require")) check = false;


        return check;
    }


    private boolean passwordMatch(EditText password1, EditText password2, TextInputLayout TFB){

        if(!password1.getText().toString().trim().equals(password2.getText().toString().trim()))
        {
            TFB.setErrorEnabled(true);
            TFB.setError("Password not match");
            return true;
        }
        else
        {
            return false;
        }

    } // To check re password match

    public boolean passwordLength(EditText text, TextInputLayout TFB){

        if(text.length() < 8 )
        {
            TFB.setErrorEnabled(true);
            TFB.setError("Password should be 8 character long");
            return true;
        }
        else
        {
            return false;
        }

    } // To check password length

    public boolean validEmail(EditText text, TextInputLayout TFB) {

        if(!Patterns.EMAIL_ADDRESS.matcher(text.getText().toString().trim()).matches())
        {
            TFB.setErrorEnabled(true);
            TFB.setError("Enter a valid email");
            return true;
        }
        else
        {
            return  false;
        }

    } // To check email valid

    private boolean checkEmptyEditText(EditText text, TextInputLayout TFB, String massage) {

        if (text.getText().toString().trim().isEmpty())
        {
            TFB.setErrorEnabled(true);
            TFB.setError(massage);
            return true;
        }
        else
        {
            TFB.setErrorEnabled(false);
            return false;
        }

    } // To check empty edit text
}
