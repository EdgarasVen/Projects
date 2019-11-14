package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int i = 0;
        int j = 0;
        int o = 0;
        if (a==0)
            o++;
        else
        if (a < 0)
            j++;
        else
            i++;
         if (b==0)
            o++;
         else
         if (b < 0)
            j++;
         else
            i++;
           if (c==0)
            o++;
           else
           if (c < 0)
            j++;
           else
            i++;

        System.out.println("количество отрицательных чисел: "+j);
        System.out.println("количество положительных чисел: "+i);








    }
}

