package ru.geekbrains.Lesson_1.Fruits_n_boxes;

class Orange extends Fruits {

    Orange(float weight) {
        super(weight);
    }

    @Override
    public void setWeight(float weight) {
        super.setWeight(weight);
    }

    @Override
    public String getName() {
        return "Orange";
    }
}