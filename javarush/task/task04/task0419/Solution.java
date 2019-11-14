package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(reader.readLine());
        int b =Integer.parseInt(reader.readLine());
        int c =Integer.parseInt(reader.readLine());
        int d =Integer.parseInt(reader.readLine());

        int num1 = Math.max(a,b);
        int num2 = Math.max(c,d);
        if ((a==b)&&(a==c)&&(a==d))
            System.out.println(a);
        else
        System.out.println(Math.max(num1,num2));

    }
}
