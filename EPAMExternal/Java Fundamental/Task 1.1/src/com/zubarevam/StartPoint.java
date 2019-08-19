/*
 * Точка входа в приложение
 * @autor Зубарев Александр
 * Лекция № 1
 * Задача № 2
 */

package com.zubarevam;

import com.zubarevam.UserInterfaces.ConsoleUserInterface;

public class StartPoint {

    public static void main(String[] args) {
	StartPoint startPoint = new StartPoint();
	startPoint.startConsoleUI();
    }
    private void startConsoleUI() {
        ConsoleUserInterface.start();
    }
}
