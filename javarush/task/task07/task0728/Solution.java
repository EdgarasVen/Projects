package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        /*int []num = new int[5];
        int j=0;
        for (int i = 5-1; i >= 0; i--) {
           num[j]=array[i];
           j++;
        }
        j=4;
        for (int i = 0; i < 5; i++) {
            array[i]=num[j];
            j--;
        }*/
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[j] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;}
        //напишите тут ваш код
    }
}
