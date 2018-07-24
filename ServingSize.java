package com.example.kesavant.kiosk.Model;

/**
 * Created by kesavanT on 12/13/2017.
 */

public class ServingSize {
    public String id;
    public String name;
    /*public double price;
    public int sequenceNumber;
    public int orderSequence;*/

    public ServingSize(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
