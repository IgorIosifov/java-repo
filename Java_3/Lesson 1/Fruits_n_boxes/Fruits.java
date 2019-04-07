package ru.geekbrains.Lesson_1.Fruits_n_boxes;

abstract class Fruits  {
    float weight;
    String name;

    public Fruits(float weight) {
        this.weight = weight;
//        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
