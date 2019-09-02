package com.zubarevam.classes;

import com.zubarevam.interfaces.ICourse;

public class Course implements ICourse {
    private String name;
    private int duration;

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDuration() {
        return duration;
    }
}
