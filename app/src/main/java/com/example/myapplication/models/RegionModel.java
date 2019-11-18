package com.example.myapplication.models;


import java.util.List;

public class RegionModel {



    private Boolean error;


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


