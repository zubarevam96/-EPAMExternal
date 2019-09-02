package com.zubarevam.classes;

import com.zubarevam.interfaces.ICurriculum;

public class Curriculum implements ICurriculum {
    private String name;
    private Course[] courses;

    public Curriculum(String name, Course[] courses) {
        this.name = name;
        this.courses = courses;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Course[] getCourses() {
        return new Course[0];
    }
    @Override
    public int getHours() {
        int hours = 0;
        for (Course course : courses) {
            hours += course.getDuration();
        }
        return hours;
    }
}
