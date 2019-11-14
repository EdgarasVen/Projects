package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[15];
        int num1=0;
        int num2=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <arr.length; i++) {
            if (i%2==0)
                num1=num1+arr[i];
            else
                num2=num2+arr[i];
        }

        if (num1>num2)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}
