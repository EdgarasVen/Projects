package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t;

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(reader.readLine());
        }

        for (int n = arr.length-1; n > 0; n--){
            for (int i = 0; i < n ; i++) {
                if(arr[i]>arr[i+1]){
                    //System.out.println("cheking "+arr[i]+ "?" +arr[i+1]);

                    t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=t;

                   // System.out.println("making "+arr[i]+ "?" +arr[i+1]);
                }

            }
        }
        for (int i:arr){
            System.out.println(i);

        }



}
}
