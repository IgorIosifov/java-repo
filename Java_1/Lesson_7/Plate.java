package ru.geekbrains.lesson_java_7;


public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food left:" + food);
    }

    public boolean decreaseFood(int food) {
        if (food < this.food) {
            this.food -= food;
            return true;
        } else {
            return false;
        }
    }
    public void addFood (int food) {
        this.food += food;
    }
}