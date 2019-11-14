package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine()) % 5;
        System.out.println(x);
        if (x < 3) System.out.println("зелёный");
        if (3 <= x && x < 4) System.out.println("жёлтый");
        if (4 <= x && x < 5) System.out.println("красный");
    }
}