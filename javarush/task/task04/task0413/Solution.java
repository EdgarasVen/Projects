package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        String day1 = reader.readLine();
        int day = Integer.parseInt(day1);
        String [] days = {"такого дня недели не существует","понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

        /*for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }*/
        if ((day < days.length) && (day > 0))
            System.out.println(days[day]);
        else
            System.out.println("такого дня недели не существует");

                
                


    }
}