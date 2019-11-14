package com.javarush.task.task06.task0614;

import java.util.ArrayList;
import java.util.List;
import sun.util.resources.cldr.ar.CalendarData_ar_TN;

/* 
Статические коты
*/

public class Cat {
  // public static List<String> cats = new ArrayList<>();
    public static ArrayList<Cat> cats = new ArrayList<>();


    //напишите тут ваш код

    public Cat() {

    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            Cat c= new Cat();
            Cat.cats.add(c);
        }
        //напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        for (int i=0;i<cats.size();i++) {
            System.out.println(cats.get(i));
        }
    }
}
