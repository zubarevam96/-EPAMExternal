package com.zubarevam;


import com.zubarevam.UserInterfaces.UserInterface;

public class StartPoint {


    public static void main(String[] args) {
	StartPoint startPoint = new StartPoint();
	startPoint.launchUserInterface();
    }
    private void launchUserInterface() {
        UserInterface.show();
    }
}
