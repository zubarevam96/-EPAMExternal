package com.zubarevam.logic;

import com.zubarevam.enums.Place;
import com.zubarevam.interfaces.ElectricalAppliance;

public class FindAppliance {
    // возвращает массив, где все элементы находятся в месте place
    public static ElectricalAppliance[] byPlace(ElectricalAppliance[] arr, Place place) {
        int n = 0; // количество элементов в возвращаемом массиве

        // подсчитываем количество элементов в возвращаемом массиве
        for (ElectricalAppliance tmp : arr) {
            if (tmp.getPlace() == place) {
                n++;
            }
        }
        ElectricalAppliance[] result = new ElectricalAppliance[n];

        //заполнение массива, который будем возвращать
        int i = 0; // индекс результирующего массива
        for (ElectricalAppliance tmp : arr) {
            if (tmp.getPlace() == place) {
                result[i++] = tmp;
            }
        }
        return result;
    }

    // возвращает массив, в котором диапазон потребляемой мощность находится в диапазоне от min до max
    public static ElectricalAppliance[] byPowerConsumption(ElectricalAppliance[] arr, int min, int max) {
        int n = 0; // количество элементов в возвращаемом массиве

        // подсчитываем количество элементов в возвращаемом массиве
        for (ElectricalAppliance tmp : arr) {
            if (tmp.getPowerConsumption() > min && tmp.getPowerConsumption() < max) {
                n++;
            }
        }
        ElectricalAppliance[] result = new ElectricalAppliance[n];

        //заполнение массива, который будем возвращать
        int i = 0; // индекс результирующего массива
        for (ElectricalAppliance tmp : arr) {
            if (tmp.getPowerConsumption() > min && tmp.getPowerConsumption() < max) {
                result[i++] = tmp;
            }
        }
        return result;
    }
}
