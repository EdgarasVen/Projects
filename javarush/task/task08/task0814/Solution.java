package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(a -> a > 10);

        return set;
    }

    public static void main(String[] args) {
        //HashSet<Integer>set=new HashSet<>(createSet());
        //System.out.println(set);
        //removeAllNumbersGreaterThan10(set);
        //System.out.println(set);



    }
}
