package com.example.myapplication;


import android.os.Bundle;

import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Order_Fragment extends Fragment {

    private String [] material_type = {"Acrylic", "Bone", "Ceramic", "Fabric", "furry", "Glass", "Leather", "Metal", "Silk", "Stone", "Velvet", "Wood", "Wool"};
    private String [] Pattern_type = {"Animal print", "Damask", "floral", "Motif", "Plaid", "patchwork", "Toile", "Weathered", "Tufted", "Striped"};
    private String [] style = {"Castal", "Eclectice", "French", "Industrial", "Kid's", "Luxe", "Modern", "Outdoor", "Traditional"};
    private String [] Brand = {"Safat Alghanim", "Ikea", "Banta", "Abyat", "Qurtaba", "Home Center", "Zara Center", "H&M"};

    private ArrayList<Integer> number_of_hale = new ArrayList<>();
    private ArrayList<Integer> number_of_room = new ArrayList<>();

    public Order_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        // Get fragment view
        View fragment_order_view = inflater.inflate(R.layout.fragment_order_, container, false);

        // Add number to hale array list
        for(int i = 1; i <= 3; i++)
        {
            number_of_hale.add(i);
        }

        // Add number to room array list
        for(int i = 1; i <= 5; i++)
        {
            number_of_room.add(i);
        }





        // Hale selector
        AutoCompleteTextView hale_number = fragment_order_view.findViewById(R.id.hale_number);
        hale_number.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, number_of_hale));


        //Room selector
        AutoCompleteTextView room_number = fragment_order_view.findViewById(R.id.room_number);
        room_number.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, number_of_room));


        //Hale 1
        MaterialCardView hale_1 = fragment_order_view.findViewById(R.id.hale_1);
        AutoCompleteTextView type_of_material_1 = fragment_order_view.findViewById(R.id.type_of_material_1);
        AutoCompleteTextView style_of_furniture_1 = fragment_order_view.findViewById(R.id.style_of_furniture_1);
        AutoCompleteTextView pattern_1 = fragment_order_view.findViewById(R.id.pattern_1);
        AutoCompleteTextView brand_1 = fragment_order_view.findViewById(R.id.brand_1);

        type_of_material_1.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, material_type));
        style_of_furniture_1.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, style));
        pattern_1.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Pattern_type));
        brand_1.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Brand));
        //------------------------------------------------------------------------------------------


        //Hale 2
        MaterialCardView hale_2 = fragment_order_view.findViewById(R.id.hale_2);
        AutoCompleteTextView type_of_material_2 = fragment_order_view.findViewById(R.id.type_of_material_2);
        AutoCompleteTextView style_of_furniture_2 = fragment_order_view.findViewById(R.id.style_of_furniture_2);
        AutoCompleteTextView pattern_2 = fragment_order_view.findViewById(R.id.pattern_2);
        AutoCompleteTextView brand_2 = fragment_order_view.findViewById(R.id.brand_2);

        type_of_material_2.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, material_type));
        style_of_furniture_2.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, style));
        pattern_2.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Pattern_type));
        brand_2.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Brand));
        //------------------------------------------------------------------------------------------

        //Hale 3
        MaterialCardView hale_3 = fragment_order_view.findViewById(R.id.hale_3);
        AutoCompleteTextView type_of_material_3 = fragment_order_view.findViewById(R.id.type_of_material_3);
        AutoCompleteTextView style_of_furniture_3 = fragment_order_view.findViewById(R.id.style_of_furniture_3);
        AutoCompleteTextView pattern_3 = fragment_order_view.findViewById(R.id.pattern_3);
        AutoCompleteTextView brand_3 = fragment_order_view.findViewById(R.id.brand_3);

        type_of_material_3.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, material_type));
        style_of_furniture_3.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, style));
        pattern_3.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Pattern_type));
        brand_3.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Brand));
        //------------------------------------------------------------------------------------------


        //Room 1
        MaterialCardView room_1 = fragment_order_view.findViewById(R.id.room_1);
        AutoCompleteTextView type_of_material_room_1 = fragment_order_view.findViewById(R.id.type_of_material_room_1);
        AutoCompleteTextView style_of_furniture_room_1 = fragment_order_view.findViewById(R.id.style_of_furniture_room_1);
        AutoCompleteTextView pattern_room_1 = fragment_order_view.findViewById(R.id.pattern_room_1);
        AutoCompleteTextView brand_room_1 = fragment_order_view.findViewById(R.id.brand_room_1);

        type_of_material_room_1.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, material_type));
        style_of_furniture_room_1.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, style));
        pattern_room_1.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Pattern_type));
        brand_room_1.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Brand));
        //------------------------------------------------------------------------------------------


        //Room 2
        MaterialCardView room_2 = fragment_order_view.findViewById(R.id.room_2);
        AutoCompleteTextView type_of_material_room_2 = fragment_order_view.findViewById(R.id.type_of_material_room_2);
        AutoCompleteTextView style_of_furniture_room_2 = fragment_order_view.findViewById(R.id.style_of_furniture_room_2);
        AutoCompleteTextView pattern_room_2 = fragment_order_view.findViewById(R.id.pattern_room_2);
        AutoCompleteTextView brand_room_2 = fragment_order_view.findViewById(R.id.brand_room_2);

        type_of_material_room_2.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, material_type));
        style_of_furniture_room_2.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, style));
        pattern_room_2.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Pattern_type));
        brand_room_2.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Brand));
        //------------------------------------------------------------------------------------------

        //Room 3
        MaterialCardView room_3 = fragment_order_view.findViewById(R.id.room_3);
        AutoCompleteTextView type_of_material_room_3 = fragment_order_view.findViewById(R.id.type_of_material_room_3);
        AutoCompleteTextView style_of_furniture_room_3 = fragment_order_view.findViewById(R.id.style_of_furniture_room_3);
        AutoCompleteTextView pattern_room_3 = fragment_order_view.findViewById(R.id.pattern_room_3);
        AutoCompleteTextView brand_room_3 = fragment_order_view.findViewById(R.id.brand_room_3);

        type_of_material_room_3.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, material_type));
        style_of_furniture_room_3.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, style));
        pattern_room_3.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Pattern_type));
        brand_room_3.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Brand));
        //------------------------------------------------------------------------------------------

        //Room 4
        MaterialCardView room_4 = fragment_order_view.findViewById(R.id.room_4);
        AutoCompleteTextView type_of_material_room_4 = fragment_order_view.findViewById(R.id.type_of_material_room_4);
        AutoCompleteTextView style_of_furniture_room_4 = fragment_order_view.findViewById(R.id.style_of_furniture_room_4);
        AutoCompleteTextView pattern_room_4 = fragment_order_view.findViewById(R.id.pattern_room_4);
        AutoCompleteTextView brand_room_4 = fragment_order_view.findViewById(R.id.brand_room_4);

        type_of_material_room_4.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, material_type));
        style_of_furniture_room_4.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, style));
        pattern_room_4.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Pattern_type));
        brand_room_4.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Brand));
        //------------------------------------------------------------------------------------------

        //Room 5
        MaterialCardView room_5 = fragment_order_view.findViewById(R.id.room_5);
        AutoCompleteTextView type_of_material_room_5 = fragment_order_view.findViewById(R.id.type_of_material_room_5);
        AutoCompleteTextView style_of_furniture_room_5 = fragment_order_view.findViewById(R.id.style_of_furniture_room_5);
        AutoCompleteTextView pattern_room_5 = fragment_order_view.findViewById(R.id.pattern_room_5);
        AutoCompleteTextView brand_room_5 = fragment_order_view.findViewById(R.id.brand_room_5);

        type_of_material_room_5.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, material_type));
        style_of_furniture_room_5.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, style));
        pattern_room_5.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Pattern_type));
        brand_room_5.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Brand));
        //------------------------------------------------------------------------------------------



        // Hale selector action
        hale_number.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                int item = (int) parent.getItemAtPosition(position);

                if (item == 1)
                {
                    hale_1.setVisibility(View.VISIBLE);

                    hale_2.setVisibility(View.GONE);
                    hale_3.setVisibility(View.GONE);
                }
                else if (item == 2)
                {
                    hale_1.setVisibility(View.VISIBLE);
                    hale_2.setVisibility(View.VISIBLE);

                    hale_3.setVisibility(View.GONE);
                }
                else if(item == 3)
                {
                    hale_1.setVisibility(View.VISIBLE);
                    hale_2.setVisibility(View.VISIBLE);
                    hale_3.setVisibility(View.VISIBLE);
                }

                Log.d("###", parent.getItemAtPosition(position).toString());

            }
        });

        // Room selector action
        room_number.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item = (int) parent.getItemAtPosition(position);

                if (item == 1)
                {
                    room_1.setVisibility(View.VISIBLE);

                    room_2.setVisibility(View.GONE);
                    room_3.setVisibility(View.GONE);
                    room_4.setVisibility(View.GONE);
                    room_5.setVisibility(View.GONE);
                }
                else if (item == 2)
                {
                    room_1.setVisibility(View.VISIBLE);
                    room_2.setVisibility(View.VISIBLE);

                    room_3.setVisibility(View.GONE);
                    room_4.setVisibility(View.GONE);
                    room_5.setVisibility(View.GONE);
                }
                else if(item == 3)
                {
                    room_1.setVisibility(View.VISIBLE);
                    room_2.setVisibility(View.VISIBLE);
                    room_3.setVisibility(View.VISIBLE);

                    room_4.setVisibility(View.GONE);
                    room_5.setVisibility(View.GONE);
                }
                else if(item == 4)
                {
                    room_1.setVisibility(View.VISIBLE);
                    room_2.setVisibility(View.VISIBLE);
                    room_3.setVisibility(View.VISIBLE);
                    room_4.setVisibility(View.VISIBLE);

                    room_5.setVisibility(View.GONE);

                }
                else if(item == 5)
                {
                    room_1.setVisibility(View.VISIBLE);
                    room_2.setVisibility(View.VISIBLE);
                    room_3.setVisibility(View.VISIBLE);
                    room_4.setVisibility(View.VISIBLE);
                    room_5.setVisibility(View.VISIBLE);

                }


                Log.d("###", parent.getItemAtPosition(position).toString());

            }
        });




        return  fragment_order_view;
    }

}
