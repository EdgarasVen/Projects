package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if ((a==b)&&(a==c))
            System.out.println(a);
        else{
        int max =Math.max(Math.max(a,b),c);
        int min =Math.min(Math.min(a,b),c);
        int mid =(a+b+c)-max-min;
            System.out.println(mid);}



    }
}
