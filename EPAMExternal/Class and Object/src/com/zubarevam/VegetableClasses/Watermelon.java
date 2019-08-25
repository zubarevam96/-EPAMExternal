package com.zubarevam.VegetableClasses;

import com.zubarevam.Interfaces.Vegetable;

// да, оказывается, это овощ (из группы бахчевых)
public class Watermelon implements Vegetable {
    private double weight;
    private String color;
    private int calories;

    //конструкторы
    public Watermelon(double weight) {
        this.weight = weight;
        this.color = "green";
        this.calories = setCalories();
    }

    public Watermelon(double weight, String color) {
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
        return (int)(300 * weight);
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
        return "Watermelon";
    }
}
