package ru.geekbrains.lesson_java_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // creating an array of words
        String words[] = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        // choosing a random one
        int rdm = (int)(Math.random()*(words.length));
        String word = words[rdm];

        String input; // this variable is for scan
        char [] c = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'}; // this array is for output

        System.out.println("topic:fruits and vegetables");
        do {
            System.out.println("enter a word in lower case:");

            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();

            // this block prevents OutOfBounds

            int min;
            if(input.length()>=word.length()) {
                min = word.length();
            } else {
                min=input.length();
            }
            //replacing "#" with guessed letters
            for (int i = 0; i < min; i++) {
                if (input.charAt(i) == word.charAt(i)) {
                    c[i] = input.charAt(i);
                }
            }
            //printing the result
            for (char o:c) {
                System.out.print(o);
            }
            System.out.println();
        }
            while (!(input.equals(word))) ;
        System.out.println("Congratulations!");
    }
}

