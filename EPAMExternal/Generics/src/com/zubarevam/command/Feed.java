package com.zubarevam.command;

import com.zubarevam.receiver.Animal;

public class Feed implements Task {
    private Animal<? extends Comparable> animal;

    public Feed(Animal<? extends Comparable> animal) {
        this.animal = animal;
    }

    @Override
    public Animal<? extends Comparable> execute() {
        animal.feed();
        return animal;
    }
}
