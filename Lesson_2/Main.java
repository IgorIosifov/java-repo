package ru.geekbrains.lesson_java_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* task #6 please set the length of the array with random numbers.
        This method will show you the whole array and minimum+maximum numbers*/
        searchMinMax(20);

        /* task #7 please put any numbers in the array.
          This method will show you is there a point of balance in the array or not (it will return true or false).
          The point of balance means that a sum of numbers on the left-hand side from the point and a sum of numbers on the right-hand side from the point are equal.
        */
        System.out.println(checkBalance(new int[]{1,6,1,1,3,4}));
        System.out.println();

        /*task #8 please set put any numbers in the array and a variable "delta". Delta can be positive or negative or even ZERO =)
         This method can shift the massive to the left or to the right by the meaning of the "delta" variable.*/
        shiftArr(new int[]{0, 1, 2, 3, 4}, 2); //
    }

    // this method is used for searching minimum and maximum in an array
    public static void searchMinMax (int l) {
        int[] arr = new int[l];
        int max = 0;
        int dim = 100;
        int min = dim; // dim=100 is more than the maximum meaning of the expression ((int) (Math.random() * dim))=99
        System.out.println("Your array is:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * dim);
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr [i];
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println(" ");
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println();
    }

 //this method is used for checking balance in an array
    public static boolean checkBalance(int []arr) {
        System.out.println("Your array is:");
        System.out.println(Arrays.toString(arr));
        System.out.println("There is a point of balance in this array:");
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int sumLeft = 0;
        int sumRight = sum;
        for (int j = 0; j <= arr.length - 1; j++) {
            sumLeft = sumLeft + arr[j];
            sumRight = sumRight - arr[j];
            if (sumLeft == sumRight) {
                return true;
            } else if (sumLeft > sumRight) {
                return false;
            }
        }
        return false;
    }

    // this method is used to shift an array by the meaning of "delta"
    public static void shiftArr(int[] arr, int delta) {
        System.out.println("Your array is:");
        System.out.println(Arrays.toString(arr));
        if (delta < 0) {
            for (int j = 0; j > delta; j--) {
                int temp = arr[0];
                int i;
                for (i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = temp;
            }
            System.out.println("Your shifted array is:");
            System.out.println(Arrays.toString(arr));
        } else {
            for (int j = 0; j < delta; j++) {
                int temp = arr[arr.length-1];
                int i;
                for (i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            }
            System.out.println("Your shifted array is:");
            System.out.println(Arrays.toString(arr));
        }
    }
}




