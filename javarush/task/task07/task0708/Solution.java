package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         strings = new ArrayList<>();
        int num = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        for (int i = 0; i < strings.size(); i++) {
            int tem = strings.get(i).length();
            if ( tem>num )
                num=tem;
        }
        for (int i = 0; i < strings.size(); i++) {
            if ( strings.get(i).length()==num )
                System.out.println(strings.get(i));
        }

    }
}
