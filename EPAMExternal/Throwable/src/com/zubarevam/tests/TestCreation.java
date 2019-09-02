package com.zubarevam.tests;

import com.zubarevam.classes.Course;
import com.zubarevam.classes.Curriculum;
import com.zubarevam.classes.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class TestCreation {
    public Student[] create2Students() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Student[] result = new Student[2];
        Curriculum[] curriculum = create2Curriculums();

        try {
            result[0] = new Student("Ivanov Ivan", curriculum[0], format.parse("2019-08-27 10:00"));
            result[1] = new Student("Petrov Petr", curriculum[1], format.parse("2019-08-30 10:00"));

        } catch (ParseException e) {
            System.err.println("ParseException while parsing in Class \"TestCreation\", method \"create2Students\"");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Exception in Class \"TestCreation\", method \"create2Students\"");
            e.printStackTrace();
        }
        return result;
    }

    private Curriculum[] create2Curriculums() {
        Curriculum[] result = new Curriculum[2];
        try {
            result[0] = new Curriculum("J2EE Developer", create2Courses());
            result[1] = new Curriculum("Java Developer", create3Courses());
        } catch (Exception e) {
            System.err.println("Exception in Class \"TestCreation\", method \"create2Curriculums\"");
            e.printStackTrace();
        }
        return result;
    }
    private Course[] create2Courses() {
        Course[] result = new Course[2];
        try {
        result[0] = new Course("Технология Java Servlets", 16);
        result[1] = new Course("Struts Framework", 24);
        } catch (Exception e) {
            System.err.println("Exception in Class \"TestCreation\", method \"create2Courses\"");
            e.printStackTrace();
        }
        return result;
    }
    private Course[] create3Courses() {
        Course[] result = new Course[3];
        try {
            result[0] = new Course("Обзор технологий Java", 8);
            result[1] = new Course("Библиотека JFC/Swing", 16);
            result[2] = new Course("Технология JDBC", 16);
        } catch (Exception e) {
            System.err.println("Exception in Class \"TestCreation\", method \"create3Courses\"");
            e.printStackTrace();
        }
        return result;
    }

}
