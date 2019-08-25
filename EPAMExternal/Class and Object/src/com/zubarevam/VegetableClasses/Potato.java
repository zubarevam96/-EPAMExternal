package com.zubarevam.VegetableClasses;

import com.zubarevam.Interfaces.Vegetable;

public class Potato implements Vegetable {
    private double weight;
    private String color;
    private int calories;

    //конструкторы
    public Potato(double weight) {
        this.weight = weight;
        this.color = "green";
        this.calories = setCalories();
    }

    public Potato(double weight, String color) {
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
        return (int)(770 * weight);
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
        return "Potato";
    }
}
