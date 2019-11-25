package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Porfile_Fragment extends Fragment {



    private TextView profile_user_name, profile_user_email;


    public Porfile_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment_profile_view = inflater.inflate(R.layout.fragment_porfile_, container, false);

        profile_user_name = fragment_profile_view.findViewById(R.id.profile_user_name);
        profile_user_email = fragment_profile_view.findViewById(R.id.profile_user_email);

        UserArea userArea = (UserArea) getActivity();
        if(userArea != null)
        {
           profile_user_name.setText(userArea.getUserName().getText().toString());
           profile_user_email.setText(userArea.getUserEmail().getText().toString());
        }




       return fragment_profile_view;
    }

}
