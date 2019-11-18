package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;


public class LoginActivity extends AppCompatActivity {

    EditText login_email_edit, login_password;
    TextInputLayout login_email_field,login_password_field;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        login_email_edit = findViewById(R.id.login_email_edit);
        login_email_field = findViewById(R.id.login_email_field);


        login_password = findViewById(R.id.login_password);
        login_password_field = findViewById(R.id.login_password_field);




    }


    public void signup(View view) {
        Intent toRegister = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(toRegister);
        this.finish(); // <-- To close this activity
    }


    public void login(View view) {

        if(this.Validate())
        {
             // login here
        }

    }



    private boolean Validate() {
        boolean check = true;

        if (checkEmptyEditText(login_email_edit, login_email_field, "Email Require") || validEmail(login_email_edit, login_email_field)) check = false;
        if (checkEmptyEditText(login_password, login_password_field, "Password Require") || passwordLength(login_password, login_password_field)) check = false;




        return check;
    } // To check validate all input

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

}
