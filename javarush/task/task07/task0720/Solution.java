package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> num = new ArrayList<>();

        //System.out.println("N and M");
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        //System.out.println("add array "+ n +" times");
        for (int i = 0; i < n; i++) {
            num.add(reader.readLine());
        }
        //System.out.println("OK");
        for (int i = 0; i < m; i++) {
            num.add(num.get(0));
            num.remove(0);
        }

        for (String i:num){
            System.out.println(i);
        }

        //напишите тут ваш код
    }
}
