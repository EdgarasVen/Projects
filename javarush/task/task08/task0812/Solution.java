package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count=0;
        int count2=1;
        int num=list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(num)){
                count2++;
            }else {
                count=Math.max(count,count2);
                count2=1;
                num=list.get(i);
            }
            count=Math.max(count,count2);
        }


        System.out.println(count);

    }
}