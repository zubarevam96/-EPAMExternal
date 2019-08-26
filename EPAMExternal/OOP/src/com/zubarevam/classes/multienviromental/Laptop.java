package com.zubarevam.classes.multienviromental;

import com.zubarevam.classes.forrestroom.Computer;
import com.zubarevam.enums.Place;

public class Laptop extends Computer {

    public Laptop(String objectModel, int powerConsubption, Place place) {
        super(objectModel, powerConsubption, place);
    }

    @Override
    public boolean isMobile() {
        return true;
    }

}
