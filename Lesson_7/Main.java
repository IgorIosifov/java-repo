package ru.geekbrains.lesson_java_7;

public class Main {

    public static void main(String[] args) {
            Cat[] cat = new Cat[5];
            cat[0] = new Cat ("Murz",5);
            cat[1] = new Cat ("Bars",10);
            cat[2] = new Cat ("Rich",30);
            cat[3] = new Cat ("Masya",20);
            cat[4] = new Cat ("Harley",50);

            Plate plate = new Plate(60);
            plate.info();

            //feeding the cats for the first time
            for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            System.out.println(cat[i].name+" satiety: "+cat[i].satiety);
            }
            plate.info();

            plate.addFood(60); //give them some food again
            plate.info();

            // I added this block to feed the rest of the cats
            for (int i = 0; i < cat.length; i++) {
            if (!cat[i].satiety) {
                cat[i].eat(plate);
                System.out.println(cat[i].name+" satiety: "+cat[i].satiety);
            }
        }
            plate.info();
        }
    }



