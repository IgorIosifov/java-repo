package ru.geekbrains.Lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Element<T>{


    private T obj;

    public Element(T obj) {
        this.obj = obj;
    }

    public String toString() {
        return obj.toString();
    }

}

class Main {

    private static Element<String> element1 = new Element<>("pen");
    private static Element<String> element2 = new Element<>("pencil");
    private static Element<Integer> element3 = new Element<>(1);
    private static Element<Integer> element4 = new Element<>(2);
    private static Object [] arr  ={element1, element2, element3, element4};

    public static void main(String[] args) {
	    shift(0,2);
	    asList(arr);
    }
    //task #1 shifting two elements
    public static void shift(int currentPosition, int nextPosition) {

        System.out.println(Arrays.toString(arr));
        Object temp = arr[currentPosition];
        arr [currentPosition] = arr [nextPosition];
        arr [nextPosition] = temp;
        System.out.println(Arrays.toString(arr));
    }

    //task #2 arrayToList
    public static List<Object> asList (Object [] arr) {
        ArrayList<Object> arrList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrList);
        return arrList;

    }

}
