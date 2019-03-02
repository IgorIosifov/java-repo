package ru.geekbrains.lesson_java_6;

class EndurDog extends Dog {
    public EndurDog(int run, int swim, float jump) {
        super(run, swim, jump);
    }

    @Override
    public void getRun() {
        if (run > 1000 || run < 0) {
            System.out.println("run:false");
        } else {
            System.out.println("run:true");
        }

    }
}