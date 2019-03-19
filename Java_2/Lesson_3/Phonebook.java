package ru.geekbrains.Lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    public static void main(String[] args) {

        HashMap<String, List<String>> phonebook = new HashMap<>();
        phonebook.put("Ivanov", new ArrayList<>());
        phonebook.get("Ivanov").add ("+71111111111");
        phonebook.get("Ivanov").add ("+7495111111");

        phonebook.put("Petrov", new ArrayList<>());
        phonebook.get("Petrov").add ("+2222222222");
        phonebook.get("Petrov").add ("+7495222222");

        System.out.println(phonebook.get("Ivanov"));
    }
}

