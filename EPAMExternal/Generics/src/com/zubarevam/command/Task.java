package com.zubarevam.command;


import com.zubarevam.receiver.Animal;

public interface Task {
    Animal<? extends Comparable> execute();
}
