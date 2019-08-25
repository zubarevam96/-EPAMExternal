package com.zubarevam.VegetableClasses;

import com.zubarevam.Interfaces.Vegetable;

public class Cucumber implements Vegetable {
    private double weight;
    private String color;
    private int calories;

    //конструкторы
    public Cucumber(double weight) {
        this.weight = weight;
        this.color = "green";
        this.calories = setCalories();
    }

    public Cucumber(double weight, String color) {
        this.weight = weight;
        this.color = "green";
        this.calories = setCalories();
    }

    //геттеры-сеттеры
    @Override
    public int getCalories() {
        return calories;
    }
    private int setCalories() {
        return (int)(140 * weight);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getClassName() {
        return "Cucumber";
    }
}
