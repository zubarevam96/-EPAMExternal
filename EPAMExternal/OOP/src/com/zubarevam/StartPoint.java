package com.zubarevam;

import com.zubarevam.ui.ConsoleUI;
import com.zubarevam.test.TestArray;

public class StartPoint {

    public static void main(String[] args) {
	StartPoint startPoint = new StartPoint();
	startPoint.TestIt();
    }
    private void TestIt() {
        TestArray testArray = new TestArray();
        ConsoleUI consoleUI = new ConsoleUI();
        System.out.println("array at the beginning:");
        consoleUI.showArray((testArray.getArray()));
        System.out.println("\ntest on finding by power consumption between 100 and 800:");
        consoleUI.showArray(testArray.testFinding(100, 800));
        System.out.println("\ntest on sorting:");
        consoleUI.showArray(testArray.testSorting());

    }
}
