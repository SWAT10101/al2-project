package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.api.RetrofitClient;
import com.example.myapplication.models.LoginResponse;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {

    EditText login_email_edit, login_password;
    TextInputLayout login_email_field,login_password_field;


    String email, password;

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

       /* if(this.Validate())
        {

            email = login_email_edit.getText().toString().trim();
            password = login_password.getText().toString().trim();

            Call<LoginResponse> call = RetrofitClient
                    .getInstance()
                    .getApi()
                    .userlogin(email, password);

            call.enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                    if(!response.isSuccessful())
                    {

                        Gson gson = new Gson();

                        if (response.errorBody() != null) {
                            LoginResponse message = gson.fromJson(response.errorBody().charStream(), LoginResponse.class);
                            Log.d("#####", message.getMessage());

                            new MaterialAlertDialogBuilder(LoginActivity.this)
                                    .setTitle("Error")
                                    .setMessage(message.getMessage())
                                    .setPositiveButton("Ok", null)
                                    .show();


                        }


                    }

                    if(response.isSuccessful())
                    {
                        if(response.body() != null)
                        {
                            Toast.makeText(LoginActivity.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                            Log.d("####", response.body().getMessage() + "------" + response.body().getUser().getFirstName());
                            Log.d("####", response.body().getMessage() + "------" + response.body().getUser().getLasttName());
                            Log.d("####", response.body().getMessage() + "------" + response.body().getUser().getEmail());
                            Log.d("####", response.body().getMessage() + "------" + response.body().getUser().getRegion());
                            Log.d("####", response.body().getMessage() + "------" + response.body().getUser().getState());
                            Log.d("####", response.body().getMessage() + "------" + response.body().getUser().getBlock());
                            Log.d("####", response.body().getMessage() + "------" + response.body().getUser().getBuilding());
                            Log.d("####", response.body().getMessage() + "------" + response.body().getUser().getStreet());
                            Log.d("####", response.body().getMessage() + "------" + response.body().getUser().getFloor());



                        }

                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {

                }
            });



        }*/

       Intent i = new Intent(this, UserArea.class);
       startActivity(i);

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
