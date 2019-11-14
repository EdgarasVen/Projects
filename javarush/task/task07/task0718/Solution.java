package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String > list = new ArrayList<String>();
       ArrayList<Integer > list2 = new ArrayList<Integer>();



        String j="n";
        int in ;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            if (list.get(i).length()<j.length()) {
                list2.add(i);
            }
            else
                j = list.get(i);
        }
        if (list2.size()!=0)
            System.out.println(list2.get(0));
    }
}

