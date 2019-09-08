package com.zubarevam.receiver;

public class Animal<T extends Comparable> {
    private T id; // идентификатор животного
    private String name;
    private int age;
    // если все три параметра истина, животное будет счастливо (метод isHappy = true)
    private boolean isFed = false;
    private boolean isWashed = false;
    private boolean isPlayed = false;

    public Animal(T id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getClassName() {
        return "Animal";
    }

    public void feed() {
        isFed = true;
        System.out.println(name + " is fed");
    }
    public void wash() {
        isWashed = true;
        System.out.println(name + " is washed");
    }
    public void play() {
        isPlayed = true;
        System.out.println(name + " is played enough");
    }

    public  boolean isHappy() {
        if (isPlayed && isWashed && isFed) {
            return true;
        }
        else {
            return false;
        }
    }

}
