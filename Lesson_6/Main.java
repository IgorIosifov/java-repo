package ru.geekbrains.lesson_java_6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(300, 500, 1.9f);
        System.out.println("");
        System.out.println("cat's tryouts");
        cat.getRun();
        cat.getSwim();
        cat.getJump();

        Dog dog = new Dog(400, 11, 0.5f);
        System.out.println("");
        System.out.println("dog's tryouts");
        dog.getRun();
        dog.getSwim();
        dog.getJump();

        EndurDog endurDog = new EndurDog(600, 11, 0.5f);
        System.out.println("");
        System.out.println("enduring dog's tryouts");
        endurDog.getRun();

        WeakDog weakDog = new WeakDog(300, 11, 0.5f);
        System.out.println("");
        System.out.println("weak dog's tryouts");
        weakDog.getRun();
    }
}
