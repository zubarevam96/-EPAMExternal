package com.zubarevam.classes.fortoilet;

import com.zubarevam.enums.Place;
import com.zubarevam.interfaces.ElectricalAppliance;

public class ElectricShaver implements ElectricalAppliance {

    private int powerConsumption;
    private String objectModel;
    private Place place;
    private boolean connection = false; // подключение к сети

    public ElectricShaver(String objectModel, int powerConsumption) {
        this.objectModel = objectModel;
        this.powerConsumption = powerConsumption;
        place = Place.TOILET;
    }

    public ElectricShaver(String objectModel, int powerConsumption, Place place) {
        this(objectModel, powerConsumption);
        this.place = place;
    }


    @Override
    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public boolean isMobile() {
        return true;
    }

    @Override
    public String getModel() {
        return objectModel;
    }

    @Override
    public boolean isPlugedIn() {
        return connection;
    }
    @Override
    public void plugIn() {
        connection = true;
    }
    @Override
    public void plugOut() {
        connection = false;
    }

    @Override
    public Place getPlace() {
        return place;
    }

    @Override
    public void setPlace(Place place) {
        this.place = place;
    }
}