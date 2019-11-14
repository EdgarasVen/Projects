package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int dateY = Integer.parseInt(reader.readLine());
        int dateM = Integer.parseInt(reader.readLine());
        int dateD = Integer.parseInt(reader.readLine());
        System.out.println("Меня зовут "+ name +"."+"\n"+"Я родился "+dateD+"."+dateM+"."+dateY);

    }
}
