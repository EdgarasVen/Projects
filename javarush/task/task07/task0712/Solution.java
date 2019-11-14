package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            String s=reader.readLine();
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            int t =list.get(i).length();
            if ( t>max )
                max=t;
            if ( t<min )
                min=t;
        }
        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i).length()==max || list.get(i).length()==min ){
                System.out.println(list.get(i));
                break;
            }

        }
    }
}
