package com.example.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Regions {

    @SerializedName("RegionId")
    @Expose
    private int RegionId;

    @SerializedName("Name")
    @Expose
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
