package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] bigA = new int[20];
        int [] s1A = new int[10];
        int [] s2A = new int[10];

        int j=bigA.length/2;

        for (int i = 0; i < bigA.length; i++) {
            bigA[i]=Integer.parseInt(reader.readLine());
        }


        for (int i = 0; i < bigA.length/2; i++) {
            s1A[i]=bigA[i];
        }

        for (int i = 0 ; i < s2A.length; i++) {

            s2A[i]=bigA[j];
            j++;
        }

        for (int i = 0; i < s2A.length; i++) {
            System.out.println(s2A[i]);
        }

    }
}
