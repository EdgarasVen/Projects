package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String  num =reader.readLine();
        int num1 = Integer.parseInt(num);
      String a="";
      String b="";
      if ((num1>=1)&&(num1<=999)){
      if (num1%2==0)
           a ="четное ";
      else
          a= "нечетное ";
      if (num.length()==1)
          b = "однозначное число";
      else if (num.length()==2)
          b = "двузначное число";
      else if (num.length()==3)
          b = "трехзначное число";}

        System.out.print(a);
        System.out.print(b);

    }
}
