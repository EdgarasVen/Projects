package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Pavardenis1",400);
        map.put("Pavardenis2",300);
        map.put("Pavardenis3",200);
        map.put("Pavardenis4",100);
        map.put("Pavardenis5",500);
        map.put("Pavardenis6",600);
        map.put("Pavardenis7",700);
        map.put("Pavardenis8",800);
        map.put("Pavardenis9",900);
        map.put("Pavardenis10",1000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(a -> a.getValue() < 500);
    }

    public static void main(String[] args) {

    }
}