package com.example.myapplication;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;


/**
 * A simple {@link Fragment} subclass.
 */
public class Porfile_Fragment extends Fragment {






    public Porfile_Fragment() {
        // Required empty public constructor
    }


    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        // Get fragment view
        View fragment_profile_view = inflater.inflate(R.layout.fragment_porfile_, container, false);

        // Get Items in fragment view by id
        TextView profile_user_name = fragment_profile_view.findViewById(R.id.profile_user_name);
        TextView profile_user_email = fragment_profile_view.findViewById(R.id.profile_user_email);
        TextView profile_user_phone = fragment_profile_view.findViewById(R.id.phone);
        TextView profile_user_region = fragment_profile_view.findViewById(R.id.region);
        TextView profile_user_state = fragment_profile_view.findViewById(R.id.state);
        TextView profile_user_block = fragment_profile_view.findViewById(R.id.block);
        TextView profile_user_street = fragment_profile_view.findViewById(R.id.street);
        TextView profile_user_building = fragment_profile_view.findViewById(R.id.building);
        TextView profile_user_floor = fragment_profile_view.findViewById(R.id.floor);
        TextView profile_user_flat = fragment_profile_view.findViewById(R.id.flat);
        ImageView profile_user_edit = fragment_profile_view.findViewById(R.id.user_edit);


        //Get user area activity to pass date from activity to fragment
        UserArea userArea = (UserArea) getActivity();

        if(userArea != null)
        {
            profile_user_name.setText(userArea.getUserName().getText().toString());
            profile_user_email.setText(userArea.getUserEmail().getText().toString());
            profile_user_phone.setText(Integer.toString(userArea.getPhone()));
            profile_user_region.setText(userArea.getRegion());
            profile_user_state.setText(userArea.getState());
            profile_user_block.setText(userArea.getBlock());
            profile_user_street.setText(userArea.getStreet());
            profile_user_building.setText(userArea.getBuilding());
            profile_user_floor.setText(userArea.getFloor());
            profile_user_flat.setText(userArea.getFlat());
        }


        profile_user_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Edit user info will coming soon", LENGTH_LONG).show();
            }
        });




       return fragment_profile_view;
    }

}
