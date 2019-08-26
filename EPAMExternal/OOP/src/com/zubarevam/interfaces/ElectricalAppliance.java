package com.zubarevam.interfaces;

import com.zubarevam.enums.Place;

public interface ElectricalAppliance {

    // для получения неизменяемых констант
    int getPowerConsumption();
    boolean isMobile();
    String getModel();

    // для работы с питанием
    boolean isPlugedIn();
    void plugIn();
    void plugOut();

    // для работы с местонахождением
    Place getPlace();
    void setPlace(Place place);
}
