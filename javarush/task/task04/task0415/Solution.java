package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 =reader.readLine();
        String b1 =reader.readLine();
        String c1 =reader.readLine();
        int a=Integer.parseInt(a1);
        int b=Integer.parseInt(b1);
        int c=Integer.parseInt(c1);
        int ab=a+b;
        int ac=a+c;
        int bc=b+c;

        if ((ab<=c) || (ac<=b) || (bc<=a))
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");

    }
}