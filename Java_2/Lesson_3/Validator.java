package ru.geekbrains.Lesson_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {


    private static boolean Validate(String str) {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&+=)(*]).{8,20}$");

        Matcher m = p.matcher(str);

        return m.matches();

    }
        public static void main (String[] args){
            System.out.println(Validate("asdJa*1va"));
        }
    }
