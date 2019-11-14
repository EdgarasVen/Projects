package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String n = r.readLine();
            list.add(n);
        }

        ArrayList<String> result = doubleValues(list);
        for (String x:list)
        System.out.println(x);

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i+=2) {
            list.add(i+1,list.get(i));

        }
        return list;
    }
}
