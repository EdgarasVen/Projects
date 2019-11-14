package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(r.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i)%3==0 )
                l1.add(list.get(i));
            if ( list.get(i)%2==0 )
                l2.add(list.get(i));
            if ( list.get(i)%3!=0 && list.get(i)%2!=0 )
                l3.add(list.get(i));
        }



        printList(list);
        printList(l1);
        printList(l2);
        printList(l3);
    }

    public static void printList(ArrayList<Integer> list) {

        for (Integer x: list)
        System.out.println(x);

    }
}
