package com.zubarevam.UserInterfaces;

import com.zubarevam.interfaces.ElectricalAppliance;

public class Consoleinterface {
    // выводит модели и потребление мощности элементов массива в консоль
    public void showArray(ElectricalAppliance[] arr) {
        for (ElectricalAppliance tmp : arr) {
            System.out.println(tmp.getModel() + ": " + tmp.getPowerConsumption() + " Watt");
        }
    }
}
