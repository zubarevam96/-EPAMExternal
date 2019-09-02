package com.zubarevam;

import com.zubarevam.classes.Student;
import com.zubarevam.communicationwithuser.ConsoleUI;
import com.zubarevam.tests.TestCreation;

import java.text.ParseException;

public class StartPoint {

    public static void main(String[] args) {
	StartPoint startPoint = new StartPoint();
	startPoint.consoleTest();
    }

    private void consoleTest() {
        TestCreation testCreation = new TestCreation();
        try {
            Student[] students = testCreation.create2Students();
            ConsoleUI consoleUI = new ConsoleUI();
            consoleUI.show(students);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
