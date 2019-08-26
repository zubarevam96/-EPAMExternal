package com.zubarevam.classes.forindoors;

import com.zubarevam.classes.multienviromental.Laptop;
import com.zubarevam.enums.Place;
import com.zubarevam.interfaces.ElectricalAppliance;

public class Lamp implements ElectricalAppliance {

    private int powerConsumption;
    private String objectModel;
    private Place place = Place.KITCHEN;
    private boolean connection = false; // подключение к сети
    private boolean mobility = false;

    private Lamp(String objectModel, int powerConsumption) {
        this.objectModel = objectModel;
        this.powerConsumption = powerConsumption;
    }

    public Lamp(String objectModel, int powerConsumption, Place place) {
        this(objectModel, powerConsumption);
        this.place = place;
    }
    public Lamp(String objectModel, int powerConsumption, Place place, boolean mobility) {
        this(objectModel, powerConsumption, place);
        this.mobility = mobility;
    }


    @Override
    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public boolean isMobile() {
        return mobility;
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