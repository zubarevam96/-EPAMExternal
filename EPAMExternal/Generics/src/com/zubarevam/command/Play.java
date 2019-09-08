package com.zubarevam.command;

import com.zubarevam.receiver.Animal;

public class Play implements Task {
    private Animal<? extends Comparable> animal;

    public Play(Animal<? extends Comparable> animal) {
        this.animal = animal;
    }

    @Override
    public Animal<? extends Comparable> execute() {
        animal.play();
        return animal;
    }
}
