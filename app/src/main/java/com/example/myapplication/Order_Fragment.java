package com.example.myapplication;


import android.os.Bundle;

import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Order_Fragment extends Fragment {


    public Order_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        // Get fragment view
        View fragment_order_view = inflater.inflate(R.layout.fragment_order_, container, false);



        String [] material_type = {"Leather", "Soft", "Velvet"};
        AutoCompleteTextView editTextFilledExposedDropdown = fragment_order_view.findViewById(R.id.type_of_material_1);
        editTextFilledExposedDropdown.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, material_type));


        return  fragment_order_view;
    }

}
