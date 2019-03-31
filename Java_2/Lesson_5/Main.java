package ru.geekbrains.Lesson_5;


public class Main {
    static final int size = 10000000;
    static float [] arr = new float [size];
    static final int h = size/2;
    static float [] a1 = new float [h];
    static float [] a2 = new float [h];

    public static void main(String[] args) {
        System.out.println("one thread method is working...");
        method1();
        System.out.println("two threads method is working...");
        method2();
    }

    // this method is just for not to repeat the same code
    static float calculation (float a, int i) {
        a = (float)(a * Math.sin(0.2f + i / 5) *
                Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    return a;
}
    // creating one thread method
    static void method1 () {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        } long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = calculation(arr[i], i);
        }
        System.out.println("summary working time: "+(System.currentTimeMillis()-a)+ " msec" );
    }

    //creating two threads method
    static void  method2 () {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr,0,a1,0,h);
        System.arraycopy(arr,h,a2,0,h);
        long b = System.currentTimeMillis();
        System.out.println("time required for separation: "+ (b-a) + " msec");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = calculation(a1[i], i);
        }
                long c = System.currentTimeMillis();
                System.out.println("time required for the first flow: "+ (c-b) + " msec");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a2.length; i++) {
                    a2[i]=calculation(a2[i], i+h);
                    /* !!! in this case I was forced to do "i+h" (i= 5000000, 5000001, 5000002,...) for proper calculations.
                    And it cost me about  2 seconds on the second thread.. */
                }
                long d = System.currentTimeMillis();
                System.out.println("time required for the second flow: "+ (d-b) + " msec");
            }
        });
                t1.start();
                t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long e = System.currentTimeMillis();
        System.arraycopy(a1,0,arr,0,h);
        System.arraycopy(a2,0,arr,h,h);
        long f = System.currentTimeMillis();
        System.out.println("time required for joining two array in one: "+ (f-e) + " msec");
        System.out.println("summary working time: " + (f-a) + " msec");
    }
}
