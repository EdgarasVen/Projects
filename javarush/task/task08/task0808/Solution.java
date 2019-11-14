package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        //Date time = new Date();
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);
        //Date time1 = new Date();
        //System.out.println(time1.getTime()-time.getTime());

        // LinkedList
        //Date time2 = new Date();
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
        //Date time3 = new Date();
        //System.out.println(time3.getTime()-time2.getTime());
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i,i);
        }//напишите тут ваш код

    }

    public static void get10000(List list) {
        for (int i = 0; i <10000 ; i++) {
            list.get(i);
        }//напишите тут ваш код

    }

    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(i,i);
        }//напишите тут ваш код

    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i <10000; i++) {
            list.remove(0);
        }

    }
}
