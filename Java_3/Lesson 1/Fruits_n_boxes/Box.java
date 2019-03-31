package ru.geekbrains.Lesson_1.Fruits_n_boxes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Box {


    ArrayList<Fruits> content=new ArrayList<>();


    public void addFruit (Fruits obj){
        if (content.size()==0) {
        content.add(obj);
        } else if (content.contains(obj)){
            content.add(obj);
        } else
            System.out.println("wrong type of fruit");
        }

        public float getWeight () {
            float totalWeight=0;
            for (int i = 0; i <content.size() ; i++) {
                totalWeight += content.get(i).weight;
            }
            return totalWeight;
        }
        public boolean compareWeight (Box box) {
        if (getWeight()!=box.getWeight()) {
            System.out.println("weights are not equal");
            return false;
        }
            System.out.println("weights are equal");
        return true;
        }

        public void replaceFruits(Box from, Box to) {
                if (to.content.contains(from.content.get(0))) {
                    to.content.addAll(to.content.size(), from.content);
                    from.content.clear();
                } else {
                    System.out.println("box can't be replaced, wrong type of fruits");
                }
            }
    }





