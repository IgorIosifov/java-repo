package ru.geekbrains.Lesson_1.Fruits_n_boxes;

public class packing {
    public static void main(String[] args) {

        Apple apple = new Apple(1.0f);
        Orange orange = new Orange(1.5f);

        Box appleBox = new Box(); //the box with apples
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        System.out.println("the apple box weight is " + appleBox.getWeight());


        Box orangeBox = new Box(); // the box with orange
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        System.out.println("the orange box weight is " + orangeBox.getWeight());

        appleBox.compareWeight(orangeBox); // compare the weight of orange box and apple box

        Box newBox = new Box(); // this box is for replace
        newBox.addFruit(apple); // if "apple" replace with "orange" replaceFruits method will work
        newBox.replaceFruits(orangeBox,newBox);

        System.out.println("the new box weight is " + newBox.getWeight());
        System.out.println("the old box weight is "+orangeBox.getWeight());

    }
}
