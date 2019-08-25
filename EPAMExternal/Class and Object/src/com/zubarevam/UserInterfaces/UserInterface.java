package com.zubarevam.UserInterfaces;

import com.zubarevam.Interfaces.Vegetable;
import com.zubarevam.Logic.ClassGeneration;

import java.util.ArrayList;

public class UserInterface {
    public static void show() {
        ClassGeneration classGeneration = new ClassGeneration();
        for (ArrayList<Vegetable> vegetable : classGeneration.getSortedVegetablesList()) {
            for (int i = 0; i < vegetable.size(); i++) {
                System.out.println(vegetable.get(i).getClassName());
            }
        }
    }
}
