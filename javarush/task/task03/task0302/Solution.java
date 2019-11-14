package com.javarush.task.task03.task0302;

/* 
Немедленно в печать
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println (convertEurToUsd(10,20));
        System.out.println (convertEurToUsd(12,30));

    }

    public static double convertEurToUsd(int eur, double course) {

        return eur * course;

    }
}
