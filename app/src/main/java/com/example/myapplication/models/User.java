package com.example.myapplication.models;

public class User {



    private String FirstName, LasttName, Email, region, state, Block, Street, Building, Floor, Flat;
    private int Phone;

    public User(String firstName, String lasttName, String email, String region, String state, String block, String street, String building, String floor, String flat, int phone) {
        FirstName = firstName;
        LasttName = lasttName;
        Email = email;
        this.region = region;
        this.state = state;
        Block = block;
        Street = street;
        Building = building;
        Floor = floor;
        Flat = flat;
        Phone = phone;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLasttName() {
        return LasttName;
    }

    public String getEmail() {
        return Email;
    }

    public String getRegion() {
        return region;
    }

    public String getState() {
        return state;
    }

    public String getBlock() {
        return Block;
    }

    public String getStreet() {
        return Street;
    }

    public String getBuilding() {
        return Building;
    }

    public String getFloor() {
        return Floor;
    }

    public String getFlat() {
        return Flat;
    }

    public int getPhone() {
        return Phone;
    }
}
