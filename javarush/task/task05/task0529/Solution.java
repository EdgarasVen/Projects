package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        String s="";
        int a=0;
        while (!s.equals("сумма"))
        {
            s = reader.readLine();
            try {
                a = Integer.parseInt(s);
                sum += +a;
            }
            catch (NumberFormatException e){
                continue;
            }
        }



        System.out.println(sum);
    }
}
