package com.zubarevam.Logic;

import com.zubarevam.Interfaces.Vegetable;
import com.zubarevam.VegetableClasses.Cucumber;
import com.zubarevam.VegetableClasses.Potato;
import com.zubarevam.VegetableClasses.Watermelon;

import java.util.ArrayList;

public class ClassGeneration {
    private static final int N = 20; // количество генерируемых объектов

    private ArrayList<Vegetable> vegetablesList = new ArrayList<Vegetable>(); // одномерный массив, который заполняем объектами
    private ArrayList<ArrayList<Vegetable>> sortedVegetablesList = new ArrayList<>(); // двумерный массив, 1 ряд = 1 класс


    public ClassGeneration() {
        generate(); // генерация одномерного массива
        for (int i = 0; i < N; i++) {
            sortedVegetablesList.add(new ArrayList<Vegetable>()); // генерация двумерного массива
        }

        for (Vegetable vegetable : vegetablesList) { // заполнение двумерного массива
            if (vegetable instanceof Cucumber) {
                sortedVegetablesList.get(0).add(vegetable);
            } else if (vegetable instanceof Potato) {
                sortedVegetablesList.get(1).add(vegetable);
            } else if (vegetable instanceof Watermelon) {
                sortedVegetablesList.get(2).add(vegetable);
            }
        }

    }

    public ArrayList<ArrayList<Vegetable>> getSortedVegetablesList() {
        return sortedVegetablesList;
    }

    private void generate() { // n - количество объектов для генерации
        for (int i = 0; i < N; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0:
                    vegetablesList.add(new Cucumber(140));
                    break;
                case 1:
                    vegetablesList.add((new Potato(170)));
                    break;
                case 2:
                    vegetablesList.add((new Watermelon(9000)));
                    break;
            }
        }
    }

    public ArrayList<Vegetable> get() {
        return vegetablesList;
    }

}
