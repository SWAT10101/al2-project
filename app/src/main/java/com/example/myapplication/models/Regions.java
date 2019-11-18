package com.example.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Regions {



    private int RegionId;


    private String Name;

    public Regions(int regionId, String name) {
        RegionId = regionId;
        Name = name;
    }

    public int getRegionId() {
        return RegionId;
    }

    public String getName() {
        return Name;
    }
}
