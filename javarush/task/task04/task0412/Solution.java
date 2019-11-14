package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num1 =Integer.parseInt(num);
        if (num1==0)
            System.out.println(num1);
        else if (num1>0)
            System.out.println(num1*2);
        else
            System.out.println(num1+1);


    }

}