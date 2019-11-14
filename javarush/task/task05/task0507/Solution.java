package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
       double suma=0; double kol=0;
       while (true){
           double num = Integer.parseInt(reader.readLine());

           if(num==-1)
               break;
           suma=suma+num;
           //System.out.println(suma);
           kol++;
           //System.out.println(kol);
       }
        System.out.println(suma/kol);
    }
}

