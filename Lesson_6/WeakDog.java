package ru.geekbrains.lesson_java_6;

class WeakDog extends Dog {
    public WeakDog(int run, int swim, float jump) {
        super(run, swim, jump);
    }

    @Override
    public void getRun() {
        if (run > 200 || run < 0) {
            System.out.println("run:false");
        } else {
            System.out.println("run:true");
        }

    }
}