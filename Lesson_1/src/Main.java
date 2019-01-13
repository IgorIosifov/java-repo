public class Main {
//буду сразу учиться писать комментарии на английском.
    // task 1. Creating method main
    public static void main(String[] args) {
        // task 2: creating all possible types of variables
        byte by = 6;
        short sh = 300;
        int in = 50000;
        long lo = 300000000L;
        float fl = 1500.23f;
        double dou = 15.16516164616;
        boolean bool = true;
        char ch = 'A';

        //task 3:  print the result of calculating in task 3
        System.out.println(calculate (10, 20, 40, 40) );

        //task 4: print the result of checking sum in range
        System.out.println(sumRange10and20 (5, 10));

        // task 5: calling for method positiveNegative which prints the result of checking positive/negative
        positiveNegative (-5);

        // task 6: print is the number negative?
        System.out.println(trueNegative(-5));

        // task 7: calling for method HelloName which prints "Hello,+name!"
        HelloName ("Igor");

        // task 8: calling for method yearLeap with int argument
        yearLeap (1600);

    }
    // task 3:method calculates a*(b+(c/d)) and returns the meaning of the expression

    public static int calculate ( int a, int b, int c, int d){
        int calc = a * (b + (c / d));
        return calc;
    }
    // task 4: method calculates the sum of two numbers and check it in the range [10;20]
    public static boolean sumRange10and20 (int x1, int x2) {
        if (((x1+x2)>=10) && ((x1+x2)<=20)) {
            return true;
        } else return false;
    }
    // task 5: method that shows what kind the number is: positive or negative;
    public static void positiveNegative (int x3) {
       if (x3>=0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
    // task 6: method returns "true" if the number is negative
    public static boolean trueNegative (int x4) {
        if (x4 < 0) {
            return true;
        } else return false;
    }
    // task 7: method asks you "what is your name?" and print "Hello+name!";
    public static void HelloName (String name){
        System.out.println("Hello, " + name + "!");
    }

    //task 8: method that finds out is year leap or not. Each 4th year is leap. Each 100th year isn't leap. Each 400th year is leap.

    public static void yearLeap (int year) {
        if (year%400==0){
            System.out.println("leap year");
        } else if  ((year%4==0) && (year%100!=0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
