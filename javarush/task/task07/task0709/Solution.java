package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String > list= new ArrayList<>();

       int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i).length();
            if ( temp<min )
                min=temp;
        }


        for (int i = 0; i < list.size(); i++) {
            if ( min == list.get(i).length() )
                System.out.println(list.get(i));

        }

    }
}
