package com.zubarevam.command;

import com.zubarevam.receiver.Animal;

public class Wash implements Task {
    private Animal<? extends Comparable> animal;

    public Wash(Animal<? extends Comparable> animal) {
        this.animal = animal;
    }

    @Override
    public Animal<? extends Comparable> execute() {
        animal.wash();
        return animal;
    }
}
