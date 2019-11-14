package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("write 1 numbers");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
       // System.out.println("write 1 numbers");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);
       // System.out.println("write 1 numbers");
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);
        if ((a1==b1) && (a1==c1))
            System.out.println(a+" "+b+" "+c);
        else
            if (a1==b1)
                System.out.println(a+" "+b);
            else
                if(a1==c1)
                    System.out.println(a+" "+c);
                else
                    if (c1==b1)
                        System.out.println(c+" "+b);




    }
}