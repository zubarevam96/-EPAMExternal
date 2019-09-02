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
        try {
            TestCreation testCreation = new TestCreation();
            Student[] students = testCreation.create2Students();
            ConsoleUI consoleUI = new ConsoleUI();
            consoleUI.show(students);
        } catch (Exception e) {
            System.err.println("Exception in Class \"StartPoint\", method \"consoleTest\"");
        }
    }
}
