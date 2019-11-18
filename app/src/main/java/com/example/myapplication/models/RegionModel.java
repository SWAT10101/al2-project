package com.example.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RegionModel {


    @SerializedName("error")
    @Expose
    private Boolean error;

    @SerializedName("regions")
    @Expose
    private List<Regions> regions;

    public RegionModel(Boolean error, List<Regions> regions) {
        this.error = error;
        this.regions = regions;
    }

    public Boolean getError() {
        return error;
    }

    public List<Regions> getRegions() {
        return regions;
    }
}


