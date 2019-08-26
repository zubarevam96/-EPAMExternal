package com.zubarevam;

import com.zubarevam.UserInterfaces.Consoleinterface;
import com.zubarevam.test.TestArray;

public class StartPoint {

    public static void main(String[] args) {
	StartPoint startPoint = new StartPoint();
	startPoint.TestIt();
    }
    private void TestIt() {
        TestArray testArray = new TestArray();
        Consoleinterface consoleinterface = new Consoleinterface();
        System.out.println("array at the beginning:");
        consoleinterface.showArray((testArray.getArray()));
        System.out.println("\ntest on finding by power consumption between 100 and 800:");
        consoleinterface.showArray(testArray.testFinding(100, 800));
        System.out.println("\ntest on sorting:");
        consoleinterface.showArray(testArray.testSorting());

    }
}
