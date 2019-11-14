package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String a="";
        String b="";

        if (num==0)
            System.out.println("ноль");
        else
        {
            if (num>0)
                a = "положительное ";
                        else a="отрицательное ";
            if (num%2==0)
                b= "четное число";
            else b= "нечетное число";

            System.out.print(a);
            System.out.print(b);
        }


    }
}
