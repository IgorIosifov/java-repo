package ru.geekbrains.lesson_java_7;

public class Cat {
     String name;
     int appetite;
     boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }
}


