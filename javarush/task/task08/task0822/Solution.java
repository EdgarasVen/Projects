package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут

        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = new LinkedList<>();
        System.out.println("Inter how much");
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Add value");
            integerList.add(Integer.parseInt(reader.readLine()));
        }

        // Создать и заполнить список тут
        return integerList;
    }
}
