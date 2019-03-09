package ru.geekbrains.Lesson_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	String [] arr = {"Карл", "у", "Клары", "украл", "кораллы", "а",
            "Клара", "у", "Карла", "украла", "кларнет", "Если", "бы", "Карл",
            "у", "Клары", "не", "украл", "кораллы", "то", "Клара", "у" ,"Карла",
            "не", "украла", "б", "кларнет"};
/*
Кажется, я тут нахардкодил. Но это задание пошло тяжелее всех, потратил часа 4 на него..
 */
	LinkedList<String> list = new LinkedList<>(Arrays.asList(arr));
	LinkedList<Integer> currentCounter = new LinkedList<>(Collections.nCopies(list.size(),0)); //this list is for removing process
	LinkedList<Integer> counter = new LinkedList<>(Collections.nCopies(list.size(),0)); // this list is for print result

        // filling the list with frequencies
        for (int i = list.size()-1; i >=0 ; i--) {
           counter.set(i, Collections.frequency(list, list.get(i)));
        }
        System.out.println(list);

        // this loop is for remove remaining elements
        for (int i = list.size()-1; i >=0 ; i--) {
            currentCounter.set(i, Collections.frequency(list, list.get(i)));
            if (currentCounter.get(i)>1) {
                list.remove(i);
                counter.remove(i);
            }
        }

        // this loop is for printing
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+": " );
            System.out.print(counter.get(i)+ "раза; ");
        }
    }
}
