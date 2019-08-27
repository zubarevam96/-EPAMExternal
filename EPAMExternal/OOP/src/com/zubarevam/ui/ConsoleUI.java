package com.zubarevam.ui;

import com.zubarevam.interfaces.ElectricalAppliance;

public class ConsoleUI {
    // выводит модели и потребление мощности элементов массива в консоль
    public void showArray(ElectricalAppliance[] arr) {
        for (ElectricalAppliance tmp : arr) {
            System.out.println(tmp.getModel() + ": " + tmp.getPowerConsumption() + " Watt");
        }
    }
}
