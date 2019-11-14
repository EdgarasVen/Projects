package com.javarush.task.task07.task0715;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");//напишите тут ваш код
        list.add("мыла");//напишите тут ваш код
        list.add("раму");//напишите тут ваш код

        list.add(1,"именно");
        list.add(3,"именно");
        list.add(5,"именно");

        for (String x: list)
            System.out.println(x);
    }
}
