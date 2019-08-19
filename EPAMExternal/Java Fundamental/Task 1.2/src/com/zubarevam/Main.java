/*
 * Точка входа в приложение
 * @autor Зубарев Александр
 * Лекция № 1
 * Задача № 2
 */

package com.zubarevam;

import com.zubarevam.UserInterfaces.ConsoleUserInterface;

public class Main {

    public static void main(String[] args) {
        Main startPoint = new Main();
        startPoint.startConsoleUI();
    }
    private void startConsoleUI() {
        ConsoleUserInterface.start();
    }
}
