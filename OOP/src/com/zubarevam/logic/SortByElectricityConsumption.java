package com.zubarevam.logic;

import com.zubarevam.interfaces.ElectricalAppliance;

// алгоритм сортировки стырен отсюда: https://java-master.com/алгоритм-быстрой-сортировки-quick-sort-в-java/
public class SortByElectricityConsumption {
    public static void quickSort(ElectricalAppliance[] arr, int low, int high) {
        if (arr.length == 0)
            return; // завершить выполнение если длина массива равна 0

        if (low >= high)
            return; // завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = arr[middle].getPowerConsumption();

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (arr[i].getPowerConsumption() < opora ) {
                i++;
            }

            while (arr[j].getPowerConsumption() > opora) {
                j--;
            }

            if (i <= j) { // меняем местами
                ElectricalAppliance temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
    public static void quickSort(ElectricalAppliance[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
}
