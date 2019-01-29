package ru.geekbrains.lesson_java_6;

public class Dog extends Animal {
    public Dog (int run, int swim, float jump) {
        super(run, swim, jump);
    }
    public void getRun(){
        if (run>500 || run<0) {
            System.out.println("run:false");
        } else {
            System.out.println("run:true");
        }
    }

    public void getSwim(){
        if (swim>10 || swim<0) {
            System.out.println("swim:false");
        } else {
            System.out.println("swim:true");
        }
    }
    public void getJump(){
        if (jump>0.5 || jump<0) {
            System.out.println("jump:false");
        } else {
            System.out.println("jump:true");
        }
    }
}


