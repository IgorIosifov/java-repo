package ru.geekbrains.lesson_java_6;

public class Cat extends Animal {
    public Cat (int run, int swim, float jump) {
        super(run, swim, jump);
    }
public void getRun(){
        if (run>200 || run<0) {
            System.out.println("run:false");
        } else {
            System.out.println("run:true");
        }
}
    public void getSwim(){
            System.out.println("swim:false");
    }

    public void getJump(){
        if (jump>2 || jump<0) {
            System.out.println("jump:false");
        } else {
            System.out.println("jump:true");
        }
    }
}
